package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQClearingandSettlementInitiateInputModelClearingandSettlementInstanceRecord;
import org.bian.dto.BQClearingandSettlementInitiateInputModelInboundACHInstanceRecord;
import org.bian.dto.BQClearingandSettlementInitiateInputModelOutboundACHInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQClearingandSettlementInitiateInputModel
 */
public class BQClearingandSettlementInitiateInputModel   {
  private BQClearingandSettlementInitiateInputModelInboundACHInstanceRecord inboundACHInstanceRecord = null;

  private BQClearingandSettlementInitiateInputModelOutboundACHInstanceRecord outboundACHInstanceRecord = null;

  private String aCHFulfillmentOperatingSessionInstanceReference = null;

  private Object clearingandSettlementInitiateActionRecord = null;

  private BQClearingandSettlementInitiateInputModelClearingandSettlementInstanceRecord clearingandSettlementInstanceRecord = null;


  /**
   * Get inboundACHInstanceRecord
   * @return inboundACHInstanceRecord
  **/

  public BQClearingandSettlementInitiateInputModelInboundACHInstanceRecord getInboundACHInstanceRecord() {
    return inboundACHInstanceRecord;
  }

  public void setInboundACHInstanceRecord(BQClearingandSettlementInitiateInputModelInboundACHInstanceRecord inboundACHInstanceRecord) {
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the parent ACH Fulfillment Operating Session instance 
   * @return aCHFulfillmentOperatingSessionInstanceReference
  **/

  public String getACHFulfillmentOperatingSessionInstanceReference() {
    return aCHFulfillmentOperatingSessionInstanceReference;
  }

  public void setACHFulfillmentOperatingSessionInstanceReference(String aCHFulfillmentOperatingSessionInstanceReference) {
    this.aCHFulfillmentOperatingSessionInstanceReference = aCHFulfillmentOperatingSessionInstanceReference;
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

