package com.MonoSpring.MonoSpring.Repository;

import com.MonoSpring.MonoSpring.Model.Student;
import org.springframework.data.mongodb.repository.Aggregation;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface StudentRepo extends MongoRepository<Student, Integer> {

    @Aggregation(pipeline = {"{$group: { _id: '',total: {$max: $mark}}}"})
    Integer max();

    @Aggregation(pipeline = {"{$group: { _id: '',total: {$min: $mark}}}"})
    Integer min();
}
