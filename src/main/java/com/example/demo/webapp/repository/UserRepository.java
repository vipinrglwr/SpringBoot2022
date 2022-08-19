package com.example.demo.webapp.repository;

import com.example.demo.webapp.entity.UserData;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<UserData,Integer> {
//
//    @Query("from UserData where user_email=?1")
//    public List<UserData> findByEMAIL(String email);
//
//    @Query("from UserData where user_email=?1 and user_password=?2")
//    public UserData findByUsernameAndPassword(String username,String password);


}
