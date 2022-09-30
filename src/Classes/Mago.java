package Classes;

import Interfaces.AtacanteMagico;

public class Mago extends PersonagemDeJogador implements AtacanteMagico {

    private String especialidadeElemental;
    private int mana;

    //Construtor
    public Mago(String nome, String genero, int nivel, int vida, String especialidadeElemental, int mana) {
        super(nome, genero, nivel, vida);
        this.especialidadeElemental = especialidadeElemental;
        this.mana = mana;
    }

    @Override
    public void mostrarInfo() {
        System.out.println("Nome: " + this.nome);
        System.out.println("Gênero: " + this.genero);
        System.out.println("Nível: " + this.nivel);
        System.out.println("Vida: " + this.vida);
        System.out.println("Especialidade Elemental: " + this.especialidadeElemental);
        System.out.println("Mana: " + this.mana);
    }

    @Override
    public void ataqueMagico() {
        System.out.println("Tempestade de fogo");
        while (this.mana > 0) {
            System.out.println("Bola de fogo");
            this.mana = this.mana - 10;
            System.out.println("Mana: " + this.mana);
        }
        System.out.println("Sem mana!");
    }

    public void recuperarMana(int qtd) {
        this.mana += qtd;
    }

}
