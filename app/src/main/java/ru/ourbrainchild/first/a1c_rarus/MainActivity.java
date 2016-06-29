package ru.ourbrainchild.first.a1c_rarus;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;

import ru.ourbrainchild.first.a1c_rarus.fragments.Fragment_Eighth;
import ru.ourbrainchild.first.a1c_rarus.fragments.Fragment_Fifth;
import ru.ourbrainchild.first.a1c_rarus.fragments.Fragment_First;
import ru.ourbrainchild.first.a1c_rarus.fragments.Fragment_Fourth;
import ru.ourbrainchild.first.a1c_rarus.fragments.Fragment_Second;
import ru.ourbrainchild.first.a1c_rarus.fragments.Fragment_Seventh;
import ru.ourbrainchild.first.a1c_rarus.fragments.Fragment_Sixth;
import ru.ourbrainchild.first.a1c_rarus.fragments.Fragment_Third;

public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    Fragment_First f_first;
    Fragment_Second f_second;
    Fragment_Third f_third;
    Fragment_Fourth f_fourth;
    Fragment_Fifth f_fifth;
    Fragment_Sixth f_sixth;
    Fragment_Seventh f_seventh;
    Fragment_Eighth f_eighth;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);



        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
        f_first = new Fragment_First();
        f_second = new Fragment_Second();
        f_third = new Fragment_Third();
        f_fourth = new Fragment_Fourth();
        f_fifth = new Fragment_Fifth();
        f_sixth = new Fragment_Sixth();
        f_seventh = new Fragment_Seventh();
        f_eighth = new Fragment_Eighth();
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        FragmentTransaction ftrans = getSupportFragmentManager().beginTransaction();

        if (id == R.id.nav_first) {
            ftrans.replace(R.id.container, f_first);
        } else if (id == R.id.nav_second) {
            ftrans.replace(R.id.container, f_second);
        } else if (id == R.id.nav_third) {
            ftrans.replace(R.id.container, f_third);
        } else if (id == R.id.nav_fourth) {
            ftrans.replace(R.id.container, f_fourth);
        } else if (id == R.id.nav_fifth) {
            ftrans.replace(R.id.container, f_fifth);
        } else if (id == R.id.nav_sixth) {
            ftrans.replace(R.id.container, f_sixth);
        } else if (id == R.id.nav_seventh) {
            ftrans.replace(R.id.container, f_seventh);
        } else if (id == R.id.nav_eighth){
            ftrans.replace(R.id.container, f_eighth);
        } ftrans.commit();

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
