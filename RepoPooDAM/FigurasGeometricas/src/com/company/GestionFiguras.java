package com.company;

import java.util.ArrayList;

public class GestionFiguras
{
    //Atributos
    ArrayList<Figura> listaFiguras = new ArrayList<Figura>();

    //Constructor
    public GestionFiguras(ArrayList<Figura> listaFiguras)
    {
        this.listaFiguras = listaFiguras;
    }

    //Métodos
    public void addFigura(Figura f)
    {
        listaFiguras.add(f);
    }

    public void delFigura(Figura f)
    {
        //Buscamos la figura por su índice en la lista
        int i = buscaFigura(f);

        //El objeto debe estar entre el índice 0 y lista.size()
        if(i != -1)
        {
            this.listaFiguras.remove(i);
        }
    }

    public int buscaFigura(Figura f)
    {
        int indice = 0;

        //Recorremos la lista
        for (int i = 0; i < this.listaFiguras.size(); i++)
        {
            if(this.listaFiguras.get(i).getNombre().equalsIgnoreCase(f.getNombre()))
            {
                indice = i;
            }
        }

        //Nos devuelve el índice en la del objeto buscado
        return indice;
    }

    public String muestraDatosLista()
    {
        String fichaFiguras = "";
        int i;

        for(i = 0; i < this.listaFiguras.size(); i++)
        {
            fichaFiguras += listaFiguras.get(i).toString() + "\n";
        }

        return fichaFiguras;
    }

    public double totalAreas()
    {
        double resultado = 0;

        for (int i = 0; i < this.listaFiguras.size(); i++)
        {
            resultado += this.listaFiguras.get(i).getArea();
        }

        return resultado;
    }
}
