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
// To store value in password through pass id in text view
            val password = pass.text.toString()
            val phone = mobileno.text.toString()
          val intent =Intent(this, FinalActivity::class.java)

            intent.putExtra("Password", password)
            intent.putExtra("Phone", phone)
            startActivity(intent)
        }
        val TextView= findViewById<TextView>(R.id.singUp)
        TextView.setOnClickListener {
            startActivity(Intent(this, SignUpActivity::class.java))
        }
        val TextView2= findViewById<TextView>(R.id.forgetPassword)
        TextView2.setOnClickListener {
            val intent =Intent(this,ForgetPasswordActivity::class.java)
            startActivity(intent)
        }

    }


}
