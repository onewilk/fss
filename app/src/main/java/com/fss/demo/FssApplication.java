package com.fss.demo;

import android.app.Application;

import com.fss.demo.route.RouteDetailActivity;
import com.fss.demo.util.ToastUtils;
import com.fss.router.annotation.Route;

@Route(
        destination = "com.fss.demo.route.RouteDetailActivity",
        name = "routeTestDestination"
)
@Route(
        className = "com.fss.demo.MainActivity",
        group = "haha",
        name = "navigateToMainActivityHaha"
)
public class FssApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        ToastUtils.register(getApplicationContext());
    }

}
