package com.goldensoft.example;

import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;

public class activity_Login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity__login);


        Typeface typeface=Typeface.createFromAsset(getAssets(),"fonts/iranian_sans.ttf");

        //ImageButtom
        ImageButton back_ImgBtn=(ImageButton)findViewById(R.id.back_ImgBtn);


        //Button
        Button login_btn=(Button)findViewById(R.id.login_btn);

        login_btn.setTypeface(typeface);


        //EditText
        EditText editText_username_login=(EditText)findViewById(R.id.EditText_username_login);
        EditText editText_password_login=(EditText)findViewById(R.id.EditText_password_login);

        editText_username_login.setTypeface(typeface);
        editText_password_login.setTypeface(typeface);




    }
}
