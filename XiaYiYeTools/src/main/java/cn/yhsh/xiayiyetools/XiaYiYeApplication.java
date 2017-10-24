package cn.yhsh.xiayiyetools;

import android.app.Application;
import android.content.Context;
import android.os.Handler;

/**
 * 创建者： 轻飞扬……
 * 日  期： 2017/10/24
 * 时  间： 13:05
 * 联系QQ： 13343401268
 * 个人域： http://yhsh.wap.ai
 */

public class XiaYiYeApplication extends Application {
    private static XiaYiYeApplication context;
    private static Handler mainHandler;//全局的主线程handler

    @Override
    public void onCreate() {
        super.onCreate();
        context = this;
        //初始化mainHandler,在主线程创建的handler就是主线程的handler
        mainHandler = new Handler();
    }

    /**
     * 获取全局的上下文
     *
     * @return
     */
    public static Context getYHSHContext() {
        return context;
    }

    /**
     * 获取全局主线程handler
     *
     * @return
     */
    public static Handler getMainHandler() {
        return mainHandler;
    }
}
