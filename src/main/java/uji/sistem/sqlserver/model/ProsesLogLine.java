/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uji.sistem.sqlserver.model;

import java.time.LocalDateTime;
import lombok.Data;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
@Data
public class ProsesLogLine{
    private Long id;
    private String cmpnycd;
    private String rcvno;
    private String rxArrangementNumber;
    private Integer processLogCount;
    private String lensRlType;
    private Integer previousProcessNumber;
    private Integer previousSubprocessNumber;
    private Integer currentProcessNumber;
    private Integer currentSubprocessNumber;
    private Integer dipLotNumber;
    private Integer coatLotNumber;
    private Integer breakageReasonNumber;
    private Integer breakageResponsibleProcessNumber;
    private Integer processFlag1;
    private Integer processFlag2;
    private Integer processFlag3;
    private Integer processFlag4;
    private Integer processFlag5;
    private Integer processFlag6;
    private Integer processFlag7;
    private Integer processFlag8;
    private Integer processFlag9;
    private Integer processFlag10;
    private Integer processFlag11;
    private Integer processFlag12;
    private Integer processFlag13;
    private Integer processFlag14;
    private Integer processFlag15;
    private Integer processFlag16;
    private Integer additionalTreatmentType1;
    private Integer additionalTreatmentType2;
    private Integer additionalTreatmentType3;
    private Integer additionalTreatmentType4;
    private Integer additionalTreatmentType5;
    private Integer additionalTreatmentType6;
    private Integer additionalTreatmentType7;
    private Integer additionalTreatmentType8;
    private Integer additionalTreatmentType9;
    private Integer additionalTreatmentType10;
    private Integer additionalTreatmentType11;
    private Integer additionalTreatmentType12;
    private Integer additionalTreatmentType13;
    private Integer additionalTreatmentType14;
    private Integer additionalTreatmentType15;
    private Integer additionalTreatmentType16;
    private Integer additionalTreatmentType17;
    private Integer additionalTreatmentType18;
    private Integer additionalTreatmentType19;
    private Integer additionalTreatmentType20;
    private Integer materialType;
    private String materialFLensCode;
    private String materialFColorCoatCode;
    private String materialFLensName;
    private String materialFLensColor;
    private String materialFLensCoat;
    private String materialFLensCylinderType;
    private Integer materialFLensSphere;
    private Integer materialFLensCylinder;
    private Integer materialFLensAxis;
    private Integer materialFLensAddition;
    private Integer materialFLensDiameter;
    private Integer materialFOPC;
    private String materialSLensCode;
    private String materialSLensName;
    private String materialSLensColor;
    private String materialSLensMaker;
    private Integer materialSLensNominalBC;
    private Integer materialSLensDiameter;
    private Integer materialSLensThicknessType;
    private Integer materialSLensAddition;
    private Integer materialSOPC;
    private String materialRLensCode;
    private String materialRColorCoatCode;
    private String materialRLensName;
    private String materialRLensColor;
    private String materialRLensCoat;
    private String materialRLensCylinderType;
    private Integer materialRLensSphere;
    private Integer materialRLensCylinder;
    private Integer materialRLensAxis;
    private Integer materialRLensAddition;
    private Integer materialRLensDiameter;
    private LocalDateTime amddate;
}