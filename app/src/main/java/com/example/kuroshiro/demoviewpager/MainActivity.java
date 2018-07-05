package com.example.kuroshiro.demoviewpager;

import android.support.design.widget.TabLayout;
import android.support.v4.app.FragmentManager;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    private ViewPager mView;
    private TabLayout mTab;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addControl();
        SetIcon();
    }

    private void addControl() {
        mView = findViewById(R.id.view_pager);
        mTab =  findViewById(R.id.tab_layout);

        FragmentManager manager = getSupportFragmentManager();

        PagerAdapter adapter = new PagerAdapter(manager);

        mView.setAdapter(adapter);
        mTab.setupWithViewPager(mView);
        mView.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(mTab));

       // mTab.setTabsFromPagerAdapter(adapter);
    }

    private void SetIcon()
    {
        mTab.getTabAt(0).setIcon(R.drawable.ic_launcher_foreground);
        mTab.getTabAt(1).setIcon(R.drawable.ic_launcher_foreground);
        mTab.getTabAt(2).setIcon(R.drawable.ic_launcher_foreground);
    }
}
