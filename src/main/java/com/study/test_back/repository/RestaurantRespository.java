package com.study.test_back.repository;

import com.study.test_back.entity.Restaurant;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RestaurantRespository extends JpaRepository<Restaurant, Long> {
}
