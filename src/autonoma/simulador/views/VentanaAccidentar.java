package autonoma.simulador.views;

import autonoma.simulador.models.Motor;

import autonoma.simulador.sounds.ReproductorSonido;
import javax.swing.ImageIcon;
import javax.swing.JFrame;


/**
 *
 * @author Kamii
 */
public class VentanaAccidentar extends JFrame{
    private Motor motor;
    /**
     * Creates new form VentanaAccidentar
     */
    public VentanaAccidentar(Motor motor) {
        initComponents();
        this.setLocationRelativeTo(null);
        ReproductorSonido.reproducir("sonidoAccidente.wav");
        try{
            this.setIconImage(new ImageIcon(getClass().getResource("/autonoma/simulador/images/CarroFondo.png")).getImage());
        }catch(Exception e){
            System.out.println("imagen no encontrada");
        }
        this.motor = motor;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        accidentar = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        accidentar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/autonoma/simulador/gifs/gifAccidente.gif"))); // NOI18N
        accidentar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                accidentarMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(accidentar, javax.swing.GroupLayout.PREFERRED_SIZE, 491, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(accidentar, javax.swing.GroupLayout.PREFERRED_SIZE, 272, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void accidentarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_accidentarMouseClicked
        ReproductorSonido.detener();
        this.motor.apagarPorAccidente();
        this.dispose();
    }//GEN-LAST:event_accidentarMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel accidentar;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
