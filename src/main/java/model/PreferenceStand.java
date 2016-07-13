/*******************************************************************************
 * Copyright(c) 2015-2020 Incheon International Airport Corporation.
 * All rights reserved. This software is the proprietary information of
 * Incheon International Airport Corporation.
 *******************************************************************************/
package model;

import java.util.Arrays;
import java.util.List;

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
public class PreferenceStand {
    //
    private String airlineUsid;
    private List<Integer> standUsids;

    public PreferenceStand() {
    }

    public PreferenceStand(String airlineUsid, List<Integer> standUsidList) {
        this.airlineUsid = airlineUsid;
        this.standUsids = standUsidList;
    }

    public PreferenceStand(String airlineUsid, Integer[] standUsidList) {
        this.airlineUsid = airlineUsid;
        this.standUsids = Arrays.asList(standUsidList);
    }

    public String getAirlineUsid() {
        return airlineUsid;
    }

    public void setAirlineUsid(String airlineUsid) {
        this.airlineUsid = airlineUsid;
    }

    public List<Integer> getStandUsids() {
        return standUsids;
    }

    public void setStandUsids(List<Integer> standUsids) {
        this.standUsids = standUsids;
    }
}
