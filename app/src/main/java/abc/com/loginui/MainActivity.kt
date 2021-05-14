package abc.com.loginui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.AlarmClock.EXTRA_MESSAGE
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import javax.microedition.khronos.egl.EGLDisplay

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
val mobileno= findViewById<EditText>(R.id.mobileno)
        val pass=findViewById<EditText>(R.id.pass)


        val button=findViewById<Button>(R.id.login)
        button.setOnClickListener{

            val password = pass.text.toString()
            val phone = mobileno.text.toString()
          val intent =Intent(this, FinalActivity::class.java)

            intent.putExtra("Password", password)
            intent.putExtra("Phone", phone)
            startActivity(intent)
        }

//

//
//        val button2=findViewById<Button>(R.id.next)
//        button2.setOnClickListener{
//            val intent =Intent(this, FinalActivity::class.java)
//            startActivity(intent)
//        }
    }


    fun ForgetPassword(view: View) {
        val TextView= findViewById<TextView>(R.id.forgetPassword)
        TextView.setOnClickListener {
            val intent =Intent(this,ForgetPasswordActivity::class.java)
            startActivity(intent)
        }
    }



    fun SignUp(view: View) {
        val TextView= findViewById<TextView>(R.id.singUp)
        TextView.setOnClickListener {
            val intent =Intent(this,SignUpActivity::class.java)
            startActivity(intent)
        }
    }
}
