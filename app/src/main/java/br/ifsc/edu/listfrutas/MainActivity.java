package br.ifsc.edu.listfrutas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button btnRecyclerView;
    private Button btnListView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnRecyclerView = (Button) findViewById(R.id.btnRecyclerView);
        btnListView = (Button) findViewById(R.id.btnListView);

        btnListView.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

                abreActivity1();


            }
        });

        btnRecyclerView.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

                abreActivity2();


            }
        });

    }

    private void abreActivity2() {


        Intent i = new Intent(MainActivity.this, RecyclerViewFrutas.class);
        startActivity(i);

    }


    private void abreActivity1() {

        Intent i = new Intent(MainActivity.this, ListViewFrutas.class);
        startActivity(i);
    }

}
