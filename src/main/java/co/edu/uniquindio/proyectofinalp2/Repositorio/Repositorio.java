package co.edu.uniquindio.proyectofinalp2.Repositorio;

import co.edu.uniquindio.proyectofinalp2.model.Envio;
import co.edu.uniquindio.proyectofinalp2.model.Repartidor;
import co.edu.uniquindio.proyectofinalp2.model.Usuario;

import java.util.ArrayList;

public class Repositorio {
    private static Repositorio instance;
    private ArrayList<Envio> enviosAsignados;
    private ArrayList<Usuario> usuarios;
    private ArrayList<Repartidor>repartidores;

    private Repositorio(){
        enviosAsignados=new ArrayList();
        usuarios=new ArrayList();
        repartidores=new ArrayList();
    }
    public static Repositorio getInstance(){
        if(instance==null){
            instance=new Repositorio();
        }
        return instance;
    }
    private void cargarDatos(){
        usuarios=new ArrayList();
        enviosAsignados=new ArrayList();
        repartidores=new ArrayList();
        usuarios.add(new Usuario.Builder().id("123").nombre("Miguel").password("123").build());
        usuarios.add(new Usuario.Builder().id("456").nombre("Miguel").password("124").build());

    }
}
