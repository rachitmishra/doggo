package `in`.ceeq.doggo

import android.graphics.Bitmap
import android.graphics.BitmapFactory
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.util.JsonReader
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.coroutines.*
import java.io.IOException
import java.io.InputStream
import java.io.InputStreamReader
import java.net.URL
import java.util.concurrent.Executors
import javax.net.ssl.HttpsURLConnection


class MainActivity : AppCompatActivity() {

    lateinit var job: Job
    private val doggoUrl = URL("https://dog.ceo/api/breeds/image/random")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        fun getDoggo() {
            //      Handler(HandlerThread("bg").apply { start() }.looper).post {
            //        randomDoggo(doggoUrl)
            //      }

             Executors.newSingleThreadExecutor().execute {
                    randomDoggo(doggoUrl)
                  }

            randomDoggo(doggoUrl)
        }

        button.setOnClickListener {
            getDoggo()
        }

        getDoggo()
    }


    private fun randomDoggo(url: URL) {
        job = CoroutineScope(Dispatchers.Main).launch {
            val doggoUrl =  withContext(Dispatchers.IO) { get(url, this@MainActivity::getUrlFromJson) }
            val bitmap = withContext(Dispatchers.IO) { get(URL(doggoUrl), this@MainActivity::getBitmap) }
            setImage(bitmap)
        }
    }

    private fun setImage(bm: Bitmap?) {
        image?.apply {
            setImageBitmap(bm)
        }
    }

    private fun getBitmap(input: InputStream?): Bitmap {
        return BitmapFactory.decodeStream(input)
    }

    private fun <T> get(url: URL, task: (InputStream?) -> T): T? {
        val urlConnection = prepareConnection(url)

        return urlConnection?.run {
            try {
                connect()
                if (responseCode != HttpsURLConnection.HTTP_OK) {
                    throw IOException("HTTP error code: $responseCode")
                }
                return@run task(inputStream)
            } finally {
                inputStream?.close()
                disconnect()
            }
        }
    }

//    private suspend fun <T> get(url: URL, task: (InputStream?) -> T): T? {
//        return withContext(Dispatchers.IO) {
//            val urlConnection = prepareConnection(url)
//            urlConnection?.run {
//                try {
//                    connect()
//                    if (responseCode != HttpsURLConnection.HTTP_OK) {
//                        throw IOException("HTTP error code: $responseCode")
//                    }
//                    task(inputStream)
//                } finally {
//                    urlConnection.inputStream?.close()
//                    urlConnection.disconnect()
//                }
//            }
//        }
//    }

    private fun prepareConnection(url: URL): HttpsURLConnection? {
        val result = runCatching {
            (url.openConnection() as? HttpsURLConnection)?.apply {
                readTimeout = 3000
                connectTimeout = 3000
                requestMethod = "GET"
                doInput = true
            }
        }

        return result.getOrNull()
    }

    @Throws(IOException::class)
    private fun getUrlFromJson(input: InputStream?): String {
        if (null == input) {
            return ""
        }

        var url = ""
        val reader = JsonReader(InputStreamReader(input, "UTF-8"))
        reader.use { jsonReader ->
            jsonReader.beginObject()
            while (jsonReader.hasNext()) {
                val name = jsonReader.nextName()
                if (name == "message") {
                    url = jsonReader.nextString()
                } else {
                    jsonReader.skipValue()
                }
            }
            jsonReader.endObject()
            return url
        }
    }

    override fun onDestroy() {
        super.onDestroy()
        job.cancel()
    }
}

