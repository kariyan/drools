/*******************************************************************************
 * Copyright(c) 2015-2020 Incheon International Airport Corporation.
 * All rights reserved. This software is the proprietary information of
 * Incheon International Airport Corporation.
 *******************************************************************************/
package com.sample;

/**
 *
 *
 * <pre>
 * History
 * ----------------------------------------------------------------------------
 * Date            Name                Description
 * ----------------------------------------------------------------------------
 * 2016. 07. 11.   Kim, Euntaek        최조작성
 * </pre>
 *
 * @author Kim, Euntaek. NextreeSoft, Co.
 * @since 2016. 07. 11.
 */
public class BusinessTrip {
    //
    private String name;
    private double hour;

    public BusinessTrip(String name, double hour) {
        this.name = name;
        this.hour = hour;
    }

    public String getName() {
        return name;
    }

    public double getHour() {
        return hour;
    }
}
