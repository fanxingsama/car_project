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
    private String carName;
    private String carType; // suv、s级、c级、b级、a级
    private String color;
    private String level; // 高配、中配、低配
    private Integer price;
    private String img;
}
