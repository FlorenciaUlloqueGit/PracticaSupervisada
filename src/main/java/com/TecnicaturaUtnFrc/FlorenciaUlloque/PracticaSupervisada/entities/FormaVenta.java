package com.TecnicaturaUtnFrc.FlorenciaUlloque.PracticaSupervisada.entities;

import javax.persistence.*;

@Entity
@Table(name = "FormaVentas")
public class FormaVenta {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idFormaVenta;
    private String nombre;
    @ManyToOne(cascade = CascadeType.ALL) //un producto puede tener varias formas de venta?
    @JoinColumn(name = "producto_idProducto")
    private Producto producto;

    public int getIdFormaVenta() {
        return idFormaVenta;
    }

    public void setIdFormaVenta(int idFormaVenta) {
        this.idFormaVenta = idFormaVenta;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public FormaVenta(int idFormaVenta, String nombre, Producto producto) {
        this.idFormaVenta = idFormaVenta;
        this.nombre = nombre;
        this.producto = producto;
    }

    public FormaVenta() {
    }
}
