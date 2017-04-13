package com.star.my_git_flow;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button mFeature1;
    private Button mFeature2;

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

        mFeature2 = (Button) findViewById(R.id.feature_2);
        mFeature2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (getResources().getString(R.string.feature_2)
                        .equals(mFeature2.getText().toString())) {
                    mFeature2.setText(R.string.feature_2_display);
                } else {
                    mFeature2.setText(R.string.feature_2);
                }
            }
        });
    }
}
