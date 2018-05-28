package cubex.mahesh.politicianapp

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
 

            }
        },4000)
    }
}
