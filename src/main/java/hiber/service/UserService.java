package hiber.service;

import hiber.model.Car;
import hiber.model.User;

import java.util.List;

public interface UserService {
    public void add(User user, Car car);

    List<User> listUsers();

    List<User> getUsersCar(String model, int series);
}
