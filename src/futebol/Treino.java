
package futebol;

/*
Interface utilizada para treinar tanto o goleiro como o jogador

Obs: "treinar()" poderia ser um métododa classe abstrata Jogador
     mas para treinar o uso de interface, esta função foi colocada aqui
*/

public interface Treino {
    
    //assinatura do método treinar, será implementado nas classe que importam essa interface
    public void treinar();
    
}
