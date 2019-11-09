package com.company;

import java.text.DecimalFormat;

public class Circulo extends Figura
{
    //Atributos
    final double PI = 3.1416;
    private double radio;

    //Constructores
    public Circulo(String nombre, String color, double radio)
    {
        super(nombre, color);
        this.radio = radio;
    }

    //Getter && Setter
    public double getRadio()
    {
        double radio = PI * Math.pow(this.radio, 2);

        return radio;
    }

    public void setRadio(double radio)
    {
        this.radio = radio;
    }

    //Métodos
    public double getArea()
    {
        double area = PI * Math.pow(this.radio, 2);

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
