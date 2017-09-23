package com.example.abhishekpc.activitydatapassing;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class Main2Activity extends AppCompatActivity {

    TextView tv2;
    EditText edt2;
    Button btn2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        tv2=(TextView) findViewById(R.id.getmsg);
        edt2=(EditText) findViewById(R.id.replytext);
        btn2=(Button) findViewById(R.id.reply);

        Intent intent2=getIntent();
        Bundle bundle=intent2.getExtras();
        String first=bundle.getString("data");
        tv2.setText(first);



  }
  public void reply(View view){
      String reply=edt2.getText().toString();
      Intent rep=new Intent();
      rep.putExtra("long",reply);
      setResult(RESULT_OK,rep);
      finish();
  }
}
