package com.everfirst.app.domain;

import com.orm.SugarRecord;

import java.util.Date;

import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Data
public class PensionMember extends SugarRecord<PensionMember> {
    private String firstName;
    private String lastName;
    private String middleName;
    private String suffix;
    private Date birthDate;
    private String bank;
    private String branch;
    private String accountNumber;
    private String remittanceDate;
    private String modeOfPension;
}
