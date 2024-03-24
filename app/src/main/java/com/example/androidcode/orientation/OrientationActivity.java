package com.example.androidcode.orientation;

import android.content.res.Configuration;
import android.os.Bundle;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.androidcode.R;

public class OrientationActivity extends AppCompatActivity {
    TextView orientationTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_orientation);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        orientationTextView = findViewById(R.id.orientation_text);

        switch (getResources().getConfiguration().orientation) {
            case Configuration.ORIENTATION_PORTRAIT:
                orientationTextView.setText("Portrait");
                break;
            case Configuration.ORIENTATION_LANDSCAPE:
                orientationTextView.setText("Landscape");
                break;
            case Configuration.ORIENTATION_UNDEFINED:
                orientationTextView.setText("Undefined");
                break;
            default:
                orientationTextView.setText("Error");
        }
    }
}