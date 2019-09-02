package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQClearingandSettlementInitiateInputModelClearingandSettlementInstanceRecord;
import org.bian.dto.BQClearingandSettlementInitiateInputModelOutboundACHInstanceRecord;
import org.bian.dto.BQOutboundACHInitiateOutputModelInboundACHInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQClearingandSettlementInitiateOutputModel
 */
public class BQClearingandSettlementInitiateOutputModel   {
  private BQOutboundACHInitiateOutputModelInboundACHInstanceRecord inboundACHInstanceRecord = null;

  private BQClearingandSettlementInitiateInputModelOutboundACHInstanceRecord outboundACHInstanceRecord = null;

  private String clearingandSettlementInstanceReference = null;

  private String clearingandSettlementInitiateActionReference = null;

  private Object clearingandSettlementInitiateActionRecord = null;

  private String clearingandSettlementInstanceStatus = null;

  private BQClearingandSettlementInitiateInputModelClearingandSettlementInstanceRecord clearingandSettlementInstanceRecord = null;


  /**
   * Get inboundACHInstanceRecord
   * @return inboundACHInstanceRecord
  **/

  public BQOutboundACHInitiateOutputModelInboundACHInstanceRecord getInboundACHInstanceRecord() {
    return inboundACHInstanceRecord;
  }

  public void setInboundACHInstanceRecord(BQOutboundACHInitiateOutputModelInboundACHInstanceRecord inboundACHInstanceRecord) {
    this.inboundACHInstanceRecord = inboundACHInstanceRecord;
  }


  /**
   * Get outboundACHInstanceRecord
   * @return outboundACHInstanceRecord
  **/

  public BQClearingandSettlementInitiateInputModelOutboundACHInstanceRecord getOutboundACHInstanceRecord() {
    return outboundACHInstanceRecord;
  }

  public void setOutboundACHInstanceRecord(BQClearingandSettlementInitiateInputModelOutboundACHInstanceRecord outboundACHInstanceRecord) {
    this.outboundACHInstanceRecord = outboundACHInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Clearing and Settlement instance 
   * @return clearingandSettlementInstanceReference
  **/

  public String getClearingandSettlementInstanceReference() {
    return clearingandSettlementInstanceReference;
  }

  public void setClearingandSettlementInstanceReference(String clearingandSettlementInstanceReference) {
    this.clearingandSettlementInstanceReference = clearingandSettlementInstanceReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to an Initiate service call 
   * @return clearingandSettlementInitiateActionReference
  **/

  public String getClearingandSettlementInitiateActionReference() {
    return clearingandSettlementInitiateActionReference;
  }

  public void setClearingandSettlementInitiateActionReference(String clearingandSettlementInitiateActionReference) {
    this.clearingandSettlementInitiateActionReference = clearingandSettlementInitiateActionReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The Initiate service call input and output record 
   * @return clearingandSettlementInitiateActionRecord
  **/

  public Object getClearingandSettlementInitiateActionRecord() {
    return clearingandSettlementInitiateActionRecord;
  }

  public void setClearingandSettlementInitiateActionRecord(Object clearingandSettlementInitiateActionRecord) {
    this.clearingandSettlementInitiateActionRecord = clearingandSettlementInitiateActionRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The status of the Clearing and Settlement instance (e.g. initialised, pending, active) 
   * @return clearingandSettlementInstanceStatus
  **/

  public String getClearingandSettlementInstanceStatus() {
    return clearingandSettlementInstanceStatus;
  }

  public void setClearingandSettlementInstanceStatus(String clearingandSettlementInstanceStatus) {
    this.clearingandSettlementInstanceStatus = clearingandSettlementInstanceStatus;
  }


  /**
   * Get clearingandSettlementInstanceRecord
   * @return clearingandSettlementInstanceRecord
  **/

  public BQClearingandSettlementInitiateInputModelClearingandSettlementInstanceRecord getClearingandSettlementInstanceRecord() {
    return clearingandSettlementInstanceRecord;
  }

  public void setClearingandSettlementInstanceRecord(BQClearingandSettlementInitiateInputModelClearingandSettlementInstanceRecord clearingandSettlementInstanceRecord) {
    this.clearingandSettlementInstanceRecord = clearingandSettlementInstanceRecord;
  }


}

