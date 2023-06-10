package Telas;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import com.google.gson.JsonObject;
import javax.swing.JOptionPane;
import com.google.api.core.ApiFuture;
import com.google.auth.oauth2.GoogleCredentials;
import com.google.cloud.firestore.DocumentReference;
import com.google.cloud.firestore.Firestore;
import com.google.cloud.firestore.WriteResult;
import com.google.firebase.FirebaseApp;
import com.google.firebase.FirebaseOptions;
import com.google.firebase.cloud.FirestoreClient;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.DatabaseReference.CompletionListener;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.UUID;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.concurrent.CountDownLatch;
import com.google.gson.Gson;
import com.google.gson.JsonArray;
import java.awt.event.ActionEvent;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import javax.swing.JComboBox;
import com.google.gson.JsonElement;
import java.util.Set;
public class QuestionInsert extends javax.swing.JFrame {

    public QuestionInsert() {
        initComponents();
        ref = FirebaseDatabase.getInstance().getReference(Tema);
        updateComboBox();
        txtTema.setText(Tema);
    }

    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtQuestion = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnInserir = new javax.swing.JButton();
        txtAwnser1 = new javax.swing.JTextArea();
        txtAwnser2 = new javax.swing.JTextArea();
        txtAwnser3 = new javax.swing.JTextArea();
        txtAwnser4 = new javax.swing.JTextArea();
        checkBox1 = new javax.swing.JCheckBox();
        checkBox2 = new javax.swing.JCheckBox();
        checkBox3 = new javax.swing.JCheckBox();
        checkBox4 = new javax.swing.JCheckBox();
        txtTema = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        ComboTeste = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        btnAtualizarTema = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 204, 102));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setForeground(new java.awt.Color(255, 102, 0));

        jLabel1.setText("Questao");

        jLabel2.setText("Respostas");

        btnInserir.setLabel("Inserir");
        btnInserir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInserirActionPerformed(evt);
            }
        });

        txtAwnser1.setColumns(20);
        txtAwnser1.setRows(5);

        txtAwnser2.setColumns(20);
        txtAwnser2.setRows(5);

        txtAwnser3.setColumns(20);
        txtAwnser3.setRows(5);

        txtAwnser4.setColumns(20);
        txtAwnser4.setRows(5);

        txtTema.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                txtTemaInputMethodTextChanged(evt);
            }
        });

        jLabel3.setText("Tema");

        ComboTeste.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        ComboTeste.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                ComboTesteItemStateChanged(evt);
            }
        });

        jButton1.setLabel("ATUALIZAR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        btnAtualizarTema.setText("Atualizar Tema");
        btnAtualizarTema.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtualizarTemaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(ComboTeste, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtTema, javax.swing.GroupLayout.DEFAULT_SIZE, 349, Short.MAX_VALUE))
                                .addGap(34, 34, 34))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(107, 107, 107)
                                        .addComponent(jButton1))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(113, 113, 113)
                                        .addComponent(btnAtualizarTema)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(109, 109, 109)
                                .addComponent(jLabel2))
                            .addComponent(txtQuestion, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(110, 110, 110)
                                .addComponent(jLabel1))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(checkBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtAwnser1, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(checkBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(checkBox3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(checkBox4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtAwnser2, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtAwnser3, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtAwnser4, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(65, 65, 65)
                                .addComponent(btnInserir, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(jLabel1)
                .addGap(2, 2, 2)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtQuestion, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtTema, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2))
                    .addComponent(btnAtualizarTema))
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(checkBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtAwnser1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(checkBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(19, 19, 19)
                                .addComponent(ComboTeste, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(checkBox3, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtAwnser3, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(checkBox4, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(40, 40, 40)
                                        .addComponent(btnInserir, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(txtAwnser4, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addComponent(txtAwnser2, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(69, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
/*    private void btnInserirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInserirActionPerformed
                    
    }//GEN-LAST:event_btnInserirActionPerformed
    private void ComboTesteItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_ComboTesteItemStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_ComboTesteItemStateChanged

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txtTemaInputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_txtTemaInputMethodTextChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTemaInputMethodTextChanged

    private void btnAtualizarTemaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtualizarTemaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAtualizarTemaActionPerformed
*/
    
    private void btnInserirActionPerformed(java.awt.event.ActionEvent evt) {
DatabaseReference gamesRef = FirebaseDatabase.getInstance().getReference(Tema);
gamesRef.addListenerForSingleValueEvent(new ValueEventListener() {
    @Override
    public void onDataChange(DataSnapshot dataSnapshot) {
        long questionCount = dataSnapshot.getChildrenCount();
        DatabaseReference newQuestionRef = gamesRef.child(String.valueOf(questionCount));
        
        if(!ComboTeste.getSelectedItem().toString().equals("Nova"))
        {
            newQuestionRef = gamesRef.child(String.valueOf(ComboTeste.getSelectedIndex()));
        }
        if(txtQuestion.getText().equals("") || txtAwnser1.getText().equals("") || txtAwnser2.getText().equals("") || txtAwnser3.getText().equals("") || txtAwnser4.getText().equals(""))
        {
            JOptionPane.showMessageDialog(null, "Existem campos vazios");
            return;
        }
        Map<String, Object> questionData = new HashMap<>();
        if (checkBox1.isSelected() || checkBox2.isSelected() || checkBox3.isSelected() || checkBox4.isSelected()) {
            
            if (checkBox1.isSelected()) {
                questionData.put("CorrectAwnser", txtAwnser1.getText());
            } else if (checkBox2.isSelected()) {
                questionData.put("CorrectAwnser", txtAwnser2.getText());
            } else if (checkBox3.isSelected()) {
                questionData.put("CorrectAwnser", txtAwnser3.getText());
            } else if (checkBox4.isSelected()) {
                questionData.put("CorrectAwnser", txtAwnser4.getText());
            }

            questionData.put("Question", txtQuestion.getText());

            Map<String, String> awnsers = new HashMap<>();
            awnsers.put("0", txtAwnser1.getText());
            awnsers.put("1", txtAwnser2.getText());
            awnsers.put("2", txtAwnser3.getText());
            awnsers.put("3", txtAwnser4.getText());
            questionData.put("Awnsers", awnsers);
            
            newQuestionRef.setValue(questionData, new DatabaseReference.CompletionListener() {
                @Override
                public void onComplete(DatabaseError error, DatabaseReference ref) {
                    if (error != null) {
                        System.out.println("Failed to set child value: " + error.getMessage());
                    } else {
                        System.out.println("Child value set successfully");
                    }
                }
            });
            updateComboBox();
            txtQuestion.setText("");
            txtAwnser1.setText("");
            txtAwnser3.setText("");
            txtAwnser4.setText("");
            txtAwnser2.setText("");
            checkBox1.setSelected(false);
            checkBox2.setSelected(false);
            checkBox3.setSelected(false);
            checkBox4.setSelected(false);
            GetQuestion();
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Falta a seleção da resposta correta");
        }
    }

    @Override
    public void onCancelled(DatabaseError error) {
        JOptionPane.showMessageDialog(null, "Falha ao inserir a questão");
    }
});
}
    Gson gson = new Gson();
      public List<JsonObject> questions = new ArrayList<>();
      static String Tema = "Games";
static DatabaseReference ref;
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
            java.util.logging.Logger.getLogger(QuestionInsert.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(QuestionInsert.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(QuestionInsert.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(QuestionInsert.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new QuestionInsert().setVisible(true);
            }
        });
        
        Connection connection = new Connection();
        connection.Conectar();   
    }
    
    public void updateComboBox() {
       ref.addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(DataSnapshot dataSnapshot) {
            ComboTeste.removeAllItems();
            questions.clear();
            for (DataSnapshot childSnapshot : dataSnapshot.getChildren()) {
                String question = childSnapshot.child("Question").getValue(String.class);
                JsonObject jsonObject = new JsonObject();
                jsonObject.addProperty("Question", childSnapshot.child("Question").getValue(String.class));
                jsonObject.addProperty("CorrectAwnser", childSnapshot.child("CorrectAwnser").getValue(String.class));

                JsonObject jsonAwnsers = new JsonObject();
                JsonArray awnsersArray = new JsonArray();

                // Iterar sobre os filhos de "Awnsers" para adicionar cada resposta ao array
                for (DataSnapshot awnserSnapshot : childSnapshot.child("Awnsers").getChildren()) {
                    String awnser = awnserSnapshot.getValue(String.class);
                    awnsersArray.add(awnser);
                }

                jsonAwnsers.add("Awnsers", awnsersArray);
                jsonObject.add("Awnsers", jsonAwnsers);
                questions.add(jsonObject);
                ComboTeste.addItem(question);
            }
            ComboTeste.addItem("Nova");
            GetQuestion();
        }
        
        @Override
        public void onCancelled(DatabaseError error) {
            System.out.println("Failed to read value: " + error.getMessage());
        }
    });
}
    private void ComboTesteItemStateChanged(java.awt.event.ItemEvent evt) {
        
    } 
    
  private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {  
      GetQuestion();
    } 
  
  void GetQuestion()
  {
      if(!ComboTeste.getSelectedItem().toString().equals("Nova"))
      {
       JsonObject firstQuestion = questions.get(ComboTeste.getSelectedIndex());
        String question = firstQuestion.get("Question").getAsString();
        txtQuestion.setText(question);
        JsonObject awnsersObject = questions.get(ComboTeste.getSelectedIndex()).getAsJsonObject("Awnsers");
        JsonArray awnsersArray = awnsersObject.getAsJsonArray("Awnsers");
        checkBox1.setSelected(false);
        checkBox2.setSelected(false);
        checkBox3.setSelected(false);
        checkBox4.setSelected(false);
        for (int i = 0; i < awnsersArray.size(); i++) {
            switch(i)
            {
                case 0:
                {
                    JsonElement element = awnsersArray.get(i);
                    String answerValue = element.getAsString();
                    txtAwnser1.setText(answerValue);
                    System.out.println(answerValue);
                    if(firstQuestion.get("CorrectAwnser").getAsString().equals(answerValue))
                    {
                        checkBox1.setSelected(true);
                    }
                    break;
                }
                case 1:
                {
                    JsonElement element = awnsersArray.get(i);
                    String answerValue = element.getAsString();
                    txtAwnser2.setText(answerValue);
                    System.out.println(answerValue);
                    if(firstQuestion.get("CorrectAwnser").getAsString().equals(answerValue))
                    {
                        checkBox2.setSelected(true);
                    }
                    break;
                }
                case 2:
                {
                    JsonElement element = awnsersArray.get(i);
                    String answerValue = element.getAsString();
                    txtAwnser3.setText(answerValue);
                    System.out.println(answerValue);
                    if(firstQuestion.get("CorrectAwnser").getAsString().equals(answerValue))
                    {
                        checkBox3.setSelected(true);
                    }
                    break;
                }
                case 3:
                {
                    JsonElement element = awnsersArray.get(i);
                    String answerValue = element.getAsString();
                    txtAwnser4.setText(answerValue);
                    System.out.println(answerValue);
                    if(firstQuestion.get("CorrectAwnser").getAsString().equals(answerValue))
                    {
                        checkBox4.setSelected(true);
                    }
                    break;
                }
            }
        }
        }
      else
      {
          txtQuestion.setText("");
          txtAwnser1.setText("");
          txtAwnser3.setText("");
          txtAwnser4.setText("");
          txtAwnser2.setText("");
          checkBox1.setSelected(false);
          checkBox2.setSelected(false);
          checkBox3.setSelected(false);
          checkBox4.setSelected(false);
      }
  }
  
  private void btnAtualizarTemaActionPerformed(java.awt.event.ActionEvent evt) {                                         
        Tema = txtTema.getText();
        ref = FirebaseDatabase.getInstance().getReference(Tema);
        updateComboBox();
    } 
  
  private void txtTemaInputMethodTextChanged(java.awt.event.InputMethodEvent evt) {     
    }  

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> ComboTeste;
    private javax.swing.JButton btnAtualizarTema;
    private javax.swing.JButton btnInserir;
    private javax.swing.JCheckBox checkBox1;
    private javax.swing.JCheckBox checkBox2;
    private javax.swing.JCheckBox checkBox3;
    private javax.swing.JCheckBox checkBox4;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextArea txtAwnser1;
    private javax.swing.JTextArea txtAwnser2;
    private javax.swing.JTextArea txtAwnser3;
    private javax.swing.JTextArea txtAwnser4;
    private javax.swing.JTextField txtQuestion;
    private javax.swing.JTextField txtTema;
    // End of variables declaration//GEN-END:variables
}
