package android.petrolpump.dfp.petrolpump;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import static java.lang.Integer.parseInt;

public class Q8 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_q8);
    }

    //variable
    int dinero=324;
    double percentage=64.0;

    public void venti(View view){
        EditText price = (EditText) findViewById(R.id.price);
        double cost = Double.parseDouble(price.getText().toString());
        dinero-=20;
        double alitro=20/cost;
        percentage-=alitro;
        if(dinero<=0){
            dinero=0;
            Toast.makeText(getApplicationContext(), "Sorry Man...You haven't the right money",
                    Toast.LENGTH_LONG).show();
        }else if(percentage<=0){
            percentage=0;
            Toast.makeText(getApplicationContext(), "Ops....There is no more patrol here!",
                    Toast.LENGTH_LONG).show();
        }else{
            displaydata(dinero,percentage);
        }

    }


    public void cinquanta(View view) {
        EditText price = (EditText) findViewById(R.id.price);
        double cost = parseInt(price.getText().toString());
        dinero-=50;
        double alitro=50/cost;
        percentage-=alitro;
        if(dinero<=0){
            dinero=0;
            Toast.makeText(getApplicationContext(), "Sorry Man...You haven't the right money",
                    Toast.LENGTH_LONG).show();
        }else if(percentage<=0){
            percentage=0;
            Toast.makeText(getApplicationContext(), "Ops....There is no more patrol here!",
                    Toast.LENGTH_LONG).show();
        }else{
            displaydata(dinero,percentage);
        }
    }

    public void trenta(View view) {
        EditText price = (EditText) findViewById(R.id.price);
        double cost = parseInt(price.getText().toString());
        dinero-=30;
        double alitro=30/cost;
        percentage-=alitro;
        if(dinero<=0){
            dinero=0;
            Toast.makeText(getApplicationContext(), "Sorry Man...You haven't the right money",
                    Toast.LENGTH_LONG).show();
        }else if(percentage<=0){
            percentage=0;
            Toast.makeText(getApplicationContext(), "Ops....There is no more patrol here!",
                    Toast.LENGTH_LONG).show();
        }else{
            displaydata(dinero,percentage);
        }
    }

    //private method that display quantity
    private void displaydata(int dinero, double percentage) {
        String perc = String.format( "%.1f", percentage );
        TextView dollarsTextView = (TextView) findViewById(R.id.dollars);
        TextView percentageTextView = (TextView) findViewById(R.id.percentage);
        dollarsTextView.setText("" + dinero + "$");
        percentageTextView.setText("" + perc + "%");
        Toast.makeText(getApplicationContext(), "Thank you for choosing us!",
                Toast.LENGTH_LONG).show();
    }

    public void recharge(View view) {
        dinero=324;
        percentage=64;
        TextView dollarsTextView = (TextView) findViewById(R.id.dollars);
        TextView percentageTextView = (TextView) findViewById(R.id.percentage);
        dollarsTextView.setText("324$");
        percentageTextView.setText("64%");
        Toast.makeText(getApplicationContext(), "Recharge complete!",
                Toast.LENGTH_LONG).show();
    }
}
