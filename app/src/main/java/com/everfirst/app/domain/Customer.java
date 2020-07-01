package com.everfirst.app.domain;

import com.orm.SugarRecord;

import java.util.Date;
import java.util.List;

import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Data
public class Customer extends SugarRecord<Customer> {
    private String firstName;
    private String lastName;
    private String middleName;
    private String suffix;
    private Date birthDate;
    private String contactNumber;
    private String otherContactNumber;
    private String pensionSource;
    private String pensionType;
    private PresentAddress presentAddress;
    private PermanentAddress permanentAddress;
    private PreviousAddress previousAddress;
    private PensionMember pensionMember;
    private List<Dependent> dependents;
}
