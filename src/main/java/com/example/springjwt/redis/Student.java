package com.example.springjwt.redis;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.redis.core.RedisHash;

import java.io.Serializable;

@RedisHash("Student")
@Data
public class Student implements Serializable {
    private String name;

    public Student(String name) {
        this.name = name;
    }
}
