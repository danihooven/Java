/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Printer;

/**
 *
 * @author danie
 */
public class MyPrinter extends javax.swing.JFrame {

    /**
     * Creates new form MyPrinter
     */
    public MyPrinter() {
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        textArea1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        imageCheckBox = new javax.swing.JCheckBox();
        textCheckBox = new javax.swing.JCheckBox();
        codeCheckBox = new javax.swing.JCheckBox();
        textArea2 = new javax.swing.JTextField();
        selectionRadioButton = new javax.swing.JRadioButton();
        allRadioButton = new javax.swing.JRadioButton();
        appletRadioButton = new javax.swing.JRadioButton();
        textArea3 = new javax.swing.JTextField();
        okButton = new javax.swing.JButton();
        cancelButton = new javax.swing.JButton();
        setupButton = new javax.swing.JButton();
        helpButton = new javax.swing.JButton();
        printQualityLabel = new javax.swing.JLabel();
        QualityComboBox = new javax.swing.JComboBox<>();
        printToFileCheckBox = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Printer: MyPrinter");

        imageCheckBox.setText("Image");

        textCheckBox.setText("Text");

        codeCheckBox.setText("Code");

        selectionRadioButton.setText("Selection");

        allRadioButton.setText("All");

        appletRadioButton.setText("Applet");

        okButton.setText("OK");

        cancelButton.setText("Cancel");

        setupButton.setText("Setup...");

        helpButton.setText("Help");

        printQualityLabel.setText("Print Quality");

        QualityComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "High", "Medium", "Low" }));

        printToFileCheckBox.setText("Print to File");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(textArea1, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(imageCheckBox)
                            .addComponent(textCheckBox)
                            .addComponent(codeCheckBox))
                        .addGap(18, 18, 18)
                        .addComponent(textArea2, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(selectionRadioButton)
                            .addComponent(allRadioButton)
                            .addComponent(appletRadioButton))
                        .addGap(18, 18, 18)
                        .addComponent(textArea3, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(printQualityLabel)
                        .addGap(18, 18, 18)
                        .addComponent(QualityComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(printToFileCheckBox)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(cancelButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(helpButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(setupButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(okButton, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(okButton)
                        .addGap(25, 25, 25)
                        .addComponent(cancelButton)
                        .addGap(18, 18, 18)
                        .addComponent(setupButton)
                        .addGap(18, 18, 18)
                        .addComponent(helpButton))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(textArea1, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(imageCheckBox)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(textCheckBox)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(codeCheckBox))
                            .addComponent(textArea2, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(selectionRadioButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(allRadioButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(appletRadioButton))
                            .addComponent(textArea3, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(printQualityLabel)
                            .addComponent(QualityComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(printToFileCheckBox))))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MyPrinter().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> QualityComboBox;
    private javax.swing.JRadioButton allRadioButton;
    private javax.swing.JRadioButton appletRadioButton;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.JButton cancelButton;
    private javax.swing.JCheckBox codeCheckBox;
    private javax.swing.JButton helpButton;
    private javax.swing.JCheckBox imageCheckBox;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton okButton;
    private javax.swing.JLabel printQualityLabel;
    private javax.swing.JCheckBox printToFileCheckBox;
    private javax.swing.JRadioButton selectionRadioButton;
    private javax.swing.JButton setupButton;
    private javax.swing.JTextField textArea1;
    private javax.swing.JTextField textArea2;
    private javax.swing.JTextField textArea3;
    private javax.swing.JCheckBox textCheckBox;
    // End of variables declaration//GEN-END:variables
}
