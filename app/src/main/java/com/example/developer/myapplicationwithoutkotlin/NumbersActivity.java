package com.example.developer.myapplicationwithoutkotlin;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;

public class NumbersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers);

        ArrayList<String> words = new ArrayList<>();
        words.add("one");
        words.add("two");
        words.add("three");
        words.add("four");
        words.add("five");
        words.add("six");
        words.add("seven");
        words.add("eight");
        words.add("nine");
        words.add("ten");


//        FIND ID ROOTVIEW -> ACTIVITY_NUMBERS.XML
        LinearLayout rootView = (LinearLayout) findViewById(R.id.rootView);

       /* int i = 0;

        while(i<words.size()){
            TextView wordView = new TextView(this);
//            Log.v("NumbersActivity", "index: " + i + "Value: " + words.get(i));
            wordView.setText(words.get(i));
//        ADD TEXTVIEW'S TO ROOTVIEW
            rootView.addView(wordView);
            i++;
        }*/

       for(int i = 0; i < words.size(); i++) {
           //        Create a textview that can be added to the rootview ***IMPORTANT***
           TextView wordView = new TextView(this);
           wordView.setText(words.get(i));
           //        ADD TEXTVIEW'S TO ROOTVIEW
           rootView.addView(wordView);
        }


    }

}
