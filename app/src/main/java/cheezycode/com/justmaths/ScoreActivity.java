package cheezycode.com.justmaths;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class ScoreActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_score);
        TextView tv = (TextView) findViewById(R.id.score);
        int score = getIntent().getIntExtra("score", 0);
        tv.setText("Current Score : " + score);

    }
}
