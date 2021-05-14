package abc.com.loginui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class ForgetPasswordActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_forget_password)

        val button2=findViewById<Button>(R.id.next)
        button2.setOnClickListener{
            val intent = Intent(this, FinalActivity::class.java)
            startActivity(intent)
        }

    }
}