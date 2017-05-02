package com.example.android.coffeebreak;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;

import java.text.NumberFormat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    //base variable for program
    int quantity=0,price=0;

    public void minus_Quantity(View view) {
        quantity-=1;
        displayQuantity(quantity);
    }

    public void plus_Quantity(View view) {
        quantity+=1;
        displayQuantity(quantity);
    }

    public void checkboxValue(){

        //user_name
        EditText user_name = (EditText) findViewById(R.id.name_field);
        String name = user_name.getText().toString();

        //wippead cream
        CheckBox wippeadCream = (CheckBox) findViewById(R.id.whippead_cream_checkbox);
        boolean CreamHasChecked = wippeadCream.isChecked();

        //chocolate
        CheckBox chocolate = (CheckBox) findViewById(R.id.chocolate_checkbox);
        boolean ChocolateHasChecked = chocolate.isChecked();

        //if statement fot adjust price
        if (CreamHasChecked){
            price+=1;
        }else if (ChocolateHasChecked){
            price+=2;
        }
        OrderSummary(CreamHasChecked,ChocolateHasChecked,price,quantity,name);
    }




    //---------------------------------------------------------------------------

    //private method that display quantity
    private void displayQuantity(int quantity) {
        TextView quantityTextView = (TextView) findViewById(R.id.text_view_quantity);
        quantityTextView.setText("" + quantity);
    }
    //private method that display price
    private void displayPrice(int price) {
        TextView priceTextView = (TextView) findViewById(R.id.price_text);
        priceTextView.setText(NumberFormat.getCurrencyInstance().format(price));
    }

    private String OrderSummary (){
        EditText namefield = (EditText) findViewById(R.id.name_field);
        String user_name =namefield.getText().toString();
        return user_name;
    }

    private void OrderSummary(boolean CreamHasChecked, boolean ChocolateHasChecked, int price, int quantity,String name){

        //calculate price action
        price= quantity*5;
        displayPrice(price);

        String details =
                "Name:" + name + "\n"+
                        "Quantity:"+ quantity + "\n" +
                        "whippead Cream:"+ CreamHasChecked+ "\n" +
                        "Chocolate:"+ ChocolateHasChecked + "\n" +
                        "Total price:" + price+ "\n" +
                        "thank you";

        displayMessage(details);
    }

    private void displayMessage(String details){
        TextView orderSummaryTextView = (TextView) findViewById(R.id.price_text);
        orderSummaryTextView.setText(details);
    }
}
