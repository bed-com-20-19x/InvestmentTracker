package com.example.Investmenttracker;

import android.app.Activity;
import android.os.Bundle;

import com.example.myfirstproject.R;

public class ActivitySignUp extends Activity {
    ActivitySignUp binding;
    DataBaseHelper dataBaseHelper;
    @Override
    protected void onCreate(Bundle saveInstanceState) {
        super.onCreate(saveInstanceState);
        setContentView(R.layout.activity_signup);
    }
}
