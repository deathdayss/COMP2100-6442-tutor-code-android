package com.example.androidcode;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.androidcode.bookmarkapp.BookmarkAppMainActivity;
import com.example.androidcode.findview.FindViewMainActivity;
import com.example.androidcode.location.LocationActivity;
import com.example.androidcode.navigate.NavigateMainActivity;
import com.example.androidcode.orientation.OrientationActivity;
import com.example.androidcode.passvalue.PassValueMainActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }

    public void toNavigateActivity(View v) {
        Intent intent = new Intent(this, NavigateMainActivity.class);
        startActivity(intent);
    }

    public void toFindViewActivity(View v) {
        Intent intent = new Intent(this, FindViewMainActivity.class);
        startActivity(intent);
    }

    public void toPassValueActivity(View v) {
        Intent intent = new Intent(this, PassValueMainActivity.class);
        startActivity(intent);
    }

    public void toGetOrientationActivity(View v) {
        Intent intent = new Intent(this, OrientationActivity.class);
        startActivity(intent);
    }

    public void toLocationActivity(View v) {
        Intent intent = new Intent(this, LocationActivity.class);
        startActivity(intent);
    }

    public void toBookmarkAppActivity(View v) {
        Intent intent = new Intent(this, BookmarkAppMainActivity.class);
        startActivity(intent);
    }
}