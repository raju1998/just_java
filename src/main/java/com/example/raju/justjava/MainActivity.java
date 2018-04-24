package com.example.raju.justjava;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import java.text.NumberFormat;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
           int quantity =0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    //the method is called when buuton is clicked
    public void increment(View view){
        quantity =quantity +1;
        display(quantity);
    }
    public void decrement(View view){
        quantity =quantity -1;
        display(quantity);
    }


    public void submitorder(View view){
        if(quantity<0)
            return;
        display(quantity);
        display1(quantity*5);
    }
    //the method is for display the value on screen
    public void display(int number){
        TextView textview=(TextView)findViewById(R.id.textview_quantity);
        textview.setText(" "+number);
    }
    public  void display1(int number){
        TextView priceview=(TextView)findViewById(R.id.textview_price);
        priceview.setText(NumberFormat.getCurrencyInstance().format(number));

    }
}
