package com.TecnicaturaUtnFrc.FlorenciaUlloque.PracticaSupervisada.entities;

import javax.persistence.*;

@Entity
@Table(name = "tipoAnimal")
public class TipoAnimal {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idTipo;
    private String nombre;
    @OneToOne(mappedBy = "Animal", cascade = CascadeType.ALL)
    private Animal animal;

    public int getIdTipo() {
        return idTipo;
    }

    public void setIdTipo(int idTipo) {
        this.idTipo = idTipo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Animal getAnimal() {
        return animal;
    }

    public void setAnimal(Animal animal) {
        this.animal = animal;
    }

    public TipoAnimal(int idTipo, String nombre, Animal animal) {
        this.idTipo = idTipo;
        this.nombre = nombre;
        this.animal = animal;
    }

    public TipoAnimal() {
    }
}
