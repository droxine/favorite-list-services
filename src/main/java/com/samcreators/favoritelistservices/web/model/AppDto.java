package com.samcreators.favoritelistservices.web.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.OffsetDateTime;
import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class AppDto {
    private UUID id;
    private Integer version;

    private OffsetDateTime createdDate;
    private OffsetDateTime lastModifiedDate;

    private String name;

    private AppTypeEnum appType;

    private BigDecimal price;

}
