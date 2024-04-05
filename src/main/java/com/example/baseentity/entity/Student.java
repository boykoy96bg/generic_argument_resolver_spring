package com.example.baseentity.entity;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.IdClass;
import lombok.*;


@AllArgsConstructor
@Getter
@Setter
@NoArgsConstructor
@Data
public class Student {

    private StudentId id;

    private String field1;

    private String field2;

}
