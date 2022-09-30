import Classes.PersonagemDeJogador;

public class Guilda {
    private PersonagemDeJogador[] membros = new PersonagemDeJogador[5];

    //addMembro
    public void addMembro(PersonagemDeJogador personagem){
        for (int i = 0; i < membros.length; i++) {
            if (membros[i] == null) {
                membros[i] = personagem;
                break;
            }
        }
    }

    //listarMembros
    public void listarMembros(){
        for (int i = 0; i < membros.length; i++) {
            if (membros[i] != null) {
                membros[i].mostrarInfo();
            }
        }
    }
}
