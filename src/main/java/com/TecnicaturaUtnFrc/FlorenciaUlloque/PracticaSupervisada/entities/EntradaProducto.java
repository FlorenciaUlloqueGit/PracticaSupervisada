package com.TecnicaturaUtnFrc.FlorenciaUlloque.PracticaSupervisada.entities;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "IngresoProductos")
public class EntradaProducto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idIngreso;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name =" ", columnDefinition = "")
    private Proveedor  proveedor;
    private Date fecha;
    private double total;
    @OneToMany(mappedBy = " ")
    private List<DetalleEntrada> listadoDetalleEntradas;

    public Long getIdIngreso() {
        return idIngreso;
    }

    public void setIdIngreso(Long idIngreso) {
        this.idIngreso = idIngreso;
    }

    public Proveedor getProveedor() {
        return proveedor;
    }

    public void setProveedor(Proveedor proveedor) {
        this.proveedor = proveedor;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public List<DetalleEntrada> getListadoDetalleEntradas() {
        return listadoDetalleEntradas;
    }

    public void setListadoDetalleEntradas(List<DetalleEntrada> listadoDetalleEntradas) {
        this.listadoDetalleEntradas = listadoDetalleEntradas;
    }

    public EntradaProducto(Long idIngreso, Proveedor proveedor, Date fecha, double total, List<DetalleEntrada> listadoDetalleEntradas) {
        this.idIngreso = idIngreso;
        this.proveedor = proveedor;
        this.fecha = fecha;
        this.total = total;
        this.listadoDetalleEntradas = listadoDetalleEntradas;
    }

    public EntradaProducto() {
    }
}
