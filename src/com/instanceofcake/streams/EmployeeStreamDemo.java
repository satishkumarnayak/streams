package com.instanceofcake.streams;

import java.time.LocalDate;
import java.util.List;

public class EmployeeStreamDemo {

    public static void main(String[] args){

        Employee emp1 = new Employee("Satish", "IT", 130000l,"M", LocalDate.of(1981,01,26));
        Employee emp2 = new Employee("Evy", "IT", 140000l,"M", LocalDate.of(2013,01,23));
        Employee emp3 = new Employee("Nidhi", "HR", 120000l,"F", LocalDate.of(1986,03,16));
        Employee emp4 = new Employee("Varun", "Sales", 150000l,"M", LocalDate.of(2006,05,24));
        Employee emp5 = new Employee("Dolly", "Account", 110000l,"F", LocalDate.of(2004,01,3));
        Employee emp6 = new Employee("Vaishu", "HR", 160000l,"F", LocalDate.of(1998,04,11));

        List<Employee> list = List.of(emp1, emp2, emp3, emp4, emp5, emp6);

   //     noOfMalesFemale(list);

        printDepts(list);

    }

    private static void printDepts(List<Employee> list) {

        list.stream().map(e->e.getDept()).distinct().forEach(System.out::println);
    }


    public static void noOfMalesFemale(List<Employee> list){

        long m = list.stream().filter(e -> e.getGender().equals("M")).count();
        System.out.println(m);
        list.stream().filter(e -> e.getGender().equals("F")).forEach(System.out::println);

    }
}
