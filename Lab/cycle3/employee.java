import java.util.*;

class employee {
    int age;
    long ph;
    String name, address;
    double salary;

    void printSalary() {
        System.out.println("Salary: " + salary);
    }
}

class officer extends employee {
    String specialization;
}

class manager extends employee {
    String dept;
}

class print {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        officer o1 = new officer();
        manager m1 = new manager();

        System.out.println("Enter the Officer's details");
        System.out.println("Enter The Name: ");
        o1.name = s.nextLine();
        System.out.println("Enter the Age: ");
        o1.age = s.nextInt();
        System.out.println("Enter the phone number: ");
        o1.ph = s.nextLong();
        System.out.println("Enter the Address: ");
        o1.address = s.nextLine();
        System.out.println("Enter the Salary: ");
        o1.salary = s.nextDouble();
        System.out.println("Enter the Specialization: ");
        o1.specialization = s.nextLine();
        
        System.out.println("Enter the Manager's details");
        System.out.println("Enter The Name:");
        m1.name = s.nextLine();
        System.out.println("Enter the Age:");
        m1.age = s.nextInt();
        System.out.println("Enter the phone number:");
        m1.ph = s.nextLong();
        System.out.println("Enter the Address:");
        m1.address = s.nextLine();
        System.out.println("Enter the Salary:");
        m1.salary = s.nextDouble();
        System.out.println("Enter the Department:");
        m1.dept = s.nextLine();
        
        System.out.println("The details of the Officer are:");
        System.out.println("Name: " + o1.name);
        System.out.println("Age: " + o1.age);
        System.out.println("Address: " + o1.address);
	o1.printSalary();
        System.out.println("Phone number: " + o1.ph);
        System.out.println("Specialization: " + o1.specialization);

        System.out.println("The details of the Manager are:");
        System.out.println("Name: " + m1.name);
        System.out.println("Age: " + m1.age);
	System.out.println("Phone number: " + m1.ph);
        System.out.println("Address: " + m1.address);
	m1.printSalary();
        System.out.println("Department: " + m1.dept);
    }
}	
