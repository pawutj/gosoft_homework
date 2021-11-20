package com.springboothomework1.springboothomework1;

import javax.persistence.Entity;
import javax.persistence.Id;
import lombok.Data;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

@Data
@Entity
public class Person {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long Id;
    private String fullName;
    private Integer status;
}
