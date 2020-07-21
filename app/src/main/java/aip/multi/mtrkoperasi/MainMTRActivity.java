package aip.multi.mtrkoperasi;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;


public class MainMTRActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mainmtr);
        Thread thread = new Thread() {
            @Override
            public void run() {
                {
                    try {
                        sleep(5000);
                    } catch (Exception e) {
                        e.printStackTrace();
                    } finally {
                        Intent intent=new Intent(MainMTRActivity.this, Settings.class);
                        startActivity(intent);
                    }
                }
            }
        };
        thread.start();
    }



    @Override
    protected void onPause() {
        super.onPause();
        finish();
    }


}
