package android.researchlink.dfp.researchlink;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class allenamento extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_allenamento);
    }

    public void test(View view) {
        Intent test = new Intent (this, Test.class);
        startActivity(test);
    }
}
