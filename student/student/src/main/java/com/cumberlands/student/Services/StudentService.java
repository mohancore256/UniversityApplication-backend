package com.cumberlands.student.Services;


import com.cumberlands.student.Models.Student;
import com.cumberlands.student.Repositories.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentService {

    @Autowired
    public StudentRepository studentRepository;

   public Student addStudent(Student student){

       return studentRepository.save(student);
   }


   public Optional<Student> getStudent(Long studentID)
   {
       return studentRepository.findById(studentID);
   }


   public void deleteStudent(Long studentID){
       studentRepository.deleteById(studentID);

   }

   public Student updateStudent(Student student){


       Student response = null;
       if(student.getStudentID() == null){
           return studentRepository.save(student);
       }
       Optional<Student> studentFound = studentRepository.findById(student.getStudentID());
       if(studentFound.isPresent()){
           response = studentRepository.save(student);
       }
       return response;
   }

   public List<Student> getAllStudent(){
       return studentRepository.findAll();

   }


}
