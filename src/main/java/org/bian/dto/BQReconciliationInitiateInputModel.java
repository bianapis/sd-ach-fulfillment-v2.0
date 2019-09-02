package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQReconciliationInitiateInputModelClearingandSettlementInstanceRecord;
import org.bian.dto.BQReconciliationInitiateInputModelInboundACHInstanceRecord;
import org.bian.dto.BQReconciliationInitiateInputModelOutboundACHInstanceRecord;
import org.bian.dto.BQReconciliationInitiateInputModelReconciliationInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQReconciliationInitiateInputModel
 */
public class BQReconciliationInitiateInputModel   {
  private BQReconciliationInitiateInputModelInboundACHInstanceRecord inboundACHInstanceRecord = null;

  private BQReconciliationInitiateInputModelOutboundACHInstanceRecord outboundACHInstanceRecord = null;

  private BQReconciliationInitiateInputModelClearingandSettlementInstanceRecord clearingandSettlementInstanceRecord = null;

  private String aCHFulfillmentOperatingSessionInstanceReference = null;

  private Object reconciliationInitiateActionRecord = null;

  private BQReconciliationInitiateInputModelReconciliationInstanceRecord reconciliationInstanceRecord = null;


  /**
   * Get inboundACHInstanceRecord
   * @return inboundACHInstanceRecord
  **/

  public BQReconciliationInitiateInputModelInboundACHInstanceRecord getInboundACHInstanceRecord() {
    return inboundACHInstanceRecord;
  }

  public void setInboundACHInstanceRecord(BQReconciliationInitiateInputModelInboundACHInstanceRecord inboundACHInstanceRecord) {
    this.inboundACHInstanceRecord = inboundACHInstanceRecord;
  }


  /**
   * Get outboundACHInstanceRecord
   * @return outboundACHInstanceRecord
  **/

  public BQReconciliationInitiateInputModelOutboundACHInstanceRecord getOutboundACHInstanceRecord() {
    return outboundACHInstanceRecord;
  }

  public void setOutboundACHInstanceRecord(BQReconciliationInitiateInputModelOutboundACHInstanceRecord outboundACHInstanceRecord) {
    this.outboundACHInstanceRecord = outboundACHInstanceRecord;
  }


  /**
   * Get clearingandSettlementInstanceRecord
   * @return clearingandSettlementInstanceRecord
  **/

  public BQReconciliationInitiateInputModelClearingandSettlementInstanceRecord getClearingandSettlementInstanceRecord() {
    return clearingandSettlementInstanceRecord;
  }

  public void setClearingandSettlementInstanceRecord(BQReconciliationInitiateInputModelClearingandSettlementInstanceRecord clearingandSettlementInstanceRecord) {
    this.clearingandSettlementInstanceRecord = clearingandSettlementInstanceRecord;
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
   * @return reconciliationInitiateActionRecord
  **/

  public Object getReconciliationInitiateActionRecord() {
    return reconciliationInitiateActionRecord;
  }

  public void setReconciliationInitiateActionRecord(Object reconciliationInitiateActionRecord) {
    this.reconciliationInitiateActionRecord = reconciliationInitiateActionRecord;
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


}

