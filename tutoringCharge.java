public class tutoringCharge extends serviceCharge{
    // Instance variables
    private int numOfHours;
    private double hourlyRate;

    // No-argument constructor
    public tutoringCharge() {
        super(); 
        this.numOfHours = 0;
        this.hourlyRate = 0.0;
    }

    // Parameterized constructor
    public tutoringCharge(String serviceName, double basePrice, int numOfHours, double hourlyRate) {
        super(serviceName, basePrice);
        this.numOfHours = numOfHours;
        this.hourlyRate = hourlyRate;
    }

    // Accessor methods
    public int getNumOfHours() {
        return numOfHours;
    }

    public double getHourlyRate() {
        return hourlyRate;
    }

    // Mutator methods
    public void setNumOfHours(int numOfHours) {
        this.numOfHours = numOfHours;
    }

    public void setHourlyRate(double hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

    // toString method
    public String toString() {
        return super.toString() +", TutoringCharge [Number of Hours: " + numOfHours  + ", Hourly Rate: $" + hourlyRate + "]";
    }
}