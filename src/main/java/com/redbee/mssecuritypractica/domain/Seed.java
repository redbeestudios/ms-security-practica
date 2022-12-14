package com.redbee.mssecuritypractica.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Seed {

    String seedId;
    LocalDateTime seedDate;
    BigDecimal seedAmount;
}
