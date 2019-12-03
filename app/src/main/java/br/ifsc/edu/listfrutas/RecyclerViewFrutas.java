package br.ifsc.edu.listfrutas;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class RecyclerViewFrutas extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler_view_frutas);

        ListView lista = (ListView) findViewById(R.id.recyclerView);

        ArrayList<Lista> elementoslista = addLista();
        ArrayAdapter adapter = new ListaAdapter(this, elementoslista);
        lista.setAdapter(adapter);

    }

    private ArrayList<Lista> addLista() {

        ArrayList<Lista> elementoslista = new ArrayList<Lista>();

        Lista l = new Lista("123456", "melancia", "1,50",
                "3,00", R.drawable.melancia);
        elementoslista.add(l);

        l = new Lista("157689", "morango", "3,00",
                "5,00", R.drawable.morango);
        elementoslista.add(l);

        l = new Lista("148965", "uva", "2,50",
                "3,80", R.drawable.uva);
        elementoslista.add(l);


        return elementoslista;

    }
}
