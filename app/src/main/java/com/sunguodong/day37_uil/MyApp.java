package com.sunguodong.day37_uil;

import android.app.Application;

import com.nostra13.universalimageloader.core.ImageLoader;
import com.nostra13.universalimageloader.core.ImageLoaderConfiguration;

/**
 * User: sgd(952519440@qq.com)
 * Date: 2016/09/06
 * Time: 10:02
 * progject: Day37_UIL
 * Describe：
 */

/**
 * 1.初始化网络请求框架
 * 2.初始化突破按加载框架
 * 3.初始化数据库框架
 * 4.定义全局性的变量
 */
public class MyApp extends Application {

    private static MyApp app;
    private ImageLoader imageLoader;

    @Override
    public void onCreate() {
        super.onCreate();
        this.app = this;
        initUniversalImageLoader();
    }

    private void initUniversalImageLoader() {
        //获取ImageLoader实例
        imageLoader = ImageLoader.getInstance();

        //初始化图片加载框架
        //1.定义配置信息
        ImageLoaderConfiguration imageLoaderConfiguration = ImageLoaderConfiguration.createDefault(this);
        //2.将配置信息带入初始化
        imageLoader.init(imageLoaderConfiguration);

    }

    public static MyApp getApp() {
        return app;
    }

    public ImageLoader getImageLoader() {
        return imageLoader;
    }
}
