package com.velocity.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.velocity.model.Address;

@Repository
public interface AddressRepository extends JpaRepository<Address,Integer> {

}
