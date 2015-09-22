
package futebol;

/*
    Classe responsável por armazenar 3 jogadores, criando a instância de um time
*/
public class Time { //nao preciso herdar Jogador para usa-lo, pois não quero executar suas funcoes, apenas usa-lo

    private final Jogador[] jogadores; //array "final" pq não será modificado na classe
    
    //construtor de um time
    public Time(Goleiro goleiro, Atacante a1, Atacante a2){
        
        //criar um array de 3 jogadores
        jogadores = new Jogador[3]; 
        jogadores[0] = goleiro;
        jogadores[1] = a1;
        jogadores[2] = a2;
        /*
        Obs: não é necessário dar um NEW para cada posição do array pois elas já
             apontam para um objeto existente, portanto será possivel usar suas
             funçoes
        */
        
    }

    //método para retornar um jogador do time
    public Jogador getJogador(int i) {
        return jogadores[i];
    }
    
    //método para retornar todos os jogadores dotime (repare que é do tipo "array de Jogadores")
    public Jogador[] getJogadores() {
        return jogadores;
    }
        
    
}

