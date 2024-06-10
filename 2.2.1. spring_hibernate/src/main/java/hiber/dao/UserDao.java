package hiber.dao;

import hiber.model.Car;
import hiber.model.User;

import java.util.List;

public interface UserDao {
   void add(User user);
   void addCar(Car car);
   public User getUserByModelAndSeries(String model, String series);
   List<User> listUsers();
}
