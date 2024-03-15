package org.example;

import java.util.ArrayList;
import java.util.Scanner;

import java.util.ArrayList;
import java.util.Scanner;

public class Animal {
    private int id;
    private String nome;
    private String especie;
    private int idade;
    private String dono;

    public Animal(int id, String nome, String especie, int idade, String dono) {
        this.id = id;
        this.nome = nome;
        this.especie = especie;
        this.idade = idade;
        this.dono = dono;
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }
    @Override
    public String toString() {
        return "ID: " + id + ", Nome: " + nome + ", Espécie: " + especie + ", Idade: " + idade + ", Dono: " + dono;
    }
}