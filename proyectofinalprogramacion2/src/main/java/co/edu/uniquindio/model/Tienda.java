package co.edu.uniquindio.model;

import java.util.List;

public class Tienda{
    //Atributos
    public final String NOMBRE = "YHAZ!";
    public List<Factura> listaFacturas;
    public List<Usuario> listaUsuarios;
    private static Tienda instance;

    public static Tienda getInstance(){  //Aquí se verifica la existencia de instance, en caso de no existir
        if(instance == null){            //se crea uno nuevo
            instance = new Tienda();
        }
        return instance;
    }
}