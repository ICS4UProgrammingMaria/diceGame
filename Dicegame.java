package Dicegame;

import javax.swing.*;
import javax.swing.SpinnerModel;
import javax.swing.SpinnerNumberModel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;


public class Dicegame {
    private JButton btnGuess;
    private JPanel DicePanel;
    private JTextField txtUserNumber;
    private JLabel lblAnswer;


    int UserNumber;
    int answer;

    public static void main(String[] argv) throws Exception {

        JFrame frame = new JFrame("Dicegame");
        frame.setContentPane((new Dicegame().DicePanel));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }


    public Dicegame() {
        btnGuess.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                double UserNumber = Double.parseDouble(String.valueOf(txtUserNumber.getText()));
                Random rn = new Random();
                int answer = rn.nextInt(11)+1;
                String strAnswer = Integer.toString(answer);
                if(UserNumber == answer){
                    lblAnswer.setText("Random number is: " + strAnswer);
                    System.out.println("You got it right"); }
                else {
                    System.out.println("Try again!!");
                    lblAnswer.setText("Random number is: " + strAnswer);

            }
        }
    });
};
}
//if userNumber  = answer