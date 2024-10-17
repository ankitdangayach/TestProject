package com.MonoSpring.MonoSpring.Controller;


import com.MonoSpring.MonoSpring.Model.DatabaseSequence;
import com.MonoSpring.MonoSpring.Model.Student;
import com.MonoSpring.MonoSpring.Model.StudentB;
import com.MonoSpring.MonoSpring.Repository.StudentBRepo;
import com.MonoSpring.MonoSpring.Repository.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Objects;

import static org.springframework.data.mongodb.core.FindAndModifyOptions.options;
import static org.springframework.data.mongodb.core.query.Criteria.where;
import static org.springframework.data.mongodb.core.query.Query.query;

@RestController
public class MainController {

    @Autowired
    StudentRepo studentRepo;

    @Autowired
    StudentBRepo studentBRepo;

    @Autowired
    private MongoOperations mongoOperations;

    @PostMapping("/addStudent")
    public void addStudent(@RequestBody Student student) {
        Student studentTemp = new Student();
        studentTemp.setRno(generateSequence(Student.SEQUENCE_NAME));
        studentTemp.setAddress(student.getAddress());
        studentTemp.setName(student.getName());
        studentTemp.setMark(student.getMark());
        studentRepo.save(studentTemp);
    }

    @PostMapping("/addStudentB")
    public void addStudentB(@RequestBody StudentB student) {
        StudentB studentBTemp = new StudentB();
        studentBTemp.setRno(generateSequence(StudentB.SEQUENCE_NAME));
        studentBTemp.setAddress(student.getAddress());
        studentBTemp.setName(student.getName());
        studentBRepo.save(studentBTemp);
    }


    @GetMapping("/getStudent/{id}")
    public Student addStudent(@PathVariable Integer id) {
        return studentRepo.findById(id).orElse(null);
    }

    @GetMapping("/allStudents")
    public List<Student> allStudents() {
        return studentRepo.findAll();
    }

    @PutMapping("/updateStudent")
    public void updateStudent(@RequestBody Student student) {
        Student data = studentRepo.findById((int) student.getRno()).orElse(null);
        if (data != null) {
            data.setName(student.getName());
            data.setAddress(student.getAddress());
            studentRepo.save(data);
        }
    }

    @DeleteMapping("/deleteStudent/{id}")
    public void deleteStudent(@PathVariable Integer id) {
        studentRepo.deleteById(id);
    }

    @PostMapping("/addStudentList")
    public void addStudentList(@RequestBody List<Student> studentList) {
        studentRepo.saveAll(studentList);
    }

    @GetMapping("/getMax")
    public Integer getMax() {
        return studentRepo.max();
    }

    @GetMapping("/getMin")
    public Integer getMin() {
        return studentRepo.min();
    }


    public long generateSequence(String seqName) {
        DatabaseSequence counter = mongoOperations.findAndModify(query(where("_id").is(seqName)),
                new Update().inc("seq", 1), options().returnNew(true).upsert(true),
                DatabaseSequence.class);
        return !Objects.isNull(counter) ? counter.getSeq() : 1;
    }
}
