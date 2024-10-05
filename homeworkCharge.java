public class homeworkCharge extends serviceCharge{
      // Instance variables 
    private int numOfAssignments;
    private double fee;

    // No-argument constructor
    public homeworkCharge() {
        super(); 
        this.numOfAssignments = 0;
        this.fee = 0.0;
    }

    // Parameterized constructor
    public homeworkCharge(String serviceName, double basePrice, int numOfAssignments, double fee) {
        super(serviceName, basePrice); 
        this.numOfAssignments = numOfAssignments;
        this.fee = fee;
    }

    // Accessor methods
    public int getnumOfAssignments() {
        return numOfAssignments;
    }

    public double getfee() {
        return fee;
    }

    // Mutator methods
    public void setnumOfAssignments(int numOfAssignments) {
        this.numOfAssignments = numOfAssignments;
    }

    public void setfee(double fee) {
        this.fee = fee;
    }

    // toString method
    public String toString() {
        return super.toString() + ", HomeworkCharge [Number of Assignments: " + numOfAssignments + ", Per Assignment Fee: $" + fee + "]";
    }
}