package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQReconciliationRetrieveOutputModelReconciliationInstanceAnalysis
 */
public class BQReconciliationRetrieveOutputModelReconciliationInstanceAnalysis   {
  private Object reconciliationInstanceAnalysisRecord = null;

  private String reconciliationInstanceAnalysisReportType = null;

  private String reconciliationInstanceAnalysisParameters = null;

  private Object reconciliationInstanceAnalysisReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The inputs and results of the instance analysis that can be on-going, periodic and actual and projected 
   * @return reconciliationInstanceAnalysisRecord
  **/

  public Object getReconciliationInstanceAnalysisRecord() {
    return reconciliationInstanceAnalysisRecord;
  }

  public void setReconciliationInstanceAnalysisRecord(Object reconciliationInstanceAnalysisRecord) {
    this.reconciliationInstanceAnalysisRecord = reconciliationInstanceAnalysisRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external performance analysis report available 
   * @return reconciliationInstanceAnalysisReportType
  **/

  public String getReconciliationInstanceAnalysisReportType() {
    return reconciliationInstanceAnalysisReportType;
  }

  public void setReconciliationInstanceAnalysisReportType(String reconciliationInstanceAnalysisReportType) {
    this.reconciliationInstanceAnalysisReportType = reconciliationInstanceAnalysisReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the analysis (e.g. period, algorithm type) 
   * @return reconciliationInstanceAnalysisParameters
  **/

  public String getReconciliationInstanceAnalysisParameters() {
    return reconciliationInstanceAnalysisParameters;
  }

  public void setReconciliationInstanceAnalysisParameters(String reconciliationInstanceAnalysisParameters) {
    this.reconciliationInstanceAnalysisParameters = reconciliationInstanceAnalysisParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external analysis report in any suitable form including selection filters where appropriate
   * @return reconciliationInstanceAnalysisReport
  **/

  public Object getReconciliationInstanceAnalysisReport() {
    return reconciliationInstanceAnalysisReport;
  }

  public void setReconciliationInstanceAnalysisReport(Object reconciliationInstanceAnalysisReport) {
    this.reconciliationInstanceAnalysisReport = reconciliationInstanceAnalysisReport;
  }


}

