package com.example.estructurascontrol.condicionales;

public class If {

    public static void main(String[] args) {

        int edad = 19;
        boolean esMayor = edad >= 18; // false

        if(esMayor){
            System.out.println("Es mayor de edad");
        }

        if(edad >= 18){
            System.out.println("Es mayor de edad");
        }



    }
}




public class IfElse {

    public static void main(String[] args) {

        int edad = 16;

        if (edad >= 18) { // si true entra aquí
            System.out.println("Es mayor de edad");
        } else { // si false entra aquí
            System.out.println("Es menor de edad");
        }
    }
}





public class IfElseIf {

    public static void main(String[] args) {

        String dia = "DiaNostro";

        // ejemplos comparar
        boolean resultadoCompararNum = 5 == 5;
        boolean resultado = dia.equals("Martes");

        // if else if

        if (dia.equals("Lunes")) {
            System.out.println("Animo con la semana champions");

        } else if (dia.equals("Martes")) {
            System.out.println("Martes con M de Me besas");

        } else if (dia.equals("Miercoles")) {
            System.out.println("Miercoles con M de Me besas");

        } else if (dia.equals("Jueves")) {
            System.out.println("Ya es juernes");

        } else if (dia.equals("Viernes")) {
            System.out.println("Nos fuimos!");

        } else if (dia.equals("Sabado")) {
            System.out.println("Nos murimos!");

        } else if (dia.equals("Domingo")) {
            System.out.println("Depresión");
        } else {
            System.out.println("El día introducido no es un día válido.");
        }


    }
}





public class Switch {
    public static void main(String[] args) {

        String dia = "Martes";

        switch(dia){
            case "Lunes":
                System.out.println("Hoy es Lunes!! Animo!!");
                break;
            case "Martes":
                System.out.println("Hoy es Martes!! Animo!!");
                break;
            case "Miercoles":
                System.out.println("Hoy es Miercoles!! Animo!!");
                break;
            case "Jueves":
                System.out.println("Hoy es Jueves!! Animo!!");
                break;
            case "Viernes":
                System.out.println("Hoy es Viernes!! Animo!!");
                break;
            case "Sabado":
                System.out.println("Hoy es Sabado!! Animo!!");
                break;
            case "Domingo":
                System.out.println("Hoy es Domingo!! Animo!!");
                break;
            default:
                System.out.println("No es un día válido");

        }

    }
}
