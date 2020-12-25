package com.example.androidnote;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    TextView txtHienthi,txtHienthinoidung;
    ArrayList<Note> dsnote;
    AdapterDanhSachnode adapterDanhSachnode;
    RecyclerView recyclerView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtHienthi=findViewById(R.id.txthienthi);
        txtHienthinoidung=findViewById(R.id.txthienthinoidung);
        recyclerView=findViewById(R.id.ryclerviewnode);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(MainActivity.this);

        dsnote=new ArrayList<>();
        dsnote.add(new Note("abc","20-12-1999","aaaaaaaaaaaaaaaaaaaaaaaaaaaaa/n bbbbbbb"));
        dsnote.add(new Note("abc","20-12-1999","aaaaaaaaaaaaaaaaaaaaaaaaaaaaa/n bbbbbbb"));
        dsnote.add(new Note("abc","20-12-1999","aaaaaaaaaaaaaaaaaaaaaaaaaaaaa/n bbbbbbb"));
        dsnote.add(new Note("abc","20-12-1999","aaaaaaaaaaaaaaaaaaaaaaaaaaaaa/n bbbbbbb"));

        dsnote.add(new Note("abc","20-12-1999","aaaaaaaaaaaaaaaaaaaaaaaaaaaaa/n bbbbbbb"));

        dsnote.add(new Note("abc","20-12-1999","aaaaaaaaaaaaaaaaaaaaaaaaaaaaa/n bbbbbbb"));

        dsnote.add(new Note("abc","20-12-1999","aaaaaaaaaaaaaaaaaaaaaaaaaaaaa/n bbbbbbb"));

        dsnote.add(new Note("abc","20-12-1999","aaaaaaaaaaaaaaaaaaaaaaaaaaaaa/n bbbbbbb"));


        Intent intent = getIntent();
        String tieude = intent.getStringExtra("tieude");
        String noidung = intent.getStringExtra("noidung");

        txtHienthi.setText(tieude);
        txtHienthinoidung.setText(noidung);
        recyclerView.setLayoutManager(layoutManager);
        adapterDanhSachnode = new AdapterDanhSachnode(MainActivity.this, R.layout.custom_layout_danhsachnode, dsnote);
        recyclerView.setAdapter(adapterDanhSachnode);
        adapterDanhSachnode.notifyDataSetChanged();
    }
}
