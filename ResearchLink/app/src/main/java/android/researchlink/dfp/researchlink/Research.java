package android.researchlink.dfp.researchlink;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Research extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_research);
    }

    public void GymResearch(View view) {
        Intent gym = new Intent (this, Gym.class);
        startActivity(gym);
    }

    public void Inglese(View view) {
        Intent english= new Intent (this, EnglishActivity.class);
        startActivity(english);
    }
}
