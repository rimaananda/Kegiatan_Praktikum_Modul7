package Studikasus;

import java.util.ArrayList;
import javax.swing.DefaultListModel;

public class BookServices extends javax.swing.JFrame {

    String menu = "";
    ArrayList<String> bookName = new ArrayList<>();
    ArrayList<String> authorName = new ArrayList<>();

    private void changeAllVisible(boolean value) {
        fieldBookName.setVisible(value);
        fieldAuthorName.setVisible(value);
        fieldId.setVisible(false);

        btnSet.setVisible(value);
    }

    private void changeAllVisibleUpdate(boolean value) {
        fieldBookName.setVisible(value);
        fieldAuthorName.setVisible(value);
        fieldId.setVisible(value);

        btnSet.setVisible(value);
    }

    private void changeBookNameVisible(boolean value) {
        changeAllVisible(false);
        fieldBookName.setVisible(value);
        btnSet.setVisible(value);
    }

    void addBook() {
        bookName.add(fieldBookName.getText());
        authorName.add(fieldAuthorName.getText());
    }

    void findListBook() {
        DefaultListModel<String> model = new DefaultListModel<>();

        for (int i = 0; i < bookName.size(); i++) {
            String output = "";
            output += (i + 1) + ". ";
            output += "Nama Buku: " + bookName.get(i) + ", ";
            output += "Nama Author : " + authorName.get(i);
            model.addElement(output);
        }

        jList1.setModel(model);
    }

    void findBookListById(int i) {
        DefaultListModel<String> model = new DefaultListModel<>();
        String output = "";
        output += (i) + ". ";
        output += "Nama Buku: " + bookName.get(i-1) + ", ";
        output += "Nama Author : " + authorName.get(i-1);
        model.addElement(output);

        jList1.setModel(model);
    }

    void deleteBook(int i) {
        bookName.remove(i - 1);
        authorName.remove(i - 1);
    }

    void changeMenu(String menu) {
        this.menu = menu;
    }

    void updateBook() {
        int id = Integer.parseInt(fieldId.getText()) - 1;
        
        bookName.set(id, fieldBookName.getText());
        authorName.set(id, fieldAuthorName.getText());
    }

    /**
     * Creates new form BookServices
     */
    public BookServices() {
        initComponents();
        changeAllVisible(false);
        jList1.setVisible(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        updateButton = new javax.swing.JButton();
        findBookByIdButton = new javax.swing.JButton();
        deleteBookButton = new javax.swing.JButton();
        findBookListButton = new javax.swing.JButton();
        fieldBookName = new javax.swing.JTextField();
        fieldAuthorName = new javax.swing.JTextField();
        fieldId = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        btnSet = new javax.swing.JButton();
        addBookButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        updateButton.setText("Update Book");
        updateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateButtonActionPerformed(evt);
            }
        });

        findBookByIdButton.setText("Find Book By Id");
        findBookByIdButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                findBookByIdButtonActionPerformed(evt);
            }
        });

        deleteBookButton.setText("Delete Book");
        deleteBookButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteBookButtonActionPerformed(evt);
            }
        });

        findBookListButton.setText("Find Book List");
        findBookListButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                findBookListButtonActionPerformed(evt);
            }
        });

        fieldBookName.setText("Book Name");
        fieldBookName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fieldBookNameActionPerformed(evt);
            }
        });

        fieldAuthorName.setText("Author Name");
        fieldAuthorName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fieldAuthorNameActionPerformed(evt);
            }
        });

        fieldId.setText("Book Id");
        fieldId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fieldIdActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("PERPUSTAKAAN USMAN BIN AFFAN");

        jScrollPane1.setViewportView(jList1);

        btnSet.setText("Set");
        btnSet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSetActionPerformed(evt);
            }
        });

        addBookButton.setText("Add Book");
        addBookButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addBookButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(findBookByIdButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(updateButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(addBookButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(deleteBookButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(findBookListButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(37, 37, 37)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(fieldBookName, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(fieldId, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(fieldAuthorName, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnSet, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 89, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(addBookButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(updateButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(findBookByIdButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(deleteBookButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(findBookListButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(fieldBookName, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(fieldId, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(fieldAuthorName, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(btnSet)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void updateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateButtonActionPerformed
        changeAllVisible(false);
        changeAllVisibleUpdate(true);
        changeMenu("update");
    }//GEN-LAST:event_updateButtonActionPerformed

    private void findBookByIdButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_findBookByIdButtonActionPerformed
        fieldBookName.setText("BOOK ID");
        changeBookNameVisible(true);
        changeMenu("findById");
        findListBook();
    }//GEN-LAST:event_findBookByIdButtonActionPerformed

    private void deleteBookButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteBookButtonActionPerformed
        fieldBookName.setText("BOOK ID");
        changeAllVisible(false);
        changeBookNameVisible(true);
        changeMenu("delete");

    }//GEN-LAST:event_deleteBookButtonActionPerformed

    private void findBookListButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_findBookListButtonActionPerformed
        findListBook();
        changeAllVisible(false);
        jList1.setVisible(true);
    }//GEN-LAST:event_findBookListButtonActionPerformed

    private void fieldBookNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fieldBookNameActionPerformed

    }//GEN-LAST:event_fieldBookNameActionPerformed

    private void fieldAuthorNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fieldAuthorNameActionPerformed
        
    }//GEN-LAST:event_fieldAuthorNameActionPerformed

    private void fieldIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fieldIdActionPerformed
        
    }//GEN-LAST:event_fieldIdActionPerformed

    private void btnSetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSetActionPerformed
        switch (menu) {
            case "add":
                addBook();
                break;
            case "delete":
                deleteBook(Integer.parseInt(fieldBookName.getText()));
                break;
            case "update":
                updateBook();
                break;
            case "findById":
                findBookListById(Integer.parseInt(fieldBookName.getText()));
                break;
        }
    }//GEN-LAST:event_btnSetActionPerformed

    private void addBookButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addBookButtonActionPerformed
        fieldBookName.setText("Book Name");
        changeBookNameVisible(false);
        changeAllVisible(true);
        changeMenu("add");
    }//GEN-LAST:event_addBookButtonActionPerformed

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
            java.util.logging.Logger.getLogger(BookServices.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BookServices.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BookServices.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BookServices.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BookServices().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addBookButton;
    private javax.swing.JButton btnSet;
    private javax.swing.JButton deleteBookButton;
    private javax.swing.JTextField fieldAuthorName;
    private javax.swing.JTextField fieldBookName;
    private javax.swing.JTextField fieldId;
    private javax.swing.JButton findBookByIdButton;
    private javax.swing.JButton findBookListButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JList<String> jList1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton updateButton;
    // End of variables declaration//GEN-END:variables
}
