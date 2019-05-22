package com.example.tabs;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;

public class MainActivity extends AppCompatActivity {
    Toolbar mToolbar;
    ViewPager vPager;
    TabLayout tbLayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mToolbar=findViewById(R.id.m_toolbar);
        setSupportActionBar(mToolbar);

       tbLayout=findViewById(R.id.tab_layout);
       vPager=findViewById(R.id.view_pager);

       ViewPagerAdapter adapt=new ViewPagerAdapter(getSupportFragmentManager());
        adapt.addFrg(new FragmentOne(),"");
        adapt.addFrg(new FragmentTwo(),"");
        adapt.addFrg(new FragmentThree(),"");

        /*
        adapt.addFrg(new FragmentOne(),"message");
        adapt.addFrg(new FragmentTwo(),"Voicce Call");
        adapt.addFrg(new FragmentThree(),"Video Call");
*/
        tbLayout.getTabAt(0).setIcon(R.drawable.ic_launcher_foreground);
        tbLayout.getTabAt(1).setIcon(R.drawable.ic_launcher_foreground);
        tbLayout.getTabAt(2).setIcon(R.drawable.ic_launcher_foreground);
        vPager.setAdapter(adapt);
        tbLayout.setupWithViewPager(vPager);

    }
}
