package co.edu.uniquindo.pii.proyecto.cliente.model;

import java.util.List;

public class Registro implements RealizacionRegistro{
    private List<Usuario> listaUsuarios;

    @Override
    public void registrarPersona(Usuario ususario){

        listaUsuarios.add(ususario);
    }
}