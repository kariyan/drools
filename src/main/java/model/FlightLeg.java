/*******************************************************************************
 * Copyright(c) 2015-2020 Incheon International Airport Corporation.
 * All rights reserved. This software is the proprietary information of
 * Incheon International Airport Corporation.
 *******************************************************************************/
package model;

import java.util.UUID;

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
public class FlightLeg {
    //
    private String usid;
    private String airlineIataCode;
    private FlightSector flightSector;
    private FlightType flightType;
    private String capacityGrade;
    private String serviceType;
    private String scheduledTime;

    public FlightLeg(String airlineIataCode, FlightSector flightSector, FlightType flightType, String capacityGrade, String scheduledTime) {
        initUsid();
        this.airlineIataCode = airlineIataCode;
        this.flightSector = flightSector;
        this.flightType = flightType;
        this.capacityGrade = capacityGrade;
        this.scheduledTime = scheduledTime;
    }

    public void initUsid() {
        usid = String.valueOf(UUID.randomUUID()).replaceAll("-", "");
    }

    public String getUsid() {
        return usid;
    }

    public void setUsid(String usid) {
        this.usid = usid;
    }

    public String getAirlineIataCode() {
        return airlineIataCode;
    }

    public void setAirlineIataCode(String airlineIataCode) {
        this.airlineIataCode = airlineIataCode;
    }

    public FlightSector getFlightSector() {
        return flightSector;
    }

    public void setFlightSector(FlightSector flightSector) {
        this.flightSector = flightSector;
    }

    public FlightType getFlightType() {
        return flightType;
    }

    public void setFlightType(FlightType flightType) {
        this.flightType = flightType;
    }

    public String getCapacityGrade() {
        return capacityGrade;
    }

    public void setCapacityGrade(String capacityGrade) {
        this.capacityGrade = capacityGrade;
    }

    public String getScheduledTime() {
        return scheduledTime;
    }

    public void setScheduledTime(String scheduledTime) {
        this.scheduledTime = scheduledTime;
    }

    public String getServiceType() {
        return serviceType;
    }

    public void setServiceType(String serviceType) {
        this.serviceType = serviceType;
    }
}
