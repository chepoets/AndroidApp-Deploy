package android.researchlink.dfp.researchlink;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Gym extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gym);
    }

    public void allenamento(View view) {
        Intent allenamento = new Intent (this, allenamento.class);
        startActivity(allenamento);
    }
}
