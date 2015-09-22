
package futebol;

import java.util.Random;

/*
    Classe responsável por instanciar um atacante. Ela extende Jogador, ou seja
    herda as funções da classe Jogador, sendo considerada também um Jogador.
    Ela também implementa a interface Treino, ou seja, dentro dessa clase temos
    a implementação de algum método da interface Treino (herança multipla de java)
*/
public final class Atacante extends Jogador implements Treino{
    
    private static final String usa = "Pés";
    private int gols; //gols marcados pelo atacante 
    Random r = new Random();
    
    public Atacante(){}
    
    public Atacante(String nome, int idade, double altura, double peso){
        
        setNome(nome);
        setIdade(idade);
        setAltura(altura);
        setPeso(peso);
        
        Random sorteia = new Random();
        
        //sorteia skills do atacante
        setChute(sorteia.nextInt(70-50)+50);//de 50 a 70
        setCardio(sorteia.nextInt(65-40)+40);//de 40 a 65
        setDefesa(sorteia.nextInt(20-10)+10);//de 10 a 20
        setForça(sorteia.nextInt(70-30)+30);//de 30 a 70
        setHabilidade(sorteia.nextInt(80-10)+10);//de 10 a 80
        setReflexo(sorteia.nextInt(40-30)+30);//de 30 a 40
        setVelocidade(sorteia.nextInt(90-30)+30);//de 30 a 90 
        
        setInfluencia();//gera a influencia final do goleiro de acordo com os skills sorteados 
        setTipo();//diz ao string Tipo da super classe Jogador que ele é um atacante
        
    }
    
    public String getUsa(){
        return usa;
    }

    //funcao da interface que aumenta skills do atacante
    @Override
    public void treinar() {
        if(this.getChute() < 99)//se o skill "defesa" já não estiver no limite
            this.setChute(this.getChute()+r.nextInt(2));//aumenta de 0 a 2 o chute
        if(this.getCardio() < 100)
            this.setCardio(this.getCardio()+r.nextInt(1));
        if(this.getForça() < 100)
            this.setForça(this.getForça()+r.nextInt(1));
        if(this.getHabilidade() < 99)
            this.setHabilidade(this.getHabilidade()+r.nextInt(2));
        if(this.getVelocidade() < 100)
            this.setVelocidade(this.getVelocidade()+r.nextInt(1)); 
    }
    
    
    @Override
    public void setAltura(double altura){
        if(0.0 == altura) {
            super.altura = 1.60;
        } else {
            super.altura = altura;
        }
    }
        
    /*
    método que acessa o atributo da superclasse e altera o seu valor. Lembre-se
    que o atributo "tipo" em "Jogador" é PROTECTED, logo pode ser acessado diretamente
    de uma classe filha, sem precisar dos métodos SET e GET
    */
    @Override
    public void setTipo(){
        super.tipo = "Atacante";
    }
    
    //mesma coisa que a função abaixo faz, mas sem polimofirsmo, este método só existe nesta classe
    public int getGols() {
        return gols;
    }
    
    //polimorfismo, este método existe abstrato em Jogador e concreto(implementado) em Goleiro e Atacante 
    @Override
    public void setFeitos() {
        this.gols = r.nextInt(2);
    }
    
    //polimofirsmo, este método existe abstrato em Jogador e concreto(implementado) em Goleiro e Atacante 
    @Override
    public int getFeitos(){
        return gols;
    }
    
    
}
