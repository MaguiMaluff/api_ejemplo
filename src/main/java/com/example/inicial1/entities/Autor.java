package com.example.inicial1.entities;

@Entity
@Table(name = "autor")
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Setter
public class Autor {
    @Column (name = "nombre")
    private String nombre;
    @Column (name = "apellido")
    private String apellido;
    @Column (name = "biografia", length = 1500)
    private String biografia;

}
