package com.study.test_back.service;

import com.study.test_back.dto.request.MenuRequestDto;
import com.study.test_back.dto.response.MenuResponseDto;
import com.study.test_back.repository.MenuRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class MenuService {
    private final MenuRepository menuRepository;

    public MenuResponseDto createMenu(MenuRequestDto dto) {
        return  null;
    }

    public MenuResponseDto getMenuById(Long id) {
        return  null;
    }

    public List<MenuResponseDto> getAllMenu() {
        return  null;
    }

    public MenuResponseDto updateMenu(Long id, MenuRequestDto dto) {
        return  null;
    }

    public void deleteMenu(Long id) {
    }
}
