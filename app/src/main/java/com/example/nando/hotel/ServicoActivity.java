package com.example.nando.hotel;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

public class ServicoActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_servico);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_servico,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {

            case R.id.itemmenu:
                Intent intent = new Intent(ServicoActivity.this, MenuActivity.class);
                startActivity(intent);
                break;
            case R.id.itemprodutos:
                Intent prod = new Intent(ServicoActivity.this, ProdutosActivity.class);
                startActivity(prod);
                break;
            case R.id.itemmeusdados:
                Intent usu = new Intent(ServicoActivity.this,MeusDadosActivity.class);
                startActivity(usu);
                break;
            case R.id.itemgastos:
                Intent gasto = new Intent(ServicoActivity.this,GastoServicoActivity.class);
                startActivity(gasto);
                break;

        }
        return super.onOptionsItemSelected(item);
    }
}
