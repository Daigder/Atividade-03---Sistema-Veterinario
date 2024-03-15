package org.example;

import java.util.ArrayList;
import java.util.List;

public class SistemaVeterinario {
    private List<Animal> animais;

    public SistemaVeterinario() {
        animais = new ArrayList<>();
        listaDeAnimais();
    }

    private void listaDeAnimais() {
        animais.add(new Animal(1, "Nasus", "Cachorro", 3, "João"));
        animais.add(new Animal(2, "Rengar", "Gato", 2, "Maria"));
        animais.add(new Animal(3, "Nami", "Peixe", 1, "Pedro"));
        animais.add(new Animal(4, "Leona", "Cachorro", 5, "Ana"));
        animais.add(new Animal(5, "Yuumi", "Gato", 4, "Carla"));
    }

    public boolean cadastrarAnimal(String nome, String especie, int idade, String dono) {
        int proximoId = animais.size() + 1;
        Animal animal = new Animal(proximoId, nome, especie, idade, dono);
        if (animais.add(animal)) {
            System.out.println("Animal cadastrado com sucesso.");
            return true;
        } else {
            System.out.println("Erro ao cadastrar o animal.");
            return false;
        }
    }

    public Animal buscarAnimalPorId(int id) {
        for (Animal animal : animais) {
            if (animal.getId() == id) {
                return animal;
            }
        }
        return null;
    }

    public boolean alterarAnimal(int id, String nome, String especie, int idade, String dono) {
        Animal animal = buscarAnimalPorId(id);
        if (animal != null) {
            animal.setNome(nome);
            animal.setEspecie(especie);
            animal.setIdade(idade);
            animal.setDono(dono);
            System.out.println("Animal alterado com sucesso.");
            return true;
        } else {
            System.out.println("Animal não encontrado.");
            return false;
        }
    }

    public boolean excluirAnimal(int id) {
        Animal animal = buscarAnimalPorId(id);
        if (animal != null) {
            if (animais.remove(animal)) {
                System.out.println("Animal excluído com sucesso.");
                return true;
            } else {
                System.out.println("Erro ao excluir o animal.");
                return false;
            }
        } else {
            System.out.println("Animal não encontrado.");
            return false;
        }
    }

    public void listarAnimais() {
        for (Animal animal : animais) {
            System.out.println(animal);
        }
    }
}

