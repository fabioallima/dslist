package com.example.dslist.dto;

import com.example.dslist.entities.Game;

public record GameMinDTO(
        Long id,
        String title,
        Integer year,
        String imgUrl,
        String shortDescription
) {
}

