package com.nackir.android.topquizz.controller;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.nackir.android.topquizz.R;

public class MainActivity extends AppCompatActivity {

    // Création des variables des éléments graphiques (Texte, saisie texte et bouton)
   private TextView mGreetingText;
   private EditText mNameInput;
   private Button mPlayButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /*
        * Référencer les éléments graphiques
        *
        * Méthode permettant de trouver les éléments par leur id
        **/
        mGreetingText = (TextView) findViewById(R.id.activity_main_greeting_txt);
        mNameInput = (EditText) findViewById(R.id.activity_main_name_input);
        mPlayButton = (Button) findViewById(R.id.activity_main_play_btn);

        /*
        * Implémentation de la logique "métier"
        * Méthode pour définir activation du bouton
        **/
        // Le bouton est rendu inactif par défaut : false sur la méthode setEnabled
        mPlayButton.setEnabled(false);

        // Création d'un listener (écouteur) pour surveiller le champ texte
        // C'est une interface (Classe Java)
        mNameInput.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            //Méthode permettant de surveiller la saisie de caractères
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                /*
                * On applique la méthode setEnabled sur le bouton
                * si la variable s (qui contient la chaîne de caractère de la zone de saisie
                * à laquelle on applique la méthode toString (pour forcer la chaine de caractères)
                * dont on calcule la longueur (length) en vérifiant qu'elle est différente de zéro
                * dans ce cas le bouton est activé (n'est plus grisé)
                 */
                mPlayButton.setEnabled(s.toString().length() != 0);
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });

        /*
        * Etre notifié quand l'utilisateur clique sur le bouton
        * On utilise une méthode pour ajouter un listener au bouton afin d'étre informé du clic
        *
         */
        mPlayButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent gameActivity = new Intent(MainActivity.this, GameActivity.class);
                startActivity(gameActivity);
            }
        });
    }
}

