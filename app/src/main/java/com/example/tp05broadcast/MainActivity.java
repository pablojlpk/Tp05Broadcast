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
private Context context;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        if(Build.VERSION.SDK_INT>= Build.VERSION_CODES.M
                && checkSelfPermission(android.Manifest.permission.CALL_PHONE)
                != PackageManager.PERMISSION_GRANTED) {
            requestPermissions(new String[]{Manifest.permission.CALL_PHONE}, 1000);
        }

        Log.d("salida", "entro ");
        Intent in= new Intent(Intent.ACTION_CALL);
        in.setData(Uri.parse(("tel:2664553747")));
        in.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        context.startActivity(in);


    }

/*        private void registrarBroadcast() {
        Log.d("activa", "entra al broadcast");
            this.bc=new BroadCastllamar();

            registerReceiver(this.bc,new IntentFilter("android.intent.action.AIRPLANE_MODE"));

        }
*/

}

