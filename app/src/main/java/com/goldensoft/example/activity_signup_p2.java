package com.goldensoft.example;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.RadioButton;
import android.widget.TextView;

public class activity_signup_p2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup_p2);

        Typeface typeface=Typeface.createFromAsset(getAssets(),"fonts/iranian_sans.ttf");

        //ImageButtom
        ImageButton back_imgbtn=(ImageButton)findViewById(R.id.back_ImgBtn);

        //buttom
        Button continue_btn=(Button)findViewById(R.id.continue_btn);

        continue_btn.setTypeface(typeface);

        //edittext
        EditText editText_company_name=(EditText)findViewById(R.id.EditText_company_name);

        editText_company_name.setTypeface(typeface);


        //textview
        TextView textView_singup=(TextView)findViewById(R.id.TextView_SingUp);
        TextView textView_field_of_activity=(TextView)findViewById(R.id.TextView_field_of_activity);
        TextView textView_personal_information=(TextView)findViewById(R.id.TextView_field_of_activity);


        textView_singup.setTypeface(typeface);
        textView_field_of_activity.setTypeface(typeface);
        textView_personal_information.setTypeface(typeface);



        //radiobuttom

        RadioButton radioButton_har_do=(RadioButton)findViewById(R.id.RadioButton_har_do);
        RadioButton radioButton_workshop=(RadioButton)findViewById(R.id.RadioButton_workshop);
        RadioButton radioButton_store=(RadioButton)findViewById(R.id.RadioButton_store);

        radioButton_har_do.setTypeface(typeface);
        radioButton_workshop.setTypeface(typeface);
        radioButton_store.setTypeface(typeface);




        back_imgbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(activity_signup_p2.this,activity_singup_p1.class);
                startActivity(intent);
            }

        });

        continue_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(activity_signup_p2.this,activity_signup_p3.class);
                startActivity(intent);
            }
        });






    }
}
