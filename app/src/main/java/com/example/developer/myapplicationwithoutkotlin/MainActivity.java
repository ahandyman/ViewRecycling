package com.example.developer.myapplicationwithoutkotlin;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /* ** NUMBERS ACTIVITY ** */

        // Find the view that shows the numbers category
        TextView number = findViewById(R.id.numbers);
        // Set a click listener on that view
        number.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers View is clicked on.

            @Override
            public void onClick(View view) {
                Intent numbersIntent = new Intent(MainActivity.this, NumbersActivity.class);
                startActivity(numbersIntent);
                Toast.makeText(view.getContext(), "Numbers List", Toast.LENGTH_SHORT).show();

            }
        });

        /* ** COLORS ACTIVITY ** */

        // Find the view that shows the colors category
        TextView color = findViewById(R.id.colors);
        // Set a click listener on that view
        color.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers View is clicked on.

            @Override
            public void onClick(View view) {
                Intent colorsIntent = new Intent(MainActivity.this, ColorsActivity.class);
                startActivity(colorsIntent);
                Toast.makeText(view.getContext(), "Colors List", Toast.LENGTH_SHORT).show();
            }
        });

        /* ** FAMILY MEMBERS ACTIVITY ** */
        // Find the view that shows the family category
        TextView family = findViewById(R.id.family);
        // Set a click listener on that view
        family.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers View is clicked on.

            @Override
            public void onClick(View view) {
                Intent familyIntent = new Intent(MainActivity.this, FamilyActivity.class);
                startActivity(familyIntent);
                Toast.makeText(view.getContext(), "Family List", Toast.LENGTH_SHORT).show();
            }
        });


    /* ** PHRASES ACTIVITY ** */
        // Find the view that shows the phrases category
        TextView phrases = findViewById(R.id.phrases);
        // Set a click listener on that view
        phrases.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers View is clicked on.

            @Override
            public void onClick(View view) {
                Intent phrasesIntent = new Intent(MainActivity.this, PhrasesActivity.class);
                startActivity(phrasesIntent);
                Toast.makeText(view.getContext(), "Phrases List", Toast.LENGTH_SHORT).show();
            }
        });
    }

}
