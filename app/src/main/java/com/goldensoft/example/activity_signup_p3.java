package com.goldensoft.example;

import android.content.Intent;
import android.graphics.Typeface;
import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

public class activity_signup_p3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup_p3);


        Typeface typeface=Typeface.createFromAsset(getAssets(),"fonts/iranian_sans.ttf");


        //Buttom
        Button save_btn=(Button)findViewById(R.id.save_btn);

        save_btn.setTypeface(typeface);


        //ImageView
        ImageButton back_imgbtn=(ImageButton)findViewById(R.id.back_ImgBtn);


        //TextView
        TextView textView_signup=(TextView)findViewById(R.id.TextView_SingUp);
        TextView textView_personal_information=(TextView)findViewById(R.id.TextView_personal_information);

        textView_signup.setTypeface(typeface);
        textView_personal_information.setTypeface(typeface);


        //EditText
        EditText editText_username=(EditText)findViewById(R.id.EditText_username);
        final EditText editText_password=(EditText)findViewById(R.id.EditText_password);
        final EditText editText_try_password=(EditText)findViewById(R.id.EditText_try_password);

        editText_username.setTypeface(typeface);
        editText_password.setTypeface(typeface);
        editText_try_password.setTypeface(typeface);





        back_imgbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(activity_signup_p3.this,activity_signup_p2.class);
                startActivity(intent);
            }
        });


        save_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (editText_password.getText().toString().equals(editText_try_password.getText().toString())){
                    Toast.makeText(activity_signup_p3.this, "اطلاعات شما با موفقیت ثبت شد .", Toast.LENGTH_SHORT).show();
                    Intent intent=new Intent(activity_signup_p3.this,MainActivity.class);
                    startActivity(intent);
                }
                else{
                    Toast.makeText(activity_signup_p3.this, "رمز عبور معتبر نمی باشد", Toast.LENGTH_SHORT).show();
                }
            }
        });






    }
}
