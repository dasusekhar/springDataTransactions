package com.example.rest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.rest.entity.PassegerInfo;

@Repository
public interface PassengerInfoRepository extends JpaRepository<PassegerInfo,Long> {

}
