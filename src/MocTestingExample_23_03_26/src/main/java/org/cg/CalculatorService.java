package org.cg;

public class CalculatorService {

    private ICalculator cal;

    public CalculatorService(ICalculator cal) {
        this.cal = cal;
    }

    public int addService(int x,int y){
        return cal.calculat(x,y);
    }

}
