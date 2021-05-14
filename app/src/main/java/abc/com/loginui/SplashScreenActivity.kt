package abc.com.loginui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.WindowManager

class SplashScreenActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)


        // Send user to MainActivity as soon as this activity loads
//        val intent = Intent(this, MainActivity::class.java)
//        startActivity(intent)
//        // remove this activity from the stack
//        finish()


        // we used the postDelayed(Runnable, time) method
        // to send a message with a delayed time.
       Handler().postDelayed({
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
           // finish()
        }, 3000) // 3000 is the delayed time in milliseconds.

    }
}