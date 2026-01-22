package com.mahadi.service;

import com.mahadi.common.ICommonService;
import com.mahadi.dao.TraineeDAO;
import com.mahadi.model.Trainee;

import java.util.List;

public class TraineeService implements ICommonService<Trainee> {
    TraineeDAO traineeDAO = new TraineeDAO();
    @Override
    public void sendData(List<Trainee> list) {
        Trainee trainee = new Trainee(list.get(0).gettId(),list.get(1).gettName(), list.get(2).gettAge(), list.get(3).gettAddress(), list.get(4).gettSalary());
        traineeDAO.send(trainee);
    }
}
