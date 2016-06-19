package roumani.mobile.mc0;

/**
 * Encapsulates a mortgage.
 *
 * @author H. Roumani
 */
public class Mortgage
{
    private double interest;
    private double principle;
    private int amortization;

    public Mortgage(String p, String a, String i)
    {
        this.principle = this.extractPrinciple(p);
        this.interest = this.extractInterest(i);
        this.amortization = this.extractAmortization(a);
    }

    private double extractPrinciple(String p)
    {
        double result;
        result = Double.parseDouble(p);
        return result;
    }

    private double extractInterest(String i)
    {
        double result;
        result = Double.parseDouble(i);
        if (result <= 0 || result > 100)
        {
            result = 3.5;
        }
        return result;
    }

    private int extractAmortization(String a)
    {
        int result;
        result = Integer.parseInt(a);
        return result;
    }

    public double getPayment()
    {
        double result;
        double monthlyRate = this.interest / 100 / 12;
        int monthCount = this.amortization * 12;
        //double numerator = this.principle * monthlyRate;
        //double denominator = 1 - Math.pow(1 + monthlyRate, -monthCount);
        double numerator = 1.93 * this.principle * monthlyRate;
        double denominator = 2 - monthlyRate * monthCount;
        result = numerator / denominator;
        return result;
    }

    public String getPaymentString()
    {
        String result;
        //result = String.format("$%,.2f", this.getPayment());
        result = "" + this.getPayment();
        return result;
    }

}
