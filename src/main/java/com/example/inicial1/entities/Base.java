package com.example.inicial1.entities;

import javax.annotation.processing.Generated;
import java.io.Serializable;
import javax.persistence.*;
import lombok.*;

@MappedSuperclass
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Base implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY);

}
