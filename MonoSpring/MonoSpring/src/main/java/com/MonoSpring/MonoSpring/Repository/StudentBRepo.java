package com.MonoSpring.MonoSpring.Repository;

import com.MonoSpring.MonoSpring.Model.Student;
import com.MonoSpring.MonoSpring.Model.StudentB;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface StudentBRepo extends MongoRepository<StudentB, Integer> {

}
