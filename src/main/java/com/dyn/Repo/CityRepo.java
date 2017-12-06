package com.dyn.Repo;

import com.dyn.Classes.City;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.ArrayList;

/**
 * Created by lordtemich on 10/27/17.
 */
public interface CityRepo extends MongoRepository<City,String>{
    public City findById(String id);
    public City findByNameRus(String nameRus);
    public City findByNameKaz(String nameKaz);
    public ArrayList<City> findAll();
}
