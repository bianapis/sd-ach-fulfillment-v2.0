package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQClearingandSettlementRetrieveOutputModelClearingandSettlementInstanceAnalysis;
import org.bian.dto.BQClearingandSettlementRetrieveOutputModelClearingandSettlementInstanceRecord;
import org.bian.dto.BQClearingandSettlementRetrieveOutputModelClearingandSettlementInstanceReport;
import org.bian.dto.BQClearingandSettlementRetrieveOutputModelInboundACHInstanceRecord;
import org.bian.dto.BQClearingandSettlementRetrieveOutputModelOutboundACHInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQClearingandSettlementRetrieveOutputModel
 */
public class BQClearingandSettlementRetrieveOutputModel   {
  private BQClearingandSettlementRetrieveOutputModelInboundACHInstanceRecord inboundACHInstanceRecord = null;

  private BQClearingandSettlementRetrieveOutputModelOutboundACHInstanceRecord outboundACHInstanceRecord = null;

  private BQClearingandSettlementRetrieveOutputModelClearingandSettlementInstanceRecord clearingandSettlementInstanceRecord = null;

  private String clearingandSettlementRetrieveActionTaskReference = null;

  private Object clearingandSettlementRetrieveActionTaskRecord = null;

  private String clearingandSettlementRetrieveActionResponse = null;

  private BQClearingandSettlementRetrieveOutputModelClearingandSettlementInstanceReport clearingandSettlementInstanceReport = null;

  private BQClearingandSettlementRetrieveOutputModelClearingandSettlementInstanceAnalysis clearingandSettlementInstanceAnalysis = null;


  /**
   * Get inboundACHInstanceRecord
   * @return inboundACHInstanceRecord
  **/

  public BQClearingandSettlementRetrieveOutputModelInboundACHInstanceRecord getInboundACHInstanceRecord() {
    return inboundACHInstanceRecord;
  }

  public void setInboundACHInstanceRecord(BQClearingandSettlementRetrieveOutputModelInboundACHInstanceRecord inboundACHInstanceRecord) {
    this.inboundACHInstanceRecord = inboundACHInstanceRecord;
  }


  /**
   * Get outboundACHInstanceRecord
   * @return outboundACHInstanceRecord
  **/

  public BQClearingandSettlementRetrieveOutputModelOutboundACHInstanceRecord getOutboundACHInstanceRecord() {
    return outboundACHInstanceRecord;
  }

  public void setOutboundACHInstanceRecord(BQClearingandSettlementRetrieveOutputModelOutboundACHInstanceRecord outboundACHInstanceRecord) {
    this.outboundACHInstanceRecord = outboundACHInstanceRecord;
  }


  /**
   * Get clearingandSettlementInstanceRecord
   * @return clearingandSettlementInstanceRecord
  **/

  public BQClearingandSettlementRetrieveOutputModelClearingandSettlementInstanceRecord getClearingandSettlementInstanceRecord() {
    return clearingandSettlementInstanceRecord;
  }

  public void setClearingandSettlementInstanceRecord(BQClearingandSettlementRetrieveOutputModelClearingandSettlementInstanceRecord clearingandSettlementInstanceRecord) {
    this.clearingandSettlementInstanceRecord = clearingandSettlementInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Clearing and Settlement instance retrieve service call 
   * @return clearingandSettlementRetrieveActionTaskReference
  **/

  public String getClearingandSettlementRetrieveActionTaskReference() {
    return clearingandSettlementRetrieveActionTaskReference;
  }

  public void setClearingandSettlementRetrieveActionTaskReference(String clearingandSettlementRetrieveActionTaskReference) {
    this.clearingandSettlementRetrieveActionTaskReference = clearingandSettlementRetrieveActionTaskReference;
  }


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service response (lists returned reports) 
   * @return clearingandSettlementRetrieveActionResponse
  **/

  public String getClearingandSettlementRetrieveActionResponse() {
    return clearingandSettlementRetrieveActionResponse;
  }

  public void setClearingandSettlementRetrieveActionResponse(String clearingandSettlementRetrieveActionResponse) {
    this.clearingandSettlementRetrieveActionResponse = clearingandSettlementRetrieveActionResponse;
  }


  /**
   * Get clearingandSettlementInstanceReport
   * @return clearingandSettlementInstanceReport
  **/

  public BQClearingandSettlementRetrieveOutputModelClearingandSettlementInstanceReport getClearingandSettlementInstanceReport() {
    return clearingandSettlementInstanceReport;
  }

  public void setClearingandSettlementInstanceReport(BQClearingandSettlementRetrieveOutputModelClearingandSettlementInstanceReport clearingandSettlementInstanceReport) {
    this.clearingandSettlementInstanceReport = clearingandSettlementInstanceReport;
  }


  /**
   * Get clearingandSettlementInstanceAnalysis
   * @return clearingandSettlementInstanceAnalysis
  **/

  public BQClearingandSettlementRetrieveOutputModelClearingandSettlementInstanceAnalysis getClearingandSettlementInstanceAnalysis() {
    return clearingandSettlementInstanceAnalysis;
  }

  public void setClearingandSettlementInstanceAnalysis(BQClearingandSettlementRetrieveOutputModelClearingandSettlementInstanceAnalysis clearingandSettlementInstanceAnalysis) {
    this.clearingandSettlementInstanceAnalysis = clearingandSettlementInstanceAnalysis;
  }


}

