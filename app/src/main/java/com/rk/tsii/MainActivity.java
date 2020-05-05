package com.rk.tsii;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextSwitcher;
import android.widget.TextView;
import android.widget.ViewSwitcher;

public class MainActivity extends AppCompatActivity {

    TextSwitcher TS_1_IDJAVA;
    Button B_Selanjutnya_IDJAVA, B_Sebelumnya_IDJAVA;

    String[] NamaBarang = {
            "Loudspeaker",
            "Laptop",
            "PC Desktop",
            "Keyboard",
            "Mouse",
            "Meja",
            "Kursi",
            "Mancis"
    };

    int Indeks_Terakhir = -1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        B_Sebelumnya_IDJAVA = findViewById(R.id.B_Sebelumnya_IDXML);
        B_Selanjutnya_IDJAVA = findViewById(R.id.B_Selanjutnya_IDXML);
        TS_1_IDJAVA = findViewById(R.id.TS_1_IDXML);

        TS_1_IDJAVA.setFactory(new ViewSwitcher.ViewFactory() {
            @Override
            public View makeView() {
                TextView Teks = new TextView(getApplicationContext());
                Teks.setTextSize(26);
                Teks.setTextAlignment(View.TEXT_ALIGNMENT_CENTER);
                Teks.setTextColor(getResources().getColor(R.color.colorAccent));
                return Teks;
            }
        });
    }

    public void TombolKetikaDipijit(View RizkyKhapidsyah) {
        switch (RizkyKhapidsyah.getId()) {
            case R.id.B_Sebelumnya_IDXML:
                if (Indeks_Terakhir < NamaBarang.length - 1) {
                    Indeks_Terakhir = Indeks_Terakhir + 1;
                    TS_1_IDJAVA.setText(NamaBarang[Indeks_Terakhir]);
                }
                break;
            case R.id.B_Selanjutnya_IDXML:
                if (Indeks_Terakhir > 0) {
                    Indeks_Terakhir = Indeks_Terakhir - 1;
                    TS_1_IDJAVA.setText(NamaBarang[Indeks_Terakhir]);
                }
                break;
        }
    }

}
