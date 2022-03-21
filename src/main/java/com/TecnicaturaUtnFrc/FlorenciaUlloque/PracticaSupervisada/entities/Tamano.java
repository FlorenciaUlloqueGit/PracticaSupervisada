package com.TecnicaturaUtnFrc.FlorenciaUlloque.PracticaSupervisada.entities;

import javax.persistence.*;

@Entity
@Table(name = "raza")
public class Tamano {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idTam;
    private String nombre;
    @OneToOne(mappedBy = "Animal", cascade = CascadeType.ALL)
    private Animal animal;

    public int getIdTam() {
        return idTam;
    }

    public void setIdTam(int idTam) {
        this.idTam = idTam;
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

    public Tamano(int idTam, String nombre, Animal animal) {
        this.idTam = idTam;
        this.nombre = nombre;
        this.animal = animal;
    }

    public Tamano() {
    }
}
