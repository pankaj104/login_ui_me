package abc.com.loginui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class FinalActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_final)

        val intent = intent
        // recieve value of Password trough getStringExtra
        val password11 = intent.getStringExtra("Password")
        val phone = intent.getStringExtra("Phone")

        //textview
        val resultTv = findViewById<TextView>(R.id.resultTv)
        //setText
        resultTv.text = "Phone no: "+phone+"\nPassword: "+password11

    }

    }
