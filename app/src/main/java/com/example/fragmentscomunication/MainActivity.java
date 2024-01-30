package com.example.fragmentscomunication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity implements OnButtonClickListener {

    private ImageFragment imageFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Agrega el fragmento ImageFragment al contenedor
        imageFragment = new ImageFragment();
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.fragmentImage, imageFragment)
                .commit();
    }

    @Override
    public void onButtonClick(int imageResId) {
        // Cambia la imagen en ImageFragment cuando se presiona un botón
        imageFragment.setImageResource(imageResId);
    }
}
