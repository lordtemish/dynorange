package com.dyn.Repo;

import com.dyn.Classes.Blood;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.ArrayList;

/**
 * Created by lordtemich on 10/27/17.
 */
public interface BloodRepo extends MongoRepository<Blood,String> {
    public Blood findById(String id);
    public Blood findByName(String name);
    public ArrayList<Blood> findAll();
}
