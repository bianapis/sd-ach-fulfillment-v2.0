package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQClearingandSettlementRetrieveOutputModelClearingandSettlementInstanceAnalysis
 */
public class BQClearingandSettlementRetrieveOutputModelClearingandSettlementInstanceAnalysis   {
  private Object clearingandSettlementInstanceAnalysisRecord = null;

  private String clearingandSettlementInstanceAnalysisReportType = null;

  private String clearingandSettlementInstanceAnalysisParameters = null;

  private Object clearingandSettlementInstanceAnalysisReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The inputs and results of the instance analysis that can be on-going, periodic and actual and projected 
   * @return clearingandSettlementInstanceAnalysisRecord
  **/

  public Object getClearingandSettlementInstanceAnalysisRecord() {
    return clearingandSettlementInstanceAnalysisRecord;
  }

  public void setClearingandSettlementInstanceAnalysisRecord(Object clearingandSettlementInstanceAnalysisRecord) {
    this.clearingandSettlementInstanceAnalysisRecord = clearingandSettlementInstanceAnalysisRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external performance analysis report available 
   * @return clearingandSettlementInstanceAnalysisReportType
  **/

  public String getClearingandSettlementInstanceAnalysisReportType() {
    return clearingandSettlementInstanceAnalysisReportType;
  }

  public void setClearingandSettlementInstanceAnalysisReportType(String clearingandSettlementInstanceAnalysisReportType) {
    this.clearingandSettlementInstanceAnalysisReportType = clearingandSettlementInstanceAnalysisReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the analysis (e.g. period, algorithm type) 
   * @return clearingandSettlementInstanceAnalysisParameters
  **/

  public String getClearingandSettlementInstanceAnalysisParameters() {
    return clearingandSettlementInstanceAnalysisParameters;
  }

  public void setClearingandSettlementInstanceAnalysisParameters(String clearingandSettlementInstanceAnalysisParameters) {
    this.clearingandSettlementInstanceAnalysisParameters = clearingandSettlementInstanceAnalysisParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external analysis report in any suitable form including selection filters where appropriate 
   * @return clearingandSettlementInstanceAnalysisReport
  **/

  public Object getClearingandSettlementInstanceAnalysisReport() {
    return clearingandSettlementInstanceAnalysisReport;
  }

  public void setClearingandSettlementInstanceAnalysisReport(Object clearingandSettlementInstanceAnalysisReport) {
    this.clearingandSettlementInstanceAnalysisReport = clearingandSettlementInstanceAnalysisReport;
  }


}

