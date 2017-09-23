package com.example.abhishekpc.activitydatapassing;

import android.content.Intent;
import android.os.Message;
import android.support.v4.app.NotificationCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import static android.R.id.message;

public class MainActivity extends AppCompatActivity {

    TextView tv1;
    EditText edt1;
    Button btn1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv1=(TextView) findViewById(R.id.getreply);
        edt1=(EditText) findViewById(R.id.sendtext);
        btn1=(Button) findViewById(R.id.send);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1=new Intent(MainActivity.this,Main2Activity.class);
                intent1.putExtra("data",edt1.getText().toString());
//                startActivity(intent1);
                startActivityForResult(intent1,1);
            }
        });

    }

    protected void onActivityResult(int requestcode,int resultcode,Intent data){
        tv1.setText(data.getStringExtra("long"));
    }
}
