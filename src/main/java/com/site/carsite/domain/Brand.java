package com.site.carsite.domain;
import javax.persistence.*;

@Entity//дает знать что это не просто кусок когда, а сущьность, которую необходимо сохранять в бд
@Table(name = "brand")
public class Brand {
    @Id//чтобы различать 2 записи в одной табличке
    @GeneratedValue(strategy = GenerationType.AUTO)//генератор идентификатора
    private Long id;
    private String name;

    public Brand() {
    }
    public Brand(String name) {
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}