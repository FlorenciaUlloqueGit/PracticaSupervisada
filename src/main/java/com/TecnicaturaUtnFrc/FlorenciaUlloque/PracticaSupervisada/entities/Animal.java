package com.TecnicaturaUtnFrc.FlorenciaUlloque.PracticaSupervisada.entities;

import javax.persistence.*;

@Entity
public class Animal {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idAnimal;

    @OneToOne
    @JoinColumn(name = "tipo_animal_idTipo") // id_tipo tira Spring
    private TipoAnimal tipoAnimal;
    @OneToOne
    @JoinColumn(name = "tamano_idTam") //provar con id_tam
    private Tamano tamano;
    @OneToOne
    @JoinColumn(name = "edad_idEdad") //id_edad
    private Edad edad;


    public int getIdAnimal() {
        return idAnimal;
    }

    public void setIdAnimal(int idAnimal) {
        this.idAnimal = idAnimal;
    }

    public TipoAnimal getTipoAnimal() {
        return tipoAnimal;
    }

    public void setTipoAnimal(TipoAnimal tipoAnimal) {
        this.tipoAnimal = tipoAnimal;
    }

    public void setTamano(Tamano tamano) {
        this.tamano = tamano;
    }

    public void setEdad(Edad edad) {
        this.edad = edad;
    }

    public Edad getEdad() {
        return edad;
    }

    public Tamano getTamano() {
        return tamano;
    }

    public Animal(int idAnimal, TipoAnimal tipoAnimal, Tamano tamano, Edad edad) {
        this.idAnimal = idAnimal;
        this.tipoAnimal = tipoAnimal;
        this.tamano = tamano;
        this.edad = edad;
    }

    public Animal() {
    }

    @Override
    public String toString() {
        return "Animal{" +
                "idAnimal=" + idAnimal +
                ", tipoAnimal=" + tipoAnimal +
                ", tamano=" + tamano +
                ", edad=" + edad +
                '}';
    }
}
