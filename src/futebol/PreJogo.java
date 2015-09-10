
//comentario sobre STATIC e FINAL
/*
Um campo -estático- é aquele que está disponível em uma classe de forma única para toda a aplicação. 
Ele não está vinculado a uma instância da classe. Ele pertence a classe em si e é compartilhado por 
todas as instâncias (objetos) desta classe criadas durante a execução da aplicação.

Um campo -final- é aquele que não pode ter seu conteúdo alterado depois de inicializado. 
Podemos entender como um campo somente de leitura. O valor do campo é inicializado para 
cada instância da classe no momento da sua criação e obviamente cada objeto pode ter este 
campo com valor diferente, mas não poderá ser alterado. O conteúdo pode ser inicializado 
por um construtor ou por atribuição direta. Se o campo contém uma referência, apenas a referência 
não pode ser modificada, o conteúdo do objeto referenciado pode. Portanto o final não garante 
por si só a imutabilidade do objeto.

Você pode ter uma declaração de campo que seja estático e final ao mesmo tempo. Neste caso temos um 
campo constante. Já que você tem uma valor único para toda a aplicação e ele não pode ser modificado. 
Com static final o compilador Java pode substituir o uso do campo pelo seu valor em tempo de compilação 
alcançando uma otimização.
*/

package futebol;

import java.awt.event.ItemEvent;
import java.util.Random;
import javax.swing.JOptionPane;

/*
    Classe responsávelpor aprsentar a tela de PreJogo, e também executa os métodos
    de treino dos Jogadores, além de inicializar a partida
*/
public final class PreJogo extends javax.swing.JFrame {

    Time tA;
    Time tB;
    Random r = new Random();

    //Cria um atributo chamado instancia que só a PreJogo pode ver (private) e contém sempre o mesmo valor (static).
    private static PreJogo instancia;//garatnrirá q só uma instancia será realizada    
    
    public static PreJogo getInstancia(Time tA, Time tB) {
        if (instancia == null) {
            instancia = new PreJogo(tA, tB);
        } 
        return instancia;
    }
    
    public PreJogo(){}
    
    //pre jogo recebe dois times para comecar a jogar
    public PreJogo(Time tA, Time tB) {
        initComponents();
        
        this.tA = tA;
        this.tB = tB;
        
        cbxTimeA.removeAllItems(); //só para garantir que o comboBox inicia vazio
        cbxTimeB.removeAllItems();
        
        //adiciona jogadores como objetos(itens) do combobox
        for(int i=0; i<3; i++)
            cbxTimeA.addItem(tA.getJogador(i));
        for(int i=0; i<3; i++)
            cbxTimeB.addItem(tB.getJogador(i));        
        
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cbxTimeA = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();
        cbxTimeB = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lblChute1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        lblDefesa1 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        lblHabilidade1 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        lblReflexo1 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        lblCardio1 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        lblVelocidade1 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        lblForca1 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        lblInfluencia1 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        lblVelocidade2 = new javax.swing.JLabel();
        lblChute2 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        lblForca2 = new javax.swing.JLabel();
        lblDefesa2 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        lblInfluencia2 = new javax.swing.JLabel();
        lblHabilidade2 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        lblReflexo2 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        lblCardio2 = new javax.swing.JLabel();
        btnTreinar1 = new javax.swing.JButton();
        btnTreinar2 = new javax.swing.JButton();
        btnJogar = new javax.swing.JButton();
        lblDefGol1 = new javax.swing.JLabel();
        lblDefGolsQtd1 = new javax.swing.JLabel();
        lblDefGolsQtd2 = new javax.swing.JLabel();
        lblDefGol2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        cbxTimeA.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbxTimeAItemStateChanged(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 0, 36)); // NOI18N
        jLabel1.setText("TIME A");

