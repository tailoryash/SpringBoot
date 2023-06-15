package com.restapi.model;

import com.fasterxml.jackson.annotation.*;
import jakarta.persistence.*;
import lombok.*;
import org.springframework.data.jpa.repository.*;

@Data
@Entity
@Table(name = "authors")
@NoArgsConstructor
@AllArgsConstructor
public class Author {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="author_id")
    private int id;
    private String firstname;
    private String lastname;
    @OneToOne(mappedBy = "author")
    @JsonBackReference
    private Book book;
}
