package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQClearingandSettlementRetrieveOutputModelClearingandSettlementInstanceReport
 */
public class BQClearingandSettlementRetrieveOutputModelClearingandSettlementInstanceReport   {
  private Object clearingandSettlementInstanceReportRecord = null;

  private String clearingandSettlementInstanceReportType = null;

  private String clearingandSettlementInstanceReportParameters = null;

  private Object clearingandSettlementInstanceReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The input information used to assemble the report that can be on-going, periodic and actual and projected 
   * @return clearingandSettlementInstanceReportRecord
  **/

  public Object getClearingandSettlementInstanceReportRecord() {
    return clearingandSettlementInstanceReportRecord;
  }

  public void setClearingandSettlementInstanceReportRecord(Object clearingandSettlementInstanceReportRecord) {
    this.clearingandSettlementInstanceReportRecord = clearingandSettlementInstanceReportRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external report available 
   * @return clearingandSettlementInstanceReportType
  **/

  public String getClearingandSettlementInstanceReportType() {
    return clearingandSettlementInstanceReportType;
  }

  public void setClearingandSettlementInstanceReportType(String clearingandSettlementInstanceReportType) {
    this.clearingandSettlementInstanceReportType = clearingandSettlementInstanceReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the report (e.g. period, content type) 
   * @return clearingandSettlementInstanceReportParameters
  **/

  public String getClearingandSettlementInstanceReportParameters() {
    return clearingandSettlementInstanceReportParameters;
  }

  public void setClearingandSettlementInstanceReportParameters(String clearingandSettlementInstanceReportParameters) {
    this.clearingandSettlementInstanceReportParameters = clearingandSettlementInstanceReportParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external report in any suitable form including selection filters where appropriate 
   * @return clearingandSettlementInstanceReport
  **/

  public Object getClearingandSettlementInstanceReport() {
    return clearingandSettlementInstanceReport;
  }

  public void setClearingandSettlementInstanceReport(Object clearingandSettlementInstanceReport) {
    this.clearingandSettlementInstanceReport = clearingandSettlementInstanceReport;
  }


}

