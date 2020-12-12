package com.example.mapfoodltdd;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.mapfoodltdd.home.HomeFragment;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class LogoBK extends AppCompatActivity {

    private static  int SPLASH_SCREEN = 5000;
    //variables
    Animation topAnim132 , bottonAnim132,midAnim132;
    ImageView img132;
    TextView tv_app132,solgan132;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_logobk);
        BottomNavigationView navView = findViewById(R.id.bottom_navigation);
        // Passing each menu ID as a set of Ids because each
        // menu should be considered as top level destinations.
//        AppBarConfiguration appBarConfiguration = new AppBarConfiguration.Builder(
//                R.id.navigation_home, R.id.navigation_dashboard, R.id.navigation_notifications)
//                .build();
//        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment);
//        NavigationUI.setupActionBarWithNavController(this, navController, appBarConfiguration);
//        NavigationUI.setupWithNavController(navView, navController);

        //Animations
        topAnim132 = AnimationUtils.loadAnimation(this,R.anim.top_animation);
        bottonAnim132 = AnimationUtils.loadAnimation(this,R.anim.bottom_animation);
        midAnim132 = AnimationUtils.loadAnimation(this,R.anim.mid_animation);
        // hooks
//        tv_app = findViewById(R.id.tv_app);
        solgan132 = findViewById(R.id.solgan);
        img132 = findViewById(R.id.logolk);
        img132.setAnimation(topAnim132);
//        tv_app.setAnimation(midAnim);
        solgan132.setAnimation(bottonAnim132);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(LogoBK.this,MainActivity.class);
                startActivity(intent);
                finish();
            }
        },SPLASH_SCREEN);
    }
}