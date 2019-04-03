package com.example.demo;

import javax.persistence.*;

@Entity
@Table(name = "employee", schema="hibernate")
@NamedQuery(name = "Employee.fetchByLastNameLength",
        query = "SELECT e FROM Employee e WHERE CHAR_LENGTH(e.lastname) =:length "//hql
)
public class Employee {
 
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
 
    @Column(name = "firstname")
    private String firstName;
 
    @Column(name = "lastname")
    private String lastname;
 
    @Column(name = "email")
    private String email;
 
    @Column(name = "age")
    private Integer age;
 
    @Column(name = "salary")
    private Integer salary;
     
    public Employee() {}
    public Employee(String fn, String ln,String email,int age,int salary) {
    	this.firstName = fn;
    	this.email =email;
    	this.age =age;
    	this.lastname = ln;
    	this.salary = this.salary;
    }
    
    
    public Long getId() {
        return id;
    }
 
    public void setId(Long id) {
        this.id = id;
    }
 
    public String getFirstName() {
        return firstName;
    }
 
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
 
    public String getLastname() {
        return lastname;
    }
 
    public void setLastname(String lastname) {
        this.lastname = lastname;
    }
 
    public String getEmail() {
        return email;
    }
 
    public void setEmail(String email) {
        this.email = email;
    }
 
    public Integer getAge() {
        return age;
    }
 
    public void setAge(Integer age) {
        this.age = age;
    }
 
    public Integer getSalary() {
        return salary;
    }
 
    public void setSalary(Integer salary) {
        this.salary = salary;
    }
}