package com.example.seminar2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class ActivitatePersonala extends AppCompatActivity {

    private int nr1;
    private int nr2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activitate_personala);

        Bundle bundle = getIntent().getExtras();
        if (bundle != null) {
            String mesaj = bundle.getString("mesaj", "");
            nr1 = bundle.getInt("numar1", 0);
            nr2 = bundle.getInt("numar2", 0);
            Toast.makeText(this, mesaj, Toast.LENGTH_SHORT).show();
        }
    }

    public void intoarceActivitate(View view) {
        Intent it = new Intent();
        it.putExtra("raspuns", "Rezultatul inmultirii:");
        it.putExtra("produs", nr1 * nr2);
        setResult(RESULT_OK, it);
        finish();
    }
}