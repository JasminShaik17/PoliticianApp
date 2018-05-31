package cubex.mahesh.politicianapp

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.database.FirebaseDatabase
import com.google.firebase.database.DatabaseReference





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

        val database = FirebaseDatabase.getInstance()
        val myRef = database.getReference("users/"+
                   FirebaseAuth.getInstance().currentUser!!.uid)
        myRef.child("name").setValue(name?.text.toString())
        myRef.child("mno").setValue(mno?.text.toString())
        myRef.child("dob").setValue(dob?.text.toString())
        myRef.child("address").setValue(address?.text.toString())

        startActivity(Intent(this@RegisterActivity,
                DashboardActivity::class.java))

    }
}
