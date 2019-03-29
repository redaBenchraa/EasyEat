package com.example.easyeatpayment.entities;

import lombok.*;
import javax.persistence.*;


@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Orders {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Integer id;
    private double amount;

    @Column(columnDefinition = "integer default 0")
    private int status;
    private int quantity;

    @Column(columnDefinition = "integer default 0")
    private int paid;
}
