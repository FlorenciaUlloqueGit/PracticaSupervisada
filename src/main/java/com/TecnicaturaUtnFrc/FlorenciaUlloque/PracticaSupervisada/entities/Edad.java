package com.TecnicaturaUtnFrc.FlorenciaUlloque.PracticaSupervisada.entities;

import javax.persistence.*;

@Entity
public class Edad {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idEdad;
    private String nombre;
    //oneToOne
    @OneToOne(mappedBy = "", cascade = CascadeType.ALL)
    private Animal animal;

    public int getIdEdad() {
        return idEdad;
    }

    public void setIdEdad(int idEdad) {
        this.idEdad = idEdad;
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

    public Edad(int idEdad, String nombre, Animal animal) {
        this.idEdad = idEdad;
        this.nombre = nombre;
        this.animal = animal;
    }
}
