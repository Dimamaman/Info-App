package uz.gita.infoapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class AboutDeveloper extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_developer);
        findViewById(R.id.buttonBack).setOnClickListener(view -> finish());
    }
}