package android.votailmandarino.dfp.votailmandarino;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.CheckBox;
import android.widget.Toast;

public class Mandarini extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mandarini);
    }

    //orange vote
    int orange=0;


    //check state
    boolean mandarino_uno_checked;


    boolean mandarino_due_checked;


    boolean mandarino_tre_checked;


    public void check1(View view) {

        //checkbox 1
        CheckBox mandarino_uno = (CheckBox) findViewById(R.id.vota1);
        //checkbox 2
        CheckBox mandarino_due = (CheckBox) findViewById(R.id.vota2);
        //checkbox 3
        CheckBox mandarino_tre = (CheckBox) findViewById(R.id.vota3);

        mandarino_uno_checked=mandarino_uno.isChecked();

        if(mandarino_uno_checked) {
            orange = 1;
            mandarino_due.setChecked(false);
            mandarino_tre.setChecked(false);

        }else{
            orange=0;
        }
    }

    public void check2(View view) {

        //checkbox 1
        CheckBox mandarino_uno = (CheckBox) findViewById(R.id.vota1);
        //checkbox 2
        CheckBox mandarino_due = (CheckBox) findViewById(R.id.vota2);
        //checkbox 3
        CheckBox mandarino_tre = (CheckBox) findViewById(R.id.vota3);

        mandarino_due_checked=mandarino_due.isChecked();

        if(mandarino_due_checked) {
            orange = 2;
            mandarino_uno.setChecked(false);
            mandarino_tre.setChecked(false);
        }else{
            orange=0;
        }
    }
    public void check3(View view) {

        //checkbox 1
        CheckBox mandarino_uno = (CheckBox) findViewById(R.id.vota1);
        //checkbox 2
        CheckBox mandarino_due = (CheckBox) findViewById(R.id.vota2);
        //checkbox 3
        CheckBox mandarino_tre = (CheckBox) findViewById(R.id.vota3);

        mandarino_tre_checked=mandarino_tre.isChecked();

        if(mandarino_tre_checked) {
            orange = 3;
            mandarino_due.setChecked(false);
            mandarino_uno.setChecked(false);
        }else{
            orange=0;
        }
    }

    public void invia(View view) {
        String value=String.valueOf(orange);
        String url="http://indovinailmandarino.herokuapp.com/votes/new/";
        Intent vote = new Intent(Intent.ACTION_VIEW);
        vote.setData(Uri.parse(url+value));
        startActivity(vote);
        Toast.makeText(getApplicationContext(), "invio del voto in corso", Toast.LENGTH_SHORT).show();
    }

}
