/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uji.sistem.sqlserver.model;
import java.time.LocalDateTime;
import lombok.Data;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
/**
 *
 * @author dread
 */

@Component
@Scope("prototype")
@Data

public class ProsesLogTable {
    private Long id;
    private String completed;
    private String cmpnycd;
    private String rcvno;
    private String rxArrangementNumber;
    private Integer processLogCount;
    private String passDate;
    private String passTime;
    private String productionCompanyCode;
    private String productionPlaceCode;
    private Integer breakageCount;
    private String breakageId;
    private Integer totdetline;
    private java.sql.Timestamp amddate;
}
