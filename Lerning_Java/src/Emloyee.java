public class Emloyee {
    public String name;
    public double currentSalary;
    private double newSalary;
   
        // initialize value of name and currentSalary
        Emloyee(String name , double currentSalary) {
            this.name = name;
            this.currentSalary = currentSalary;
        }
     
        // compute new salary
        public void setSalary(double percentage) {
            this.newSalary = this.currentSalary + (percentage/100);
            
        }
     
        // return the new salary
        public double getSalary() {
            return this.newSalary;
        }

}
