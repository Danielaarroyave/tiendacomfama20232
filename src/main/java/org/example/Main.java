package org.example;

import org.example.clases.Empleado;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

       //dentro del metodo main escribo mi programa y creo los objetos
        //CREANDO UNA VARIBALE
        int edad=5;
        System.out.println(edad);

        //CREANDO NUESTRO PRIMER OBJETO
        Cliente objeto=new Cliente();
        // YO USO UN OBJETO PARA ACCEDER A LOS ATRIBUTOS Y METODOS DE LA CLASE POR SEPARADO
        objeto.edad=33; //ACA SE PERSONLAIZA EL MOLDE Y SE LA ASIGNA UN VALOR
        System.out.println(objeto.edad);

        //CREANDO UN OBJETO UTILIZANDO UN CONSTRUCTOR LLENO
        Cliente objetoDos = new Cliente("sara",30,10,"45000","cl50");
        System.out.println(objetoDos.edad);
        System.out.println(objetoDos.nombre);

        //SE LLAMA EL CONSTRUCTOR PARA HACER LA COPIA Y PODER UTILIZAR LAS VARIABLES DE LA CLASE
        //LOS OBJETOS SON COPIAS DE UNA CLASE, SON INSTANCIAS DE UNA CLASE, SON VARIABLES QUE SE CREAN PARA
        //INICIALIZAR LOS ATRIBUTOS DE UNA CLASE


        //CREANDO UN OBJETO DE LA CLASE EMPLEADO
        Empleado objetoTres= new Empleado();
        System.out.println(objetoTres.nombre);


    }
}