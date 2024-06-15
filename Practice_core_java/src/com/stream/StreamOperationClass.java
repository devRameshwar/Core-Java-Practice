package Practice_core_java.src.com.stream;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

public class StreamOperationClass {

    //filtering the all employee name
    public static void employeeName(List<EmployeeDetails> list){
        System.out.println("================Collect All Employee name===========================");
        list.stream().map(e -> e.getEmployeeName()).peek(System.out::println).toList();
        System.out.println("================Ascending order===========================");
        List<String> employeeListName = list.stream().map(e -> e.getEmployeeName()).sorted().toList();
        employeeListName.forEach(System.out::println);
        System.out.println("================Descending order===========================");
        List<String> employeeNameList2 = list.stream().map(e -> e.getEmployeeName()).sorted((e1,e2)->e2.compareTo(e1)).toList();
        employeeNameList2.forEach(System.out::println);
        //collect all name start with s
        System.out.println("==========================Employee name start with S===========================");
        list.stream().filter(e->e.getEmployeeName().startsWith("S")).peek(System.out::println)
                .map(e->e.getEmployeeName()).peek(System.out::println).toList();

    }
    //Groups the remaining employees by their department.
    public static void getEmployeeThairDepartment(List<EmployeeDetails> list){
        System.out.println("=================================All Employee which are Developer=============================");
        list.stream().filter(e->e.getDepartment().equalsIgnoreCase("developer")).peek(System.out::println).toList();
        System.out.println("=================================All Employee Name which department is Operation=============================");
        list.stream().filter(e->e.getDepartment().equalsIgnoreCase("Operation")).map(e->e.getEmployeeName()).sorted().peek(System.out::println).toList();

        System.out.println("=================================[Employee Max salary which department is developer]=============================");
        list.stream().filter(e->e.getDepartment().equalsIgnoreCase("Developer")).map(e->e.getSalary())
                .max((e1,e2)->e1.compareTo(e2)).stream().peek(System.out::println).toList();
        System.out.println("=================================[Employee Min salary which department is Operation]=============================");
        list.stream().filter(e->e.getDepartment().
                equalsIgnoreCase("Operation")).map(e->e.getSalary()).min((e1,e2)->e1.compareTo(e2)).stream().peek(System.out::println).toList();
    }

    //getting data with respect Employee gender
    public static void gettingEmployeeWithGender(List<EmployeeDetails> list){
        System.out.println("=================================[Employee only male]=============================");
        list.stream().filter(e->e.getGender().equalsIgnoreCase("male")).peek(System.out::println).toList();
        System.out.println("=================================[Employee only male & Department is Developer]=============================");
        list.stream().filter(e->e.getGender().equalsIgnoreCase("Female")).
                filter(e->e.getDepartment().equalsIgnoreCase("developer")).peek(System.out::println).toList();

        System.out.println("=================================[Employee only Female & Department is Developer Max salary]=============================");
        EmployeeDetails maxSalaryFemale = list.stream().filter(e -> e.getDepartment().equalsIgnoreCase("developer"))
                .filter(e -> e.getGender().equalsIgnoreCase("female")).max((e1, e2) -> (int) (e1.getSalary() - e2.getSalary())).get();
        System.out.println(maxSalaryFemale);
    }


    public static void main(String[] args) {

        List<EmployeeDetails> employeeList = Arrays.asList(new EmployeeDetails(111, "Vijay", 5500.00, "Developer", LocalDate.of(2014, 6, 20), "Male"),
                new EmployeeDetails(100, "Sivani", 3500.50, "Operation", LocalDate.of(2015, 5, 25), "Female"),
                new EmployeeDetails(102, "Ravi", 4500.00, "Developer", LocalDate.of(2013, 4, 12), "Male"),
                new EmployeeDetails(103, "Anubhav", 5000.50, "Operation", LocalDate.of(2014, 6, 20), "Male"),
                new EmployeeDetails(104, "Akanksha", 5000.50, "Developer", LocalDate.of(2017, 8, 25), "Female"),
                new EmployeeDetails(105, "Arpit", 5000.50, "Operation", LocalDate.of(2017, 11, 20), "Male"),
                new EmployeeDetails(106, "Rameshwar", 5000.50, "Developer", LocalDate.of(2006, 12, 29), "Male"),
                new EmployeeDetails(107, "Rajan", 5000.50, "Operation", LocalDate.of(2012, 1, 20), "Male"),
                new EmployeeDetails(108, "Divya", 5000.50, "Developer", LocalDate.of(2012, 11, 23), "Female"),
                new EmployeeDetails(109, "Salini", 5000.50, "Operation", LocalDate.of(2011, 8, 01), "Female"),
                new EmployeeDetails(110, "Raj", 5000.50, "Developer", LocalDate.of(2014, 6, 20), "Male"));

        //employeeName(employeeList);
        //getEmployeeThairDepartment(employeeList);
        gettingEmployeeWithGender(employeeList);
    }
}

class EmployeeDetails {

    private Integer employeeId;
    private String employeeName;
    private Double salary;
    private String department;
    private LocalDate joiningDate;
    private String gender;

    public EmployeeDetails(Integer employeeId, String employeeName, Double salary, String department, LocalDate joiningDate, String gender) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.salary = salary;
        this.department = department;
        this.joiningDate = joiningDate;
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "EmployeeDetails{" + "employeeId=" + employeeId + ", employeeName='" + employeeName + '\'' + ", salary=" + salary + ", department='" + department + '\'' + ", joiningDate='" + joiningDate + '\'' + ", gender='" + gender + '\'' + '}';
    }

    public Integer getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(Integer employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public LocalDate getJoiningDate() {
        return joiningDate;
    }

    public void setJoiningDate(LocalDate joiningDate) {
        this.joiningDate = joiningDate;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}
