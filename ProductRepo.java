package com.captal.account.Dao;

import com.captal.account.Model.*;

import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepo extends   JpaRepository<Product,Integer> {

}
