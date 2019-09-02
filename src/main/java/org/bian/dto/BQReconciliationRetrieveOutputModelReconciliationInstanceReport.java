package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQReconciliationRetrieveOutputModelReconciliationInstanceReport
 */
public class BQReconciliationRetrieveOutputModelReconciliationInstanceReport   {
  private Object reconciliationInstanceReportRecord = null;

  private String reconciliationInstanceReportType = null;

  private String reconciliationInstanceReportParameters = null;

  private Object reconciliationInstanceReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The input information used to assemble the report that can be on-going, periodic and actual and projected 
   * @return reconciliationInstanceReportRecord
  **/

  public Object getReconciliationInstanceReportRecord() {
    return reconciliationInstanceReportRecord;
  }

  public void setReconciliationInstanceReportRecord(Object reconciliationInstanceReportRecord) {
    this.reconciliationInstanceReportRecord = reconciliationInstanceReportRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external report available 
   * @return reconciliationInstanceReportType
  **/

  public String getReconciliationInstanceReportType() {
    return reconciliationInstanceReportType;
  }

  public void setReconciliationInstanceReportType(String reconciliationInstanceReportType) {
    this.reconciliationInstanceReportType = reconciliationInstanceReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the report (e.g. period, content type) 
   * @return reconciliationInstanceReportParameters
  **/

  public String getReconciliationInstanceReportParameters() {
    return reconciliationInstanceReportParameters;
  }

  public void setReconciliationInstanceReportParameters(String reconciliationInstanceReportParameters) {
    this.reconciliationInstanceReportParameters = reconciliationInstanceReportParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external report in any suitable form including selection filters where appropriate 
   * @return reconciliationInstanceReport
  **/

  public Object getReconciliationInstanceReport() {
    return reconciliationInstanceReport;
  }

  public void setReconciliationInstanceReport(Object reconciliationInstanceReport) {
    this.reconciliationInstanceReport = reconciliationInstanceReport;
  }


}

