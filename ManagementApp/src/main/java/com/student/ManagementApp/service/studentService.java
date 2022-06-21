package com.student.ManagementApp.service;

import com.nimbusds.jose.shaded.json.JSONObject;
import com.student.ManagementApp.model.DTO.student_studentClassDTO;
import com.student.ManagementApp.model.DTO.student_subjectScoreDTO;
import com.student.ManagementApp.model.Entity.scores;
import com.student.ManagementApp.model.Entity.student;
import com.student.ManagementApp.respository.*;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.*;
import java.util.stream.Collectors;

@Service
public class studentService{
    private final studentRepository studentRepository;
    private final classRepository classRepository;
    private final scoreRepository scoreRepository;
    private final departmentRepository departmentRepository;
    private final subjectRepository subjectRepository;

    @Autowired
    public studentService(com.student.ManagementApp.respository.studentRepository studentRepository, com.student.ManagementApp.respository.classRepository classRepository, com.student.ManagementApp.respository.scoreRepository scoreRepository, com.student.ManagementApp.respository.departmentRepository departmentRepository, com.student.ManagementApp.respository.subjectRepository subjectRepository) {
        this.studentRepository = studentRepository;
        this.classRepository = classRepository;
        this.scoreRepository = scoreRepository;
        this.departmentRepository = departmentRepository;
        this.subjectRepository = subjectRepository;
    }

    @Bean
    public ModelMapper modelMapper() {
        return new ModelMapper();
    }
    @Autowired
    private ModelMapper modelMapper;

    public student_studentClassDTO convertToDto(student student) {
        student_studentClassDTO student_studentClassDTO = modelMapper.map(student, student_studentClassDTO.class);
        student_studentClassDTO.setCid(student.getStudentclass().getCid());
        student_studentClassDTO.setClassName(student.getStudentclass().getClassName());
        student_studentClassDTO.setNumOfStudent(student.getStudentclass().getNumOfStudent());
        student_studentClassDTO.setCourseNum(student.getStudentclass().getCourseNum());
        student_studentClassDTO.setEnrollYear(student.getStudentclass().getEnrollYear());
        student_studentClassDTO.setTrainType(student.getStudentclass().getTrainType());
        return student_studentClassDTO;
    }
    public student_subjectScoreDTO convertToDto(scores scores) {
        student_subjectScoreDTO student_subjectScoreDTO = modelMapper.map(scores, student_subjectScoreDTO.class);

        student_subjectScoreDTO.setSid(scores.getstudent().getSid());
        student_subjectScoreDTO.setFirstName(scores.getstudent().getFirstName());
        student_subjectScoreDTO.setLastName(scores.getstudent().getLastName());
        student_subjectScoreDTO.setCredits(scores.getSubject().getCredits());
        student_subjectScoreDTO.setSjid(scores.getSubject().getSjid());
        student_subjectScoreDTO.setSubjectName(scores.getSubject().getSubjectName());
        return student_subjectScoreDTO;
    }



    //Get All Students in Database
    public ResponseEntity<Map<String, Object>> getAllStudents(){
        Map<String, Object> response = new HashMap<>();
        List<student> students = studentRepository.findAll();
        List<student_studentClassDTO> studentStudentClassDTO = students.stream().map(this::convertToDto).collect(Collectors.toList());
        response.put("students", studentStudentClassDTO);
        return new ResponseEntity<>(new JSONObject(response), HttpStatus.OK);
    }

    //Get All Student With Class Id param
    public ResponseEntity<Map<String, Object>> getStudentsFromClass(String classId){
        Map<String, Object> response = new HashMap<>();
        List<student> students = studentRepository.findAllByStudentclass_Cid(classId);
        List<student_studentClassDTO> studentStudentClassDTO = students.stream().map(this::convertToDto).collect(Collectors.toList());
        response.put("students", studentStudentClassDTO);
        return new ResponseEntity<>(new JSONObject(response), HttpStatus.OK);
    }

    //Get Scores With student Id and subject Id.
    public ResponseEntity<Map<String, Object>> getScoresOfSubject(String sid,String sjId) {
        Map<String, Object> response = new HashMap<>();
        List<scores> scores = scoreRepository.findAllBysidAndsjid(sid,sjId);
        List<student_subjectScoreDTO> student_subjectScoreDTO = scores.stream().map(this::convertToDto).collect(Collectors.toList());
        response.put("student_scores", student_subjectScoreDTO);
        return new ResponseEntity<>(new JSONObject(response),HttpStatus.OK);
    }
}
