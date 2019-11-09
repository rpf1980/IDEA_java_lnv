package com.company;

import java.text.DecimalFormat;

public class Cuadrado extends Figura
{
    //Atributos
    private double lado;

    //Constructores
    public Cuadrado(String nombre, String color, double lado)
    {
        super(nombre, color);
        this.lado = lado;
    }

    //Getter && Setter
    public double getLado()
    {
        return lado;
    }

    public void setLado(double lado)
    {
        this.lado = lado;
    }

    //Métodos
    public double getArea()
    {
        double area = Math.pow(this.lado, 2);

        return area;
    }

    @Override
    public String toString()
    {
        DecimalFormat formateador = new DecimalFormat("####.##");

        return "Nombre: " 		+ getNombre() + "\n" +
                "Color: "		+ getColor() + "\n" +
                "Area: " 		+ formateador.format(getArea());
    }
}
