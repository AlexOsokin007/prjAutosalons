package com.site.carsite.domain;

import javax.persistence.*;

@Entity//дает знать что это не просто кусок когда, а сущьность, которую необходимо сохранять в бд
@Table(name = "tech_t")
public class Tech {
    @Id//чтобы различать 2 записи в одной табличке
    @GeneratedValue(strategy = GenerationType.AUTO)//генератор идентификатора
    private Long id;
    private String type;
    private String name;
    private String cond;
    private String old;
    private Integer price;
    private String transmission;
    private String drive;

    public String getTransmission() {
        return transmission;
    }

    public void setTransmission(String transmission) {
        this.transmission = transmission;
    }

    public String getDrive() {
        return drive;
    }

    public void setDrive(String drive) {
        this.drive = drive;
    }

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getVin() {
        return vin;
    }

    public void setVin(String vin) {
        this.vin = vin;
    }

    private String engine;
    private String color;
    private String vin;

    public String getOld() {
        return old;
    }

    public void setOld(String old) {
        this.old = old;
    }

    public Tech() {
    }
    public Tech(String type, String name, String cond, String old, Integer price, String transmission, String drive, String engine, String color, String vin) {
        this.name = name;
        this.type = type;
        this.cond = cond;
        this.old = old;
        this.price = price;
        this.transmission = transmission;
        this.drive = drive;
        this.engine = engine;
        this.color = color;
        this.vin = vin;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCond() {
        return cond;
    }

    public void setCond(String cond) {
        this.cond = cond;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getCondition() {
        return cond;
    }

    public void setCondition(String condition) {
        this.cond = condition;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }
}
