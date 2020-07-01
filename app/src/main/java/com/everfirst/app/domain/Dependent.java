package com.everfirst.app.domain;

import com.orm.SugarRecord;

import java.util.Date;

import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Data
public class Dependent extends SugarRecord<Dependent> {
    private String firstName;
    private String lastName;
    private String middleName;
    private String suffix;
    private Date birthDate;
    private String civilStatus;
    private String occupation;
}
