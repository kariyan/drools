/*******************************************************************************
 * Copyright(c) 2015-2020 Incheon International Airport Corporation.
 * All rights reserved. This software is the proprietary information of
 * Incheon International Airport Corporation.
 *******************************************************************************/
package com.sample;

import java.util.Collection;

import org.junit.Test;
import org.kie.api.KieBase;
import org.kie.api.KieServices;
import org.kie.api.io.ResourceType;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;
import org.kie.api.runtime.StatelessKieSession;
import org.kie.internal.builder.KnowledgeBuilder;
import org.kie.internal.builder.KnowledgeBuilderFactory;
import org.kie.internal.io.ResourceFactory;

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
public class BusinessTripTest {
    //
    @Test
    public void testBusinessTrip() {
        //
        KieServices kieServices = KieServices.Factory.get();
        KieContainer kieContainer = kieServices.getKieClasspathContainer();

        KieBase kieBase = kieContainer.getKieBase("KBase1");
        KieSession kieSession = kieContainer.newKieSession("KSession2_1");
        Collection<String> kieBaseNames = kieContainer.getKieBaseNames();
        StatelessKieSession statelessKieSession = kieContainer.newStatelessKieSession("KSession2_2");

        KnowledgeBuilder builder = KnowledgeBuilderFactory.newKnowledgeBuilder();
        builder.add(ResourceFactory.newClassPathResource("META-INF/sample.drl"), ResourceType.DRL);

        KieBase base = builder.newKnowledgeBase();
        KieSession session = base.newKieSession();

        session.insert(new BusinessTrip("사용자1", 3.5));
        session.insert(new BusinessTrip("사용자2", 5));
        session.insert(new BusinessTrip("사용자3", 8));
        session.insert(new BusinessTrip("사용자4", 10));
        session.insert(new BusinessTrip("사용자5", 13));

        session.fireAllRules();
    }
}
