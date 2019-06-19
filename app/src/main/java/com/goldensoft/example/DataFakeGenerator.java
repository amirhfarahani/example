package com.goldensoft.example;

import android.content.Context;
import android.support.v4.content.res.ResourcesCompat;

import java.util.ArrayList;
import java.util.List;

public class DataFakeGenerator
{

    public static List<Post> getData(Context context)
    {
        List<Post> posts=new ArrayList <>();
        for (int i=0;i<6;i++)
        {
            Post post=new Post();
            post.setId(i);
            post.setTitle("golden_art");
            post.setContent( "لورم ایپسوم متن ساختگی با تولید سادگی نامفهوم از صنعت چاپ و با استفاده از طراحان گرافیک است. چاپگرها و متون بلکه روزنامه و مجله در ستون و سطرآنچنان که لازم است و برای شرایط فعلی تکنولوژی مورد نیاز و کاربردهای متنوع با هدف بهبود ابزارهای کاربردی می باشد. کتابهای زیادی در شصت و سه درصد گذشته، حال و آینده شناخت فراوان جامعه و متخصصان را می طلبد تا با نرم افزارها شناخت بیشتری را برای طراحان رایانه ای علی الخصوص طراحان خلاقی و فرهنگ پیشرو در زبان فارسی ایجاد کرد.");
            post.setDate("دو ساعت پیش");
            switch (i)
            {
                case 0:
                    post.setPostImage(ResourcesCompat.getDrawable(context.getResources(),R.drawable.pic1,null));
                    break;
                case 1:
                    post.setPostImage(ResourcesCompat.getDrawable(context.getResources(),R.drawable.pic2,null));
                    break;
                case 2:
                    post.setPostImage(ResourcesCompat.getDrawable(context.getResources(),R.drawable.pic3,null));
                    break;
                case 3:
                    post.setPostImage(ResourcesCompat.getDrawable(context.getResources(),R.drawable.pic4,null));
                    break;
                case 4:
                    post.setPostImage(ResourcesCompat.getDrawable(context.getResources(),R.drawable.pic5,null));
                    break;
                case 5:
                    post.setPostImage(ResourcesCompat.getDrawable(context.getResources(),R.drawable.pic6,null));
                    break;
            }

            posts.add(post);

        }
        return posts;
    }
}


