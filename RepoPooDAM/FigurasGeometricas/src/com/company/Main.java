package com.company;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Scanner;

public class Main
{

    public static void main(String[] args)
    {
        //Variables
        int opcion = -1;

        //Declaramos una ArrayList de objetos Figura
        ArrayList<Figura> listaFiguras = new ArrayList<Figura>();

        //Instanciamos clase GestionFigura
        GestionFiguras gestiona = new GestionFiguras(listaFiguras);

        //Creamos el menú
        Scanner sc = new Scanner(System.in);
        while(opcion != 0)
        {
            System.out.println("=====================");
            System.out.println("MENÚ OPCIONES FIGURAS");
            System.out.println("=====================");
            System.out.println("[1] Añade figura");
            System.out.println("[2] Borra figura");
            System.out.println("[3] Muestra figuras");
            System.out.println("[4] Calcula total área de las figuras");
            System.out.println("[0] SALIR");

            System.out.print("Elige una opción: ");
            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion)
            {
                case 1:
                {
                    //Objetos de la clase Figura
                    Figura cuadrado = new Cuadrado("Cuadrado", "Rojo", 5.7);
                    Figura triangulo = new Triangulo("Triangulo", "Verde", 23.4, 34.0);
                    Figura circulo = new Circulo("Cuadrado", "Azul", 12.9);

                    listaFiguras.add(cuadrado);
                    listaFiguras.add(triangulo);
                    listaFiguras.add(circulo);

                }
                break;

                case 2:
                {
                    //No saldrá esta prueba aunque delFigura vemos que no da errores y funciona correctamente
                    //porque el objeto cuadrado insertado anteriormente en la lista, figura que queremos borrar
                    //está instanciado en un ámbito local (entre las llaves del case)

                    Figura c2 = new Cuadrado("Cuadrado", "Rojo", 5.7);

                    gestiona.delFigura(c2);
                }
                break;

                case 3:
                {
                    //Mostramos las figuras de la lista con sus datos
                    String fichaDatosFiguras = gestiona.muestraDatosLista();

                    System.out.println(fichaDatosFiguras);
                }
                break;

                case 4:
                {
                    double areasTotales = gestiona.totalAreas();

                    DecimalFormat df = new DecimalFormat("###.##");

                    System.out.println(String.valueOf(df.format(areasTotales)));
                }
                break;


                default: System.out.println("Opcion no encontrada");
                    break;
            }
        }
    }
}

