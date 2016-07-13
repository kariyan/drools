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
public class Gate {
    //
    private int gateNo;
    private boolean busGate;
    private Stand connectedStand;

    public int getGateNo() {
        return gateNo;
    }

    public void setGateNo(int gateNo) {
        this.gateNo = gateNo;
    }

    public boolean isBusGate() {
        return busGate;
    }

    public void setBusGate(boolean busGate) {
        this.busGate = busGate;
    }

    public Stand getConnectedStand() {
        return connectedStand;
    }

    public void setConnectedStand(Stand connectedStand) {
        this.connectedStand = connectedStand;
    }
}
