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
 * BQReconciliationUpdateOutputModel
 */
public class BQReconciliationUpdateOutputModel   {
  private BQReconciliationUpdateInputModelInboundACHInstanceRecord inboundACHInstanceRecord = null;

  private BQReconciliationUpdateInputModelOutboundACHInstanceRecord outboundACHInstanceRecord = null;

  private BQReconciliationUpdateInputModelClearingandSettlementInstanceRecord clearingandSettlementInstanceRecord = null;

  private BQReconciliationInitiateInputModelReconciliationInstanceRecord reconciliationInstanceRecord = null;

  private String reconciliationUpdateActionTaskReference = null;

  private Object reconciliationUpdateActionTaskRecord = null;

  private Object updateResponseRecord = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to an update service call 
   * @return reconciliationUpdateActionTaskReference
  **/

  public String getReconciliationUpdateActionTaskReference() {
    return reconciliationUpdateActionTaskReference;
  }

  public void setReconciliationUpdateActionTaskReference(String reconciliationUpdateActionTaskReference) {
    this.reconciliationUpdateActionTaskReference = reconciliationUpdateActionTaskReference;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: Details of the Update action service response 
   * @return updateResponseRecord
  **/

  public Object getUpdateResponseRecord() {
    return updateResponseRecord;
  }

  public void setUpdateResponseRecord(Object updateResponseRecord) {
    this.updateResponseRecord = updateResponseRecord;
  }


}

