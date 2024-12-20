
package igu;

public class FormDificultad extends javax.swing.JFrame {

    public FormDificultad() {
        init();
    }
    public void init(){
        initComponents();
        setResizable(false); 
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jblNormal = new javax.swing.JLabel();
        jblDificil = new javax.swing.JLabel();
        jblFacil = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jblExtremo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(49, 236, 86));

        jblNormal.setFont(new java.awt.Font("Stencil", 1, 18)); // NOI18N
        jblNormal.setForeground(new java.awt.Color(239, 3, 108));
        jblNormal.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jblNormal.setText("normal");

        jblDificil.setFont(new java.awt.Font("Stencil", 1, 18)); // NOI18N
        jblDificil.setForeground(new java.awt.Color(239, 3, 108));
        jblDificil.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jblDificil.setText("dificil");

        jblFacil.setFont(new java.awt.Font("Stencil", 1, 18)); // NOI18N
        jblFacil.setForeground(new java.awt.Color(239, 3, 108));
        jblFacil.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jblFacil.setText("Facil");
        jblFacil.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jblFacilMousePressed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Stencil", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(239, 3, 108));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("atras");

        jblExtremo.setFont(new java.awt.Font("Stencil", 1, 18)); // NOI18N
        jblExtremo.setForeground(new java.awt.Color(239, 3, 108));
        jblExtremo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jblExtremo.setText("Extremo");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jblNormal, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel4))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jblDificil, javax.swing.GroupLayout.DEFAULT_SIZE, 388, Short.MAX_VALUE)
                    .addComponent(jblFacil, javax.swing.GroupLayout.DEFAULT_SIZE, 388, Short.MAX_VALUE)
                    .addComponent(jblExtremo, javax.swing.GroupLayout.DEFAULT_SIZE, 388, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addComponent(jblFacil, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jblNormal, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jblDificil, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jblExtremo, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jblFacilMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jblFacilMousePressed
        this.dispose();
        
        FormFacil formFacil=new FormFacil();
        formFacil.setVisible(true);
    }//GEN-LAST:event_jblFacilMousePressed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel jblDificil;
    private javax.swing.JLabel jblExtremo;
    private javax.swing.JLabel jblFacil;
    private javax.swing.JLabel jblNormal;
    // End of variables declaration//GEN-END:variables
}
