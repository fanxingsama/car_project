package org.example.entities;

/**
 * @author 马云龙
 * @create 2024-01-06 15:01
 */
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Car {
    private Integer id;
    private String name;
    private String type;
    private String price;
    private String img;
}
