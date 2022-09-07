package Controller;

import Model.CalcModel;
import View.CalcView;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalcController
{

    private CalcView view;

    private CalcModel model;


    public CalcController(CalcView view, CalcModel model)
    {
            this.model = model;
            this.view = view;

            this.view.addCalcactionListener(new CalculateListener());
    }

    class CalculateListener implements ActionListener
    {

        @Override
        public void actionPerformed(ActionEvent e) {

            int firstNum, secoundNum = 0;

            try
            {
                firstNum = view.getFirstNum();
                secoundNum = view.getFirstNum();

                model.addTwoNumbbers(firstNum,secoundNum);

                view.setCalcSolution(model.getCalcTot());
            }
            catch (NumberFormatException exception)
            {
                view.displayErrorMessage("You need to enter 2 Integers");
            }
        }
    }

}
