package com.example.chilenbe.imageviews;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {
    private ImageView myImageView;
    private TextView myTextView;

    private static final String TAG= "MainActivity";



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toast.makeText(getApplicationContext(),"Helo",Toast.LENGTH_LONG).show();
        Toast.makeText(this,"Hello",Toast.LENGTH_LONG).show();

        myImageView=(ImageView) findViewById(R.id.imageView);
        myTextView= (TextView) findViewById(R.id.textView);

        myImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                myTextView.setText("Ovo je jabuka,neb' vjerov'o");

                Log.d(TAG, "Hello from here");
                Log.v(TAG, "Another Hello!, test");

            }
        });

    }
    class MyClass{


        
    }
}
