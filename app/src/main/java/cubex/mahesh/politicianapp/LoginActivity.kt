package cubex.mahesh.politicianapp

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.Toast
import com.google.android.gms.tasks.OnCompleteListener
import com.google.android.gms.tasks.Task
import com.google.firebase.auth.AuthResult
import com.google.firebase.auth.FirebaseAuth



class LoginActivity : AppCompatActivity() {

    var et1:EditText? = null
    var et2:EditText? = null

    private var mAuth: FirebaseAuth? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_welcome)

        et1 = findViewById(R.id.let1)
        et2 = findViewById(R.id.let2)

        mAuth = FirebaseAuth.getInstance();

    }

    fun  login(v:View)
    {
        mAuth?.signInWithEmailAndPassword(et1?.text.toString(),
                et2?.text.toString())?.addOnCompleteListener(object : OnCompleteListener<AuthResult> {
            override fun onComplete(task: Task<AuthResult>) {

                if(task.isSuccessful) {
                    startActivity(Intent(this@LoginActivity,
                            DashboardActivity::class.java))
                }else{
                    Toast.makeText(this@LoginActivity,
                            "Invalid User...",
                            Toast.LENGTH_LONG)
                }
            }

        })
    }

    fun  register(v:View)
    {
        mAuth?.createUserWithEmailAndPassword(et1?.text.toString(),
                et2?.text.toString())?.addOnCompleteListener(object : OnCompleteListener<AuthResult> {
            override fun onComplete(task: Task<AuthResult>) {


            if(task.isSuccessful) {
                startActivity(Intent(this@LoginActivity,
                        RegisterActivity::class.java))
              }
            }

        })

    }

}
