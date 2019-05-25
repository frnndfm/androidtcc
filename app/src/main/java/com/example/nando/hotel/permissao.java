package com.example.nando.hotel;

import android.app.Activity;
import android.content.pm.PackageManager;
import android.os.Build;
import android.support.v4.app.ActivityCompat;
import android.support.v4.content.ContextCompat;

import java.util.ArrayList;
import java.util.List;

public class permissao {

    public static boolean validarpermissoes(String [] permissoes, Activity activity, int request){

        if(Build.VERSION.SDK_INT >= 23){

            List<String> listapermissoes = new ArrayList<>();
            for(String permissao: permissoes){

               Boolean tempermissão =  ContextCompat.checkSelfPermission(activity,permissao) == PackageManager.PERMISSION_GRANTED;
               if( !tempermissão )listapermissoes.add(permissao);


            }
            if(listapermissoes.isEmpty())return true;

            String[] novaspermissoes = new String[listapermissoes.size()];
            listapermissoes.toArray(novaspermissoes);

            ActivityCompat.requestPermissions(activity,novaspermissoes, request );

        }

        return true;
    }

}
