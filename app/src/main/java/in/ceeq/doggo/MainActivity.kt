package `in`.ceeq.doggo

import android.graphics.Bitmap
import android.graphics.BitmapFactory
import android.os.Bundle
import android.os.Handler
import android.os.HandlerThread
import android.support.v7.app.AppCompatActivity
import android.util.JsonReader
import android.util.Log
import kotlinx.android.synthetic.main.activity_main.*
import java.io.IOException
import java.io.InputStream
import java.io.InputStreamReader
import java.net.URL
import javax.net.ssl.HttpsURLConnection


class MainActivity : AppCompatActivity() {

  private val doggoUrl = URL("https://dog.ceo/api/breeds/image/random")

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_main)

    fun getDoggo() {
      Handler(HandlerThread("bg").apply { start() }.looper).post {
        randomDoggo(doggoUrl)
      }
    }

    button.setOnClickListener {
      getDoggo()
    }

    getDoggo()
  }

  private fun randomDoggo(url: URL) {
    fetch(url) { jsonStream ->
      jsonStream?.let {
        val doggoUrl = getUrlFromJson(jsonStream)
        Log.e("Doggo", doggoUrl)

        fetch(URL(doggoUrl)) { imageStream ->
          imageStream?.let {
            val bitmap: Bitmap = BitmapFactory.decodeStream(imageStream)
            runOnUiThread {
              image?.apply {
                setImageBitmap(bitmap)
              }
            }
          }
        }
      }
    }
  }

  private fun fetch(url: URL, task: (InputStream?) -> Unit) {
    var connection: HttpsURLConnection? = null
    try {
      connection = (url.openConnection() as? HttpsURLConnection)?.apply {
        readTimeout = 3000
        connectTimeout = 3000
        requestMethod = "GET"
        doInput = true
        connect()
        if (responseCode != HttpsURLConnection.HTTP_OK) {
          throw IOException("HTTP error code: $responseCode")
        }

        task(inputStream)
      }
    } finally {
      connection?.inputStream?.close()
      connection?.disconnect()
    }
  }

  @Throws(IOException::class)
  private fun getUrlFromJson(input: InputStream): String {
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
}

