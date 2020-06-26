package com.marchmello.marchmello.functions.comment;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Getter
@Setter
@Entity
public class Comment {
    @Id
    @GeneratedValue
    private long id;
    private long commentLocation;
    private String comment;
    private long createTime;
}
