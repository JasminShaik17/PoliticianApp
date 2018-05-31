package cubex.mahesh.politicianapp

import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.database.FirebaseDatabase
import com.google.firebase.iid.FirebaseInstanceIdService
import com.google.firebase.iid.FirebaseInstanceId



class MyService:FirebaseInstanceIdService( )
{
    override fun onTokenRefresh() {
        super.onTokenRefresh()
        if(FirebaseAuth.getInstance().currentUser != null) {
            val refreshedToken = FirebaseInstanceId.getInstance().token
            val database = FirebaseDatabase.getInstance()
            val myRef = database.getReference("users/" +
                    FirebaseAuth.getInstance().currentUser!!.uid)
            myRef.child("fcm_id").setValue(refreshedToken)
        }
    }
}