package com.study.test_back.dto.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;


    @Getter
    @AllArgsConstructor
    @Builder
    public class RestaurantRequestDto {
        private Long id;
        private String name;
        private String address;
        private String phoneNumber;
    }

