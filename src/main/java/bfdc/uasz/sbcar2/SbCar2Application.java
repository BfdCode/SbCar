package bfdc.uasz.sbcar2;



import bfdc.uasz.sbcar2.domain.Car;
import bfdc.uasz.sbcar2.domain.CarRepository;
import bfdc.uasz.sbcar2.domain.Owner;
import bfdc.uasz.sbcar2.domain.OwnerRepository;
import bfdc.uasz.sbcar2.domain.User;
import bfdc.uasz.sbcar2.domain.UserRepository;
import java.util.Arrays;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
// import java.util.List;

// import org.springframework.data.repository.query.Param;
// import org.springframework.data.repository.CrudRepository;
// import org.springframework.data.jpa.repository.Query;


@SpringBootApplication
public class SbCar2Application implements CommandLineRunner {

	private static final Logger logger = LoggerFactory.getLogger(SbCar2Application.class);

	@Autowired
	private CarRepository repository;

	@Autowired
	private OwnerRepository orepository;

	@Autowired
	private UserRepository urepository;

	public static void main(String[] args) {
		SpringApplication.run(SbCar2Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		Owner owner1 = new Owner("John", "Johnson");
		Owner owner2 = new Owner("Mary", "Robinson");
		orepository.saveAll(Arrays.asList(owner1, owner2));

		Car car1 = new Car("Ford", "Mustand", "Red", "ADF-1121", 2021, 59000, owner1);
		Car car2 = new Car("Nissan", "Leaf", "White", "SSJ-3002", 2019, 29000, owner2);
		Car car3 = new Car("Toyota", "Prius", "Silver", "KKO-0212", 2020, 39000, owner2);
		repository.saveAll(Arrays.asList(car1, car2, car3));

		for (Car car : repository.findAll()) {
			logger.info(car.getBrand() + "  " + car.getModel());	
		}

		urepository.save(new User("user", 
		"$2a$10$NVM0n8ElaRgg7zWO1CxUdei7vWoPg91Lz2aYavh9.f9q0e4bRadue", "USER"
		));
		urepository.save(new User("admin", 
		"$2a$10$8cjz47bjbR4Mn8GMg9IZx.vyjhLXR/SKKMSZ9.mP9vpMu0ssKi8GW", "ADMIN"
		));
	}

}
