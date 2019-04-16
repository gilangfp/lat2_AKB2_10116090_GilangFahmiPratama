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
import android.widget.Button;

public class account extends AppCompatActivity {
        private Button button5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_account);
        button5= (Button) findViewById(R.id.button5);
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                username();
            }
        });
    }
    public void username(){
        Intent i=new Intent(this,user.class);
        startActivity(i);
    }
}
