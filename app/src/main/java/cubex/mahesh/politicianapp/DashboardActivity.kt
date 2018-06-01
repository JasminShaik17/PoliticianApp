package cubex.mahesh.politicianapp

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class DashboardActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dashboard)
    }

    fun  load(v:View)
    {
        when(v.id)
        {
            R.id.previous_events-> print("")
            R.id.next_events-> print("")
            R.id.messages-> print("")
            R.id.complaint-> print("")
            R.id.user-> print("")
            R.id.contactus-> print("")
        }

    }
}
