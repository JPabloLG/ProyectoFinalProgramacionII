package co.edu.uniquindo.pii.proyecto.cliente.model;

public class RegistroProxy implements RealizacionRegistro {

    private RealizacionRegistro registroReal;
    private boolean usuarioAutorizado;

    @Override
    public void registrarPersona(Usuario usuario){
        acceso(usuario);
        if(usuarioAutorizado){
            if(registroReal == null){
                registroReal = new Registro();
                registroReal.registrarPersona(usuario);
            }
            else{
                registroReal.registrarPersona(usuario);
            }
        }
        else{
            throw new IllegalArgumentException("Usuario no autorizado");
        }
    }

    private void acceso(Usuario usuario){

        if(usuario instanceof Dueño){
            usuarioAutorizado = true;
        }
        else{
            usuarioAutorizado = false;
        }

    }
}