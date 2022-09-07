package Controller;

import Model.CalcModel;
import View.CalcView;

public class MainProgram
{

    public static void main(String[] args) {

        CalcModel model = new CalcModel();
        CalcView view = new CalcView();
        CalcController controller = new CalcController(view, model);

        view.setVisible(true);
    }

}
