/*******************************************************************************
 * Copyright(c) 2015-2020 Incheon International Airport Corporation.
 * All rights reserved. This software is the proprietary information of
 * Incheon International Airport Corporation.
 *******************************************************************************/
package com.sample;

import java.util.Arrays;

import org.junit.Test;
import org.kie.api.KieServices;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.StatelessKieSession;

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
public class BusinessTripTest2 {
    //
    @Test
    public void testBusinessTrip() {
        //
        KieServices kieServices = KieServices.Factory.get();
        KieContainer kieContainer = kieServices.getKieClasspathContainer();

        StatelessKieSession kieSession = kieContainer.newStatelessKieSession();

//        kieSession.execute(new BusinessTrip("사용자1", 3.5));
//        kieSession.execute(new BusinessTrip("사용자2", 5));
//        kieSession.execute(new BusinessTrip("사용자3", 8));
//        kieSession.execute(new BusinessTrip("사용자4", 10));
//        kieSession.execute(new BusinessTrip("사용자5", 13));

        kieSession.execute(kieServices.getCommands().newInsertElements(Arrays.asList(
                new BusinessTrip("사용자1", 3.5),
                new BusinessTrip("사용자2", 5),
                new BusinessTrip("사용자3", 8),
                new BusinessTrip("사용자4", 10),
                new BusinessTrip("사용자5", 13)
        )));
    }
}
