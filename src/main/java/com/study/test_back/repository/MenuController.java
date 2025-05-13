package com.study.test_back.repository;

import com.study.test_back.dto.request.MenuRequestDto;
import com.study.test_back.dto.request.RestaurantRequestDto;
import com.study.test_back.dto.response.MenuResponseDto;
import com.study.test_back.dto.response.RestaurantResponseDto;
import com.study.test_back.service.MenuService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/menus")
@RequiredArgsConstructor // 생성자 주입
public class MenuController {
    private final MenuService menuService;


    @PostMapping
    public ResponseEntity<MenuResponseDto> createMenu(@RequestBody MenuRequestDto dto){

        MenuResponseDto  menu = menuService.createMenu(dto);
        return ResponseEntity.status(HttpStatus.CREATED).body(menu);
    }


    @GetMapping("/{id}")
    public ResponseEntity<MenuResponseDto> getMenuById(@PathVariable Long id) {
        MenuResponseDto  menu = menuService.getMenuById(id);
        return ResponseEntity.status(HttpStatus.OK).body(menu);
    }


    @GetMapping
    public ResponseEntity<List<MenuResponseDto>> getAllMenu() {
        List<MenuResponseDto> menu = menuService.getAllMenu();
        return ResponseEntity.status(HttpStatus.OK).body(menu);
    }

    // 수정
    @PutMapping("/{id}")
    public ResponseEntity<MenuResponseDto> updateMenu(
            @PathVariable Long id,
            @RequestBody MenuRequestDto dto
    ){
        MenuResponseDto  menu = menuService.updateMenu(id, dto);
        return ResponseEntity.status(HttpStatus.OK).body(menu);
    }

    // 삭제
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteMenu(@PathVariable Long id){
        menuService.deleteMenu(id);
        return ResponseEntity.noContent().build();
    }
}
