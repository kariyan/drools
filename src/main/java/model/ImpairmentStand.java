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
public class ImpairmentStand {
    //
    private List<Integer> standIds;

    public ImpairmentStand() {
    }

    public ImpairmentStand(List<Integer> standIds) {
        this.standIds = standIds;
    }

    public ImpairmentStand(Integer[] standIds) {
        this.standIds = Arrays.asList(standIds);
    }

    public List<Integer> getStandIds() {
        return standIds;
    }

    public void setStandIds(List<Integer> standIds) {
        this.standIds = standIds;
    }
}
