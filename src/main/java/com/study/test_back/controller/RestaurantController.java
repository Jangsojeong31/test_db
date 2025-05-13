package com.study.test_back.controller;

import com.study.test_back.dto.request.RestaurantRequestDto;
import com.study.test_back.dto.response.RestaurantResponseDto;
import com.study.test_back.service.RestaurantService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


    @RestController
    @RequestMapping("/api/v1/restaurants")
    @RequiredArgsConstructor // 생성자 주입
    public class RestaurantController {


        private final RestaurantService restaurantService;


        @PostMapping
        public ResponseEntity<RestaurantResponseDto> createRestaurant( @RequestBody RestaurantRequestDto dto){

            RestaurantResponseDto restaurant = restaurantService.createRestaurant(dto);
            return ResponseEntity.status(HttpStatus.CREATED).body(restaurant);
        }


        @GetMapping("/{id}")
        public ResponseEntity<RestaurantResponseDto> getRestaurantById(@PathVariable Long id) {
            RestaurantResponseDto restaurant = restaurantService.getRestaurantById(id);
            return ResponseEntity.status(HttpStatus.OK).body(restaurant);
        }


        @GetMapping
        public ResponseEntity<List<RestaurantResponseDto>> getAllRestaurant() {
            List<RestaurantResponseDto> restaurant = restaurantService.getAllRestaurant();
            return ResponseEntity.status(HttpStatus.OK).body(restaurant);
        }

        // 수정
        @PutMapping("/{id}")
        public ResponseEntity<RestaurantResponseDto> updateRestaurant(
                @PathVariable Long id,
                @RequestBody RestaurantRequestDto dto
        ){
            RestaurantResponseDto restaurant = restaurantService.updateRestaurant(id, dto);
            return ResponseEntity.status(HttpStatus.OK).body(restaurant);
        }

        // 삭제
        @DeleteMapping("/{id}")
        public ResponseEntity<Void> deleteRestaurant(@PathVariable Long id){
            restaurantService.deleteRestaurant(id);
            return ResponseEntity.noContent().build();
        }
}
