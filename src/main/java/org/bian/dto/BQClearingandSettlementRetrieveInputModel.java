package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQClearingandSettlementRetrieveInputModelClearingandSettlementInstanceAnalysis;
import org.bian.dto.BQClearingandSettlementRetrieveInputModelClearingandSettlementInstanceReport;

import javax.validation.Valid;
  
/**
 * BQClearingandSettlementRetrieveInputModel
 */
public class BQClearingandSettlementRetrieveInputModel   {
  private Object clearingandSettlementRetrieveActionTaskRecord = null;

  private String clearingandSettlementRetrieveActionRequest = null;

  private BQClearingandSettlementRetrieveInputModelClearingandSettlementInstanceReport clearingandSettlementInstanceReport = null;

  private BQClearingandSettlementRetrieveInputModelClearingandSettlementInstanceAnalysis clearingandSettlementInstanceAnalysis = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return clearingandSettlementRetrieveActionTaskRecord
  **/

  public Object getClearingandSettlementRetrieveActionTaskRecord() {
    return clearingandSettlementRetrieveActionTaskRecord;
  }

  public void setClearingandSettlementRetrieveActionTaskRecord(Object clearingandSettlementRetrieveActionTaskRecord) {
    this.clearingandSettlementRetrieveActionTaskRecord = clearingandSettlementRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service request (lists requested reports) 
   * @return clearingandSettlementRetrieveActionRequest
  **/

  public String getClearingandSettlementRetrieveActionRequest() {
    return clearingandSettlementRetrieveActionRequest;
  }

  public void setClearingandSettlementRetrieveActionRequest(String clearingandSettlementRetrieveActionRequest) {
    this.clearingandSettlementRetrieveActionRequest = clearingandSettlementRetrieveActionRequest;
  }


  /**
   * Get clearingandSettlementInstanceReport
   * @return clearingandSettlementInstanceReport
  **/

  public BQClearingandSettlementRetrieveInputModelClearingandSettlementInstanceReport getClearingandSettlementInstanceReport() {
    return clearingandSettlementInstanceReport;
  }

  public void setClearingandSettlementInstanceReport(BQClearingandSettlementRetrieveInputModelClearingandSettlementInstanceReport clearingandSettlementInstanceReport) {
    this.clearingandSettlementInstanceReport = clearingandSettlementInstanceReport;
  }


  /**
   * Get clearingandSettlementInstanceAnalysis
   * @return clearingandSettlementInstanceAnalysis
  **/

  public BQClearingandSettlementRetrieveInputModelClearingandSettlementInstanceAnalysis getClearingandSettlementInstanceAnalysis() {
    return clearingandSettlementInstanceAnalysis;
  }

  public void setClearingandSettlementInstanceAnalysis(BQClearingandSettlementRetrieveInputModelClearingandSettlementInstanceAnalysis clearingandSettlementInstanceAnalysis) {
    this.clearingandSettlementInstanceAnalysis = clearingandSettlementInstanceAnalysis;
  }


}

