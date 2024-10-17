package com.MonoSpring.MonoSpring.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Transient;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
@Data
@NoArgsConstructor
@AllArgsConstructor
public class StudentB {
    @Transient
    public static final String SEQUENCE_NAME = "studentB_seq";

    @Id
    private long rno;

    private String name;

    private String address;
}
