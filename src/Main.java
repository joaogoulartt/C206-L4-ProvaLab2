import Classes.*;

public class Main {
    public static void main(String[] args) {
        //Criação de Ladino, Guerreiro, Mago
        Ladino ladino = new Ladino("Ladin", "Masculino", 12, 100, 30, 10);
        Guerreiro guerreiro = new Guerreiro("Brutus", "Masculino", 9, 100);
        Mago mago = new Mago("Morgana", "Feminino", 10, 100, "Fogo", 40);

        Guilda guilda = new Guilda();

        guilda.addMembro(ladino);
        guilda.addMembro(guerreiro);
        guilda.addMembro(mago);

        int qtdMana = 10;
        int qtdFlechas = 5;

        ladino.addMunicao(qtdFlechas);
        mago.recuperarMana(qtdMana);

        guilda.listarMembros();

        guerreiro.ataqueFisico();
        ladino.ataqueFisico();
        mago.ataqueMagico();
    }
}