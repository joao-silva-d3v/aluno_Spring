package com.aluno.aluno_backend.resources;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.aluno.aluno_backend.entities.Aluno;
import com.aluno.aluno_backend.repositories.AlunoRepository;



@RestController
public class AlunoController {

   @Autowired
   private AlunoRepository repository;

   @GetMapping("hello")
   public String hello(){
    return "Hello from aluno Backend";
   }
   
   @GetMapping("students")
   public List<Aluno> getAlunos(){
         return repository.findAll();
   }
}