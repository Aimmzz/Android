package id.ac.rohim.intentapp

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnMoveActivity : Button = findViewById(R.id.btn_move_activity)
        btnMoveActivity.setOnClickListener(this)

        val btnMoveWithActivity : Button = findViewById(R.id.btn_move_activity_data)
        btnMoveWithActivity.setOnClickListener(this)

        val btnDialNumber : Button = findViewById(R.id.btn_dial_number)
        btnDialNumber.setOnClickListener(this)

    }

    override fun onClick(v: View?) {
        when (v?.id){
            R.id.btn_move_activity ->{
                val intent = Intent(this@MainActivity, MoveActivity::class.java)
                startActivity(intent)
            }
            R.id.btn_move_activity_data ->{
                val dataIntent = Intent(this@MainActivity, MoveWithDataActivity::class.java)
                dataIntent.putExtra(MoveWithDataActivity.EXTRA_NAME,"Rohim Kurniawan")
                dataIntent.putExtra(MoveWithDataActivity.EXTRA_AGE, 20)
                startActivity(dataIntent)
            }
            R.id.btn_dial_number ->{
                val dialPhoneNumber = Intent(Intent.ACTION_DIAL, Uri.parse("tel:"))
                startActivity(dialPhoneNumber)
            }
        }
    }
}