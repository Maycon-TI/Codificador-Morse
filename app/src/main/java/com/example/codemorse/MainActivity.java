package com.example.codemorse;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.codemorse.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding binding;
    private String codeMorse;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        super.onCreate(savedInstanceState);
        setContentView(binding.getRoot());
        prepararBotao();
    }

    private void loadView(){
        codeMorse = "";
        String text = binding.etFrase.getText().toString();

        if (!binding.etFrase.getText().toString().isEmpty()) {

            for (int i = 0; i < text.length(); i = i + 1){

                codeMorse = codeMorse.concat(" ");
                char letra = text.charAt(i);
                String c = String.valueOf(letra);
                codeMorseAlphabet(c);
            }

            binding.tvCodeMorse.setText(codeMorse);
        }
    }
    private void codeMorseAlphabet(String c){
        switch (c) {
            case "a":
                codeMorse = codeMorse.concat(".-");
                break;
            case "b":
                codeMorse = codeMorse.concat("-...");
                break;
            case "c":
                codeMorse = codeMorse.concat(".-.-");
                break;
            case "d":
                codeMorse = codeMorse.concat("-..");
                break;
            case "e":
                codeMorse = codeMorse.concat(".");
                break;
            case "f":
                codeMorse = codeMorse.concat("..-.");
                break;
            case "g":
                codeMorse = codeMorse.concat("--.");
                break;
            case "h":
                codeMorse = codeMorse.concat("....");
                break;
            case "i":
                codeMorse = codeMorse.concat("..");
                break;
            case "j":
                codeMorse = codeMorse.concat(".---");
                break;
            case "k":
                codeMorse = codeMorse.concat("-.-");
                break;
            case "l":
                codeMorse = codeMorse.concat(".-..");
                break;
            case "m":
                codeMorse = codeMorse.concat("--");
                break;
            case "n":
                codeMorse = codeMorse.concat("-.");
                break;
            case "o":
                codeMorse = codeMorse.concat("---");
                break;
            case "p":
                codeMorse = codeMorse.concat(".--.");
                break;
            case "q":
                codeMorse = codeMorse.concat("--.-");
                break;
            case "r":
                codeMorse = codeMorse.concat(".-.");
                break;
            case "s":
                codeMorse = codeMorse.concat("...");
                break;
            case "t":
                codeMorse = codeMorse.concat("-");
                break;
            case "u":
                codeMorse = codeMorse.concat("..-");
                break;
            case "v":
                codeMorse = codeMorse.concat("...-");
                break;
            case "w":
                codeMorse = codeMorse.concat(".--");
                break;
            case "x":
                codeMorse = codeMorse.concat("-..-");
                break;
            case "y":
                codeMorse = codeMorse.concat("-.--");
                break;
            case "z":
                codeMorse = codeMorse.concat("--..");
                break;
            case "0":
                codeMorse = codeMorse.concat("-----");
                break;
            case "1":
                codeMorse = codeMorse.concat(".----");
                break;
            case "2":
                codeMorse = codeMorse.concat("..---");
                break;
            case "3":
                codeMorse = codeMorse.concat("...--");
                break;
            case "4":
                codeMorse = codeMorse.concat("....-");
                break;
            case "5":
                codeMorse = codeMorse.concat(".....");
                break;
            case "6":
                codeMorse = codeMorse.concat("-....");
                break;
            case "7":
                codeMorse = codeMorse.concat("--...");
                break;
            case "8":
                codeMorse = codeMorse.concat("---..");
                break;
            case "9":
                codeMorse = codeMorse.concat("----.");
                break;
            case " ":
                codeMorse = codeMorse.concat("/");
                break;
        }

    }

    private void prepararBotao(){
        btOk();
    }

    private void btOk(){
        binding.btOk.setOnClickListener(view -> loadView());
    }
}