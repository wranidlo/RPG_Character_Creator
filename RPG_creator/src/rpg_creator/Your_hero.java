/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rpg_creator;

/**
 *
 * @author baryl
 */
public class Your_hero extends javax.swing.JFrame {

    /**
     * Creates new form Your_hero
     */
    public Your_hero() {
        super("RPG Cretor");
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

        buttonGroupSex = new javax.swing.ButtonGroup();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        panelName = new javax.swing.JPanel();
        labelName = new javax.swing.JLabel();
        textName = new javax.swing.JTextField();
        labelStory = new javax.swing.JLabel();
        labeSex = new javax.swing.JLabel();
        scrollStory = new javax.swing.JScrollPane();
        textStory = new javax.swing.JTextArea();
        buttonSexMale = new javax.swing.JRadioButton();
        buttonSexFemale = new javax.swing.JRadioButton();
        panelRace = new javax.swing.JPanel();
        panelClass = new javax.swing.JPanel();
        panelStats = new javax.swing.JPanel();
        panelEquipment = new javax.swing.JPanel();
        menuBar = new javax.swing.JMenuBar();
        menuFile = new javax.swing.JMenu();
        menuOptions = new javax.swing.JMenu();

        buttonGroupSex.add(buttonSexMale);
        buttonGroupSex.add(buttonSexFemale);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        labelName.setText("Name");

        textName.setText("waran");

        labelStory.setText("Story");

        labeSex.setText("Sex");

        scrollStory.createVerticalScrollBar();

        textStory.setColumns(20);
        textStory.setRows(5);
        textStory.setLineWrap(true);
        textStory.setWrapStyleWord(true);
        scrollStory.setViewportView(textStory);

        buttonSexMale.setText("Male");

        buttonSexFemale.setText("Female");

        javax.swing.GroupLayout panelNameLayout = new javax.swing.GroupLayout(panelName);
        panelName.setLayout(panelNameLayout);
        panelNameLayout.setHorizontalGroup(
            panelNameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelNameLayout.createSequentialGroup()
                .addGroup(panelNameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(scrollStory, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
                    .addComponent(labelName, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(textName, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelStory, javax.swing.GroupLayout.Alignment.LEADING))
                .addGap(41, 41, 41)
                .addGroup(panelNameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labeSex)
                    .addComponent(buttonSexMale)
                    .addComponent(buttonSexFemale))
                .addGap(0, 84, Short.MAX_VALUE))
        );
        panelNameLayout.setVerticalGroup(
            panelNameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelNameLayout.createSequentialGroup()
                .addGroup(panelNameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelName)
                    .addComponent(labeSex))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelNameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonSexMale))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelNameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelStory)
                    .addComponent(buttonSexFemale))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(scrollStory, javax.swing.GroupLayout.DEFAULT_SIZE, 186, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane2.addTab("Name", panelName);

        javax.swing.GroupLayout panelRaceLayout = new javax.swing.GroupLayout(panelRace);
        panelRace.setLayout(panelRaceLayout);
        panelRaceLayout.setHorizontalGroup(
            panelRaceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 324, Short.MAX_VALUE)
        );
        panelRaceLayout.setVerticalGroup(
            panelRaceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 264, Short.MAX_VALUE)
        );

        jTabbedPane2.addTab("Race", panelRace);

        javax.swing.GroupLayout panelClassLayout = new javax.swing.GroupLayout(panelClass);
        panelClass.setLayout(panelClassLayout);
        panelClassLayout.setHorizontalGroup(
            panelClassLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 324, Short.MAX_VALUE)
        );
        panelClassLayout.setVerticalGroup(
            panelClassLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 264, Short.MAX_VALUE)
        );

        jTabbedPane2.addTab("Class", panelClass);

        javax.swing.GroupLayout panelStatsLayout = new javax.swing.GroupLayout(panelStats);
        panelStats.setLayout(panelStatsLayout);
        panelStatsLayout.setHorizontalGroup(
            panelStatsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 324, Short.MAX_VALUE)
        );
        panelStatsLayout.setVerticalGroup(
            panelStatsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 264, Short.MAX_VALUE)
        );

        jTabbedPane2.addTab("Stats", panelStats);

        javax.swing.GroupLayout panelEquipmentLayout = new javax.swing.GroupLayout(panelEquipment);
        panelEquipment.setLayout(panelEquipmentLayout);
        panelEquipmentLayout.setHorizontalGroup(
            panelEquipmentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 324, Short.MAX_VALUE)
        );
        panelEquipmentLayout.setVerticalGroup(
            panelEquipmentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 264, Short.MAX_VALUE)
        );

        jTabbedPane2.addTab("Equipment", panelEquipment);

        menuFile.setText("File");
        menuBar.add(menuFile);

        menuOptions.setText("Options");
        menuBar.add(menuOptions);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 329, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 292, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(Your_hero.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Your_hero.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Your_hero.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Your_hero.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Your_hero().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroupSex;
    private javax.swing.JRadioButton buttonSexFemale;
    private javax.swing.JRadioButton buttonSexMale;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JLabel labeSex;
    private javax.swing.JLabel labelName;
    private javax.swing.JLabel labelStory;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JMenu menuFile;
    private javax.swing.JMenu menuOptions;
    private javax.swing.JPanel panelClass;
    private javax.swing.JPanel panelEquipment;
    private javax.swing.JPanel panelName;
    private javax.swing.JPanel panelRace;
    private javax.swing.JPanel panelStats;
    private javax.swing.JScrollPane scrollStory;
    private javax.swing.JTextField textName;
    private javax.swing.JTextArea textStory;
    // End of variables declaration//GEN-END:variables
}
