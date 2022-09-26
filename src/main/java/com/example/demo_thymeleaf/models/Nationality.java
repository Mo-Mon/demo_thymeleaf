package com.example.demo_thymeleaf.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Nationality {
    @Id
    @GeneratedValue
    private Integer id;
    private String name;
    private String capital;
    private String updatedBy;
    @DateTimeFormat(pattern="yyyy-mm-dd")
    private Date updatedOn;
}
