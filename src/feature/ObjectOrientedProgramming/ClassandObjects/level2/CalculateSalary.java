class CalculateSalary {
    int id;
    String name;
    double basicSalary;

    double calculateSalary() {
        double hra = 0.2 * basicSalary;
        double da = 0.1 * basicSalary;
        return basicSalary + hra + da;
    }

    public static void main(String[] args) {
        CalculateSalary e = new CalculateSalary();
        e.id = 201;
        e.name = "Komal";
        e.basicSalary = 30000;

        System.out.println("Total Salary: " + e.calculateSalary());
    }
}
