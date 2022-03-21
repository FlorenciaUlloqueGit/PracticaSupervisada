package com.TecnicaturaUtnFrc.FlorenciaUlloque.PracticaSupervisada.entities;

import javax.persistence.*;

@Entity
@Table(name = "SubcategoriaProducto")
public class Subcategoria {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idSubcategoria;

    @ManyToOne
    @JoinColumn(name = "") //AGREGARRRR
    private Categoria categoria;

    private String nombre;

    public int getIdSubcategoria() {
        return idSubcategoria;
    }

    public void setIdSubcategoria(int idSubcategoria) {
        this.idSubcategoria = idSubcategoria;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Subcategoria(int idSubcategoria, Categoria categoria, String nombre) {
        this.idSubcategoria = idSubcategoria;
        this.categoria = categoria;
        this.nombre = nombre;
    }

    public Subcategoria() {
    }
}
