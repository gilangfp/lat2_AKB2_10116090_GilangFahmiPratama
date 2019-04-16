/**
 * tanggal pengerjaan   : 16/04/2019
 * nim                  :10116090
 * nama                 :Gilang Fahmi Pratama
 * kelas                :AKB-2
 */

package com.example.latihan2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;




public class almost extends AppCompatActivity {
    private Button button4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_almost);
        button4=(Button) findViewById(R.id.button4);
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            accounts();
            }
        });
    }

    public void accounts(){
        Intent i=new Intent(this,account.class);
        startActivity(i);
    }
}

