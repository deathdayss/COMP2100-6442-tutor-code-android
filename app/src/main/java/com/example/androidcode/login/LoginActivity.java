package com.example.androidcode.login;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.androidcode.R;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;

public class LoginActivity extends AppCompatActivity {
    EditText usernameEdit;
    EditText passwordEdit;
    Button loginButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_login);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        usernameEdit = findViewById(R.id.username_input);
        passwordEdit = findViewById(R.id.password_input);
        loginButton = findViewById(R.id.login_button);
    }

    public void clickLoginButton() {

        BufferedReader reader;
        try {
            reader = new BufferedReader(new InputStreamReader(getAssets().open("loginDetails.csv"), "UTF-8"));
            String line;
            while ((line = reader.readLine()) != null) {
                String[] tokens = line.split(",");
                //TODO
                //you may need to check if the number of tokens in each line is correct
                //store the data (e.g. if reading user information, you may want to store it in a User class)

            }
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}