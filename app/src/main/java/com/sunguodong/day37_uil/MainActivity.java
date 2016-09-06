package com.sunguodong.day37_uil;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

import com.nostra13.universalimageloader.core.DisplayImageOptions;

public class MainActivity extends AppCompatActivity {

    private ImageView imageView;
    private String url = "https://ss0.bdstatic.com/5aV1bjqh_Q23odCf/static/superman/img/logo/logo_white_fe6da1ec.png";



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imageView = (ImageView) findViewById(R.id.activity_main_imageId);
    }

    public void imageLoader(View view) {

        DisplayImageOptions displayImageOptions = new DisplayImageOptions.Builder()
                .showImageOnLoading(R.mipmap.ic_launcher)
                .cacheInMemory(true)
                .cacheInMemory(true)
                .build();

        /**
         * 参数1.url地址
         * 参数2.imageView
         * 参数3.显示图片选项（配置缓存，配置解码方式，显示处理{圆角，圆形，淡入}）
         * 参数4.图片加载监听
         * 参数5.图片下载进度监听
         */
        MyApp.getApp().getImageLoader().displayImage(
                url,
                imageView,
                displayImageOptions

        );

    }
}
