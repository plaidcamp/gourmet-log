package com.plaidcamp.mealogram.domain.history;

import com.plaidcamp.mealogram.domain.BaseEntity;
import com.sun.istack.NotNull;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;
import java.time.LocalDateTime;

@Entity
public class WeightHistory extends BaseEntity implements Serializable {

    @Column
    @NotNull
    private String name;

    @Column
    private Long changeseq;

    @Column
    private Long entnumber;

    @Column
    private LocalDateTime udate;
}
