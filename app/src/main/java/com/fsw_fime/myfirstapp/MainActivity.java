package com.fsw_fime.myfirstapp;

import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button next,skip; //Declaramos los botones de Next y Skip
    private ImageView youtube; //Declaramos el ImageView en caso de que querramos hacer algo con el
    private TextView welcome,awesome; //Declarar Text View
    private LinearLayout linearLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        linearLayout = (LinearLayout) findViewById(R.id.view);

        //Identificamos cuales son nuestros botones por medio de su identificador
        next = (Button) findViewById(R.id.next_btn);
        skip = (Button) findViewById(R.id.skip_btn);

        //Identificamos nuestra imagen por su Id
        youtube = (ImageView) findViewById(R.id.youtube_img);

        //Identificamos nuestros Text View
        welcome = (TextView) findViewById(R.id.welcome_txt);
        awesome = (TextView) findViewById(R.id.awesome_txt);

        //Hacemos el metodo Onclick en el boton de Next
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //Toast que es mensaje que se muestra en pantalla
                Toast.makeText(getApplicationContext(),"Next has been pressed",Toast.LENGTH_LONG).show();
            }
        });
    }
    //Creamos metodo que actua como el OnClickListener
    public void clickdesdeMetodo(View v){
        //Mensaje que vemos desde nuestro Android Monitor
        Log.e("Click","  Click en metodo creado");

        //Snackbar forma de mensaje para el usuario que se muestra en la parte inferior
        Snackbar.make(linearLayout,"Muestra ejemplo de Snackbar",Snackbar.LENGTH_LONG).show();

    }
}
