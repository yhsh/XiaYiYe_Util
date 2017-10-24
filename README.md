第一次上传下一页自制工具类到GitHub

具体使用库的方法： 现在你项目project下面的build.gradle文件里面添加如下代码


allprojects {
	repositories {
		...
		maven { url 'https://jitpack.io' }
	}
}


然后在你的model项目的build.gradle里面添加如下代码


dependencies {
        compile 'com.github.yhsh:XiaYiYe_Tool:v1.0'
}



就这样就可以使用我的内库文件了 使用方法： 先把上面的库文件引入，
工具里面有全局Context，XiaYiYeApplication 方法： 
先在你的xml清单文件里面的application标签里面配置name：如下：
 android:name="cn.yhsh.xiayiyetools.XiaYiYeApplication" 
 更多工具以后添加，里面更多的工具类，自己可以看下
