package com.example.healthy_flour;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Register extends AppCompatActivity {
    DatabaseHelper MyDB;
    EditText e0,e1,e2,e3;
    Button b1,b2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        MyDB = new DatabaseHelper(this);

        e0=(EditText)findViewById(R.id.e0);
        e1=(EditText)findViewById(R.id.e1);
        e2=(EditText)findViewById(R.id.e2);
        e3=(EditText)findViewById(R.id.e3);
        b1=(Button)findViewById(R.id.regib2);
        b2=(Button)findViewById(R.id.show1);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               Clickinsert();
            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in = new Intent(Register.this,ShowData.class);
                startActivity(in);
            }
        });

    }

    private void Clickinsert()
    {
            String id=e0.getText().toString();
            String username =e1.getText().toString();
            String password=e2.getText().toString();
            String repassword=e3.getText().toString();
            Boolean result=MyDB.insertDATA(id,username,password,repassword);

            if(result==true||id.equals(null)==true||id.equals("")==true||username.equals(null)==true||username.equals("")==true||password.equals(null)==true||password.equals("")==true||repassword.equals(null)==true||repassword.equals("")==true)
        {
            Toast.makeText(Register.this,"required field",Toast.LENGTH_SHORT).show();
        }
        else
        {
            Toast.makeText(Register.this,"registration complete",Toast.LENGTH_SHORT).show();
        }
    }
}
