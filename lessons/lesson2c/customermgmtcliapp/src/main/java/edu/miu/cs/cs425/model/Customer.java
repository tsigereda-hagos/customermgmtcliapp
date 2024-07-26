package edu.miu.cs.cs425.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Customer {
    private Integer customerId;
    private String customerName;
    private LocalDate dateOfBirth;
}
