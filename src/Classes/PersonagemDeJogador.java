package Classes;

public abstract class PersonagemDeJogador {
    //Atributos
    protected String nome;
    protected String genero;
    protected int nivel;
    protected int vida;

    //Construtor
    public PersonagemDeJogador(String nome, String genero, int nivel, int vida) {
        this.nome = nome;
        this.genero = genero;
        this.nivel = nivel;
        this.vida = vida;
    }

    public abstract void mostrarInfo();
}
