package br.ifsc.edu.listfrutas;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class ListaAdapter extends ArrayAdapter<Lista> {

    private Context context;
    private  ArrayList<Lista> elementos;

    public ListaAdapter(Context context, ArrayList<Lista> elementos){
        super(context, R.layout.lista, elementos);
        this.context = context;
        this.elementos = elementos;

    }

    public View getView(int position, View convertView, ViewGroup parent) {

        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        View rowView = inflater.inflate(R.layout.lista, parent, false);

        TextView codigo = (TextView) rowView.findViewById(R.id.codigo);
        TextView nomefruta = (TextView) rowView.findViewById(R.id.nomefruta);
        TextView preco = (TextView) rowView.findViewById(R.id.preco);
        TextView precovenda = (TextView) rowView.findViewById(R.id.precovenda);
        ImageView imagem = (ImageView) rowView.findViewById(R.id.imageView);

        codigo.setText(elementos.get(position).getCodigo());
        nomefruta.setText(elementos.get(position).getNomefruta());
        preco.setText(elementos.get(position).getPreco());
        precovenda.setText(elementos.get(position).getPrecovenda());
        imagem.setImageResource(elementos.get(position).getImagem());

        return rowView;
    }

}

