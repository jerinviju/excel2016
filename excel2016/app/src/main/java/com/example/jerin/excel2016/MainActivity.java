package com.example.jerin.excel2016;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.Toast;

import com.example.jerin.excel2016.fragments.Innovationsfragment;
import com.example.jerin.excel2016.fragments.Schedulefragment;
import com.example.jerin.excel2016.fragments.aboutfragment;
import com.example.jerin.excel2016.fragments.accountsfragment;
import com.example.jerin.excel2016.fragments.competitionfragment;
import com.example.jerin.excel2016.fragments.funzonefragment;
import com.example.jerin.excel2016.fragments.galleryfragment;
import com.example.jerin.excel2016.fragments.homefragment;
import com.example.jerin.excel2016.fragments.mapfragment;
import com.example.jerin.excel2016.fragments.newsfeedfragment;
import com.example.jerin.excel2016.fragments.proshowfragment;
import com.example.jerin.excel2016.fragments.talksfragment;
import com.special.ResideMenu.ResideMenu;
import com.special.ResideMenu.ResideMenuItem;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
 ResideMenu resideMenu;


    private ResideMenuItem account;
    private ResideMenuItem Schedule;
    private ResideMenuItem map;
    private ResideMenuItem newsfeed;
    private ResideMenuItem gallery;
    private ResideMenuItem about;
    private ResideMenuItem competition;
    private ResideMenuItem talks;
    private ResideMenuItem workshops;
    private ResideMenuItem Innovations;
    private ResideMenuItem funzone;
    private ResideMenuItem proshow;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mainactivity);

        resideMenu = new ResideMenu(this);

        resideMenu.setBackground(R.drawable.index);
        resideMenu.attachToActivity(this);
        resideMenu.setMenuListener(menuListener);
        // create menu items;
      // resideMenu.setScaleValue(0.2f);

        account = new ResideMenuItem(this, R.drawable.index, "Account");
        Schedule = new ResideMenuItem(this, R.drawable.index, "Schedule");
        map = new ResideMenuItem(this, R.drawable.index, "Map");
        newsfeed = new ResideMenuItem(this, R.drawable.index, "Newsfeed");
        gallery = new ResideMenuItem(this, R.drawable.index, "Gallery");
        about = new ResideMenuItem(this, R.drawable.index, "About");
        competition = new ResideMenuItem(this, R.drawable.index, "Competition");
        talks = new ResideMenuItem(this, R.drawable.index, "Talks");
        workshops = new ResideMenuItem(this, R.drawable.index, "workshops");
        Innovations = new ResideMenuItem(this, R.drawable.index, "Innovation");
        funzone = new ResideMenuItem(this, R.drawable.index, "FunZone");
        proshow = new ResideMenuItem(this, R.drawable.index, "Proshow");

        account.setOnClickListener(this);
        Schedule.setOnClickListener(this);
        map.setOnClickListener(this);
        newsfeed.setOnClickListener(this);
        gallery.setOnClickListener(this);
        about.setOnClickListener(this);
        competition.setOnClickListener(this);
        talks.setOnClickListener(this);
        workshops.setOnClickListener(this);
        Innovations.setOnClickListener(this);
        funzone.setOnClickListener(this);
        proshow.setOnClickListener(this);

        resideMenu.addMenuItem(account, ResideMenu.DIRECTION_LEFT);
        resideMenu.addMenuItem(Schedule, ResideMenu.DIRECTION_LEFT);
        resideMenu.addMenuItem(map, ResideMenu.DIRECTION_LEFT);
        resideMenu.addMenuItem(newsfeed, ResideMenu.DIRECTION_LEFT);
        resideMenu.addMenuItem(gallery, ResideMenu.DIRECTION_LEFT);
        resideMenu.addMenuItem(about, ResideMenu.DIRECTION_LEFT);
        resideMenu.addMenuItem(competition, ResideMenu.DIRECTION_RIGHT);
        resideMenu.addMenuItem(talks, ResideMenu.DIRECTION_RIGHT);
        resideMenu.addMenuItem(workshops, ResideMenu.DIRECTION_RIGHT);
        resideMenu.addMenuItem(Innovations, ResideMenu.DIRECTION_RIGHT);
        resideMenu.addMenuItem(funzone, ResideMenu.DIRECTION_RIGHT);
        resideMenu.addMenuItem(proshow, ResideMenu.DIRECTION_RIGHT);
        changeFragment(new homefragment());
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent ev) {
        return resideMenu.dispatchTouchEvent(ev);
    }

    @Override
    public void onClick(View view) {
        if (view == account){
            changeFragment(new accountsfragment());
        }else if (view == Schedule){
            changeFragment(new Schedulefragment());
        }else if (view == map){
            changeFragment(new mapfragment());
        }else if (view == newsfeed){
            changeFragment(new newsfeedfragment());
        }
        else if (view == gallery){
          changeFragment(new galleryfragment());
        }
        else if (view == about){
              changeFragment(new aboutfragment());
        }
        else if (view == competition){
              changeFragment(new competitionfragment());
        }
        else if (view == talks){
              changeFragment(new talksfragment());
        }
        else if (view == Innovations){
              changeFragment(new Innovationsfragment());
        }
        else if (view == funzone){
              changeFragment(new funzonefragment());
        }
        else if (view == proshow){
              changeFragment(new proshowfragment());
        }
        resideMenu.closeMenu();
    }
    private ResideMenu.OnMenuListener menuListener = new ResideMenu.OnMenuListener() {
        @Override
        public void openMenu() {
            Toast.makeText(MainActivity.this, "Menu is opened!", Toast.LENGTH_SHORT).show();
        }
        @Override
        public void closeMenu() {
            Toast.makeText(MainActivity.this, "Menu is closed!", Toast.LENGTH_SHORT).show();
        }
    };
    public void changeFragment(Fragment fragment){
        resideMenu.clearIgnoredViewList();
        FragmentManager manager5=getSupportFragmentManager();
        FragmentTransaction fragmentTransaction5 = manager5.beginTransaction();

        fragmentTransaction5.replace(R.id.container, fragment);

        fragmentTransaction5.commit();
    }
    public ResideMenu getResideMenu(){
        return resideMenu;
    }

}

