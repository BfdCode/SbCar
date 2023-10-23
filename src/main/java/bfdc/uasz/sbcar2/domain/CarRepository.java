package bfdc.uasz.sbcar2.domain;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
// import org.springframework.stereotype.Repository;

@RepositoryRestResource
public interface CarRepository extends CrudRepository<Car, Long> { 
    //Fetch Cars by brand  
	List<Car> findByBrand(@Param("brand") String brand);
		
	//Fetch Cars by color  
	List<Car> findByColor(@Param("color") String color)  ;

	//Fetch Cars by brand and model 
	List<Car> findByBrandAndModel(String brand, String model)  ;

	//Fetch Cars by brand or color 
	List<Car> findByBrandOrColor(String brand, String color)  ;

	// Fetch Cars by model using SQL

	@Query("select c from Car c where c.model = ?1")
	List<Car> findByModel(String model)  ;

}