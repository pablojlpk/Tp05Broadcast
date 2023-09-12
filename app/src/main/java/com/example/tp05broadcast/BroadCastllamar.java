package com.example.tp05broadcast;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;

public class BroadCastllamar extends BroadcastReceiver {


    @Override
    public void onReceive(Context context, Intent intent) {

        Intent in= new Intent(Intent.ACTION_CALL);
        in.setData(Uri.parse(("tel:2664553747")));
        in.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        context.startActivity(in);
    }

    public void llamar( Context context) {
        Intent in= new Intent(Intent.ACTION_CALL);
        in.setData(Uri.parse(("tel:2664553747")));
        in.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        context.startActivity(in);

    }
}
