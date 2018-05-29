package cubex.mahesh.politicianapp

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText

class RegisterActivity : AppCompatActivity() {

    var name:EditText? = null
    var mno:EditText? = null
    var dob:EditText? = null
    var address:EditText? = null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        name = findViewById(R.id.name)
        mno = findViewById(R.id.mno)
        dob = findViewById(R.id.dob)
        address = findViewById(R.id.address)

    }

    fun register(v:View)
    {




    }
}
