package id.ac.rohim.basiccrodential;

import androidx.appcompat.app.AppCompatActivity;

import android.app.KeyguardManager;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.provider.Settings;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    public static  final  int LOCK_REQUEST_CODE = 221;
    public static final int SECURITY_SETTING_REQUEST_CODE = 223;

    TextView textView;
    //method untuk autentikasi
    private void authenticateApp(){
        //inisiasi obyek keyguardManager
        //keyguardManager

        KeyguardManager keyguardManager = (KeyguardManager) getSystemService(KEYGUARD_SERVICE);

        //cek
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP){
            //membuat intent
            Intent i = keyguardManager.createConfirmDeviceCredentialIntent(getResources().getString(R.string.unlock),
                    getResources().getString(R.string.confirm_pattern));
            try {
                //jalankan intent
                startActivityForResult(i, LOCK_REQUEST_CODE);
            } catch (Exception e){
                Intent intent = new Intent(Settings.ACTION_SECURITY_SETTINGS);
                try {
                    startActivityForResult(intent,SECURITY_SETTING_REQUEST_CODE);
                }catch (Exception ex){
                    textView.setText(getResources().getString(R.string.setting_label));
                }
            }

        }
    }

    @Override
    protected void  onActivityResult(int requestCode,int resultCode, Intent data){
        super.onActivityResult(requestCode,resultCode, data);
        switch (requestCode){
            case LOCK_REQUEST_CODE:
                if (resultCode != RESULT_OK){
                    textView.setText(getResources().getString(R.string.unlock_failed));
                }
                break;
            case SECURITY_SETTING_REQUEST_CODE:
                if (isDevicesecure()){
                    Toast.makeText(this,getResources().getString(R.string.device_is_secure),
                            Toast.LENGTH_SHORT).show();
                    authenticateApp();
                } else {
                    textView.setText(getResources().getString(R.string.security_device_cancelled));
                }
                break;
        }
    }
    private boolean isDevicesecure(){
        KeyguardManager keyguardManager = (KeyguardManager) getSystemService(KEYGUARD_SERVICE);
        return Build.VERSION.SDK_INT >= Build.VERSION_CODES.JELLY_BEAN && keyguardManager.isKeyguardSecure();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = findViewById(R.id.tv_label);
        authenticateApp();
    }
}