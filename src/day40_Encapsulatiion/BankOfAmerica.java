package day40_Encapsulatiion;

public class BankOfAmerica {
    public static void main(String[] args) {
        EmployeeInfo Abdul = new EmployeeInfo();
        Abdul.setAddress("Virginia");
        Abdul.setSalary(120_000.50);



        System.out.println(Abdul.getAddress());
        System.out.println(Abdul.companyName);
        System.out.println(Abdul.getSalary());


    }
}
