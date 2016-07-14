/*******************************************************************************
 * Copyright(c) 2015-2020 Incheon International Airport Corporation.
 * All rights reserved. This software is the proprietary information of
 * Incheon International Airport Corporation.
 *******************************************************************************/
package com.sample;

import org.kie.api.KieBase;
import org.kie.api.io.ResourceType;
import org.kie.api.runtime.KieSession;
import org.kie.internal.builder.KnowledgeBuilder;
import org.kie.internal.builder.KnowledgeBuilderFactory;
import org.kie.internal.io.ResourceFactory;

/**
 * This is a sample file to launch a rule package from a rule source file.
 */
public class DroolsTest {

    public static final void main(String[] args) {
        try {

            KnowledgeBuilder kbuilder = KnowledgeBuilderFactory.newKnowledgeBuilder();
            kbuilder.add(ResourceFactory.newClassPathResource("META-INF/sampleMember.drl"), ResourceType.DRL);

            KieBase kiebase = kbuilder.newKnowledgeBase();
            KieSession session = kiebase.newKieSession();
            Member memFact1 = new Member("사용자1", "HR", 168);
            session.insert(memFact1);
            Member memFact2 = new Member("사용자2", "HR", 172);
            session.insert(memFact2);
            Member memFact3 = new Member("사용자3", "HR", 171);
            session.insert(memFact3);
            Member memFact4 = new Member("사용자4", "HR", 170);
            session.insert(memFact4);
            Member memFact5 = new Member("사용자5", "HR", 165);
            session.insert(memFact5);

            session.fireAllRules();

        } catch (Throwable t) {
            t.printStackTrace();
        }
    }
}

