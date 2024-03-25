package com.example.androidcode.navigate;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.androidcode.R;

public class NavigateMainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_navigate_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        System.out.println("NavigateMainActivity: onCreate()");
    }

    @Override
    protected void onStart() {
        super.onStart();
        System.out.println("NavigateMainActivity: onStart()");
    }

    @Override
    protected void onResume() {
        super.onResume();
        System.out.println("NavigateMainActivity: onResume()");
    }

    @Override
    protected void onPause() {
        super.onPause();
        System.out.println("NavigateMainActivity: onPause()");
    }

    @Override
    protected void onStop() {
        super.onStop();
        System.out.println("NavigateMainActivity: onStop()");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        System.out.println("NavigateMainActivity: onDestroy()");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        System.out.println("NavigateMainActivity: onRestart()");
    }

    public void toNavigateNextActivity(View v) {
        Intent intent = new Intent(this, NavigateNextActivity.class);
        startActivity(intent);
    }
}