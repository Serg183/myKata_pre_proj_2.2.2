package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import web.DAO.CarsDAO;
import web.model.Car;

import java.util.List;

@Service
public class CarsServiceImpl implements CarsService{
    @Autowired
    private CarsDAO carsDAO;

    @Override
    public List<Car> carCount(Integer count) {
        return carsDAO.carCount(count);
    }
}
