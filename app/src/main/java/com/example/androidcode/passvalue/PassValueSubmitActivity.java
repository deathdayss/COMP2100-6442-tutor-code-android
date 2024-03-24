package com.example.androidcode.passvalue;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.androidcode.R;

public class PassValueSubmitActivity extends AppCompatActivity {
    EditText inputTextView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_pass_value_submit);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        inputTextView = findViewById(R.id.pass_value_input);
    }

    public void submitPassValueInput(View v) {
        // get text from input and delete text in the input
        String inputText = inputTextView.getText().toString();
        inputTextView.setText("");

        // generate and pass the result data
        Intent data = this.getIntent().putExtra("input", inputText);
        setResult(RESULT_OK, data);

        // kill the activity
        finish();
    }
}