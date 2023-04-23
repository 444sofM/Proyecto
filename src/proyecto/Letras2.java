
package proyecto;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Usuario
 */
public class Letras2 extends javax.swing.JFrame{
    int contador;
    private String[][] palabras = {{"PERRO", "GATO", "ELEFANTE"},
        {"MANZANA", "BANANA", "NARANJA"},
        {"ROJO", "AZUL", "VERDE"}
    };
    private Random rand = new Random();
    private int indice = 0;
    public String sinVocal(String palabras){
        
        boolean encontrado = false;
        StringBuilder resultado = new StringBuilder();
        for (int i = 0; i < palabras.length(); i++) {
            char caracter = palabras.charAt(i);
            if (!encontrado && esVocal(caracter)) {
                resultado.append('_');
                encontrado = true;
            } else {
                resultado.append(caracter);
            }
        }
        return resultado.toString();

        
    }

      public static boolean esVocal(char c) {
        c = Character.toLowerCase(c);
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }

    /**
     * Creates new form Letras2
     */
    public Letras2() {
        
        initComponents();
        
        
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        intentos = new javax.swing.JLabel();
        jugadornombre = new javax.swing.JTextField();
        intentos1 = new javax.swing.JTextField();
        salirdeljuego = new javax.swing.JButton();
        vocalA = new javax.swing.JButton();
        vocalE = new javax.swing.JButton();
        vocalI = new javax.swing.JButton();
        vocalO = new javax.swing.JButton();
        vocalU = new javax.swing.JButton();
        letraintento = new javax.swing.JTextField();
        siguiente = new javax.swing.JButton();
        boxuno = new javax.swing.JComboBox<>();
        panelmuestra = new javax.swing.JPanel();
        vocalaqui = new javax.swing.JTextField();
        letracorrecta = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(153, 255, 153));

        jLabel1.setFont(new java.awt.Font("Dubai Medium", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 51, 255));
        jLabel1.setText("Jugador:");

        intentos.setFont(new java.awt.Font("Dubai Medium", 1, 18)); // NOI18N
        intentos.setForeground(new java.awt.Color(255, 0, 255));
        intentos.setText("Intentos");

