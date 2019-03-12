package com.company;

import java.util.List;

public class ListOfEmployees {


    public List<Employee> listOfEmployees() {
        listOfEmployees().add(new Employee("Jakub", "Niewadzi", 4999));
        listOfEmployees().add(new Employee("Patryk", "Gubała", 1999));
        listOfEmployees().add(new Employee("Sebastian", "Chachulski", 5999));
        listOfEmployees().add(new Employee("Mikołaj", "Pietrzyk", 9999));
        listOfEmployees().add(new Employee("Adam", "Grucha", 2999));
        listOfEmployees().add(new Employee("Czarek", "Moskal", 6999));
        listOfEmployees().add(new Employee("Mateusz", "Szczerek", 3999));
        listOfEmployees().add(new Employee("Kuba", "Kochański", 7999));
        return listOfEmployees();
    }

    public List<Employee> filteredListOfEmployees() {
        for (Employee employee : listOfEmployees()) {
            if (employee.getSalary() > 4000) {
                filteredListOfEmployees().add(employee);
            }
        }
        return filteredListOfEmployees();
    }


}
