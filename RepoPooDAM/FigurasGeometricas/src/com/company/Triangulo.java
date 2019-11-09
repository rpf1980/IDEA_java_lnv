package com.company;

import java.text.DecimalFormat;

public class Triangulo extends Figura
{
    //Atributos
    private double base;
    private double altura;

    //Constructores
    public Triangulo(String nombre, String color, double base, double altura)
    {
        super(nombre, color);
        this.base = base;
        this.altura = altura;
    }

    //Getter && Setter
    public double getBase()
    {
        return base;
    }
    public void setBase(double base)
    {
        this.base = base;
    }
    public double getAltura()
    {
        return altura;
    }
    public void setAltura(double altura)
    {
        this.altura = altura;
    }

    //Métodos
    public double getArea()
    {
        double area = (this.base * this.altura) / 2;

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
