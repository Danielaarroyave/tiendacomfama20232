package org.example.clases;

public class Empleado {
    //ATRIBUTOS
    public Integer salario;
    private String nombre;


    //METODOS ESPECIALES
    //1. CONSTRUCTOR VACÍO


    public Empleado() {
    }



    //2.CONSTRUCTOR LLENO


    public Empleado(Integer salario, String nombre) {
        this.salario = salario;
        this.nombre = nombre;
    }
}

