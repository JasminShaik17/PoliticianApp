package cubex.mahesh.politicianapp

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var h = Handler( )
        h.postDelayed(object : Runnable {
            override fun run() {

            startActivity(Intent(this@MainActivity,
                    LoginActivity::class.java))

            }
        },4000)
    }
}
