package com.site.carsite.domain;

import javax.persistence.*;

@Entity//дает знать что это не просто кусок когда, а сущьность, которую необходимо сохранять в бд
@Table(name = "color")
public class Color {
    @Id//чтобы различать 2 записи в одной табличке
    @GeneratedValue(strategy = GenerationType.AUTO)//генератор идентификатора
    private Long id;
    private String color_name;
    public Color() {
    }
    public Color(String color_name) {
        this.color_name = color_name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getColor_name() {
        return color_name;
    }

    public void setColor_name(String color_name) {
        this.color_name = color_name;
    }
}