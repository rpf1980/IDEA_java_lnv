package com.company;

public class Figura
{
    //Atributos
    private String nombre;
    private String color;

    //Constructores
    public Figura(String nombre, String color)
    {
        this.nombre = nombre;
        this.color = color;
    }

    //Gette && Setter
    public String getNombre()
    {
        return nombre;
    }
    public void setNombre(String nombre)
    {
        this.nombre = nombre;
    }
    public String getColor()
    {
        return color;
    }
    public void setColor(String color)
    {
        this.color = color;
    }

    //Metodos
    public double getArea()
    {
        return 0;
    }
}
