package cn.yhsh.xiayiyetools.utils;

import android.widget.Toast;

import cn.yhsh.xiayiyetools.XiaYiYeApplication;

public class ToastUtil {
	private static Toast toast;
	public static void showToast(String text){
		if(toast==null){
			toast = Toast.makeText(XiaYiYeApplication.getYHSHContext(),text,Toast.LENGTH_LONG);
		}
		toast.setText(text);
		toast.show();
	}
}
