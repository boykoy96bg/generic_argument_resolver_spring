package com.example.baseentity.controller;

import com.example.baseentity.entity.Student;
import com.example.baseentity.entity.StudentId;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class StudentController extends BaseController<StudentId> {

}
