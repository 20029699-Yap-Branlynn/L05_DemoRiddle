package sg.edu.rp.c346.id20029699.demoriddle;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView qn1;
    Button reveal1;
    TextView qn2;
    Button reveal2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.d("MainActivity", "onCreate() called.");

        qn1 = findViewById(R.id.textViewQ1);
        reveal1 = findViewById(R.id.button1);
        qn2 = findViewById(R.id.textViewQ2);
        reveal2 = findViewById(R.id.button2);


        reveal1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,AnswerActivity1.class);
                intent.putExtra("Question", "Q1");
                startActivity(intent);
                //answer.setText("Q1 answer is: Queue");
            }
        });

        reveal2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent2 = new Intent(MainActivity.this,AnswerActivity2.class);
                intent2.putExtra("Question", "Q2");
                startActivity(intent2);
                //answer.setText("Q2 answer is: Gone");
            }
        });

    }
    @Override
    protected void onStart() {
        Log.d("MainActivity", "onStart() called.");
        super.onStart();
    }
    @Override
    protected void onResume() {
        Log.d("MainActivity", "onResume() called.");
        super.onResume();
    }
    @Override
    protected void onPause() {
        Log.d("MainActivity", "onPause() called.");
        super.onPause();
    }
    @Override
    protected void onStop() {
        Log.d("MainActivity", "onStop() called.");
        super.onStop();
    }
    @Override
    protected void onDestroy() {
        Log.d("MainActivity", "onDestroy() called.");
        super.onDestroy();
    }
    @Override
    protected void onRestart() {
        Log.d("MainActivity", "onRestart() called.");
        super.onRestart();
    }

}