package com.study.test_back.dto.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

public class MenuRequestDto {
    @Getter
    @AllArgsConstructor
    @Builder
    public class MenuResponseDto {
        private Long id;
        private String name;
        private Double price;
        private String description;
    }
}
