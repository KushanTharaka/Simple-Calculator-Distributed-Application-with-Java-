package calculator;
import java.net.*;
import java.io.*;
import javax.swing.JOptionPane;

/**
 *
 * @author Kushan Tharaka
 */
public class Calculator extends javax.swing.JFrame {
    
    static Socket CS;

    public Calculator() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        numOne = new javax.swing.JButton();
        numFour = new javax.swing.JButton();
        numSeven = new javax.swing.JButton();
        numEight = new javax.swing.JButton();
        numTwo = new javax.swing.JButton();
        numFive = new javax.swing.JButton();
        numNine = new javax.swing.JButton();
        btnMulti = new javax.swing.JButton();
        btnAdd = new javax.swing.JButton();
        btnSub = new javax.swing.JButton();
        numThree = new javax.swing.JButton();
        numSix = new javax.swing.JButton();
        numZero = new javax.swing.JButton();
        btnDiv = new javax.swing.JButton();
        btnAns = new javax.swing.JButton();
        btnClr = new javax.swing.JButton();
        tfDisplaySym = new javax.swing.JTextField();
        tfAns = new javax.swing.JTextField();
        tfDisplay1 = new javax.swing.JTextField();
        tfDisplay2 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Calculator");
        setLocation(new java.awt.Point(500, 250));
        setResizable(false);
        setType(java.awt.Window.Type.UTILITY);

