package com.tonyseo.machpig;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.ImageView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    ImageView[] iv_arr = new ImageView[5];
    ImageView iv_prin;
    int[] ranarr = new int[5];
    int flag;
    Random rnd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        try {


        }catch (Exception e){
            Toast.makeText(MainActivity.this,"값을 입력하세요.", Toast.LENGTH_SHORT).show();
        };

    }

    public void game_start(View view) {
        flag = rnd.nextInt(5);

        for(int i = 0; i<ranarr.length; i++){
            ranarr[i] = rnd.nextInt(5);
            for(int j = 0; j<i; j++){
                if(ranarr[i]==ranarr[j]){
                    i--;
                    break;
                }
            }
        }

//        for(int i = 0 ; i < iv_arr.length; i++){
//
//        }
    }

    public void howtoplay(View view) {
        final AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("게임설명");
        builder.setMessage("matchPic이란 게임은 동물이 나올거야.\n하단에 있는 단어와 터치한 동물이 일치하면\n이기는거지!!");

        builder.setPositiveButton("확인", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                ;
            }
        });
        AlertDialog dialog = builder.create();
        dialog.show();
    }
}
