package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQReconciliationRetrieveInputModelReconciliationInstanceAnalysis;
import org.bian.dto.BQReconciliationRetrieveInputModelReconciliationInstanceReport;

import javax.validation.Valid;
  
/**
 * BQReconciliationRetrieveInputModel
 */
public class BQReconciliationRetrieveInputModel   {
  private Object reconciliationRetrieveActionTaskRecord = null;

  private String reconciliationRetrieveActionRequest = null;

  private BQReconciliationRetrieveInputModelReconciliationInstanceReport reconciliationInstanceReport = null;

  private BQReconciliationRetrieveInputModelReconciliationInstanceAnalysis reconciliationInstanceAnalysis = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return reconciliationRetrieveActionTaskRecord
  **/

  public Object getReconciliationRetrieveActionTaskRecord() {
    return reconciliationRetrieveActionTaskRecord;
  }

  public void setReconciliationRetrieveActionTaskRecord(Object reconciliationRetrieveActionTaskRecord) {
    this.reconciliationRetrieveActionTaskRecord = reconciliationRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service request (lists requested reports) 
   * @return reconciliationRetrieveActionRequest
  **/

  public String getReconciliationRetrieveActionRequest() {
    return reconciliationRetrieveActionRequest;
  }

  public void setReconciliationRetrieveActionRequest(String reconciliationRetrieveActionRequest) {
    this.reconciliationRetrieveActionRequest = reconciliationRetrieveActionRequest;
  }


  /**
   * Get reconciliationInstanceReport
   * @return reconciliationInstanceReport
  **/

  public BQReconciliationRetrieveInputModelReconciliationInstanceReport getReconciliationInstanceReport() {
    return reconciliationInstanceReport;
  }

  public void setReconciliationInstanceReport(BQReconciliationRetrieveInputModelReconciliationInstanceReport reconciliationInstanceReport) {
    this.reconciliationInstanceReport = reconciliationInstanceReport;
  }


  /**
   * Get reconciliationInstanceAnalysis
   * @return reconciliationInstanceAnalysis
  **/

  public BQReconciliationRetrieveInputModelReconciliationInstanceAnalysis getReconciliationInstanceAnalysis() {
    return reconciliationInstanceAnalysis;
  }

  public void setReconciliationInstanceAnalysis(BQReconciliationRetrieveInputModelReconciliationInstanceAnalysis reconciliationInstanceAnalysis) {
    this.reconciliationInstanceAnalysis = reconciliationInstanceAnalysis;
  }


}

