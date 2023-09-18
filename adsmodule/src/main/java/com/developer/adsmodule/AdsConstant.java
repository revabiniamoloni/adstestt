package com.developer.adsmodule;

import android.app.Activity;
import android.widget.Toast;

public class AdsConstant {

    public static void showToast(Activity activity, String msg) {
        Toast.makeText(activity, msg, Toast.LENGTH_SHORT).show();
    }

    public static boolean checkBuild() {
        return BuildConfig.DEBUG;
    }
}
