package scisrc.mobiledev.firstuiassignment

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class LoginActivity : AppCompatActivity() {

    lateinit var backToMainBtn: Button
    lateinit var signUpTextView: TextView // เพิ่มตัวแปรสำหรับ TextView "Sign Up"

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_login)

        // จัดการ Window Insets
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        backToMainBtn = findViewById(R.id.loginBackToMainBtn)
        signUpTextView = findViewById(R.id.textSignUp) // เชื่อม TextView จาก XML

        // คลิกปุ่ม Back
        backToMainBtn.setOnClickListener {
            finish()
        }

        // คลิก TextView "Sign Up" เพื่อไปยัง RegisterActivity
        signUpTextView.setOnClickListener {
            val intent = Intent(this, RegisterActivity::class.java) // สร้าง Intent
            startActivity(intent) // เปิดหน้า RegisterActivity
        }
    }
}
