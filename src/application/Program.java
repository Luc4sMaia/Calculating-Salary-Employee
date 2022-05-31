package application;

import java.util.Scanner;

import entities.Employee;
import entities.OutsourcedEmployee;

public class Program {

	public static void main(String[] args) {

		Employee employee = new OutsourcedEmployee();

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the number of employees: ");
		int loopFor = sc.nextInt();

		for (int auxiliarLoop = 0; auxiliarLoop < loopFor; auxiliarLoop++) {
			System.out.println("Employee #" + (auxiliarLoop + 1) + " data:");
			System.out.print("Outsourced (y/n)? ");
			char choose = sc.next().charAt(0);

			if (choose == 'y' || choose == 'Y') {
				System.out.print("Name: ");
				sc.nextLine();
				String name = sc.nextLine();

				System.out.print("Hours: ");
				Integer hours = sc.nextInt();

				System.out.print("Value per hour: ");
				Double valuePerHour = sc.nextDouble();

				System.out.print("Additional charge: ");
				Double additionalCharge = sc.nextDouble();

				Employee employeeOutSourced = new OutsourcedEmployee(name, hours, valuePerHour, additionalCharge);

				employee.addEmployee(employeeOutSourced);
			}

			else if (choose == 'n' || choose == 'N') {
				System.out.print("Name: ");
				sc.nextLine();
				String name = sc.nextLine();

				System.out.print("Hours: ");
				Integer hours = sc.nextInt();

				System.out.print("Value per hour: ");
				Double valuePerHour = sc.nextDouble();

				Employee trueEmployee = new Employee(name, hours, valuePerHour);
				employee.addEmployee(trueEmployee);
			}
			
			else {
				System.out.println("This number does not exist");
				System.exit(0);
			}

		}

		System.out.println("PAYMENTS:");
		System.out.println(employee.getListEmployee());

		sc.close();
	}

}
