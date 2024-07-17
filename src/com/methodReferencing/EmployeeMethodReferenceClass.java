package com.methodReferencing;

import java.util.function.Predicate;
import java.util.function.Supplier;

interface CheckEligibility {
    Boolean checkAgeAndSalary(Employee employee);

}
interface GetEmployeeAge{
    Integer getEmployeeAge();
}

public class EmployeeMethodReferenceClass {

    public static void main(String[] args) {

        //static method referencing
        CheckEligibility checkEligibility = Employee::checkAgeAndSalary;

        Employee sivani = new Employee(101, "Sivani", 23, 40000.00);
        //calling a static method
        Boolean checked = checkEligibility.checkAgeAndSalary(sivani);
        System.out.println(checked);

        System.out.println(checkEligibility.checkAgeAndSalary(new Employee
                (102,"Rameshwar Singh",24,2400.00)));

        //non-static method referencing
        GetEmployeeAge getEmployeeAge=sivani::getAge;
        //calling the functional interface method
        System.out.println(getEmployeeAge.getEmployeeAge());

        //calling the predefined Functional interface
        Supplier<String> employeeSupplier=sivani::getEmployeeName;
        //calling the get() method in Supplier Interface
        System.out.println(employeeSupplier.get());

        //creating Predicate for Static method Referencing
        Predicate<Employee> predicate=Employee::checkAgeAndSalary;
        //calling the test() method in Predicate Functional interface
        System.out.println(predicate.test(sivani));

        StringBuffer stringBuffer = new StringBuffer("Good Morning");
        Supplier<StringBuffer> supplier=stringBuffer::reverse;
        System.out.println(supplier.get());


    }
}