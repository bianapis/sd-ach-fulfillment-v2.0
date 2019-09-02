package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQReconciliationInitiateInputModelReconciliationInstanceRecord;
import org.bian.dto.BQReconciliationRetrieveOutputModelClearingandSettlementInstanceRecord;
import org.bian.dto.BQReconciliationRetrieveOutputModelInboundACHInstanceRecord;
import org.bian.dto.BQReconciliationRetrieveOutputModelOutboundACHInstanceRecord;
import org.bian.dto.BQReconciliationRetrieveOutputModelReconciliationInstanceAnalysis;
import org.bian.dto.BQReconciliationRetrieveOutputModelReconciliationInstanceReport;

import javax.validation.Valid;
  
/**
 * BQReconciliationRetrieveOutputModel
 */
public class BQReconciliationRetrieveOutputModel   {
  private BQReconciliationRetrieveOutputModelInboundACHInstanceRecord inboundACHInstanceRecord = null;

  private BQReconciliationRetrieveOutputModelOutboundACHInstanceRecord outboundACHInstanceRecord = null;

  private BQReconciliationRetrieveOutputModelClearingandSettlementInstanceRecord clearingandSettlementInstanceRecord = null;

  private BQReconciliationInitiateInputModelReconciliationInstanceRecord reconciliationInstanceRecord = null;

  private String reconciliationRetrieveActionTaskReference = null;

  private Object reconciliationRetrieveActionTaskRecord = null;

  private String reconciliationRetrieveActionResponse = null;

  private BQReconciliationRetrieveOutputModelReconciliationInstanceReport reconciliationInstanceReport = null;

  private BQReconciliationRetrieveOutputModelReconciliationInstanceAnalysis reconciliationInstanceAnalysis = null;


  /**
   * Get inboundACHInstanceRecord
   * @return inboundACHInstanceRecord
  **/

  public BQReconciliationRetrieveOutputModelInboundACHInstanceRecord getInboundACHInstanceRecord() {
    return inboundACHInstanceRecord;
  }

  public void setInboundACHInstanceRecord(BQReconciliationRetrieveOutputModelInboundACHInstanceRecord inboundACHInstanceRecord) {
    this.inboundACHInstanceRecord = inboundACHInstanceRecord;
  }


  /**
   * Get outboundACHInstanceRecord
   * @return outboundACHInstanceRecord
  **/

  public BQReconciliationRetrieveOutputModelOutboundACHInstanceRecord getOutboundACHInstanceRecord() {
    return outboundACHInstanceRecord;
  }

  public void setOutboundACHInstanceRecord(BQReconciliationRetrieveOutputModelOutboundACHInstanceRecord outboundACHInstanceRecord) {
    this.outboundACHInstanceRecord = outboundACHInstanceRecord;
  }


  /**
   * Get clearingandSettlementInstanceRecord
   * @return clearingandSettlementInstanceRecord
  **/

  public BQReconciliationRetrieveOutputModelClearingandSettlementInstanceRecord getClearingandSettlementInstanceRecord() {
    return clearingandSettlementInstanceRecord;
  }

  public void setClearingandSettlementInstanceRecord(BQReconciliationRetrieveOutputModelClearingandSettlementInstanceRecord clearingandSettlementInstanceRecord) {
    this.clearingandSettlementInstanceRecord = clearingandSettlementInstanceRecord;
  }


  /**
   * Get reconciliationInstanceRecord
   * @return reconciliationInstanceRecord
  **/

  public BQReconciliationInitiateInputModelReconciliationInstanceRecord getReconciliationInstanceRecord() {
    return reconciliationInstanceRecord;
  }

  public void setReconciliationInstanceRecord(BQReconciliationInitiateInputModelReconciliationInstanceRecord reconciliationInstanceRecord) {
    this.reconciliationInstanceRecord = reconciliationInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Reconciliation instance retrieve service call 
   * @return reconciliationRetrieveActionTaskReference
  **/

  public String getReconciliationRetrieveActionTaskReference() {
    return reconciliationRetrieveActionTaskReference;
  }

  public void setReconciliationRetrieveActionTaskReference(String reconciliationRetrieveActionTaskReference) {
    this.reconciliationRetrieveActionTaskReference = reconciliationRetrieveActionTaskReference;
  }


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service response (lists returned reports) 
   * @return reconciliationRetrieveActionResponse
  **/

  public String getReconciliationRetrieveActionResponse() {
    return reconciliationRetrieveActionResponse;
  }

  public void setReconciliationRetrieveActionResponse(String reconciliationRetrieveActionResponse) {
    this.reconciliationRetrieveActionResponse = reconciliationRetrieveActionResponse;
  }


  /**
   * Get reconciliationInstanceReport
   * @return reconciliationInstanceReport
  **/

  public BQReconciliationRetrieveOutputModelReconciliationInstanceReport getReconciliationInstanceReport() {
    return reconciliationInstanceReport;
  }

  public void setReconciliationInstanceReport(BQReconciliationRetrieveOutputModelReconciliationInstanceReport reconciliationInstanceReport) {
    this.reconciliationInstanceReport = reconciliationInstanceReport;
  }


  /**
   * Get reconciliationInstanceAnalysis
   * @return reconciliationInstanceAnalysis
  **/

  public BQReconciliationRetrieveOutputModelReconciliationInstanceAnalysis getReconciliationInstanceAnalysis() {
    return reconciliationInstanceAnalysis;
  }

  public void setReconciliationInstanceAnalysis(BQReconciliationRetrieveOutputModelReconciliationInstanceAnalysis reconciliationInstanceAnalysis) {
    this.reconciliationInstanceAnalysis = reconciliationInstanceAnalysis;
  }


}

