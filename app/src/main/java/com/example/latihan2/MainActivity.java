/**
 * tanggal pengerjaan   : 15/04/2019
 * nim                  :10116090
 * nama                 :Gilang Fahmi Pratama
 * kelas                :AKB-2
 */

package com.example.latihan2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView textView3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView3=(TextView)findViewById(R.id.textView3);
        textView3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                daftar();
            }
        });
    }
            public void daftar(){
                Intent intent=new Intent(this,daftar.class);
                startActivity(intent);
            }
}
