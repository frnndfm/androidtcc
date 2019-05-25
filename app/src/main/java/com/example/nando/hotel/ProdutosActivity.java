package com.example.nando.hotel;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

public class ProdutosActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_produtos);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_produto,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        switch (item.getItemId()) {

            case R.id.itemmenu:
                Intent usu = new Intent(ProdutosActivity.this,MenuActivity.class);
                startActivity(usu);
                break;
            case R.id.itemmeusdados:
                Intent prod = new Intent(ProdutosActivity.this,MeusDadosActivity.class);
                startActivity(prod);
                break;
            case R.id.itemgastos:
                Intent gasto = new Intent(ProdutosActivity.this,GastoServicoActivity.class);
                startActivity(gasto);
                break;
            case R.id.itemservicos:
                Intent serv = new Intent(ProdutosActivity.this,ServicoActivity.class);
                startActivity(serv);
                break;
        }
        return super.onOptionsItemSelected(item);
    }
}
