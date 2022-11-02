package com.bsi.ac.id.appbelajarintent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    private Button btnMoveActivity;
    private Button btnWithDataActivity;
    private Button btnWithDataObject;
    private Button btnDialPhone;
    private Button btnMoveForResult;
    private TextView tvResult;
    private int REQUEST_CODE = 100;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnMoveActivity=(Button)findViewById(R.id.btn_move_activity);
        btnMoveActivity.setOnClickListener(this);
        btnWithDataActivity=(Button) findViewById(R.id.btn_move_activity_data);
        btnWithDataActivity.setOnClickListener(this);
        btnWithDataObject=(Button) findViewById(R.id.btn_move_activity_object);
        btnWithDataObject.setOnClickListener(this);
        btnDialPhone =(Button) findViewById(R.id.btn_dial_number);
        btnDialPhone.setOnClickListener(this);
        btnMoveForResult = (Button)findViewById(R.id.btn_move_for_result);
        btnMoveForResult.setOnClickListener(this);
        tvResult = (TextView)findViewById(R.id.tv_result);


    }

    @Override
    public void onClick(View v){
        switch(v.getId()) {
            case R.id.btn_move_activity:
                Intent moveIntent = new Intent(MainActivity.this, MoveActivity.class);
                startActivity(moveIntent);
                break;
            case R.id.btn_move_activity_data:
                Intent moveWithDataIntent = new Intent(MainActivity.this, MoveWithDataActivity.class);
                moveWithDataIntent.putExtra(MoveWithDataActivity.EXTRA_NAME, "Bina Sarana Informatika");
                moveWithDataIntent.putExtra(MoveWithDataActivity.EXTRA_AGE, 32);
                startActivity(moveWithDataIntent);
                break;
            case R.id.btn_move_activity_object:
                Person mPerson = new Person();
                mPerson.setName("Bina Sarana Informatika");
                mPerson.setAge(32);
                mPerson.setEmail("ubsi@bsi.ac.id");
                mPerson.setCity("DKI Jakarta");
                Intent moveWithObjectIntent = new Intent(MainActivity.this,
                        MoveWithObjectActivity.class);
                moveWithObjectIntent.putExtra(MoveWithObjectActivity.EXTRA_PERSON,
                        mPerson);
                startActivity(moveWithObjectIntent);

                break;

            case R.id.btn_dial_number:
                String phoneNumber = "081381755824";
                Intent dialPhoneIntent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:"+phoneNumber));
                startActivity(dialPhoneIntent);

            case R.id.btn_move_for_result:
                Intent moveForResultIntent = new Intent(MainActivity.this, MoveForResultActivity.class);
                startActivityForResult(moveForResultIntent, REQUEST_CODE);
                break;
        }

    }
    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == REQUEST_CODE){
            if (resultCode == MoveForResultActivity.RESULT_CODE){
                int selectedValue =
                        data.getIntExtra(MoveForResultActivity.EXTRA_SELECTED_VALUE, 0);
                tvResult.setText("Hasil : "+selectedValue);
            }
        }
    }
}