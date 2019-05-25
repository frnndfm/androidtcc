package com.example.nando.hotel;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MenuActivity extends Activity {

    ImageView imgusu,imgprod,imgserv,imgconfig,imggasto;
    TextView txtusumenu,txtprodmenu,txtservmenu,txtconfigmenu,txtgastomenu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        imgusu = (ImageView)findViewById(R.id.imgusu);
        imgconfig = (ImageView)findViewById(R.id.imgconfig);
        imggasto = (ImageView)findViewById(R.id.imggasto);
        imgprod = (ImageView)findViewById(R.id.imgprod);
        imgserv = (ImageView)findViewById(R.id.imgserv);

        txtusumenu = (TextView)findViewById(R.id.txtusumenu);
        txtconfigmenu = (TextView)findViewById(R.id.txtconfigmenu);
        txtgastomenu = (TextView)findViewById(R.id.txtgastomenu);
        txtprodmenu = (TextView)findViewById(R.id.txtprodmenu);
        txtservmenu = (TextView)findViewById(R.id.txtservmenu);

        imgusu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MenuActivity.this,MeusDadosActivity.class);
                startActivity(intent);
            }
        });

        txtusumenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MenuActivity.this,MeusDadosActivity.class);
                startActivity(intent);
            }
        });

        imgprod.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MenuActivity.this,ProdutosActivity.class);
                startActivity(intent);

            }
        });

        txtprodmenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MenuActivity.this,ProdutosActivity.class);
                startActivity(intent);
            }
        });

        imgserv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MenuActivity.this,ServicoActivity.class);
                startActivity(intent);
            }
        });
        txtservmenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MenuActivity.this,ServicoActivity.class);
                startActivity(intent);
            }
        });
        imggasto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MenuActivity.this,GastoServicoActivity.class);
                startActivity(intent);
            }
        });
        txtgastomenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MenuActivity.this,GastoServicoActivity.class);
                startActivity(intent);
            }
        });

    }
}
