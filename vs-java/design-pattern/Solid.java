package pattern;


class Employee {
    private String name;
    private double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}

// Single Responsibility Principle (SRP)
class PayrollCalculator {
    public double calculatePay(Employee employee) {
        // Calculation logic for payroll
        return employee.getSalary();
    }
}

class EmployeeDataStorage {
    public void saveEmployeeData(Employee employee) {
        // Save employee data
        System.out.println("Employee data saved: " + employee.toString());
    }
}

// Open/Closed Principle (OCP)
abstract class Shape {
    public abstract double area();
}

class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        return Math.PI * radius * radius;
    }
}

class Square extends Shape {
    private double sideLength;

    public Square(double sideLength) {
        this.sideLength = sideLength;
    }

    @Override
    public double area() {
        return sideLength * sideLength;
    }
}

// Liskov Substitution Principle (LSP)
class Bird {
    public void fly() {
        System.out.println("Flying");
    }
}

class Ostrich extends Bird {
    @Override
    public void fly() {
        throw new UnsupportedOperationException("Ostriches cannot fly");
    }
}

// Interface Segregation Principle (ISP)
interface Printer {
    void printDocument(String document);
}

interface Scanner {
    void scanDocument(String document);
}

interface FaxMachine {
    void faxDocument(String document);
}

// Dependency Inversion Principle (DIP)
class Order {
    private double totalAmount;

    public Order(double totalAmount) {
        this.totalAmount = totalAmount;
    }

    public double getTotalAmount() {
        return totalAmount;
    }
}

class OrderProcessor {
    private PaymentGateway paymentGateway;

    public OrderProcessor(PaymentGateway paymentGateway) {
        this.paymentGateway = paymentGateway;
    }

    public void processOrder(Order order) {
        // Process order logic
        paymentGateway.processPayment(order.getTotalAmount());
    }
}

interface PaymentGateway {
    void processPayment(double amount);
}

class StripePaymentGateway implements PaymentGateway {
    @Override
    public void processPayment(double amount) {
        // Process payment using Stripe
        System.out.println("Payment processed via Stripe: $" + amount);
    }
}

class PayPalPaymentGateway implements PaymentGateway {
    @Override
    public void processPayment(double amount) {
        // Process payment using PayPal
        System.out.println("Payment processed via PayPal: $" + amount);
    }
}

public class Solid {
    public static void main(String[] args) {
        // SRP Example
        PayrollCalculator payrollCalculator = new PayrollCalculator();
        EmployeeDataStorage employeeDataStorage = new EmployeeDataStorage();
        Employee employee = new Employee("John", 5000);
        double pay = payrollCalculator.calculatePay(employee);
        System.out.println("Calculated pay for " + employee.getName() + ": $" + pay);
        employeeDataStorage.saveEmployeeData(employee);

        // OCP Example
        Shape circle = new Circle(5);
        Shape square = new Square(4);
        System.out.println("Area of circle: " + circle.area());
        System.out.println("Area of square: " + square.area());

        // LSP Example
        Bird bird = new Bird();
        bird.fly();
        Ostrich ostrich = new Ostrich();
        ostrich.fly(); // This will throw an exception

        // ISP Example
        Printer printer = new Printer() {
            @Override
            public void printDocument(String document) {
                System.out.println("Printing document: " + document);
            }
        };
        printer.printDocument("Test Document");

        // DIP Example
        Order order = new Order(100);
        PaymentGateway stripePaymentGateway = new StripePaymentGateway();
        OrderProcessor orderProcessor = new OrderProcessor(stripePaymentGateway);
        orderProcessor.processOrder(order);

        PaymentGateway payPalPaymentGateway = new PayPalPaymentGateway();
        OrderProcessor orderProcessor2 = new OrderProcessor(payPalPaymentGateway);
        orderProcessor2.processOrder(order);
    }
}
