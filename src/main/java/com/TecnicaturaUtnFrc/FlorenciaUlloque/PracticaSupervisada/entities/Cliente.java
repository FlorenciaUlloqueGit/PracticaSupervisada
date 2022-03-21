package com.TecnicaturaUtnFrc.FlorenciaUlloque.PracticaSupervisada.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Cliente extends Usuario{ //crear clase cliente en la base

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id ;
    private String nombre;
    private String apellido;
    private long telefono;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Override
    public String getNombre() {
        return nombre;
    }

    @Override
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public long getTelefono() {
        return telefono;
    }

    public void setTelefono(long telefono) {
        this.telefono = telefono;
    }

    public Cliente(int idUsuario, String nombre, String contra, long id, String nombre1, String apellido, long telefono) {
        super(idUsuario, nombre, contra);
        this.id = id;
        this.nombre = nombre1;
        this.apellido = apellido;
        this.telefono = telefono;
    }

    public Cliente(long id, String nombre, String apellido, long telefono) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
    }

    public Cliente() {
    }
}
