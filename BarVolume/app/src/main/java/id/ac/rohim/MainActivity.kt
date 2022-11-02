package id.ac.rohim

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity(), View.OnClickListener {

    private lateinit var edtWeight : EditText
    private lateinit var edtLength : EditText
    private lateinit var edtHeight : EditText
    private lateinit var tvResult : TextView
    private lateinit var btnCalculate : Button

    companion object {
        private const val STATE_RESULT = "state_result"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        edtWeight = findViewById(R.id.edt_weight)
        edtLength = findViewById(R.id.edt_length)
        edtHeight = findViewById(R.id.edt_height)
        tvResult = findViewById(R.id.tv_result)
        btnCalculate = findViewById(R.id.btn_calculate)

        btnCalculate.setOnClickListener(this)

        if (savedInstanceState != null){
            val result = savedInstanceState.getString(STATE_RESULT)
            tvResult.text = result
        }
    }

    override fun onClick(v: View?) {
        if (v?.id == R.id.btn_calculate){
            val inputLength = edtLength.text.toString().trim()
            val inputWeight = edtWeight.text.toString().trim()
            val inputHeight = edtHeight.text.toString().trim()

            var isEmptyField = false

            if (inputWeight.isEmpty()){
                isEmptyField = true
                edtWeight.error = "Field ini tidak boleh kosong!"
            }
            if (inputLength.isEmpty()){
                isEmptyField = true
                edtLength.error = "Field ini tidak boleh kosong!"
            }
            if (inputHeight.isEmpty()){
                isEmptyField = true
                edtHeight.error = "Field ini tidak boleh kosong!"
            }
            if (!isEmptyField){
                val volume = inputLength.toDouble() * inputWeight.toDouble() * inputHeight.toDouble()
                tvResult.text = volume.toString()
            }
        }

    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        outState.putString(STATE_RESULT,tvResult.text.toString())
    }
}