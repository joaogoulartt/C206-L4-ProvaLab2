package Classes;

import Interfaces.AtacanteFisico;

public class Ladino extends PersonagemDeJogador implements AtacanteFisico {

    private int alcanceArco;
    private int numFlechas;
    //Construtor
    public Ladino(String nome, String genero, int nivel, int vida, int alcanceArco, int numFlechas) {
        super(nome, genero, nivel, vida);
        this.alcanceArco = alcanceArco;
        this.numFlechas = numFlechas;
    }

    @Override
    public void ataqueFisico() {
        System.out.println("Chuva de Flechas");
        while (this.numFlechas > 0) {
            System.out.println("Flecha");
            this.numFlechas--;
            System.out.println("Flechas restantes: " + this.numFlechas);
        }
        System.out.println("Sem flechas!");
        System.out.println("Alcance dos ataques: " + this.alcanceArco);
    }

    public void addMunicao(int qtd) {
        this.numFlechas += qtd;
    }

    @Override
    public void mostrarInfo() {
        System.out.println("Nome: " + this.nome);
        System.out.println("Gênero: " + this.genero);
        System.out.println("Nível: " + this.nivel);
        System.out.println("Vida: " + this.vida);
        System.out.println("Alcance do arco: " + this.alcanceArco);
        System.out.println("Número de flechas: " + this.numFlechas);
    }
}
