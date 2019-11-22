package com.example.higherorlower;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    int randomNumber ;

    public void generateRandom(){

        Random random = new Random();
        randomNumber = random.nextInt(20) + 1;

    }

    public void onGuess(View view){

        EditText editText = (EditText) findViewById(R.id.editText);
        int guessNumber =  Integer.parseInt(editText.getText().toString());

        String message ;
        if (guessNumber > randomNumber){
            message = "lower ";
        } else if (guessNumber < randomNumber){
            message = "Higher";
        } else {
            message = "You've gussed it try it again";
            generateRandom();
        }
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();


        Log.i("Entered Value",editText.getText().toString());
        Log.i("RandomNumber", Integer.toString(randomNumber));
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        generateRandom();

    }
}
