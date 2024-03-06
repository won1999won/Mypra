package com.hw1.run;

import com.hw1.model.dto.Employee;
import com.hw1.model.dto.Person;
import com.hw1.model.dto.Student;

import java.util.Scanner;

public class Run {
    public static void main(String[] args) {


        Person[] students = {
                new Student("홍길이", 20, 170.2, 70.0, 1, "정보시스템공학과"),
                new Student("말똥이", 21, 187.2, 80.0, 2, "경영학과"),
                new Student("개순이", 23, 152.2, 45.0, 4, "정보통신공학과")
        };
        for (Person i : students) {
            System.out.println(i.getinfo());
        }


        Employee[] employee = new Employee[10];
        Scanner scanner = new Scanner(System.in);
        int employeeCt = 0;
        String in;
        int countem = 0;


        while (true) {
            System.out.print("이름:");
            String name = scanner.nextLine();
            System.out.print("나이:");
            int age = scanner.nextInt();
            System.out.print("신장:");
            double height = scanner.nextDouble();
            System.out.print("몸무게");
            double weight = scanner.nextDouble();
            System.out.print("급여");
            int saraly = scanner.nextInt();
            System.out.print("부서");
            scanner.nextLine();
            String dept = scanner.nextLine();

            Employee employee1 = new Employee(name, age, height, weight, saraly, dept);

            employsee[countem]=employee1;


            countem++;
            System.out.print("계속입력? y/n");
            in = scanner.nextLine();
            if (in.equalsIgnoreCase("n")) {
                break;
            }


        }
        System.out.println("입력횟수:" + countem);


        System.out.println("출력");
        for (int i = 0; i < countem; i++) {
            System.out.println("이름: " + employee[i].getName() +
                    "나이: " + employee[i].getAge() +
                    "신장: " + employee[i].getHeight() +
                    "몸무계: " + employee[i].getWeight() +
                    "급여: " + employee[i].getSalary() +
                    "부서: " + employee[i].getDept());

        }
    }
}
