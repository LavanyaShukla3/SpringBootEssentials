package com.example.roomwebapp.data.entity;

import com.example.roomwebapp.data.enums.Position;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.Id;
import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.EnumType;

import lombok.Getter;
import lombok.Setter;

import java.util.UUID;

@Entity
@Table(name = "EMPLOYEES")
@Getter
@Setter
public class StaffEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "EMPLOYEE_ID")
    private UUID empId;

    @Column(name = "FIRST_NAME")
    private String fName;

    @Column(name = "LAST_NAME")
    private String lName;

    @Column(name = "POSITION")
    @Enumerated(EnumType.STRING)
    private Position position;


    @Override
    public String toString() {
        return "Staff{" +
                "EmpId=" + empId +
                ", Firstname='" + fName + '\'' +
                ", Lastname='" + lName + '\'' +
                ", position='" + position+ '\''+
                '}';
    }
}


