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
public class Stand {
    //
    private int id;
    private String capacityGrade;

    public Stand() {
    }

    public Stand(int id, String capacityGrade) {
        this.id = id;
        this.capacityGrade = capacityGrade;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCapacityGrade() {
        return capacityGrade;
    }

    public void setCapacityGrade(String capacityGrade) {
        this.capacityGrade = capacityGrade;
    }
}
