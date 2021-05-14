package abc.com.loginui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toolbar

class SignUpActivity : AppCompatActivity() {
    lateinit var toolbar: Toolbar
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_up)

//        toolbar = findViewById(R.id.toolbar)
//        setSupportActionBar(toolbar)
        supportActionBar?.title = "Register Yourself"

        val button1=findViewById<Button>(R.id.register)
        button1.setOnClickListener{
            val intent = Intent(this, FinalActivity::class.java)
            startActivity(intent)
        }
    }
}