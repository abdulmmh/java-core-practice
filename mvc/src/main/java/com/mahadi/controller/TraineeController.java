package com.mahadi.controller;

import com.mahadi.model.Trainee;
import com.mahadi.service.TraineeService;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TraineeController implements IController<Trainee>{
   static TraineeService traineeService = new TraineeService();
    @Override
    public void create(Trainee trainee) {

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Initializing Program");
        System.out.println("...........");
        System.out.println("...........");
        System.out.print("Enter your id: ");
        int tId = sc.nextInt();
        System.out.print("Enter your name: ");
        String tName = sc.nextLine();
        System.out.print("Enter your id: ");
        int tAge = sc.nextInt();
        System.out.print("Enter your address: ");
        String tAddress = sc.nextLine();
        System.out.print("Enter your salary: ");
        double tSalary = sc.nextDouble();

        List<Trainee> trainees = new ArrayList<>();

        Trainee trainee = new Trainee(tId, tName, tAge, tAddress, tSalary);;
        trainees.add(trainee);
        traineeService.sendData(trainees);
    }
}
