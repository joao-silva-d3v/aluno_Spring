package com.aluno.aluno_backend.entities;
import java.io.Serializable;

import org.springframework.data.jpa.domain.AbstractPersistable;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.metamodel.SingularAttribute;

@Entity
public class Aluno {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
     private Integer id;

     private String Name;
     private Boolean active;
     private String period;

     public Integer getId(){
        return id;
     }

     public void setId(Integer id) {
        this.id = id;
     }
       
    public String getName(){
        return Name;
     }

     public void setName(String name) {
        this.Name = name;
     }   
     
     public Boolean getActive(){
        return active;
     }

     public void setActive(Boolean active) {
        this.active = active;
     }
      
    public String getPeriod(){
        return period;
     }

     public void setPeriod(String period) {
        this.period = period;
     }

    public void SetId(SingularAttribute<AbstractPersistable, Serializable> id) {
        throw new UnsupportedOperationException("Not supported yet.");
    }




     

}