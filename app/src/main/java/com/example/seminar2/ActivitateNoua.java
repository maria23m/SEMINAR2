package com.example.seminar2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class ActivitateNoua extends AppCompatActivity {

    private static final int COD_CERERE = 100;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activitate_noua);
    }

    public void deschideActivitate(View view) {
        Intent it = new Intent(this, ActivitatePersonala.class);
        it.putExtra("mesaj", "Salut din primul ecran!");
        it.putExtra("numar1", 3);
        it.putExtra("numar2", 4);
        startActivityForResult(it, COD_CERERE);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == COD_CERERE && resultCode == RESULT_OK && data != null) {
            String raspuns = data.getStringExtra("raspuns");
            int produs = data.getIntExtra("produs", 0);
            Toast.makeText(this, raspuns + " " + produs, Toast.LENGTH_LONG).show();
        }
    }
}