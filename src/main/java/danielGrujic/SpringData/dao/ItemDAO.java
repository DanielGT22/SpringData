package danielGrujic.SpringData.dao;

import danielGrujic.SpringData.Entities.Item;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ItemDAO extends JpaRepository<Item, Long> {


    List<Item> findByName(String name);
    List<Item> findByCalories(int calories);
    List<Item> findByCaloriesAndPrice(int calories, double price);
    List<Item> findByCaloriesLessOrName(int calories,String name);
    List<Item> findByCaloriesLessThan(int calories);
    List<Item> findPriceLessThan(int calories);

    @Query("SELECT i FROM Item i WHERE i.price >= 30")
    List<Item> filterByMoreThanThirty();

    @Query("SELECT i FROM Item i WHERE i.topping = ")
    List<Item> filterByMaggiorenni();




}
