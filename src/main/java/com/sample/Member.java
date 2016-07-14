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
 * 2016. 07. 14.   Kim, Euntaek        최조작성
 * </pre>
 *
 * @author Kim, Euntaek. NextreeSoft, Co.
 * @since 2016. 07. 14.
 */
public class Member {
    private String name;
    private String section;
    private int height;

    public Member(String name, String section, int height) {
        super();
        this.name = name;
        this.section = section;
        this.height = height;
    }

    public String getSection() {
        return section;
    }

    public void setSection(String name) {
        this.section = name;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}