        numOne.setText("1");
        numOne.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numOneActionPerformed(evt);
            }
        });

        numFour.setText("4");
        numFour.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numFourActionPerformed(evt);
            }
        });

        numSeven.setText("7");
        numSeven.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numSevenActionPerformed(evt);
            }
        });

        numEight.setText("8");
        numEight.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numEightActionPerformed(evt);
            }
        });

        numTwo.setText("2");
        numTwo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numTwoActionPerformed(evt);
            }
        });

        numFive.setText("5");
        numFive.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numFiveActionPerformed(evt);
            }
        });

        numNine.setText("9");
        numNine.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numNineActionPerformed(evt);
            }
        });

        btnMulti.setText("*");
        btnMulti.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMultiActionPerformed(evt);
            }
        });

        btnAdd.setText("+");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        btnSub.setText("-");
        btnSub.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubActionPerformed(evt);
            }
        });

        numThree.setText("3");
        numThree.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numThreeActionPerformed(evt);
            }
        });

        numSix.setText("6");
        numSix.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numSixActionPerformed(evt);
            }
        });

        numZero.setText("0");
        numZero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numZeroActionPerformed(evt);
            }
        });

        btnDiv.setText("/");
        btnDiv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDivActionPerformed(evt);
            }
        });

        btnAns.setText("=");
        btnAns.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAnsActionPerformed(evt);
            }
        });

        btnClr.setText("CLR");
        btnClr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClrActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(tfAns, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(numOne)
                            .addComponent(numFour)
                            .addComponent(numSeven)
                            .addComponent(btnClr))
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(numTwo)
                                    .addComponent(numFive)
                                    .addComponent(numEight))
                                .addGap(37, 37, 37)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(numThree)
                                    .addComponent(numSix)
                                    .addComponent(numNine))
                                .addGap(40, 40, 40)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btnAdd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnMulti, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnSub, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(numZero)
                                .addGap(37, 37, 37)
                                .addComponent(btnAns)
                                .addGap(38, 38, 38)
                                .addComponent(btnDiv, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(tfDisplay1, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(tfDisplaySym, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(tfDisplay2, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(19, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfDisplay1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfDisplaySym, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfDisplay2, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(tfAns, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(numOne)
                            .addGap(33, 33, 33)
                            .addComponent(numFour)
                            .addGap(30, 30, 30)
                            .addComponent(numSeven))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(numTwo)
                            .addGap(33, 33, 33)
                            .addComponent(numFive)
                            .addGap(30, 30, 30)
                            .addComponent(numEight)))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(numThree)
                            .addGap(33, 33, 33)
                            .addComponent(numSix)
                            .addGap(30, 30, 30)
                            .addComponent(numNine))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(btnAdd)
                            .addGap(33, 33, 33)
                            .addComponent(btnSub)
                            .addGap(30, 30, 30)
                            .addComponent(btnMulti))))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(numZero)
                        .addComponent(btnClr))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnDiv)
                        .addComponent(btnAns)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void numOneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numOneActionPerformed
        if(tfDisplaySym.getText().equals(""))
        {
            tfDisplay1.setText(tfDisplay1.getText() + "1");
        }
        else
        {
            tfDisplay2.setText(tfDisplay2.getText() + "1");
        }
    }//GEN-LAST:event_numOneActionPerformed

    private void numTwoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numTwoActionPerformed
        if(tfDisplaySym.getText().equals(""))
        {
            tfDisplay1.setText(tfDisplay1.getText() + "2");
        }
        else
        {
            tfDisplay2.setText(tfDisplay2.getText() + "2");
        }
    }//GEN-LAST:event_numTwoActionPerformed

    private void numThreeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numThreeActionPerformed
        if(tfDisplaySym.getText().equals(""))
        {
            tfDisplay1.setText(tfDisplay1.getText() + "3");
        }
        else
        {
            tfDisplay2.setText(tfDisplay2.getText() + "3");
        }
    }//GEN-LAST:event_numThreeActionPerformed

    private void numFourActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numFourActionPerformed
        if(tfDisplaySym.getText().equals(""))
        {
            tfDisplay1.setText(tfDisplay1.getText() + "4");
        }
        else
        {
            tfDisplay2.setText(tfDisplay2.getText() + "4");
        }
    }//GEN-LAST:event_numFourActionPerformed

    private void numFiveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numFiveActionPerformed
        if(tfDisplaySym.getText().equals(""))
        {
            tfDisplay1.setText(tfDisplay1.getText() + "5");
        }
        else
        {
            tfDisplay2.setText(tfDisplay2.getText() + "5");
        }
    }//GEN-LAST:event_numFiveActionPerformed

    private void numSixActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numSixActionPerformed
        if(tfDisplaySym.getText().equals(""))
        {
            tfDisplay1.setText(tfDisplay1.getText() + "6");
        }
        else
        {
            tfDisplay2.setText(tfDisplay2.getText() + "6");
        }
    }//GEN-LAST:event_numSixActionPerformed

    private void numSevenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numSevenActionPerformed
       if(tfDisplaySym.getText().equals(""))
        {
            tfDisplay1.setText(tfDisplay1.getText() + "7");
        }
        else
        {
            tfDisplay2.setText(tfDisplay2.getText() + "7");
        }
    }//GEN-LAST:event_numSevenActionPerformed

    private void numEightActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numEightActionPerformed
        if(tfDisplaySym.getText().equals(""))
        {
            tfDisplay1.setText(tfDisplay1.getText() + "8");
        }
        else
        {
            tfDisplay2.setText(tfDisplay2.getText() + "8");
        }
    }//GEN-LAST:event_numEightActionPerformed

    private void numNineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numNineActionPerformed
        if(tfDisplaySym.getText().equals(""))
        {
            tfDisplay1.setText(tfDisplay1.getText() + "9");
        }
        else
        {
            tfDisplay2.setText(tfDisplay2.getText() + "9");
        }
    }//GEN-LAST:event_numNineActionPerformed

    private void numZeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numZeroActionPerformed
        if(tfDisplaySym.getText().equals(""))
        {
            tfDisplay1.setText(tfDisplay1.getText() + "0");
        }
        else
        {
            tfDisplay2.setText(tfDisplay2.getText() + "0");
        }
    }//GEN-LAST:event_numZeroActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        tfDisplaySym.setText("+");
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnSubActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubActionPerformed
        tfDisplaySym.setText("-");
    }//GEN-LAST:event_btnSubActionPerformed

    private void btnMultiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMultiActionPerformed
        tfDisplaySym.setText("*");
    }//GEN-LAST:event_btnMultiActionPerformed

    private void btnDivActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDivActionPerformed
        tfDisplaySym.setText("/");
    }//GEN-LAST:event_btnDivActionPerformed

    private void btnAnsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAnsActionPerformed
        String type = tfDisplaySym.getText();
        String a = tfDisplay1.getText();
        String b = tfDisplay2.getText();
        
        try {
            
            PrintWriter pr = new PrintWriter(CS.getOutputStream());
            pr.println(type);
            pr.println(a);
            pr.println(b);
            pr.flush();
            
            InputStreamReader ObjIn = new InputStreamReader(CS.getInputStream());
            BufferedReader ObjBuffer = new BufferedReader(ObjIn);
            String message = ObjBuffer.readLine();
            System.out.println("Server ::"+message);
            tfAns.setText(message);
        
        }
        catch (Exception e) {
        
            JOptionPane.showMessageDialog(null, e.toString());
            
        }
    }//GEN-LAST:event_btnAnsActionPerformed

    private void btnClrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClrActionPerformed
        tfDisplaySym.setText("");
        tfDisplay1.setText("");
        tfDisplay2.setText("");
    }//GEN-LAST:event_btnClrActionPerformed


    public static void main(String args[]) throws Exception{
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Calculator().setVisible(true);
            }
        });
        
        CS = new Socket("localhost", 6778);
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnAns;
    private javax.swing.JButton btnClr;
    private javax.swing.JButton btnDiv;
    private javax.swing.JButton btnMulti;
    private javax.swing.JButton btnSub;
    private javax.swing.JButton numEight;
    private javax.swing.JButton numFive;
    private javax.swing.JButton numFour;
    private javax.swing.JButton numNine;
    private javax.swing.JButton numOne;
    private javax.swing.JButton numSeven;
    private javax.swing.JButton numSix;
    private javax.swing.JButton numThree;
    private javax.swing.JButton numTwo;
    private javax.swing.JButton numZero;
    private javax.swing.JTextField tfAns;
    private javax.swing.JTextField tfDisplay1;
    private javax.swing.JTextField tfDisplay2;
    private javax.swing.JTextField tfDisplaySym;
    // End of variables declaration//GEN-END:variables
}
