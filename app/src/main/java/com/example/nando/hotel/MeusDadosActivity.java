package com.example.nando.hotel;

import android.Manifest;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.support.annotation.NonNull;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;

public class MeusDadosActivity extends Activity {

    private String[] permissoesNecessarias = new String[]{
            Manifest.permission.READ_EXTERNAL_STORAGE

    };

    ImageView imgusermeusdados;
    ImageButton imgbtn;
    Button btnfoto;

    private static final int selecaogaleria = 100;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_meus_dados);

        permissao.validarpermissoes(permissoesNecessarias, this, 1);

        btnfoto = (Button)findViewById(R.id.btnfoto);
        imgusermeusdados = (ImageView) findViewById(R.id.imgusermeusdados);
        imgbtn = (ImageButton) findViewById(R.id.imgbtn);

        imgbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i = new Intent(Intent.ACTION_PICK,MediaStore.Images.Media.EXTERNAL_CONTENT_URI);
                if(i.resolveActivity(getPackageManager())!= null ){
                    startActivityForResult(i,selecaogaleria);
                }

            }
        });
        btnfoto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Intent.ACTION_PICK,MediaStore.Images.Media.EXTERNAL_CONTENT_URI);
                if(i.resolveActivity(getPackageManager())!= null ){
                    startActivityForResult(i,selecaogaleria);
                }

            }
        });

        imgusermeusdados.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Intent.ACTION_PICK,MediaStore.Images.Media.EXTERNAL_CONTENT_URI);
                if(i.resolveActivity(getPackageManager())!= null ){
                    startActivityForResult(i,selecaogaleria);
                }
            }
        });

    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if(resultCode == RESULT_OK){
            Bitmap imagem = null;
            try{
                switch (requestCode){
                    case selecaogaleria:
                        Uri localimagem = data.getData();
                        imagem = MediaStore.Images.Media.getBitmap(getContentResolver(),localimagem);
                        break;
                }
                if (imagem !=null){
                    imgusermeusdados.setImageBitmap(imagem);
                }
            }
            catch (Exception e){
                e.printStackTrace();
            }

        }

    }

    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);
        for (int permissaoresultado : grantResults) {
            if (permissaoresultado == PackageManager.PERMISSION_DENIED) {
                alertvalidacao();
            }

        }
    }
        private void alertvalidacao(){
            AlertDialog.Builder builder = new AlertDialog.Builder(this);
            builder.setTitle("Permissoes negadas");
            builder.setMessage("Para utilizar o aplicativo é necessario aceitar as permissões");
            builder.setCancelable(false);
            builder.setPositiveButton("Confirmar", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialogInterface, int i) {
                    finish();
                }
            });
            AlertDialog dialog = builder.create();
            dialog.show();
        }






    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_meus_dados, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {


        switch (item.getItemId()) {

            case R.id.itemmenu:
                Intent intent = new Intent(MeusDadosActivity.this,MenuActivity.class);
                startActivity(intent);
                break;
            case R.id.itemgastos:
                Intent gasto = new Intent(MeusDadosActivity.this,GastoServicoActivity.class);
                startActivity(gasto);
                break;
            case R.id.itemservicos:
                Intent serv = new Intent(MeusDadosActivity.this,ServicoActivity.class);
                startActivity(serv);
                break;
            case R.id.itemprodutos:
                Intent prod = new Intent(MeusDadosActivity.this,ProdutosActivity.class);
                startActivity(prod);
                break;
    }
        return super.onOptionsItemSelected(item);

    }


}

