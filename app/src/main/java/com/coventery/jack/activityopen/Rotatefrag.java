package com.coventery.jack.activityopen;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Display;
import android.view.Surface;
import android.view.WindowManager;
import android.support.v4.app.Fragment;

public class Rotatefrag extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rotatefrag);

        FragmentManager aFragmentManager = getFragmentManager();
        FragmentTransaction aFragmentTransaction = aFragmentManager.beginTransaction();

        WindowManager aWindowManager = getWindowManager();
        Display aDispaly = aWindowManager.getDefaultDisplay();

        int orientation = aDispaly.getRotation();

        if (orientation == Surface.ROTATION_90 || orientation == Surface.ROTATION_270){
            BlankFragment frag1 = new BlankFragment();
            aFragmentTransaction.replace(R.id.container, frag1);
        }

        else {
            BlankFragment2 frag2 = new BlankFragment2();
            aFragmentTransaction.replace(R.id.container, frag2);
        }
        aFragmentTransaction.commit();

    }

}
