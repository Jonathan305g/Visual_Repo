package visualcl;

import javax.swing.JOptionPane;

public class Ventana1 extends javax.swing.JDialog {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(Ventana1.class.getName());

    public Ventana1(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }
    
    public void Sumar(){
       //Integer num1, num2, resultado;
        //num1=Integer.valueOf(jtxtNumero1.getText());
        //num2=Integer.valueOf(jtxtNumero2.getText());
        //resultado=num1+num2;
        //jtxtResultado.setText(String.valueOf(resultado));
        Integer resultado = Integer.valueOf(jtxtNumero1.getText())+ Integer.valueOf(jtxtNumero2.getText());
        jtxtResultado.setText(String.valueOf(resultado));
    }
     public void Sumar2(Integer nummero1, Integer nummero2) throws MyException{
       Integer result = nummero1 + nummero2;
       jtxtResultado.setText(String.valueOf(result));
    }
     
     public void Dividir(Integer num1, Integer num2) throws MyException{
         
         if("0".equals(jtxtNumero2.getText())){
             throw new MyException ("No se puede dividir para cero");

         }else if("1".equals(jtxtNumero2.getText())){
             throw new MyException("Dividir para uno no es un reto..");
     }else{
             Integer result = num1 / num2;
             jtxtResultado.setText(String.valueOf(result));
         } 
    }
     
     public void SoloNumeros() throws MyException{
         String texto1 = jtxtNumero1.getText().trim();
         String texto2 = jtxtNumero2.getText().trim();
         
          if (!texto1.matches("-?\\d+") || !texto2.matches("-?\\d+")) {
            throw new MyException("Solo se permiten caracteres númericos");}
     }
     
     public void SoloNumerosVector() throws MyException {
    if (!jtxtPosition.getText().trim().matches("-?\\d+")) {
        throw new MyException("Solo se permiten caracteres numéricos");
    }
}
     
   public void CrearVector() throws MyException {
    int[] vector = new int[100];
    
    for (int i = 0; i < vector.length; i++) {
        vector[i] = i + 1;
    }
    
    
    
    int posicion = Integer.valueOf(jtxtPosition.getText().trim());
    
    if (posicion < 0 || posicion >= vector.length) {
        throw new MyException("La posición " + posicion + " no existe, el vector tiene " + vector.length + " posiciones (0 al " + (vector.length - 1) + ")");
    }
    
    jtxtResulVec.setText(String.valueOf(vector[posicion]));
}

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jtxtNumero1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jtxtNumero2 = new javax.swing.JTextField();
        jbtnSumar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jtxtResultado = new javax.swing.JTextField();
        jbtnDivision = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jtxtPosition = new javax.swing.JTextField();
        jbtnBuscar = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jtxtResulVec = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setText("Numero 1");

        jLabel2.setText("Numero 2");

        jbtnSumar.setText("SUMAR");
        jbtnSumar.addActionListener(this::jbtnSumarActionPerformed);

        jLabel3.setText("Resultado");

        jtxtResultado.addActionListener(this::jtxtResultadoActionPerformed);

        jbtnDivision.setText("DIVIDIR");
        jbtnDivision.addActionListener(this::jbtnDivisionActionPerformed);

        jLabel4.setText("Posicion");

        jtxtPosition.addActionListener(this::jtxtPositionActionPerformed);

        jbtnBuscar.setText("BUSCAR");
        jbtnBuscar.addActionListener(this::jbtnBuscarActionPerformed);

        jLabel5.setText("Resultado del vector");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jtxtResulVec, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jtxtNumero1, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 68, Short.MAX_VALUE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jtxtNumero2, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jtxtResultado, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jtxtPosition, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(36, 36, 36)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jbtnBuscar)
                            .addComponent(jbtnSumar)
                            .addComponent(jbtnDivision))))
                .addContainerGap(139, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jtxtNumero1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jtxtNumero2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jtxtResultado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(jbtnSumar)
                        .addGap(18, 18, 18)
                        .addComponent(jbtnDivision)))
                .addGap(61, 61, 61)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jtxtPosition, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtnBuscar))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jtxtResulVec, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(55, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jtxtResultadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtResultadoActionPerformed
    }//GEN-LAST:event_jtxtResultadoActionPerformed

    private void jbtnSumarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnSumarActionPerformed
        try {
            SoloNumeros();
            Sumar2(Integer.valueOf(jtxtNumero1.getText()), Integer.valueOf(jtxtNumero2.getText()));
        } catch (MyException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }//GEN-LAST:event_jbtnSumarActionPerformed

    private void jbtnDivisionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnDivisionActionPerformed
        try {
            SoloNumeros();
            Dividir(Integer.valueOf(jtxtNumero1.getText()), Integer.valueOf(jtxtNumero2.getText()));
        } catch (MyException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        } 
    }//GEN-LAST:event_jbtnDivisionActionPerformed

    private void jtxtPositionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtPositionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtPositionActionPerformed

    private void jbtnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnBuscarActionPerformed
        // TODO add your handling code here:
        try {
        SoloNumerosVector(); 
        CrearVector();
        } catch (MyException ex) {
        JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }//GEN-LAST:event_jbtnBuscarActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                Ventana1 dialog = new Ventana1(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JButton jbtnBuscar;
    private javax.swing.JButton jbtnDivision;
    private javax.swing.JButton jbtnSumar;
    private javax.swing.JTextField jtxtNumero1;
    private javax.swing.JTextField jtxtNumero2;
    private javax.swing.JTextField jtxtPosition;
    private javax.swing.JTextField jtxtResulVec;
    private javax.swing.JTextField jtxtResultado;
    // End of variables declaration//GEN-END:variables
}
