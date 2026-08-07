package ir.tamin.hub.infrastructure.persistence.entity;


import ir.tamin.hub.domain.enumaration.BankEnum;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.sql.Timestamp;

/**
 * Author: davood akbari
 * Email: daak1365@gmail.com
 */

@Setter
@Getter
@Entity
@Table(name = "BANK")
public class BankEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "bankSeq")
    @SequenceGenerator(name = "bankSeq", sequenceName = "BANK_SEQ", allocationSize = 1, initialValue = 1)
    @Column(name = "ID", nullable = false)
    private Long id;

    @Column(name = "CODE", nullable = false)
    @Enumerated(EnumType.STRING)
    private BankEnum code;

    @Column(name = "NAME", nullable = false, length = 100)
    private String name;

    @Column(name = "ACTIVE", nullable = false, length = 100)
    private boolean active;

    @Column(name = "CREATION_DATE")
    private Timestamp createDate;

    @Column(name = "CREATION_USER", length = 100)
    private String createUser;

    @Column(name = "MODIFY_DATE")
    private Timestamp modifyDate;

    @Column(name = "MODIFY_USER", length = 100)
    private String modifyUser;
}
