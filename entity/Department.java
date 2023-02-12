package com.dailycodebuffer.Springboot.tutorial.entity;

import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Department {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long departmentId;

    @NotBlank(message = "Please add the Department Name")
    private String departmentName;
    private String departmentAddress;
    private String departmentCode;


}
