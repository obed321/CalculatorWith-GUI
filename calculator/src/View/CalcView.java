package View;

import javax.swing.*;
import java.awt.event.ActionListener;

public class CalcView extends JFrame
{

    private JTextField firstNum = new JTextField(10);
    private JLabel additionLabel = new JLabel("+");
    private JTextField secoundNum = new JTextField(10);
    private JButton calculateBtn = new JButton("Calculate");
    private JTextField calcSolution = new JTextField(10);



     public CalcView() {

        JPanel calcPanel = new JPanel();

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(600,200);

        calcPanel.add(firstNum);
         calcPanel.add(additionLabel);
        calcPanel.add(secoundNum);
        calcPanel.add(calculateBtn);
        calcPanel.add(calcSolution);

        this.add(calcPanel);
    }


   public int getFirstNum()
   {
       return Integer.parseInt(firstNum.getText());
   }

    public int getSecoundNum()
    {
        return Integer.parseInt(secoundNum.getText());
    }


    public int getcalcSolution()
    {
        return Integer.parseInt(calcSolution.getText());
    }

    public void setCalcSolution(int solution)
    {
        calcSolution.setText(Integer.toString(solution));
    }


   public void addCalcactionListener(ActionListener listenForCalcBtn)
    {
        calculateBtn.addActionListener(listenForCalcBtn);
    }

    public void displayErrorMessage(String errorMessage)
    {
        JOptionPane.showMessageDialog(this, errorMessage);
    }

}
