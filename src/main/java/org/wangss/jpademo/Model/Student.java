package org.wangss.jpademo.Model;


import lombok.Data;
import org.hibernate.annotations.GeneratorType;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Data
public class Student {

    @Id
    private Long id;
    private String name;
    private String address;
}
