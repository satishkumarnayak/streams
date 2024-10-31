package com.instanceofcake.streams;

import java.time.LocalDate;

public class EmployeeStreamDemo {

    public static void main(String[] args){

        Employee emp1 = new Employee("Satish", "IT", 130000l,"M", LocalDate.of(1981,01,26));
        Employee emp2 = new Employee("Evy", "IT", 140000l,"M", LocalDate.of(2013,01,23));
        Employee emp3 = new Employee("Nidhi", "HR", 120000l,"F", LocalDate.of(1986,03,16));
        Employee emp4 = new Employee("Varun", "Sales", 150000l,"M", LocalDate.of(2006,05,24));
        Employee emp5 = new Employee("Dolly", "Account", 110000l,"F", LocalDate.of(2004,01,3));
        Employee emp6 = new Employee("Vaishu", "HR", 160000l,"F", LocalDate.of(1998,04,11));
    }
}
