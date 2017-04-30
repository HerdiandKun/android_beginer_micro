package org.micro.amin.profile;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class DetailRiwayatActivity extends AppCompatActivity {

    ListView lv_riwayat_pendidikan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_riwayat);

        lv_riwayat_pendidikan = (ListView) findViewById(R.id.lv_riwayat_pendidikan);
        String riwayat[] = {"SDN xxxx",
                            "SMPN xxxx",
                            "SMAN xxxx",
                            "IPB"};

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, riwayat);
        lv_riwayat_pendidikan.setAdapter(adapter);
    }
}
