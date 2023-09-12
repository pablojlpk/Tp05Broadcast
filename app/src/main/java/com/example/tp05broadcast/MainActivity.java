package com.example.tp05broadcast;

import androidx.appcompat.app.AppCompatActivity;

import android.Manifest;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
private BroadCastllamar bc;
//private Context context;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        habilitarPermisos();
        registrarBroadcast();

}

        private void registrarBroadcast() {
        Log.d("activa", "entra al broadcast");
            this.bc=new BroadCastllamar();
            registerReceiver(this.bc,new IntentFilter("android.net.wifi.supplicant.CONNECTION_CHANGE"));
        }

        public void habilitarPermisos(){
            if(Build.VERSION.SDK_INT>= Build.VERSION_CODES.M
                    && checkSelfPermission(android.Manifest.permission.CALL_PHONE)
                    != PackageManager.PERMISSION_GRANTED) {
                requestPermissions(new String[]{Manifest.permission.CALL_PHONE}, 1000);
            }
        }


    @Override
    protected void onDestroy() {
        super.onDestroy();
        unregisterReceiver(this.bc);
    }
}

