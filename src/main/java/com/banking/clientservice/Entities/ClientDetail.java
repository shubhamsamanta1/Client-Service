package com.banking.clientservice.Entities;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.UpdateTimestamp;

import java.sql.Timestamp;
import java.time.DateTimeException;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;

@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "Client_Details")
public class ClientDetail {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long clientID;

    String name;

    String address;

    Long pincode;

    Long contact;

    LocalDate dateOfBirth;

    String email;

    String nationality;

    @Column(unique=true)
    String govId;

    String password;

    @UpdateTimestamp
    Timestamp tmStamp;

    transient List<SbCbDetail> sbCbDetails;

    transient List<LoanAccDetail> loanAccDetails;

}
