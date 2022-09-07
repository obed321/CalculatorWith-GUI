package Model;

public class CalcModel
{

    private int calcTot;


    public void addTwoNumbbers(int firstNum, int secoundNum)
    {
        calcTot = firstNum + secoundNum;
    }


    public int getCalcTot()
    {
      return calcTot;
    }

}
