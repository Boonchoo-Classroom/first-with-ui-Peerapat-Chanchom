package scisrc.mobiledev.firstuiassignment

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class RegisterActivity : AppCompatActivity() {

    lateinit var backToMainPageBtn: Button
    lateinit var LogInTextView: TextView // เพิ่มตัวแปรสำหรับ TextView "Sign Up"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_register)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        backToMainPageBtn = findViewById(R.id.registBackToMainBtn)
        LogInTextView = findViewById(R.id.textLogin)

        backToMainPageBtn.setOnClickListener() {
            finish()
        }
        LogInTextView.setOnClickListener {
            val intent = Intent(this, LoginActivity::class.java) // สร้าง Intent
            startActivity(intent) // เปิดหน้า RegisterActivity
        }
    }
}