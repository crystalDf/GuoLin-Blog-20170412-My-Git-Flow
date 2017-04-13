package com.star.my_git_flow;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button mFeature1;
    private Button mFeature4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mFeature1 = (Button) findViewById(R.id.feature_1);
        mFeature1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (getResources().getString(R.string.feature_1)
                        .equals(mFeature1.getText().toString())) {
                    mFeature1.setText(R.string.feature_1_display);
                } else {
                    mFeature1.setText(R.string.feature_1);
                }
            }
        });

        mFeature4 = (Button) findViewById(R.id.feature_4);
        mFeature4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (getResources().getString(R.string.feature_4)
                        .equals(mFeature4.getText().toString())) {
                    mFeature4.setText(R.string.feature_4_display);
                } else {
                    mFeature4.setText(R.string.feature_4);
                }
            }
        });
    }
}
