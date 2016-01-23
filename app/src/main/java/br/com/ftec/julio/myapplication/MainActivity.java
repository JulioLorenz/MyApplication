package br.com.ftec.julio.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "FTEC";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main); // indica o arquivo de layout dessa Activity

        System.out.println("Não use System.out.println()");
        Log.v(TAG, "Log de Verbose");
        Log.d(TAG, "Log de Debug");
        Log.i(TAG, "Log de Informação");
        Log.w(TAG, "Log de Alerta");
        Log.e(TAG, "Log de Erro");

        TextView textViewTexto = (TextView) findViewById(R.id.texto);
        Log.d(TAG, "Texto Original: " + textViewTexto.getText());
        textViewTexto.setText(R.string.texto_novo);

        ImageView imageViewFtec = (ImageView) findViewById(R.id.imageViewFtec);
        imageViewFtec.setImageResource(R.drawable.ftec2);

    }
}


