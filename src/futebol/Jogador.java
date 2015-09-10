
package futebol;

import static java.lang.Math.pow;


abstract class Jogador {
    
    private String nome;
    private int idade;
    protected double altura;//será usado em subclasses
    private double peso;
    
    protected String tipo;//atributo protected, para que as classes filhas consigam acessa-lo de forma direta
    
    private double influencia;//guarda a influência do jogador na partida
    
    //Skilss do jogador: todos de 0-100
    private int chute;
    private int defesa;
    private int velocidade;
    private int força;
    private int habilidade;
    private int reflexo;
    private int cardio;
    
    public Jogador(){}
    
    public final String getNome(){
        return nome;
    }
    public final void setNome(String nome){
        this.nome = nome;
    }
    public final int getIdade(){
        return idade;
    }
    //exemplo do benefício do SET, você pode tratar dados incorretos antes de atribuir o valor ao atributo
    public final void setIdade(int idade){
        if(idade == 0)
            this.idade = 18;
        else
            this.idade = idade;
    }
    public final double getAltura(){
        return altura;
    }
    //este método não é final pq em Atacante a altura mínima será 1.60m, este método será sobrescrito (polimofirsmo)
    public void setAltura(double altura){
        if(0.0 == altura) {
            this.altura = 1.7;
        } else {
            this.altura = altura;
        }
    }
    
    public final double getPeso(){
        return peso;
    }
    public final void setPeso(double peso){
        if(0.0 == peso) {
            this.peso = 70.0;
        } else {
            this.peso = peso;
        }
    }


    public final int getDefesa() {
        return defesa;
    }
    public final void setDefesa(int defesa) {
        this.defesa = defesa;
    }

    public final int getVelocidade() {
        return velocidade;
    }
    public final void setVelocidade(int velocidade) {
        this.velocidade = velocidade;
    }

    public final int getForça() {
        return força;
    }
    public final void setForça(int força) {
        this.força = força;
    }

    public final int getHabilidade() {
        return habilidade;
    }
    public final void setHabilidade(int habilidade) {
        this.habilidade = habilidade;
    }

    public final int getReflexo() {
        return reflexo;
    }
    public final void setReflexo(int reflexo) {
        this.reflexo = reflexo;
    }

    public final int getCardio() {
        return cardio;
    }
    public final void setCardio(int cardio) {
        this.cardio = cardio;
    }

    public final int getChute() {
        return chute;
    }
    public final void setChute(int chute) {
        this.chute = chute;
    }
    
    public final double getInfluencia(){
        return influencia;
    }
    //aqui é gerado o valorda influênia do jogador napartida, de acordo com vários fatores (idade, peso, altura)
    public final void setInfluencia(){
        double fatorIdade = 0.5 + 1/idade;
        double fatorPeso = peso/10;
        
        double fatorChute = (this.getChute() + this.getForça()/2)/10;
        double fatorVelocidade = (this.getVelocidade() + this.getCardio()) * fatorIdade * (1/fatorPeso);
        double fatorHabilidade = this.getHabilidade() * pow(1/altura, 2);
        double fatorDefesa = (this.getDefesa() + this.getReflexo() * altura * fatorIdade)/fatorPeso;
        
        this.influencia = fatorChute + fatorVelocidade + fatorHabilidade + fatorDefesa;
    }
    
    public String getTipo(){
        return tipo;
    }
    
    abstract int getFeito();
    abstract void setSkill();
}
