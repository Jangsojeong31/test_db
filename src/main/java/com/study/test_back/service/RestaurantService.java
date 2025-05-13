package com.study.test_back.service;

import com.study.test_back.dto.request.RestaurantRequestDto;
import com.study.test_back.dto.response.RestaurantResponseDto;
import com.study.test_back.entity.Restaurant;
import com.study.test_back.repository.RestaurantRespository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class RestaurantService {
    private final RestaurantRespository restaurantRespository;

    public RestaurantResponseDto createPost(RestaurantRequestDto dto) {
        RestaurantResponseDto responseDto = null;

        Restaurant restaurant = new Restaurant(dto.getId(), dto.getAddress(), dto.getName(), dto.getPhoneNumber());

        Restaurant savedrestaurant = restaurantRespository.save(restaurant);

        responseDto = RestaurantResponseDto.builder()
                .id(restaurant.getId())
                .name(restaurant.getName())
                .address(restaurant.getAddress())
                .phoneNumber(restaurant.getPhoneNumber())
                .build();

        return responseDto;
    }

    public RestaurantResponseDto getRestaurantById(Long id) {
        RestaurantResponseDto responseDto = null;

        Restaurant restaurant = restaurantRespository.findById(id)
                .orElseThrow(() -> new Error("없음"));

        responseDto = RestaurantResponseDto.builder()
                .id(restaurant.getId())
                .name(restaurant.getName())
                .address(restaurant.getAddress())
                .phoneNumber(restaurant.getPhoneNumber())
                .build();

        return responseDto;
    }

    public List<RestaurantResponseDto> getAllRestaurant() {

        List<RestaurantResponseDto> responseDto = null;

        List<Restaurant> restaurants = restaurantRespository.findAll();


        responseDto = restaurants.stream()
                        .map(restaurant -> RestaurantResponseDto.builder()
                                .id(restaurant.getId())
                                .name(restaurant.getName())
                                .address(restaurant.getAddress())
                                .phoneNumber(restaurant.getPhoneNumber())
                                .build())
                .collect(Collectors.toList());


        return responseDto;
    }
}