        jugadornombre.setFont(new java.awt.Font("Dubai Medium", 3, 18)); // NOI18N
        jugadornombre.setForeground(new java.awt.Color(204, 0, 204));
        jugadornombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jugadornombreActionPerformed(evt);
            }
        });

        salirdeljuego.setBackground(new java.awt.Color(51, 255, 0));
        salirdeljuego.setFont(new java.awt.Font("Vineta BT", 0, 24)); // NOI18N
        salirdeljuego.setText("SALIR DEL JUEGO");
        salirdeljuego.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                salirdeljuegoMouseClicked(evt);
            }
        });
        salirdeljuego.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salirdeljuegoActionPerformed(evt);
            }
        });

        vocalA.setBackground(new java.awt.Color(153, 255, 153));
        vocalA.setFont(new java.awt.Font("Elephant", 1, 36)); // NOI18N
        vocalA.setForeground(new java.awt.Color(0, 255, 255));
        vocalA.setText("A");
        vocalA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vocalAActionPerformed(evt);
            }
        });

        vocalE.setBackground(new java.awt.Color(153, 255, 153));
        vocalE.setFont(new java.awt.Font("Elephant", 1, 36)); // NOI18N
        vocalE.setForeground(new java.awt.Color(0, 255, 255));
        vocalE.setText("E");
        vocalE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vocalEActionPerformed(evt);
            }
        });

        vocalI.setBackground(new java.awt.Color(153, 255, 153));
        vocalI.setFont(new java.awt.Font("Elephant", 1, 36)); // NOI18N
        vocalI.setForeground(new java.awt.Color(0, 255, 255));
        vocalI.setText("I");
        vocalI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vocalIActionPerformed(evt);
            }
        });

        vocalO.setBackground(new java.awt.Color(153, 255, 153));
        vocalO.setFont(new java.awt.Font("Elephant", 1, 36)); // NOI18N
        vocalO.setForeground(new java.awt.Color(0, 255, 255));
        vocalO.setText("O");
        vocalO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vocalOActionPerformed(evt);
            }
        });

        vocalU.setBackground(new java.awt.Color(153, 255, 153));
        vocalU.setFont(new java.awt.Font("Elephant", 1, 36)); // NOI18N
        vocalU.setForeground(new java.awt.Color(0, 255, 255));
        vocalU.setText("U");
        vocalU.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vocalUActionPerformed(evt);
            }
        });

        letraintento.setFont(new java.awt.Font("Chiller", 0, 36)); // NOI18N
        letraintento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                letraintentoActionPerformed(evt);
            }
        });

        siguiente.setBackground(new java.awt.Color(0, 204, 255));
        siguiente.setFont(new java.awt.Font("Dubai Medium", 1, 18)); // NOI18N
        siguiente.setText("SIGUIENTE");
        siguiente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                siguienteActionPerformed(evt);
            }
        });

        boxuno.setBackground(new java.awt.Color(0, 255, 255));
        boxuno.setFont(new java.awt.Font("Dubai Medium", 1, 18)); // NOI18N
        boxuno.setForeground(new java.awt.Color(255, 102, 102));
        boxuno.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Animales", "Frutas", "Colores" }));
        boxuno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boxunoActionPerformed(evt);
            }
        });

        panelmuestra.addContainerListener(new java.awt.event.ContainerAdapter() {
            public void componentAdded(java.awt.event.ContainerEvent evt) {
                panelmuestraComponentAdded(evt);
            }
        });
        panelmuestra.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                panelmuestraAncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });

        vocalaqui.setFont(new java.awt.Font("Chiller", 0, 36)); // NOI18N
        vocalaqui.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vocalaquiActionPerformed(evt);
            }
        });

        letracorrecta.setFont(new java.awt.Font("Wide Latin", 0, 10)); // NOI18N
        letracorrecta.setText("Comprobar      vocal");
        letracorrecta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                letracorrectaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelmuestraLayout = new javax.swing.GroupLayout(panelmuestra);
        panelmuestra.setLayout(panelmuestraLayout);
        panelmuestraLayout.setHorizontalGroup(
            panelmuestraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelmuestraLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(vocalaqui, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 94, Short.MAX_VALUE)
                .addComponent(letracorrecta, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        panelmuestraLayout.setVerticalGroup(
            panelmuestraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelmuestraLayout.createSequentialGroup()
                .addContainerGap(41, Short.MAX_VALUE)
                .addGroup(panelmuestraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(vocalaqui, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(letracorrecta, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jugadornombre, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(105, 105, 105)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(vocalA, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(vocalI, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGap(58, 58, 58)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(vocalE)
                                .addComponent(vocalO)))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(165, 165, 165)
                            .addComponent(vocalU))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(142, 142, 142)
                            .addComponent(boxuno, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(60, 60, 60)
                                .addComponent(salirdeljuego))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(115, 115, 115)
                                .addComponent(letraintento, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(219, 219, 219)
                                .addComponent(siguiente))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(168, 168, 168)
                                .addComponent(panelmuestra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(197, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(intentos)
                        .addGap(18, 18, 18)
                        .addComponent(intentos1, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(181, 181, 181))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(intentos)
                    .addComponent(jugadornombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(intentos1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(71, 71, 71)
                        .addComponent(panelmuestra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(letraintento, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(siguiente)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(salirdeljuego)
                        .addGap(62, 62, 62))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(boxuno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(86, 86, 86)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(vocalA)
                            .addComponent(vocalE))
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(vocalI)
                            .addComponent(vocalO))
                        .addGap(18, 18, 18)
                        .addComponent(vocalU)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void jugadornombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jugadornombreActionPerformed
        // Para que el nombre aparezaca en la ventana
        String nombre = jugadornombre.getText();
        jugadornombre.setText(jugadornombre.getText()+nombre);
        
    }//GEN-LAST:event_jugadornombreActionPerformed

    private void salirdeljuegoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirdeljuegoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_salirdeljuegoActionPerformed

    private void salirdeljuegoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_salirdeljuegoMouseClicked
        // SALIR DE LA APLICACION:
       
        System.exit(0); // Cierra la aplicación
      
    }//GEN-LAST:event_salirdeljuegoMouseClicked

    private void vocalAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vocalAActionPerformed
                    
        String letra =vocalA.getText();
        vocalaqui.setText(vocalaqui.getText()+letra);
      
    }//GEN-LAST:event_vocalAActionPerformed

    private void vocalEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vocalEActionPerformed
        // TODO add your handling code here:
        String letra =vocalE.getText();
        vocalaqui.setText(vocalaqui.getText()+letra);
    }//GEN-LAST:event_vocalEActionPerformed

    private void vocalIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vocalIActionPerformed
        // TODO add your handling code here:
        String letra =vocalI.getText();
        vocalaqui.setText(vocalaqui.getText()+letra);
    }//GEN-LAST:event_vocalIActionPerformed

    private void vocalOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vocalOActionPerformed
        // TODO add your handling code here:
        String letra =vocalO.getText();
        vocalaqui.setText(vocalaqui.getText()+letra);
    }//GEN-LAST:event_vocalOActionPerformed

    private void vocalUActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vocalUActionPerformed
        // TODO add your handling code here:
        String letra =vocalU.getText();
        vocalaqui.setText(vocalaqui.getText()+letra);
    }//GEN-LAST:event_vocalUActionPerformed

    private void letraintentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_letraintentoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_letraintentoActionPerformed
  
    private void siguienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_siguienteActionPerformed
            // TODO add your handling code here:
        contador++;
        String numero=String.valueOf(contador);
        intentos1.setText(numero);
        
        
        String opcionSeleccionda = (String) boxuno.getSelectedItem();
        String[] listaDePalabras = palabras[boxuno.getSelectedIndex()];
        String palabra = listaDePalabras[rand.nextInt(listaDePalabras.length)];
        String palabraMostrar = sinVocal(palabra);
        letraintento.setText(palabraMostrar);
        add(siguiente);
        
         if  (vocalaqui.getText().length()!=0){
        vocalaqui.setText(vocalaqui.getText().substring(0,vocalaqui.getText().length()-1));
         }
        
  
    }//GEN-LAST:event_siguienteActionPerformed

    private void boxunoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boxunoActionPerformed
        // TODO add your handling code here:
        add(boxuno);
    }//GEN-LAST:event_boxunoActionPerformed

    private void panelmuestraAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_panelmuestraAncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_panelmuestraAncestorAdded

    private void panelmuestraComponentAdded(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_panelmuestraComponentAdded
        // TODO add your handling code here:
        
    }//GEN-LAST:event_panelmuestraComponentAdded

    private void letracorrectaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_letracorrectaActionPerformed
     
     
           
    
      if (letracorrecta(vocalaqui.getText().trim())){
          JOptionPane.showMessageDialog(rootPane, "LA VOCAL ES CORRECTA");
          
          
      }
      else{
           JOptionPane.showMessageDialog(rootPane, "ES INCORRETO");
      }
     
    }//GEN-LAST:event_letracorrectaActionPerformed
          public static boolean letracorrecta(String vocalaqui){
             return vocalaqui.matches("[a-e-i-o-uA-E-I-O-U]");
        }
    private void vocalaquiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vocalaquiActionPerformed
        
    }//GEN-LAST:event_vocalaquiActionPerformed
 
    /**
     * @param args the command line arguments
     */
    
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        Letras2 app = new Letras2();
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
            java.util.logging.Logger.getLogger(Letras2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Letras2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Letras2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Letras2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Letras2().setVisible(true);
            }
        });
        
    }
    
   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> boxuno;
    private javax.swing.JLabel intentos;
    private javax.swing.JTextField intentos1;
    private javax.swing.JLabel jLabel1;
    public static javax.swing.JTextField jugadornombre;
    private javax.swing.JButton letracorrecta;
    private javax.swing.JTextField letraintento;
    private javax.swing.JPanel panelmuestra;
    private javax.swing.JButton salirdeljuego;
    private javax.swing.JButton siguiente;
    private javax.swing.JButton vocalA;
    private javax.swing.JButton vocalE;
    private javax.swing.JButton vocalI;
    private javax.swing.JButton vocalO;
    private javax.swing.JButton vocalU;
    private javax.swing.JTextField vocalaqui;
    // End of variables declaration//GEN-END:variables
}
