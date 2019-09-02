package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQReconciliationInitiateInputModelReconciliationInstanceRecord;
import org.bian.dto.BQReconciliationUpdateInputModelClearingandSettlementInstanceRecord;
import org.bian.dto.BQReconciliationUpdateInputModelInboundACHInstanceRecord;
import org.bian.dto.BQReconciliationUpdateInputModelOutboundACHInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQReconciliationUpdateInputModel
 */
public class BQReconciliationUpdateInputModel   {
  private BQReconciliationUpdateInputModelInboundACHInstanceRecord inboundACHInstanceRecord = null;

  private BQReconciliationUpdateInputModelOutboundACHInstanceRecord outboundACHInstanceRecord = null;

  private BQReconciliationUpdateInputModelClearingandSettlementInstanceRecord clearingandSettlementInstanceRecord = null;

  private String aCHFulfillmentOperatingSessionInstanceReference = null;

  private String reconciliationInstanceReference = null;

  private BQReconciliationInitiateInputModelReconciliationInstanceRecord reconciliationInstanceRecord = null;

  private Object reconciliationUpdateActionTaskRecord = null;

  private String reconciliationUpdateActionRequest = null;


  /**
   * Get inboundACHInstanceRecord
   * @return inboundACHInstanceRecord
  **/

  public BQReconciliationUpdateInputModelInboundACHInstanceRecord getInboundACHInstanceRecord() {
    return inboundACHInstanceRecord;
  }

  public void setInboundACHInstanceRecord(BQReconciliationUpdateInputModelInboundACHInstanceRecord inboundACHInstanceRecord) {
    this.inboundACHInstanceRecord = inboundACHInstanceRecord;
  }


  /**
   * Get outboundACHInstanceRecord
   * @return outboundACHInstanceRecord
  **/

  public BQReconciliationUpdateInputModelOutboundACHInstanceRecord getOutboundACHInstanceRecord() {
    return outboundACHInstanceRecord;
  }

  public void setOutboundACHInstanceRecord(BQReconciliationUpdateInputModelOutboundACHInstanceRecord outboundACHInstanceRecord) {
    this.outboundACHInstanceRecord = outboundACHInstanceRecord;
  }


  /**
   * Get clearingandSettlementInstanceRecord
   * @return clearingandSettlementInstanceRecord
  **/

  public BQReconciliationUpdateInputModelClearingandSettlementInstanceRecord getClearingandSettlementInstanceRecord() {
    return clearingandSettlementInstanceRecord;
  }

  public void setClearingandSettlementInstanceRecord(BQReconciliationUpdateInputModelClearingandSettlementInstanceRecord clearingandSettlementInstanceRecord) {
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Reconciliation instance 
   * @return reconciliationInstanceReference
  **/

  public String getReconciliationInstanceReference() {
    return reconciliationInstanceReference;
  }

  public void setReconciliationInstanceReference(String reconciliationInstanceReference) {
    this.reconciliationInstanceReference = reconciliationInstanceReference;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The update service call consolidated processing record 
   * @return reconciliationUpdateActionTaskRecord
  **/

  public Object getReconciliationUpdateActionTaskRecord() {
    return reconciliationUpdateActionTaskRecord;
  }

  public void setReconciliationUpdateActionTaskRecord(Object reconciliationUpdateActionTaskRecord) {
    this.reconciliationUpdateActionTaskRecord = reconciliationUpdateActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the update action service request 
   * @return reconciliationUpdateActionRequest
  **/

  public String getReconciliationUpdateActionRequest() {
    return reconciliationUpdateActionRequest;
  }

  public void setReconciliationUpdateActionRequest(String reconciliationUpdateActionRequest) {
    this.reconciliationUpdateActionRequest = reconciliationUpdateActionRequest;
  }


}

