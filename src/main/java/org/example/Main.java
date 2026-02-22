package org.example;

import org.example.enums.Plan;

public class Main {

    public static void main(String[] args) {
        run();
    }

    private static void run() {

        // Healthplan objesi
        Healthplan healthplan = new Healthplan(1, "A Sigorta", Plan.BASIC);
        System.out.println(healthplan.toString());

        // Employee objesi
        String[] healthPlans = new String[2];
        Employee employee = new Employee(
                1,
                "John Doe",
                "jd@test.com",
                "1234",
                healthPlans
        );

        employee.addHealthPlan(0, healthplan.getName());
        System.out.println(employee.toString());

        // Company objesi
        String[] developers = new String[2];
        Company company = new Company(
                1,
                "Workintech",
                1000,
                developers
        );

        company.addEmployee(0, employee.getFullName());
        System.out.println(company.toString());
    }
}