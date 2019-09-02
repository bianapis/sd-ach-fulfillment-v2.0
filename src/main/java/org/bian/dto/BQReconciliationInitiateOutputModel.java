package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQOutboundACHInitiateOutputModelInboundACHInstanceRecord;
import org.bian.dto.BQReconciliationInitiateInputModelOutboundACHInstanceRecord;
import org.bian.dto.BQReconciliationInitiateInputModelReconciliationInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQReconciliationInitiateOutputModel
 */
public class BQReconciliationInitiateOutputModel   {
  private BQOutboundACHInitiateOutputModelInboundACHInstanceRecord inboundACHInstanceRecord = null;

  private BQReconciliationInitiateInputModelOutboundACHInstanceRecord outboundACHInstanceRecord = null;

  private String reconciliationInstanceReference = null;

  private String reconciliationInitiateActionReference = null;

  private Object reconciliationInitiateActionRecord = null;

  private String reconciliationInstanceStatus = null;

  private BQReconciliationInitiateInputModelReconciliationInstanceRecord reconciliationInstanceRecord = null;


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

  public BQReconciliationInitiateInputModelOutboundACHInstanceRecord getOutboundACHInstanceRecord() {
    return outboundACHInstanceRecord;
  }

  public void setOutboundACHInstanceRecord(BQReconciliationInitiateInputModelOutboundACHInstanceRecord outboundACHInstanceRecord) {
    this.outboundACHInstanceRecord = outboundACHInstanceRecord;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to an Initiate service call 
   * @return reconciliationInitiateActionReference
  **/

  public String getReconciliationInitiateActionReference() {
    return reconciliationInitiateActionReference;
  }

  public void setReconciliationInitiateActionReference(String reconciliationInitiateActionReference) {
    this.reconciliationInitiateActionReference = reconciliationInitiateActionReference;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The status of the Reconciliation instance (e.g. initialised, pending, active) 
   * @return reconciliationInstanceStatus
  **/

  public String getReconciliationInstanceStatus() {
    return reconciliationInstanceStatus;
  }

  public void setReconciliationInstanceStatus(String reconciliationInstanceStatus) {
    this.reconciliationInstanceStatus = reconciliationInstanceStatus;
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

