package com.sda.db;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Cat {
    private int id;
    private String name;
    private int birthYear;
    private String colour;

    public Cat(String name, int birthYear, String colour) {
        this.name = name;
        this.birthYear = birthYear;
        this.colour = colour;
    }
}
