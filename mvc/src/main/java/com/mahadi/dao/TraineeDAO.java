package com.mahadi.dao;


import com.mahadi.model.Trainee;


public class TraineeDAO implements IDAO<Trainee> {

    public void send(Trainee trainee) {
        System.out.println("ID : " + trainee.gettId()
        + " Name : " + trainee.gettName());
    }
}
