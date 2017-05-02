package android.researchlink.dfp.researchlink;

import android.os.Bundle;
import android.os.SystemClock;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Chronometer;
import android.widget.TextView;

public class Test extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test);

        //widget

        crono = (Chronometer) findViewById(R.id.crono);
        Start = (Button) findViewById(R.id.start);
        Stop = (Button) findViewById(R.id.stop);

        Start.setEnabled(true);
        Stop.setEnabled(false);

    }

    //base variable for program
    int quantity=0,price=0;
    Button Start,Stop;
    Chronometer crono;
    long Time=0;




    //add giri
    public void minus_Quantity(View view) {
        quantity-=1;
        displayQuantity(quantity);
    }

    public void plus_Quantity(View view) {
        quantity+=1;
        displayQuantity(quantity);
    }


    //start cronometro
    public void start(View view) {
        Start.setEnabled(false);
        Stop.setEnabled(true);
        crono.setBase(SystemClock.elapsedRealtime());
        crono.start();
    }

    //stop cronometro
    public void stop(View view) {
        Start.setEnabled(true);
        Stop.setEnabled(false);
        crono.stop();
    }

    //reset
    public void reset(View view) {
    }


    //private method that display quantity
    private void displayQuantity(int quantity) {
        TextView quantityTextView = (TextView) findViewById(R.id.text_view_quantity);
        quantityTextView.setText("" + quantity);
    }



}
