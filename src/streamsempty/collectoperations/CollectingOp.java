package streamsempty.collectoperations;


import lambda.streamsempty.helperclasses.Employee;
import streamsempty.helperclasses.Account;
import streamsempty.helperclasses.Status;

import java.util.*;
import java.util.stream.Collectors;

public class CollectingOp {
    public static void main(String[] args) {
        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Employee("Alex", 23, 23000, "USA"));
        employeeList.add(new Employee("Ben", 63, 25000, "India"));
        employeeList.add(new Employee("Dave", 34, 56000, "Bhutan"));
        employeeList.add(new Employee("Jodi", 43, 67000, "China"));
        employeeList.add(new Employee("Ryan", 53, 54000, "Libya"));
        List<Account> listOfAccounts = new ArrayList<>();
        listOfAccounts.add(new Account(500, "23212233", Status.ACTIVE));
        listOfAccounts.add(new Account(400, "34215111", Status.BLOCKED));
        listOfAccounts.add(new Account(800, "43566655", Status.REMOVED));
        listOfAccounts.add(new Account(200, "34567876", Status.ACTIVE));

        //1. returneaza o lista cu numele tututor angajatilor din lista de angajati
        List<String> listOfNames = employeeList.stream()
                .map(employee -> employee.getName())
                .collect(Collectors.toList());
        System.out.println(listOfNames);

        //2. returneaza un set cu tarile tututor angajatilor din lista de angajati
        Set<String> listOfCountries = employeeList.stream()
                .map(employee -> employee.getCountry())
                .collect(Collectors.toSet());
        System.out.println(listOfCountries);

        //3. returneaza o mapa in care cheia este fiecare nume de angajat din lista, iar valoarea este tara angajatului
        Map<String, String> map1 = employeeList.stream()
                .collect(Collectors.toMap(employee -> employee.getName(), employee -> employee.getCountry()));

        //4. returneaza o lista cu numerele de cont ale tuturor conturilor din lista de conturi
        List<String> listOfNoAcccounts = listOfAccounts.stream()
                .map(account -> account.getNumber())
                .collect(Collectors.toList());
        System.out.println(listOfNoAcccounts);
        //5. returneaza suma soldurilor tuturor conturilor din lista de conturi
//
            Optional<Integer> sumOfAllBalances =  listOfAccounts.stream()
                    .map(account->account.getBalance())
                    .reduce((sum, balance)->sum+balance);

        System.out.println(sumOfAllBalances.get());
        //6. returneaza o lista cu soldurile conturilor din lista de conturi

    }

}

