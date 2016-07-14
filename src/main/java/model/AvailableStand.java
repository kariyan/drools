/*******************************************************************************
 * Copyright(c) 2015-2020 Incheon International Airport Corporation.
 * All rights reserved. This software is the proprietary information of
 * Incheon International Airport Corporation.
 *******************************************************************************/
package model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
public class AvailableStand {
    //
    private List<StandScore> standScores = new ArrayList<>();
    private Map<Integer, StandScore> scoreMap = new HashMap<>();

    public void add(int standId, int score) {
        if (scoreMap.containsKey(standId)) {
            scoreMap.get(standId).addScore(score);
        } else {
            StandScore standScore = new StandScore(standId, score);
            scoreMap.put(standId, standScore);
            standScores.add(standScore);
        }
    }

    public void add(List<Integer> standIds, int score) {
        for (int standId : standIds) {
            if (scoreMap.containsKey(standId)) {
                scoreMap.get(standId).addScore(score);
            }
        }
    }

    public List<StandScore> getStandScores() {
        return standScores;
    }

    public void setStandScores(List<StandScore> standScores) {
        this.standScores = standScores;
    }
}
