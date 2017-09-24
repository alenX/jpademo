package org.wangss.jpademo.Jpa;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.wangss.jpademo.Model.Student;

import java.util.List;

public interface IStudentJpa extends JpaRepository<Student,Long> {

    @Query(value = "select u from Student u where u.name like %?1")
    List<Student>  findAllStus(String name);

    Student findAllByAddress(String address);
}
