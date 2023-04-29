package org.moiseslemus.system;

/* 
@author Alberto Moises Gerardo Lemus Alvarado
Carnet: 2021062
codigo tecnico: IN5BM
Grupo: 1
*/
public class Principal {
    public static void main(String[] args) {

        String nombre = "Moises Lemus";
        String cadena = "anona";
        String correo = "         moises@gmail.com           ";
        System.out.println(nombre.length());
        System.out.println(nombre.toUpperCase());
        System.out.println(nombre.toLowerCase());
        System.out.println(nombre.equals("Moises Lemus"));
        System.out.println(nombre.equalsIgnoreCase("moises lemus"));

        System.out.println(nombre.charAt(0));
        System.out.println(nombre.charAt(7));

        System.out.println(nombre.substring(7));
        System.out.println(nombre.substring(0, 6));

        System.out.println(nombre.charAt(nombre.length()-1));
        System.out.println(nombre.substring(nombre.length()-3));

        System.out.println(cadena.replace("n","e"));
        System.out.println(cadena.indexOf("n"));
        System.out.println(cadena.indexOf("o"));

        System.out.println(correo.contains("@"));
        System.out.println(correo.contains(".com"));
        System.out.println(nombre.startsWith("Moises"));
        System.out.println(nombre.startsWith("Lemus"));
        System.out.println(correo.endsWith(".edu.gt"));
        System.out.println(correo.endsWith(".com"));

        System.out.println(correo);
        System.out.println(correo.trim());
        correo = correo.trim();
        System.out.println(correo);
    }
    
}
