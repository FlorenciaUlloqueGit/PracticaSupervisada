package com.TecnicaturaUtnFrc.FlorenciaUlloque.PracticaSupervisada.entities;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "Productos")
public class Producto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idProducto;
    private long codBarras;
    private String nombre;
    private Date fechaVencimiento;
    private double precioCompra;
    private double precioVenta;
    @OneToMany(mappedBy = "producto")
    private List<FormaVenta> formaVentaList;
    @ManyToOne
    @JoinColumn(name = "marca_idMarca")
    private Marca marca;
    @ManyToOne
    @JoinColumn(name = "subcategoria_idSubcategoria")
    private Subcategoria subcategoria;
    @ManyToOne
    @JoinColumn(name = "animal_idAnimal")
    private Animal animal;
    private float pesoNeto;
    private Unidad

    public Animal getAnimal() {
        return animal;
    }

    public Subcategoria getSubcategoria() {
        return subcategoria;
    }


    public Marca getMarca() {
        return marca;
    }
}
