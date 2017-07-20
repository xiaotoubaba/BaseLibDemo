package com.jovision.xunwei.lib;

import android.app.Application;
import android.content.Context;

import com.jovision.xunwei.lib.exception.CrashHanlderExcetpion;
import com.jovision.xunwei.lib.util.LogUtil;


public class BaseApplication extends Application{
	
	private static Context mContext;
	 
	@Override
    public void onCreate() {
        super.onCreate();
        mContext = this.getApplicationContext();
        
        CrashHanlderExcetpion.getInstance().init(this);
        
        //log
        LogUtil.setLevel(LogUtil.Level.V);

	}
	
	public static Context getContext(){
        return mContext;
    }

}
