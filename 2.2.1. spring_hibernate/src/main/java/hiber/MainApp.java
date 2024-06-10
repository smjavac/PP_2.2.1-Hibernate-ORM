package hiber;

import hiber.config.AppConfig;
import hiber.model.Car;
import hiber.model.User;
import hiber.service.UserService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.sql.SQLException;
import java.util.List;

public class MainApp {
    public static void main(String[] args) throws SQLException {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(AppConfig.class);

        UserService userService = context.getBean(UserService.class);

        Car car = new Car("BMW", "F10");
        Car car2 = new Car("WV", "Golf");
        Car car3 = new Car("AUDI", "A6");
        User user = new User("User1", "Lastname1", "user1@gamil.com", car);
        User user2 = new User("User2", "Lastname2", "user2@gamil.com", car2);
        User user3 = new User("User3", "Lastname3", "user3@gamil.com", car3);

        userService.add(user);
        userService.add(user2);
        userService.add(user3);

        System.out.println("сдесь должен быть распечатан юзер:  " + userService.getUserByModelAndSeries("BMW", "F10"));

//        List<User> users = userService.listUsers();
//        for (User u : users) {
//            System.out.println("Id = " + u.getId());
//            System.out.println("First Name = " + u.getFirstName());
//            System.out.println("Last Name = " + u.getLastName());
//            System.out.println("Email = " + u.getEmail());
//            System.out.println("Car's " + u.getCar());
//        }

        context.close();
    }
}
