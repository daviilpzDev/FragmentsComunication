package com.example.fragmentscomunication;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


public class ButtonsFragment extends Fragment {

    private OnButtonClickListener buttonClickListener;

    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
        try {
            buttonClickListener = (OnButtonClickListener) context;
        } catch (ClassCastException e) {
            throw new ClassCastException(context.toString() + " debe implementar OnButtonClickListener");
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_buttons, container, false);
        Button buttonGoku = view.findViewById(R.id.buttonGoku);
        Button buttonGohan = view.findViewById(R.id.buttonGohan);
        Button buttonVegetta = view.findViewById(R.id.buttonVegetta);
        Button buttonPiccolo = view.findViewById(R.id.buttonPiccolo);
        Button buttonBills = view.findViewById(R.id.buttonBills);
        Button buttonBulma = view.findViewById(R.id.buttonBulma);

        buttonGoku.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Notifica al MainActivity que se presionó el botón y pasa el ID de la imagen
                buttonClickListener.onButtonClick(R.drawable.goku);
            }
        });

        buttonGohan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Notifica al MainActivity que se presionó el botón y pasa el ID de la imagen
                buttonClickListener.onButtonClick(R.drawable.gohan);
            }
        });

        buttonVegetta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Notifica al MainActivity que se presionó el botón y pasa el ID de la imagen
                buttonClickListener.onButtonClick(R.drawable.vegetta);
            }
        });

        buttonPiccolo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Notifica al MainActivity que se presionó el botón y pasa el ID de la imagen
                buttonClickListener.onButtonClick(R.drawable.piccolo);
            }
        });

        buttonBills.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Notifica al MainActivity que se presionó el botón y pasa el ID de la imagen
                buttonClickListener.onButtonClick(R.drawable.bills);
            }
        });

        buttonBulma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Notifica al MainActivity que se presionó el botón y pasa el ID de la imagen
                buttonClickListener.onButtonClick(R.drawable.bulma);
            }
        });



        return view;
    }
}



