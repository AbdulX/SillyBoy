package com.wiseyep.tubebaby.baby.activity.utils;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager.NameNotFoundException;

public class PackageInfoUtils {
	private PackageInfoUtils(){};
	public static String getPackageVersion(Context context){
		String version=null;
		try {
			PackageInfo packinfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
			version = packinfo.versionName;
			
		} catch (NameNotFoundException e) {
			e.printStackTrace();
		}
		return version;
	}
	public static int getPackageVersionCode(Context context){
		int code = 0;
		try {
			PackageInfo packinfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
			code = packinfo.versionCode;
		} catch (NameNotFoundException e) {
			e.printStackTrace();
		}
		return code;
	}
}
