package com.goldensoft.example;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;

public class activity_singup_p1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_singup_p1);

        Typeface typeface=Typeface.createFromAsset(getAssets(),"fonts/iranian_sans.ttf");

        //EditText
        EditText editText_name=(EditText)findViewById(R.id.EditText_name);
        EditText editText_phone=(EditText)findViewById(R.id.EditText_phone);
        EditText editText_mobile=(EditText)findViewById(R.id.EditText_mobile);
        EditText editText_address=(EditText)findViewById(R.id.EditText_address);

        editText_name.setTypeface(typeface);
        editText_phone.setTypeface(typeface);
        editText_mobile.setTypeface(typeface);
        editText_address.setTypeface(typeface);


        //TextView
        TextView singup=(TextView)findViewById(R.id.TextView_SingUp);

        singup.setTypeface(typeface);


        //Button
        Button change_pic_btn=(Button)findViewById(R.id.Change_pic_btn);
        Button continue_btn=(Button)findViewById(R.id.continue_btn);

        change_pic_btn.setTypeface(typeface);
        continue_btn.setTypeface(typeface);


        //ImageButtom

        ImageButton back_imgbtn=(ImageButton)findViewById(R.id.back_ImgBtn);



        back_imgbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(activity_singup_p1.this,MainActivity.class);
                startActivity(intent);
            }
        });


        continue_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(activity_singup_p1.this,activity_signup_p2.class);
                startActivity(intent);
            }
        });


    }
}
