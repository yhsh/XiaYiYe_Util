package cn.yhsh.xiayiyetools.utils;

import android.graphics.drawable.Drawable;

import cn.yhsh.xiayiyetools.XiaYiYeApplication;

/**
 * 创建者： 轻飞扬……
 * 日  期： 2017/10/24
 * 时  间： 13:11
 * 联系QQ： 13343401268
 * 个人域： http://yhsh.wap.ai
 */

public class GetResourcesTool {
    /**
     * 获取一个颜色
     *
     * @param color
     * @return
     */
    public static int GetResources_Color(int color) {
        return XiaYiYeApplication.getYHSHContext().getResources().getColor(color);
    }

    /**
     * 获取一个Drawable图片
     *
     * @param drawable
     * @return
     */
    public static Drawable GetResources_Drawable(int drawable) {
        return XiaYiYeApplication.getYHSHContext().getResources().getDrawable(drawable);
    }

    public static float GetResources_dp(int dp) {
        return XiaYiYeApplication.getYHSHContext().getResources().getDimension(dp);
    }
}
