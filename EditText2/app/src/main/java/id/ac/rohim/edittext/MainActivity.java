package id.ac.rohim.edittext;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button bSubmit;
    EditText mEditText;
    TextView tvTextPreview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bSubmit = findViewById(R.id.button_submit);
        mEditText = findViewById(R.id.edit_text);
        tvTextPreview = findViewById(R.id.tv_text);

        bSubmit.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                tvTextPreview.setText("Nama Saya Adalah : " + mEditText.getText().toString());
            }
        });
    }
}