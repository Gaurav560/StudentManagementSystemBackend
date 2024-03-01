package com.telusko.controller;
import com.telusko.model.Student;
import com.telusko.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "http://localhost:5173")
public class StudentController {

    private final StudentService studentService;

    @Autowired
    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping("/Students")
    public List<Student> getAllStudents() {
        return studentService.getAllStudents();
    }

    @PostMapping("/Student")
    public Student createStudent(@RequestBody Student student) {
        return studentService.saveStudent(student);
    }

    @GetMapping("/Student/{id}")
    public ResponseEntity<Student> getStudentById(@PathVariable Long id) {
        Student student = studentService.getStudentById(id);
        return ResponseEntity.ok(student);
    }

    @PutMapping("/Student/{id}")
    public ResponseEntity<Student> updateStudent(@PathVariable Long id, @RequestBody Student studentDetails) {
        Student student = studentService.getStudentById(id);

        student.setName(studentDetails.getName());
        student.setEmail(studentDetails.getEmail());
        student.setAddress(studentDetails.getAddress());
        student.setPhoneNumber(studentDetails.getPhoneNumber());
        student.setClassName(studentDetails.getClassName());
        student.setFathersName(studentDetails.getFathersName());

        final Student updatedStudent = studentService.saveStudent(student);
        return ResponseEntity.ok(updatedStudent);
    }

    @DeleteMapping("/Student/{id}")
    public ResponseEntity<Void> deleteStudent(@PathVariable Long id) {
        studentService.deleteStudentById(id);
        return ResponseEntity.noContent().build();
    }
}
