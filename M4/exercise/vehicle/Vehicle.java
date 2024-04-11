class Vehicle {
    private String regNo;
    private String make;
    private int yearOfManufacture;
    private double value;

    public Vehicle(String regNo, String make, int yearOfManufacture, double value) {
        this.regNo = regNo;
        // complete this assignment statements here
    }

    // write getter and setter here

    public int calculateAge(int currentYear) {
        // compute age here
    }

    @Override
    public String toString() {
        return "Reg No: " + regNo + ", Make: " + make + ", Year of Manufacture: " + yearOfManufacture + ", Value: Php" + value;
    }
}
