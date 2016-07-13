/*******************************************************************************
 * Copyright(c) 2015-2020 Incheon International Airport Corporation.
 * All rights reserved. This software is the proprietary information of
 * Incheon International Airport Corporation.
 *******************************************************************************/
package service;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.kie.api.KieServices;
import org.kie.api.command.Command;
import org.kie.api.command.KieCommands;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.StatelessKieSession;

import model.FlightLeg;
import model.FlightSector;
import model.FlightType;
import model.ImpairmentStand;
import model.PreferenceStand;
import model.Stand;

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
public class StandAssignmentServiceTest {
    //
    private List<Stand> stands = new ArrayList<>();
    private ImpairmentStand impairmentStand;
    private List<PreferenceStand> preferenceStands = new ArrayList<>();
    private List<FlightLeg> flightLegs = new ArrayList<>();

    @Test
    public void testStandAssignment() {
        //
        KieServices kieServices = KieServices.Factory.get();
        KieContainer kieContainer = kieServices.getKieClasspathContainer();
        StatelessKieSession kieSession = kieContainer.newStatelessKieSession();

        KieCommands commands = kieServices.getCommands();
        Command command = commands.newInsertElements(stands);

        kieSession.execute(command);
    }

    @Before
    public void setUp() {
        //
        stands.add(new Stand(1, "A"));
        stands.add(new Stand(2, "B"));
        stands.add(new Stand(3, "D"));
        stands.add(new Stand(4, "F"));
        stands.add(new Stand(5, "G"));
        stands.add(new Stand(6, "D"));
        stands.add(new Stand(7, "D"));
        stands.add(new Stand(8, "F"));
        stands.add(new Stand(9, "F"));
        stands.add(new Stand(10, "C"));
        stands.add(new Stand(11, "C"));
        stands.add(new Stand(12, "B"));
        stands.add(new Stand(13, "B"));
        stands.add(new Stand(14, "D"));
        stands.add(new Stand(15, "F"));

        impairmentStand = new ImpairmentStand(new Integer[]{1, 5, 10, 13});

        preferenceStands.add(new PreferenceStand("KE", new Integer[]{1, 2, 3, 4, 5, 6}));
        preferenceStands.add(new PreferenceStand("OZ", new Integer[]{7, 8, 9, 10, 11, 12}));

        flightLegs.add(new FlightLeg("KE", FlightSector.Depature, FlightType.International, "G", "1300"));
        flightLegs.add(new FlightLeg("OZ", FlightSector.Depature, FlightType.International, "G", "1300"));
        flightLegs.add(new FlightLeg("DL", FlightSector.Depature, FlightType.International, "E", "0900"));
        flightLegs.add(new FlightLeg("AL", FlightSector.Depature, FlightType.International, "E", "0930"));
        flightLegs.add(new FlightLeg("AL", FlightSector.Depature, FlightType.International, "F", "0930"));

        flightLegs.add(new FlightLeg("KE", FlightSector.Depature, FlightType.Domestic, "F", "0930"));
        flightLegs.add(new FlightLeg("7C", FlightSector.Depature, FlightType.International, "C", "0930"));
        flightLegs.add(new FlightLeg("KE", FlightSector.Depature, FlightType.International, "D", "1100"));
        flightLegs.add(new FlightLeg("OZ", FlightSector.Depature, FlightType.International, "A", "1230"));
        flightLegs.add(new FlightLeg("OZ", FlightSector.Depature, FlightType.International, "C", "1530"));
    }
}
