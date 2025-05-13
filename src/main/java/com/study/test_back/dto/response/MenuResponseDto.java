package com.study.test_back.dto.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

@Getter
@AllArgsConstructor
@Builder
public class MenuResponseDto {
    private Long id;
    private String name;
    private Double price;
    private String description;
}
