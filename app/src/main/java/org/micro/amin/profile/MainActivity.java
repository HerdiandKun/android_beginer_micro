package org.micro.amin.profile;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private static String TAG = "MainActivity";
    Button btn_riwayat,btn_call;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_riwayat = (Button) findViewById(R.id.btn_riwayat);
        btn_call = (Button) findViewById(R.id.btn_call);
        Log.d(TAG, "onCreate");

        btn_call.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView telepon = (TextView) findViewById(R.id.telepon);
                String toDial = "tel:"+telepon.getText().toString();
                Intent call =  new Intent(Intent.ACTION_DIAL, Uri.parse(toDial));
                startActivity(call);
            }
        });

        btn_riwayat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i =  new Intent(MainActivity.this,DetailRiwayatActivity.class);
                startActivity(i);

            }
        });
    }

    @Override
    protected void onStart() {
        super.onStart();

        Log.d(TAG, "onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();

        Log.d(TAG, "onResume");
    }


}
