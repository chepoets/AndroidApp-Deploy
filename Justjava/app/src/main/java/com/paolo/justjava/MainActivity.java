package com.paolo.justjava;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * quantity int declaration
     */
        int quantity=2;

    /**
     * This method is called when the plus button is clicked.
     */
    public void submitQuantityplus(View view) {
        quantity+=1;
        displayQuantity(quantity);

        //control quantity
        if (quantity == 100) {
            // Show an error message as a toast
            Toast.makeText(this, getString(R.string.more_coffee), Toast.LENGTH_SHORT).show();
            // Exit this method early because there's nothing left to do
            return;
        }
    }

    /**
     * This method is called when the minus button is clicked.
     */
    public void submitQuantityminus(View view) {

        //control quantity
        if (quantity == 1) {
            // Show an error message as a toast
            Toast.makeText(this, getString(R.string.few_coffee), Toast.LENGTH_SHORT).show();
            // Exit this method early because there's nothing left to do
            return;
        }
        quantity-=1;
        displayQuantity(quantity);
    }


    /**
     * This method is called when the order button is clicked.
     */

    public void submitOrder(View view) {

        //calculate price
        int price=0;

        //control checkbox cream
        CheckBox wippeadcreamcheckbox = (CheckBox) findViewById(R.id.wippead_cream_checkbox);
        boolean hasChecked = wippeadcreamcheckbox.isChecked();

        //control checkbox chocloate
        CheckBox chocolatecheckbox = (CheckBox) findViewById(R.id.chocolate_checkbox);
        boolean hasChecked2 = chocolatecheckbox.isChecked();

        //field name
        EditText nameField = (EditText) findViewById(R.id.name_field);
        String name = nameField.getText().toString();

        //controll checkbox for price adjustament
        if (hasChecked && hasChecked2) {
            price = quantity * 8;
        }else if(hasChecked){
                price=quantity*6;
            }else if(hasChecked2){
                price=quantity*7;
            }else{
                price=quantity*5;
            }
        displayMessage(createOrderSummary(hasChecked,hasChecked2,name,price));
    }
    //-----------------------------------------------

    //intent mail action

    public void composeEmail(View view) {


        //calculate price
        int price=0;

        //control checkbox cream
        CheckBox wippeadcreamcheckbox = (CheckBox) findViewById(R.id.wippead_cream_checkbox);
        boolean hasChecked = wippeadcreamcheckbox.isChecked();

        //control checkbox chocloate
        CheckBox chocolatecheckbox = (CheckBox) findViewById(R.id.chocolate_checkbox);
        boolean hasChecked2 = chocolatecheckbox.isChecked();

        //field name
        EditText nameField = (EditText) findViewById(R.id.name_field);
        String name = nameField.getText().toString();

        //controll checkbox for price adjustament
        if (hasChecked && hasChecked2) {
            price = quantity * 8;
        }else if(hasChecked){
            price=quantity*6;
        }else if(hasChecked2){
            price=quantity*7;
        }else{
            price=quantity*5;
        }

        String details =
                getString(R.string.user_name,name)+ "\n"+
                        getString(R.string.quantity)+ quantity + "\n" +
                        getString(R.string.Whipped_Cream)+ hasChecked + "\n" +
                        getString(R.string.Chocolate)+ hasChecked2 + "\n" +
                        getString(R.string.total_price)+ price + "\n" +
                        getString(R.string.thank_you);

        Intent intent = new Intent(Intent.ACTION_SENDTO);
        intent.setData(Uri.parse("mailto:caffeprova@simpuvrid.com")); // only email apps should handle this
        intent.putExtra(Intent.EXTRA_SUBJECT, "Coffe Break order by " + name);
        intent.putExtra(Intent.EXTRA_TEXT, details);
        if (intent.resolveActivity(getPackageManager()) != null) {
            startActivity(intent);
        }
    }




    //---------------------------------------------------------------------
    /**
     * method for finally check
     * @param hasChecked parameter for checkbox
     *
     */
    private String createOrderSummary(boolean hasChecked,boolean hasChecked2, String name,int price) {
        String details =
                "Name:" + name + "\n"+
                        "Quantity:  "+ quantity + "\n" +
                        "whippead Cream:  "+ hasChecked + "\n" +
                        "Chocolate:  "+ hasChecked2 + "\n" +
                        "Total price:  " + price + "\n" +
                        "Thank you";
        return details;
    }

    /**
     * This method displays the given quantity value on the screen.
     */
    private void displayQuantity(int number) {
        TextView quantityTextView = (TextView) findViewById(R.id.quantity_text_view);
        quantityTextView.setText("" + number);
    }

    /**
     * This method displays the given text on the screen.
     */
    private void displayMessage(String message) {
        TextView orderSummaryTextView = (TextView) findViewById(R.id.order_summary_text_view);
        orderSummaryTextView.setText(message);
    }
}
