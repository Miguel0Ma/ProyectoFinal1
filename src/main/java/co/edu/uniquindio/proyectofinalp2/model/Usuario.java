package co.edu.uniquindio.proyectofinalp2.model;

import java.util.ArrayList;

public class Usuario {
    private String id;
    private String nombre;
    private String correo;
    private String telefono;
    private ArrayList<Direccion> direcciones;
    private ArrayList<Envio> envios;
    private String password;

    private Usuario (Builder builder) {
        this.id = builder.id;
        this.nombre = builder.nombre;
        this.correo = builder.correo;
        this.telefono=builder.telefono;
        this.direcciones=builder.direcciones;
        this.envios=builder.envios;
        this.password=builder.password;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public ArrayList<Direccion> getDirecciones() {
        return direcciones;
    }

    public void setDirecciones(ArrayList<Direccion> direcciones) {
        this.direcciones = direcciones;
    }

    public ArrayList<Envio> getEnvios() {
        return envios;
    }

    public void setEnvios(ArrayList<Envio> envios) {
        this.envios = envios;
    }

    public static class Builder {
        private String id;
        private String nombre;
        private String correo;
        private String telefono;
        private ArrayList<Direccion> direcciones;
        private ArrayList<Envio> envios;
        private String password;

        public Builder id(String id){
            this.id = id;
            return this;
        }
        public Builder nombre(String nombre){
            this.nombre = nombre;
            return this;
        }
        public Builder correo(String correo){
            this.correo = correo;
            return this;
        }
        public Builder telefono(String telefono){
            this.telefono = telefono;
            return this;
        }
        public Builder direcciones(ArrayList<Direccion> direcciones){
            this.direcciones = direcciones;
            return this;
        }
        public Builder envios(ArrayList<Envio> envios){
            this.envios = envios;
            return this;
        }
        public Builder password(String password){
            this.password=password;
            return this;
        }
        public Usuario build(){
            return new Usuario(this);
        }
    }
}
