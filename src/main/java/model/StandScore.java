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
public class StandScore implements Comparable<StandScore> {
    //
    private int standId;
    private int score;

    public StandScore(int standId, int score) {
        this.standId = standId;
        this.score = score;
    }

    public void addScore(int score) {
        this.score += score;
    }

    public int getStandId() {
        return standId;
    }

    public void setStandId(int standId) {
        this.standId = standId;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    @Override
    public int compareTo(StandScore o) {
        return o.score - score;
    }
}
