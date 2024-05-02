package entities;

public class Employee {
		public String name;
		public Double grossSalary;
		public Double tax;
		
		public double netSalary() {
			return grossSalary - tax;
		}
		public void increaseSalary(double percentage) {
			grossSalary += (grossSalary * percentage)/100.00;
		}
		@Override
		public String toString() {
			return name
					+", $ "
					+String.format("%.2f ", netSalary());		
		}

}
