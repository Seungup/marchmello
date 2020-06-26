package com.marchmello.marchmello.functions.thread;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Getter
@Setter
@Entity
public class Thread {
    @Id
    @GeneratedValue
    private long id;
    private String title;
    private String description;
    private long createTime;
}
