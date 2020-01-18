package com.hms.sra.preferencestester;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText et;
    CheckBox cb;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        SRAPreferencesFactory.downLoadPrefs(this);

        et = (EditText)findViewById(R.id.etid);
        cb = (CheckBox)findViewById(R.id.cbid);

    }

    @Override
    protected void onResume() {
        super.onResume();
        SRAPreferencesFactory.downLoadPrefs(this);
        et.setText(SRAPreferencesFactory.et_val);
        cb.setChecked(SRAPreferencesFactory.cb_val);
    }

    public void onSettingsClickListener(View view) {
        Intent intentForSA = new Intent(this,SettingsActivity.class);
        this.startActivity(intentForSA);
    }


}
