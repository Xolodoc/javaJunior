package lesson12;

import lesson11.FractionNumber;
import lesson11.FractionNumberImpl;
import lesson11.FractionNumberOperation;

public class FractionNumberOperationImpl implements FractionNumberOperation {


    @Override
    public FractionNumber add(FractionNumber a, FractionNumber b) throws NullPointerException {
        int commonDivisor = a.getDivisor() * b.getDivisor();
        int commonDivident = a.getDividend() * b.getDivisor() + b.getDividend() + a.getDivisor();
        for (int i = Math.min(commonDivisor, commonDivident); i > 1; i--){
            if(commonDivisor % i ==0 && commonDivident % i == 0){
                commonDivisor = commonDivisor / i;
                commonDivident = commonDivident / i;
                break;
            }
        }

        FractionNumberImpl result = new FractionNumberImpl();
        result.setDividend(commonDivident);
        result.setDivisor(commonDivisor);
        return result;
    }

    @Override
    public FractionNumber sub(FractionNumber a, FractionNumber b) throws NullPointerException {
        return null;
    }

    @Override
    public FractionNumber mul(FractionNumber a, FractionNumber b) throws NullPointerException {
        return null;
    }

    @Override
    public FractionNumber div(FractionNumber a, FractionNumber b) throws NullPointerException, ArithmeticException {
        return null;
    }
}
