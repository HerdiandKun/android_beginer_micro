package org.micro.amin.profile;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class DetailRiwayatActivity extends AppCompatActivity {

    ListView lv_riwayat_pendidikan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_riwayat);

        lv_riwayat_pendidikan = (ListView) findViewById(R.id.lv_riwayat_pendidikan);
        final String riwayat[] = {"SDN xxxx",
                            "SMPN xxxx",
                            "SMAN xxxx",
                            "IPB"};

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, riwayat);
        lv_riwayat_pendidikan.setAdapter(adapter);

        lv_riwayat_pendidikan.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(DetailRiwayatActivity.this,riwayat[position],Toast.LENGTH_LONG).show();
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
//        return super.onCreateOptionsMenu(menu);
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
//        return super.onOptionsItemSelected(item);
        int id = item.getItemId();

        if (id == R.id.menu_exit) {
            finish();
            System.exit(0);
        }
         return super.onOptionsItemSelected(item);
    }
}
