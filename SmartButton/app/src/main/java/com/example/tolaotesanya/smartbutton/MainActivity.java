package com.example.tolaotesanya.smartbutton;

/*

@Tola Otesanya
4th March 2018
Simple App to demonstrate event handling for onClick (a tab) and onLongClick (when you hold down)
*/
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View; //any type of widget
import android.widget.Button;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button tolasbutton = (Button)findViewById(R.id.tolasbutton); // id tolasbutton now an object to be used

        //set up the event - Onclick listener to action the button
        tolasbutton.setOnClickListener(

                new Button.OnClickListener(){
                    public void onClick(View v) {
                        TextView tolatext = (TextView)findViewById(R.id.tolatext);
                        tolatext.setText("Welcome to Tola's First App");
                    }

                }

        ); //event click listener //created an interface on step 23 to hold the callback message line 24
        //setText method to change text on line 26

        //set up a LongClick listener
        tolasbutton.setOnLongClickListener(
                new Button.OnLongClickListener(){
                    public boolean onLongClick(View v){
                        TextView tolatext = (TextView)findViewById(R.id.tolatext);
                        tolatext.setText("You are Loved!");
                        return true; //onLongClick require return statement so that it event is handled
                        //if return is false then longclick will reveal the message but for a sec before changing back to onClick
                    }
                }

        );

    }

}
