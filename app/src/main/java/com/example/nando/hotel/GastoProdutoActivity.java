package com.example.nando.hotel;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class GastoProdutoActivity extends Activity {

    Button btnirservicos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gasto_produto);

        btnirservicos = (Button)findViewById(R.id.btnirservico);

        btnirservicos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(GastoProdutoActivity.this,GastoServicoActivity.class);
                startActivity(i);
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_gastos, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {


        switch (item.getItemId()) {

            case R.id.itemmenu:
                Intent intent = new Intent(GastoProdutoActivity.this,MenuActivity.class);
                startActivity(intent);
                break;
            case R.id.itemmeusdados:
                Intent gasto = new Intent(GastoProdutoActivity.this,MeusDadosActivity.class);
                startActivity(gasto);
                break;
            case R.id.itemservicos:
                Intent serv = new Intent(GastoProdutoActivity.this,ServicoActivity.class);
                startActivity(serv);
                break;
            case R.id.itemprodutos:
                Intent prod = new Intent(GastoProdutoActivity.this,ProdutosActivity.class);
                startActivity(prod);
                break;
        }
        return super.onOptionsItemSelected(item);

    }
}
