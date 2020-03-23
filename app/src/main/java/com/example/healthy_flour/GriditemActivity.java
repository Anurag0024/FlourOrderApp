package com.example.healthy_flour;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class GriditemActivity extends AppCompatActivity {
    TextView name,textView1,textView2;
    ImageView image;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_griditem);

        name=(TextView)findViewById(R.id.griddata);
        image=(ImageView)findViewById(R.id.imageView);
        textView1=(TextView)findViewById(R.id.textView1);
        textView2=(TextView)findViewById(R.id.textView2);

        Intent intent= getIntent();
        name.setText(intent.getStringExtra("name"));
        image.setImageResource(intent.getIntExtra("images",0));
        textView1.setText(intent.getStringExtra("textView1"));
        textView2.setText(intent.getStringExtra("textView2"));
    }
}
