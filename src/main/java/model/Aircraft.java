/*******************************************************************************
 * Copyright(c) 2015-2020 Incheon International Airport Corporation.
 * All rights reserved. This software is the proprietary information of
 * Incheon International Airport Corporation.
 *******************************************************************************/
package model;

/**
 *
 *
 * <pre>
 * History
 * ----------------------------------------------------------------------------
 * Date            Name                Description
 * ----------------------------------------------------------------------------
 * 2016. 07. 13.   Kim, Euntaek        최조작성
 * </pre>
 *
 * @author Kim, Euntaek. NextreeSoft, Co.
 * @since 2016. 07. 13.
 */
public class Aircraft {
    //
    private String registrationNo;
    private String aircraftType;
    private String aircraftSubType;
    private String capacityGrade;

    public String getRegistrationNo() {
        return registrationNo;
    }

    public void setRegistrationNo(String registrationNo) {
        this.registrationNo = registrationNo;
    }

    public String getAircraftType() {
        return aircraftType;
    }

    public void setAircraftType(String aircraftType) {
        this.aircraftType = aircraftType;
    }

    public String getAircraftSubType() {
        return aircraftSubType;
    }

    public void setAircraftSubType(String aircraftSubType) {
        this.aircraftSubType = aircraftSubType;
    }

    public String getCapacityGrade() {
        return capacityGrade;
    }

    public void setCapacityGrade(String capacityGrade) {
        this.capacityGrade = capacityGrade;
    }
}
