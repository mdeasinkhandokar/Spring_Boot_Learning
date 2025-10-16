package com.easinkhandokarcse.gmail.LearningRestApi.dto;


import lombok.AllArgsConstructor;
import lombok.Data;

/// Constructor ,gatter, setter, all the things replace  @Data anotation

@Data
@AllArgsConstructor
public class StudentDto {
    private Long id;
    private String name;
    private String  email;

//    public StudentDto(long l, String easin, String s) {
//    }


//    public StudentDto(Long id, String name, String email) {
//        this.id = id;
//        this.name = name;
//        this.email = email;
//    }
//
//    public StudentDto() {
//    }
//
//    public Long getId() {
//        return id;
//    }
//
//    public void setId(Long id) {
//        this.id = id;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public String getEmail() {
//        return email;
//    }
//
//    public void setEmail(String email) {
//        this.email = email;
//    }
//
//

}
