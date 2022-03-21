package com.TecnicaturaUtnFrc.FlorenciaUlloque.PracticaSupervisada.entities;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "CategoriaProducto")
public class Categoria {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idCategoria;

    private String nombre;

    @OneToMany(mappedBy = "categoria")
    private List<Subcategoria> listadoSubcategorias;

    @OneToMany(mappedBy = "Producto") //?
    private List<Producto> listaProductos;

    public int getIdCategoria() {
        return idCategoria;
    }

    public void setIdCategoria(int idCategoria) {
        this.idCategoria = idCategoria;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Subcategoria> getListadoSubcategorias() {
        return listadoSubcategorias;
    }

    public void setListadoSubcategorias(List<Subcategoria> listadoSubcategorias) {
        this.listadoSubcategorias = listadoSubcategorias;
    }

    public List<Producto> getListaProductos() {
        return listaProductos;
    }

    public void setListaProductos(List<Producto> listaProductos) {
        this.listaProductos = listaProductos;
    }

    public Categoria(int idCategoria, String nombre, List<Subcategoria> listadoSubcategorias, List<Producto> listaProductos) {
        this.idCategoria = idCategoria;
        this.nombre = nombre;
        this.listadoSubcategorias = listadoSubcategorias;
        this.listaProductos = listaProductos;
    }

    public Categoria() {
    }
}
