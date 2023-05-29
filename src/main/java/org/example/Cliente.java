package org.example;

public class Cliente {
    //atributos: variables que almacenan datos de la clase
    private String nombre;
    public int edad;  //los datos son primitivos cuando todos estan en minusculas
    public Integer comprasAlmes; // este es para num tambien pero con envolturaas
    public String telefono;  //cuando todo esta en mayuscula es un datos en envoltura
    public String direccion;



    //metodos especiales
    // 1. constructor vacio
    public Cliente() {
    }

    //2. CONSTRUCTOR LLENO

    public Cliente(String nombre, int edad, Integer comprasAlmes, String telefono, String direccion) {
        this.nombre = nombre;
        this.edad = edad;
        this.comprasAlmes = comprasAlmes;
        this.telefono = telefono;
        this.direccion = direccion;
    }


    //metodos ordinarios
}