        cbxTimeB.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbxTimeBItemStateChanged(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Lucida Grande", 0, 36)); // NOI18N
        jLabel2.setText("TIME B");

        jLabel3.setText("Chute:");

        lblChute1.setText("0");

        jLabel5.setText("Defesa:");

        lblDefesa1.setText("0");

        jLabel7.setText("Habilidade:");

        lblHabilidade1.setText("0");

        jLabel9.setText("Reflexo:");

        lblReflexo1.setText("0");

        jLabel11.setText("Cardio:");

        lblCardio1.setText("0");

        jLabel13.setText("Velocidade:");

        lblVelocidade1.setText("0");

        jLabel15.setText("Força:");

        lblForca1.setText("0");

        jLabel17.setFont(new java.awt.Font("Lucida Grande", 0, 15)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(0, 51, 255));
        jLabel17.setText("INFLUÊNCIA:");

        lblInfluencia1.setFont(new java.awt.Font("Lucida Grande", 0, 15)); // NOI18N
        lblInfluencia1.setText("0");

        jLabel14.setText("Velocidade:");

        jLabel4.setText("Chute:");

        lblVelocidade2.setText("0");

        lblChute2.setText("0");

        jLabel16.setText("Força:");

        jLabel6.setText("Defesa:");

        lblForca2.setText("0");

        lblDefesa2.setText("0");

        jLabel18.setFont(new java.awt.Font("Lucida Grande", 0, 15)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(0, 51, 255));
        jLabel18.setText("INFLUÊNCIA:");

        jLabel8.setText("Habilidade:");

        lblInfluencia2.setFont(new java.awt.Font("Lucida Grande", 0, 15)); // NOI18N
        lblInfluencia2.setText("0");

        lblHabilidade2.setText("0");

        jLabel10.setText("Reflexo:");

        lblReflexo2.setText("0");

        jLabel12.setText("Cardio:");

        lblCardio2.setText("0");

        btnTreinar1.setText("Treinar");
        btnTreinar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTreinar1ActionPerformed(evt);
            }
        });

        btnTreinar2.setText("Treinar");
        btnTreinar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTreinar2ActionPerformed(evt);
            }
        });

        btnJogar.setText("JOGAR");
        btnJogar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnJogarActionPerformed(evt);
            }
        });

        lblDefGol1.setText("Defesas:");

        lblDefGolsQtd1.setText("0");

        lblDefGolsQtd2.setText("0");

        lblDefGol2.setText("Defesas:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblDefGol1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblDefGolsQtd1))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel15)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblForca1))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblVelocidade1))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblCardio1))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addComponent(jLabel9)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(lblReflexo1))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblHabilidade1))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblDefesa1))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblChute1))))
                    .addComponent(btnTreinar1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel17)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblInfluencia1))
                    .addComponent(jLabel1)
                    .addComponent(cbxTimeA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 114, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnTreinar2, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel18, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblInfluencia2)
                        .addGap(15, 15, 15))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel2)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel16)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(lblForca2))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel14)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(lblVelocidade2))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel12)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(lblCardio2))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblReflexo2))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel8)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(lblHabilidade2))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel6)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(lblDefesa2))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel4)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(lblChute2))
                                .addComponent(cbxTimeB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(lblDefGol2)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(lblDefGolsQtd2))))
                .addGap(105, 105, 105))
            .addGroup(layout.createSequentialGroup()
                .addGap(167, 167, 167)
                .addComponent(btnJogar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbxTimeA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbxTimeB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(lblChute1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(lblDefesa1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(lblHabilidade1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(lblReflexo1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(lblCardio1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel13)
                            .addComponent(lblVelocidade1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel15)
                            .addComponent(lblForca1))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblDefGol1)
                            .addComponent(lblDefGolsQtd1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 51, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel17)
                            .addComponent(lblInfluencia1))
                        .addGap(18, 18, 18)
                        .addComponent(btnTreinar1))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(lblChute2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(lblDefesa2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(lblHabilidade2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(lblReflexo2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12)
                            .addComponent(lblCardio2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel14)
                            .addComponent(lblVelocidade2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel16)
                            .addComponent(lblForca2))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblDefGol2)
                            .addComponent(lblDefGolsQtd2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel18)
                            .addComponent(lblInfluencia2))
                        .addGap(18, 18, 18)
                        .addComponent(btnTreinar2)))
                .addGap(18, 18, 18)
                .addComponent(btnJogar, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //atualiza os labels do time A de acordo com jogador selecionado
    private void atualizaA(Jogador n){//Jogador n = new Goleiro() ou new Atacante() dependendo o que chegar aqui
        lblCardio1.setText(Integer.toString(n.getCardio()));
        lblChute1.setText(Integer.toString(n.getChute()));
        lblDefesa1.setText(Integer.toString(n.getDefesa()));
        lblForca1.setText(Integer.toString(n.getForça()));
        lblHabilidade1.setText(Integer.toString(n.getHabilidade()));
        lblVelocidade1.setText(Integer.toString(n.getVelocidade()));
        lblReflexo1.setText(Integer.toString(n.getReflexo()));
        lblInfluencia1.setText(String.format("%.2f", n.getInfluencia()));
        
    }
    
    //atualiza os labels do time B de acordo com jogador selecionado
    private void atualizaB(Jogador n){//Jogador n = new Goleiro() ou new Atacante() dependendo o que chegar aqui
        lblCardio2.setText(Integer.toString(n.getCardio()));
        lblChute2.setText(Integer.toString(n.getChute()));
        lblDefesa2.setText(Integer.toString(n.getDefesa()));
        lblForca2.setText(Integer.toString(n.getForça()));
        lblHabilidade2.setText(Integer.toString(n.getHabilidade()));
        lblVelocidade2.setText(Integer.toString(n.getVelocidade()));
        lblReflexo2.setText(Integer.toString(n.getReflexo()));
        lblInfluencia2.setText(String.format("%.2f", n.getInfluencia()));
        
    }
    
    //exemplo com utilizacao do metodo sobrecaregado
    private void cbxTimeAItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbxTimeAItemStateChanged
        if (evt.getStateChange() == ItemEvent.SELECTED) {
            Jogador n = (Jogador) evt.getItem();
            atualizaA(n);
            if(n.getTipo().contains("Goleiro")){
                lblDefGol1.setText("Defesas:");
                lblDefGolsQtd1.setText(Integer.toString(n.getFeito()));
            }
            else{
                lblDefGol1.setText("Gols:");
                lblDefGolsQtd1.setText(Integer.toString(n.getFeito()));
            }
        }
    }//GEN-LAST:event_cbxTimeAItemStateChanged

    //exemplo com instanceof 
    private void cbxTimeBItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbxTimeBItemStateChanged
        if (evt.getStateChange() == ItemEvent.SELECTED) {
            if(evt.getItem() instanceof Goleiro){
                Goleiro g = (Goleiro) evt.getItem(); //transforma Object em Goleiro
                atualizaB(g);
                lblDefGol2.setText("Defesas:");
                lblDefGolsQtd2.setText(Integer.toString(g.getDefesas()));
            }
            else{
                Atacante a = (Atacante) evt.getItem(); //transforma Object em Atacante
                atualizaB(a);
                lblDefGol2.setText("Gols:");
                lblDefGolsQtd2.setText(Integer.toString(a.getGols()));
            }
        }
    }//GEN-LAST:event_cbxTimeBItemStateChanged

    //método qu aumenta os skills dos jogadores do timeA
    private void btnTreinar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTreinar1ActionPerformed
        if(cbxTimeA.getSelectedItem() instanceof Goleiro){
            Goleiro g = (Goleiro) cbxTimeA.getSelectedItem();
            g.treinar(); //aumenta skills
            g.setInfluencia(); //atualiza influencia do jogador para partida
            atualizaA(g); //atualiza labels
        }
        else{
            Atacante a = (Atacante) cbxTimeA.getSelectedItem();
            a.treinar();
            a.setInfluencia();
            atualizaA(a);
        }

    }//GEN-LAST:event_btnTreinar1ActionPerformed

    //método qu aumenta os skills dos jogadores do timeB
    private void btnTreinar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTreinar2ActionPerformed
        if(cbxTimeB.getSelectedItem() instanceof Goleiro){
            Goleiro g = (Goleiro) cbxTimeB.getSelectedItem();
            g.treinar();
            g.setInfluencia();
            atualizaB(g);
        }
        else{
            Atacante a = (Atacante) cbxTimeB.getSelectedItem();
            a.treinar();
            a.setInfluencia();
            atualizaB(a);
        }
    }//GEN-LAST:event_btnTreinar2ActionPerformed

    //método soh para gerar aleatoriamente gols e defesas da ultima partida
    private void sorteiaGolsDefesas(){
        Random r = new Random();
        
        for(Jogador j : tA.getJogadores())
            j.setSkill();
        for(Jogador j : tB.getJogadores())
            j.setSkill();
        
    }
    
    //método que realiza a partida
    private void btnJogarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnJogarActionPerformed
        double totalTimeA = 0; //influencia total do time A
        double totalTimeB = 0; //influencia total do time B
        
        //soma as influências de cada Jogador
        for(Jogador j : tA.getJogadores())
            totalTimeA += j.getInfluencia();        
        for(Jogador j : tB.getJogadores())
            totalTimeB += j.getInfluencia();
        
        sorteiaGolsDefesas();//sorteio aleatório de defesas realizadas e gols marcados
        
        /*
          aumentará na "sorte" de 0% a 50% a influência do time, pois nem sempre
          o time com melhores jogadores vence
        */
        totalTimeA *= r.nextFloat() * (1.5-1) + 1;
        totalTimeB *= r.nextFloat() * (1.5-1) + 1;
        
        if(totalTimeA > totalTimeB)
            JOptionPane.showMessageDialog(null, "O time A ganhou!");
        else if(totalTimeA < totalTimeB)
            JOptionPane.showMessageDialog(null, "O time B ganhou!");
        else
            JOptionPane.showMessageDialog(null, "Houve um empate!");
        
    }//GEN-LAST:event_btnJogarActionPerformed


    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(PreJogo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PreJogo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PreJogo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PreJogo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PreJogo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnJogar;
    private javax.swing.JButton btnTreinar1;
    private javax.swing.JButton btnTreinar2;
    private javax.swing.JComboBox cbxTimeA;
    private javax.swing.JComboBox cbxTimeB;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel lblCardio1;
    private javax.swing.JLabel lblCardio2;
    private javax.swing.JLabel lblChute1;
    private javax.swing.JLabel lblChute2;
    private javax.swing.JLabel lblDefGol1;
    private javax.swing.JLabel lblDefGol2;
    private javax.swing.JLabel lblDefGolsQtd1;
    private javax.swing.JLabel lblDefGolsQtd2;
    private javax.swing.JLabel lblDefesa1;
    private javax.swing.JLabel lblDefesa2;
    private javax.swing.JLabel lblForca1;
    private javax.swing.JLabel lblForca2;
    private javax.swing.JLabel lblHabilidade1;
    private javax.swing.JLabel lblHabilidade2;
    private javax.swing.JLabel lblInfluencia1;
    private javax.swing.JLabel lblInfluencia2;
    private javax.swing.JLabel lblReflexo1;
    private javax.swing.JLabel lblReflexo2;
    private javax.swing.JLabel lblVelocidade1;
    private javax.swing.JLabel lblVelocidade2;
    // End of variables declaration//GEN-END:variables
}
