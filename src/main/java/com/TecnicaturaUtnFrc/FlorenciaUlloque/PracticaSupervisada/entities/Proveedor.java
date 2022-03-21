package com.TecnicaturaUtnFrc.FlorenciaUlloque.PracticaSupervisada.entities;

import javax.persistence.*;

@Entity
@Table(name = "Proveedores")
public class Proveedor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idProveedor;
    private String nombre;
    private long telefono;

    //un proveedor puede tener varias marcas // sino hacerlo many to many (lo correcto)

    public long getIdProveedor() {
        return idProveedor;
    }

    public void setIdProveedor(long idProveedor) {
        this.idProveedor = idProveedor;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public long getTelefono() {
        return telefono;
    }

    public void setTelefono(long telefono) {
        this.telefono = telefono;
    }
}
