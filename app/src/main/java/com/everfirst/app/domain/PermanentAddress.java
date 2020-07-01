package com.everfirst.app.domain;

import com.orm.SugarRecord;

import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Data
public class PermanentAddress extends SugarRecord<PermanentAddress> {
    private String unit;
    private String location;
    private String city;
    private String region;
}
