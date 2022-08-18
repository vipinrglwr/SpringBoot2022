package com.example.demo.storeproedure;

import com.example.demo.onetomany.entity.Vehicle;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Map;

public interface SPRepository extends JpaRepository<Vehicle,Long> {

    @Query(value= "{call getVehicleData()}",nativeQuery = true)
        List <Map<String,String>> getVehicle();


}
