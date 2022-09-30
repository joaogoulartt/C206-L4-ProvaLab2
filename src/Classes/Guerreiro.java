package Classes;

import Interfaces.AtacanteFisico;

public class Guerreiro extends PersonagemDeJogador implements AtacanteFisico {

    //Construtor
    public Guerreiro(String nome, String genero, int nivel, int vida) {
        super(nome, genero, nivel, vida);
    }

    @Override
    public void mostrarInfo() {
        System.out.println("Nome: " + this.nome);
        System.out.println("Gênero: " + this.genero);
        System.out.println("Nível: " + this.nivel);
        System.out.println("Vida: " + this.vida);
    }

    @Override
    public void ataqueFisico() {
        System.out.println("Ataque físico");
    }
}

