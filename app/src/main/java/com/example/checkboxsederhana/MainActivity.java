package com.example.checkboxsederhana;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.CheckBox;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    private CheckBox ayam1, ayam2, ayam3;
    private String menu1, menu2, menu3;
    private  Button pesan;
    private TextView pilihan1,pilihan2,pilihan3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Menginisialisasi ID pada Semua elemen UI
        ayam1 = findViewById((R.id.ayam1));
        ayam2 = findViewById(R.id.ayam2);
        ayam3 = findViewById(R.id.ayam3);
        pilihan1 = findViewById(R.id.menu_satu);
        pilihan2 = findViewById(R.id.menu_dua);
        pilihan3 = findViewById(R.id.menu_tiga);
        pesan = findViewById(R.id.pesan);

        //Saat Tombol DI klik maka program akan mengeksekusi pesanan dari user
        pesan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (ayam1.isChecked()){
                    menu1 = "Ayam Geprek";
                }
                else if (!ayam2.isChecked()){
                    menu1 = " ";
                }

                //Melihat Status Kondisi Pada Pilihan Menu ayam bakar
                if (ayam2.isChecked()){
                    menu2 = "Ayam Bakar";
                }
                else if (!ayam2.isChecked()){
                    menu2 = " ";
                }

                // melihat Status kondisi pada pilihan menu Ayang Goyeng
                if (ayam3.isChecked()){
                    menu3 = " Ayam Goreng";
                }
                else if (!ayam3.isChecked()){
                    menu3 = " ";
                }
                //Kondisi jika tidak ada salah satupun menu makanan yang dipilih
                if (!ayam1.isChecked() && !ayam2.isChecked() && !ayam3.isChecked()){
                    Toast.makeText(getApplicationContext(),  "Tidak ada menu makanan yang di pesan", Toast.LENGTH_SHORT).show();
                }else {
                    //menampilkan hasil pesanan yang di input dari user
                    Toast.makeText(getApplicationContext(), "Pesanan Terkirim" , Toast.LENGTH_SHORT).show();
                    pilihan1.setText("Menu 1 : "+menu1);
                    pilihan2.setText("Menu 2 : "+menu2);
                    pilihan3.setText("Menu 3 : "+menu3);
                }
            }
        });
    }
}