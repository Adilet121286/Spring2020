package day39_AccessModifiers;

public class EmployeeObjects {
    public static void main(String[] args) {
        Employee employee1 = new Employee("Adilet");
        System.out.println(employee1);

        Employee employee2 = new Employee("Elbek","SDET");
        System.out.println(employee2);

        Employee employee3 = new Employee("Zhyldyz","Developer",5031986);
        System.out.println(employee3);

        Employee employee4 = new Employee("Muhtar","Instructor",4061994,130_000);
        System.out.println(employee4);

        Employee employee5 = new Employee("Karim", "Scrum manager",9061978,80_000,'M');
        System.out.println(employee5);








    }


}
