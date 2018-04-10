package com.nackir.android.topquizz;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.TextureView;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    // Création des variables des éléments graphiques (Texte, saisie texte et bouton)
   private TextureView mGreetingText;
   private EditText mNameInput;
   private Button mPlayButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Référencer les éléments graphiques
        //Méthode permettant de trouver les éléments par leur id
        mGreetingText = (TextureView) findViewById(R.id.activity_main_greeting_txt);
        mNameInput = (EditText) findViewById(R.id.activity_main_name_input);
        mPlayButton = (Button) findViewById(R.id.activity_main_play_btn);
    }
}

