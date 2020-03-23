package com.example.healthy_flour;

import androidx.appcompat.app.AppCompatActivity;

import android.database.Cursor;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class ShowData extends AppCompatActivity {
    DatabaseHelper MyDB;

    Button b1;
    TextView t1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_data);
        b1=(Button)findViewById(R.id.read1);
        t1=(TextView)findViewById(R.id.text1);
        MyDB = new DatabaseHelper(this);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Clickread();
            }
        });
    }
    /// this function for the read of the raed

    private void Clickread()
    {
        Cursor res=MyDB.getAllData();
        StringBuffer stringBuffer = new StringBuffer();
        if(res!= null && res.getCount()>0){
            while (res.moveToNext()){
                stringBuffer.append("Id:" +res.getString(0)+"\n");
                stringBuffer.append("USERNAME:" +res.getString(1) +"\n" );
                stringBuffer.append("PASSWORD:" +res.getString(2) +"\n");
                stringBuffer.append("REPASSWORD" +res.getString(3) +"\n");
            }
            t1.setText(stringBuffer.toString());
            Toast.makeText(ShowData.this,"data retrieved sucessfully",Toast.LENGTH_SHORT).show();
        }
        else
        {
            Toast.makeText(ShowData.this,"no data found",Toast.LENGTH_SHORT).show();
        }
    }
}
