package com.TecnicaturaUtnFrc.FlorenciaUlloque.PracticaSupervisada.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idUsuario;
    private String nombre;
    private String contra;

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getContra() {
        return contra;
    }

    public void setContra(String contra) {
        this.contra = contra;
    }

    public Usuario(int idUsuario, String nombre, String contra) {
        this.idUsuario = idUsuario;
        this.nombre = nombre;
        this.contra = contra;
    }

    public Usuario() {
    }
}
