package leafAnalysis;

/*
 * This file is the LeafInfo.java which will be shown after analysing an image
 * along with the EdgeResult.java to allow the user to input information about
 * the leaf that can later be stored into the database. @author Daniel Elstob
 * @version 1.0 23-04-2015
 */
public class LeafInfo extends javax.swing.JInternalFrame {
    public String imageFilePath = null;
    public String species = null;
    public String initials = null;
    public String part = null;
    public double pixelsPerCentimeter = 0.0;
    public int dimensionality = 2;
    public int nEdges = 0;
    
    // Creates new form LeafInfo
    public LeafInfo() {
        super("Image File Information",
                false, //resizable
                true, //closable
                false, //maximizable
                true);//iconifiable
        setLocation(300, 239);
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblSpecies = new javax.swing.JLabel();
        txtSpecies = new javax.swing.JTextField();
        lblLOF = new javax.swing.JLabel();
        txtPOF = new javax.swing.JTextField();
        txtIF = new javax.swing.JTextField();
        lblIF = new javax.swing.JLabel();
        lblDimensionality = new javax.swing.JLabel();
        txtDimensionality = new javax.swing.JTextField();
        lblNumber = new javax.swing.JLabel();
        txtNOE = new javax.swing.JTextField();
        lblInitials = new javax.swing.JLabel();
        txtInitials = new javax.swing.JTextField();
        btnOK = new javax.swing.JButton();
        lblHeader = new javax.swing.JLabel();
        btnCancel = new javax.swing.JButton();
        lblPPC = new javax.swing.JLabel();
        txtPPC = new javax.swing.JTextField();

        setBorder(javax.swing.BorderFactory.createEtchedBorder());
        setTitle("Leaf Information");
        setToolTipText("");
        setMinimumSize(new java.awt.Dimension(270, 340));
        setPreferredSize(new java.awt.Dimension(279, 341));

        lblSpecies.setText("Species");

        lblLOF.setText("Leaf or Flower");

        txtIF.setEditable(false);

        lblIF.setText("Image file");

        lblDimensionality.setText("Dimensionality");

        txtDimensionality.setEditable(false);

        lblNumber.setText("Number of Edges");

        txtNOE.setEditable(false);

        lblInitials.setText("Initials");

        btnOK.setText("OK");
        btnOK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOKActionPerformed(evt);
            }
        });

        lblHeader.setText("Add information about aspects of your image");

        btnCancel.setText("Cancel");
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });

        lblPPC.setText("Pixels per cm");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblSpecies, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblLOF, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblInitials, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblPPC)
                            .addComponent(lblDimensionality, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblNumber)
                            .addComponent(lblIF, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtPOF, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtSpecies, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtInitials, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtPPC, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtDimensionality, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNOE, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtIF, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(74, 74, 74)
                        .addComponent(btnCancel)
                        .addGap(18, 18, 18)
                        .addComponent(btnOK))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblHeader)))
                .addGap(70, 70, 70))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(lblHeader)
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSpecies)
                    .addComponent(txtSpecies, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblLOF)
                    .addComponent(txtPOF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblInitials)
                    .addComponent(txtInitials, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPPC)
                    .addComponent(txtPPC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDimensionality)
                    .addComponent(txtDimensionality, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNumber)
                    .addComponent(txtNOE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblIF)
                    .addComponent(txtIF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnOK)
                    .addComponent(btnCancel))
                .addContainerGap(76, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
// OK button to confirm the information about the image.
    private void btnOKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOKActionPerformed
        this.dimensionality = Integer.parseInt(this.txtDimensionality.getText());
        this.imageFilePath = this.txtIF.getText();
        this.initials = this.txtInitials.getText();
        this.part = txtPOF.getText();
        this.species = this.txtSpecies.getText();
        this.pixelsPerCentimeter = 0.0;
        try {
            double tmpd = Double.parseDouble(this.txtPPC.getText());
            this.pixelsPerCentimeter = tmpd;
        } catch (NumberFormatException nfe) {
        }
        this.nEdges = Integer.parseInt(this.txtNOE.getText());
        this.dispose();
    }//GEN-LAST:event_btnOKActionPerformed
    
// Cancel button if the use doesn't want to add information.
    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnCancelActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new LeafInfo().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnOK;
    private javax.swing.JLabel lblDimensionality;
    private javax.swing.JLabel lblHeader;
    private javax.swing.JLabel lblIF;
    private javax.swing.JLabel lblInitials;
    private javax.swing.JLabel lblLOF;
    private javax.swing.JLabel lblNumber;
    private javax.swing.JLabel lblPPC;
    private javax.swing.JLabel lblSpecies;
    public javax.swing.JTextField txtDimensionality;
    public javax.swing.JTextField txtIF;
    public javax.swing.JTextField txtInitials;
    public javax.swing.JTextField txtNOE;
    public javax.swing.JTextField txtPOF;
    public javax.swing.JTextField txtPPC;
    public javax.swing.JTextField txtSpecies;
    // End of variables declaration//GEN-END:variables
}