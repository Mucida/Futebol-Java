
package futebol;

import java.util.Random;

/*
    Classe responsável por instanciar um goleiro. Ela extende Jogador, ou seja
    herda as funções da classe Jogador, sendo considerada também um Jogador.
    Ela também implementa a interface Treino, ou seja, dentro dessa clase temos
    a implementação de algum método da interface Treino
*/
public final class Goleiro extends Jogador implements Treino{
    
    private static final String usa = "Mãos"; //poderia estar em jogador, mas só para demonstrar o static
    private int defesas; //numero de defesas que o goleiro realizou
    Random r = new Random();
    
    public Goleiro(){}
    
    //construtor personalizado do goleiro
    public Goleiro(String nome, int idade, double altura, double peso){
        
        setNome(nome);
        setIdade(idade);
        setAltura(altura);
        setPeso(peso);
        
        Random sorteia = new Random();
        
        //sorteia skills do goleiro
        setChute(sorteia.nextInt(60-50)+50);//de 50 a 60
        setCardio(sorteia.nextInt(60-30)+30);//de 30 a 60
        setDefesa(sorteia.nextInt(90-60)+60);//de 60 a 90
        setForça(sorteia.nextInt(70-40)+40);// de 40 a 70
        setHabilidade(sorteia.nextInt(20-10)+10);//de 10 a 20
        setReflexo(sorteia.nextInt(80-60)+60);//de 60 a 80
        setVelocidade(sorteia.nextInt(60-30)+30);//de 30 a 60        
        
        setInfluencia();//gera a influencia final do goleiro de acordo com os skills sorteados
        setTipo();//diz ao string Tipo da super classe Jogador que ele é um goleiro
        
    }
    
    public String getUsa(){
        return usa;
    }
    
    //método da interface que aumenta skills do goleiro
    @Override
    public void treinar() {
        if(this.getReflexo() < 99)//se o skill "defesa" já não estiver no limite
            this.setReflexo(this.getReflexo()+r.nextInt(2));//aumenta de 0 a 2 o reflexo
        if(this.getDefesa() < 99)
            this.setDefesa(this.getDefesa()+r.nextInt(2));
        if(this.getCardio() < 100)
            this.setCardio(this.getCardio()+r.nextInt(1));
        if(this.getForça() < 100)
            this.setForça(this.getForça()+r.nextInt(1));
        if(this.getVelocidade() < 100)
            this.setVelocidade(this.getVelocidade()+r.nextInt(1)); 
    }
    
    /*
    método que acessa o atributo da superclasse e altera o seu valor. Lembre-se
    que o atributo "tipo" em "Jogador" é PROTECTED, logo pode ser acessado diretamente
    de uma classe filha, sem precisar dos métodos SET e GET
    */
    @Override
    public void setTipo(){
        super.tipo = "Goleiro";
    }    
       
    //mesma coisa que a função abaixo faz, mas sem polimofirsmo, este método só existe nesta classe
    protected int getDefesas() {
        return defesas;
    }    
        
    //polimorfismo, este método existe abstrato em Jogador e concreto(implementado) em Goleiro e Atacante 
    @Override
    public int getFeitos(){
        return defesas;
    }
    
    //polimofirsmo, este método existe abstrato em Jogador e concreto(implementado) em Goleiro e Atacante 
    @Override
    public void setFeitos() {
        this.defesas = r.nextInt(15-5)+5;
    }
}
