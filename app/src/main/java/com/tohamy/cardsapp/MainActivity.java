package com.tohamy.cardsapp;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;

import com.facebook.drawee.backends.pipeline.Fresco;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
    }

    protected void init(){
        initViews();
        Fresco.initialize(this);
    }

    protected void initViews(){
        initToolbar();
        initCardsView();
//        initFab();
    }

    protected void initToolbar(){
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
    }

    protected void initCardsView(){
        ArrayList<NowCard> cards = new ArrayList<>();
        cards.add(new NowCard("GDG Design session", "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Vivamus tincidunt feugiat fringilla. Donec consectetur elit ut urna viverra, sit amet fermentum eros dignissim. Fusce efficitur velit dui. Donec eu nisi massa. Nullam finibus quam blandit metus accumsan mattis. Donec blandit fermentum felis a tincidunt. Curabitur tempus risus velit, in dapibus nibh cursus sit amet. Quisque hendrerit luctus leo ac dapibus. Quisque mattis, turpis in ornare aliquam, dolor lectus sagittis massa, sed consectetur risus lacus vel orci. Donec eget diam nibh. Nullam pulvinar ultrices libero. Mauris sagittis metus et faucibus commodo. Vestibulum nec elit rutrum lacus maximus molestie. Proin finibus suscipit eros bibendum semper. Cras elementum commodo sollicitudin.\n" +
                "\n" +
                "Pellentesque et tellus ullamcorper, posuere nulla vel, bibendum enim. Donec ornare erat nulla, sed gravida lectus malesuada quis. Ut consectetur, enim sit amet dignissim varius, tortor ipsum accumsan nisl, non interdum sem magna at lorem. Suspendisse rhoncus finibus nibh in luctus. Nunc dapibus, magna vel tincidunt commodo, urna mi malesuada purus, sed tristique sapien lorem eget purus. Aliquam non tellus nunc. Sed viverra, nunc sed elementum lacinia, ante nulla tincidunt leo, sed ultrices est libero sed dui. Nunc lobortis blandit velit, ut tincidunt velit rutrum eget. Pellentesque leo ipsum, vestibulum non tellus sed, elementum porttitor dolor. Phasellus aliquam eros metus, ac sollicitudin nibh vestibulum ut. Duis velit justo, facilisis non dapibus eget, volutpat sit amet tellus. Maecenas ac sollicitudin ipsum."
                , R.drawable.ic_launcher));
        cards.add(new NowCard("GDG Design session end", "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Vivamus tincidunt feugiat fringilla. Donec consectetur elit ut urna viverra, sit amet fermentum eros dignissim. Fusce efficitur velit dui. Donec eu nisi massa. Nullam finibus quam blandit metus accumsan mattis. Donec blandit fermentum felis a tincidunt. Curabitur tempus risus velit, in dapibus nibh cursus sit amet. Quisque hendrerit luctus leo ac dapibus. Quisque mattis, turpis in ornare aliquam, dolor lectus sagittis massa, sed consectetur risus lacus vel orci. Donec eget diam nibh. Nullam pulvinar ultrices libero. Mauris sagittis metus et faucibus commodo. Vestibulum nec elit rutrum lacus maximus molestie. Proin finibus suscipit eros bibendum semper. Cras elementum commodo sollicitudin.\n" +
                "\n" +
                "Pellentesque et tellus ullamcorper, posuere nulla vel, bibendum enim. Donec ornare erat nulla, sed gravida lectus malesuada quis. Ut consectetur, enim sit amet dignissim varius, tortor ipsum accumsan nisl, non interdum sem magna at lorem. Suspendisse rhoncus finibus nibh in luctus. Nunc dapibus, magna vel tincidunt commodo, urna mi malesuada purus, sed tristique sapien lorem eget purus. Aliquam non tellus nunc. Sed viverra, nunc sed elementum lacinia, ante nulla tincidunt leo, sed ultrices est libero sed dui. Nunc lobortis blandit velit, ut tincidunt velit rutrum eget. Pellentesque leo ipsum, vestibulum non tellus sed, elementum porttitor dolor. Phasellus aliquam eros metus, ac sollicitudin nibh vestibulum ut. Duis velit justo, facilisis non dapibus eget, volutpat sit amet tellus. Maecenas ac sollicitudin ipsum.", R.drawable.ic_launcher));
        cards.add(new NowCard("DroidCon 2016", "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Vivamus tincidunt feugiat fringilla. Donec consectetur elit ut urna viverra, sit amet fermentum eros dignissim. Fusce efficitur velit dui. Donec eu nisi massa. Nullam finibus quam blandit metus accumsan mattis. Donec blandit fermentum felis a tincidunt. Curabitur tempus risus velit, in dapibus nibh cursus sit amet. Quisque hendrerit luctus leo ac dapibus. Quisque mattis, turpis in ornare aliquam, dolor lectus sagittis massa, sed consectetur risus lacus vel orci. Donec eget diam nibh. Nullam pulvinar ultrices libero. Mauris sagittis metus et faucibus commodo. Vestibulum nec elit rutrum lacus maximus molestie. Proin finibus suscipit eros bibendum semper. Cras elementum commodo sollicitudin.\n" +
                "\n" +
                "Pellentesque et tellus ullamcorper, posuere nulla vel, bibendum enim. Donec ornare erat nulla, sed gravida lectus malesuada quis. Ut consectetur, enim sit amet dignissim varius, tortor ipsum accumsan nisl, non interdum sem magna at lorem. Suspendisse rhoncus finibus nibh in luctus. Nunc dapibus, magna vel tincidunt commodo, urna mi malesuada purus, sed tristique sapien lorem eget purus. Aliquam non tellus nunc. Sed viverra, nunc sed elementum lacinia, ante nulla tincidunt leo, sed ultrices est libero sed dui. Nunc lobortis blandit velit, ut tincidunt velit rutrum eget. Pellentesque leo ipsum, vestibulum non tellus sed, elementum porttitor dolor. Phasellus aliquam eros metus, ac sollicitudin nibh vestibulum ut. Duis velit justo, facilisis non dapibus eget, volutpat sit amet tellus. Maecenas ac sollicitudin ipsum.", R.drawable.ic_launcher));
        cards.add(new NowCard("Go for Con", "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Vivamus tincidunt feugiat fringilla. Donec consectetur elit ut urna viverra, sit amet fermentum eros dignissim. Fusce efficitur velit dui. Donec eu nisi massa. Nullam finibus quam blandit metus accumsan mattis. Donec blandit fermentum felis a tincidunt. Curabitur tempus risus velit, in dapibus nibh cursus sit amet. Quisque hendrerit luctus leo ac dapibus. Quisque mattis, turpis in ornare aliquam, dolor lectus sagittis massa, sed consectetur risus lacus vel orci. Donec eget diam nibh. Nullam pulvinar ultrices libero. Mauris sagittis metus et faucibus commodo. Vestibulum nec elit rutrum lacus maximus molestie. Proin finibus suscipit eros bibendum semper. Cras elementum commodo sollicitudin.\n" +
                "\n" +
                "Pellentesque et tellus ullamcorper, posuere nulla vel, bibendum enim. Donec ornare erat nulla, sed gravida lectus malesuada quis. Ut consectetur, enim sit amet dignissim varius, tortor ipsum accumsan nisl, non interdum sem magna at lorem. Suspendisse rhoncus finibus nibh in luctus. Nunc dapibus, magna vel tincidunt commodo, urna mi malesuada purus, sed tristique sapien lorem eget purus. Aliquam non tellus nunc. Sed viverra, nunc sed elementum lacinia, ante nulla tincidunt leo, sed ultrices est libero sed dui. Nunc lobortis blandit velit, ut tincidunt velit rutrum eget. Pellentesque leo ipsum, vestibulum non tellus sed, elementum porttitor dolor. Phasellus aliquam eros metus, ac sollicitudin nibh vestibulum ut. Duis velit justo, facilisis non dapibus eget, volutpat sit amet tellus. Maecenas ac sollicitudin ipsum.", R.drawable.ic_launcher));
        cards.add(new NowCard("Google IO", "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Vivamus tincidunt feugiat fringilla. Donec consectetur elit ut urna viverra, sit amet fermentum eros dignissim. Fusce efficitur velit dui. Donec eu nisi massa. Nullam finibus quam blandit metus accumsan mattis. Donec blandit fermentum felis a tincidunt. Curabitur tempus risus velit, in dapibus nibh cursus sit amet. Quisque hendrerit luctus leo ac dapibus. Quisque mattis, turpis in ornare aliquam, dolor lectus sagittis massa, sed consectetur risus lacus vel orci. Donec eget diam nibh. Nullam pulvinar ultrices libero. Mauris sagittis metus et faucibus commodo. Vestibulum nec elit rutrum lacus maximus molestie. Proin finibus suscipit eros bibendum semper. Cras elementum commodo sollicitudin.\n" +
                "\n" +
                "Pellentesque et tellus ullamcorper, posuere nulla vel, bibendum enim. Donec ornare erat nulla, sed gravida lectus malesuada quis. Ut consectetur, enim sit amet dignissim varius, tortor ipsum accumsan nisl, non interdum sem magna at lorem. Suspendisse rhoncus finibus nibh in luctus. Nunc dapibus, magna vel tincidunt commodo, urna mi malesuada purus, sed tristique sapien lorem eget purus. Aliquam non tellus nunc. Sed viverra, nunc sed elementum lacinia, ante nulla tincidunt leo, sed ultrices est libero sed dui. Nunc lobortis blandit velit, ut tincidunt velit rutrum eget. Pellentesque leo ipsum, vestibulum non tellus sed, elementum porttitor dolor. Phasellus aliquam eros metus, ac sollicitudin nibh vestibulum ut. Duis velit justo, facilisis non dapibus eget, volutpat sit amet tellus. Maecenas ac sollicitudin ipsum.", R.drawable.ic_launcher));
        new CardsView((RecyclerView) findViewById(R.id.cardsView), cards);
    }

    protected void initFab(){
//        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
//        fab.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
//                        .setAction("Action", null).show();
//            }
//        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
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
}
