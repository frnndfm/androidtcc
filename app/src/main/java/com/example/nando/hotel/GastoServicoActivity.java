package com.example.nando.hotel;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class GastoServicoActivity extends Activity {

    Button btnirprodutos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gasto_servico);

        btnirprodutos = (Button)findViewById(R.id.btnirprodutos);

        btnirprodutos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(GastoServicoActivity.this,GastoProdutoActivity.class);
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
                Intent intent = new Intent(GastoServicoActivity.this,MenuActivity.class);
                startActivity(intent);
                break;
            case R.id.itemmeusdados:
                Intent gasto = new Intent(GastoServicoActivity.this,MeusDadosActivity.class);
                startActivity(gasto);
                break;
            case R.id.itemservicos:
                Intent serv = new Intent(GastoServicoActivity.this,ServicoActivity.class);
                startActivity(serv);
                break;
            case R.id.itemprodutos:
                Intent prod = new Intent(GastoServicoActivity.this,ProdutosActivity.class);
                startActivity(prod);
                break;
        }
        return super.onOptionsItemSelected(item);

    }

}
