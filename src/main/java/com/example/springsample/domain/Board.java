package com.example.springsample.domain;

import lombok.*;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import javax.persistence.GenerationType;
import javax.validation.constraints.NotBlank;
import java.time.LocalDateTime;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Board {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "제목을 입력하세요.")
    @Column(length = 500, nullable = false)
    private String title;

    @NotBlank(message = "저자를 입력하세요.")
    @Column(length = 500, nullable = false)
    private String author;

    @NotBlank(message = "내용을 입력하세요")
    @Column(columnDefinition = "TEXT", nullable = false)
    private String content;

    @CreationTimestamp
    private LocalDateTime createDate;

}

