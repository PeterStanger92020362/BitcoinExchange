public class Customer implements Comparable{

    private String customerName;
    private int initialInvestment;
    private int currentInvestmentValue;
    private int netInvestmentGain;

    @Override
    public int compareTo(Object o) {
        Customer e = (Customer) o;
        return this.getNetInvestmentGain() - e.getNetInvestmentGain(); // sorted by netInvestmentGain
        //return getCurrentInvestmentValue().compareTo(e.getCurrentInvestmentValue());  //sorted by currentInvestementValue

    }

    public Customer(String newName, int newInitial, int newCurrent){
        customerName = newName;
        initialInvestment = newInitial;
        currentInvestmentValue = newCurrent;
        netInvestmentGain = currentInvestmentValue - initialInvestment;
    }

    public String getCustomerName() {
        return customerName;
    }

    public int getInitialInvestment() {
        return initialInvestment;
    }

    public int getCurrentInvestmentValue() {
        return currentInvestmentValue;
    }

    public int getNetInvestmentGain() {
        return netInvestmentGain;
    }
}