package com.project.sokheangret.animationflash;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.widget.Toast;

import com.github.paolorotolo.appintro.AppIntro;
import com.github.paolorotolo.appintro.AppIntroFragment;

public class App_Intro extends AppIntro {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        addSlide(AppIntroFragment.newInstance("Welcome to Sva app!","This is a app that built for Sva. You using it, it mean you are a sva.",R.drawable.sva3,getResources().getColor(R.color.colorAccent)));
        addSlide(AppIntroFragment.newInstance("This is your profile!","This is your photo in the future.",R.drawable.sva2,getResources().getColor(R.color.colorPrimary)));
        addSlide(AppIntroFragment.newInstance("This is your favorite food","Start from now you can eat banana for lunch time. ", R.drawable.banana,getColor(R.color.colorYellow)));

    }

    @Override
    public void onDonePressed(Fragment currentFragment) {
        super.onDonePressed(currentFragment);
        Toast.makeText(this, "Done", Toast.LENGTH_SHORT).show();
    }
}
