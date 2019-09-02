package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQOutboundACHInitiateInputModelOutboundACHInstanceRecord;
import org.bian.dto.BQOutboundACHInitiateOutputModelInboundACHInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQOutboundACHInitiateOutputModel
 */
public class BQOutboundACHInitiateOutputModel   {
  private BQOutboundACHInitiateOutputModelInboundACHInstanceRecord inboundACHInstanceRecord = null;

  private String outboundACHInstanceReference = null;

  private String outboundACHInitiateActionReference = null;

  private Object outboundACHInitiateActionRecord = null;

  private String outboundACHInstanceStatus = null;

  private BQOutboundACHInitiateInputModelOutboundACHInstanceRecord outboundACHInstanceRecord = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Outbound ACH instance 
   * @return outboundACHInstanceReference
  **/

  public String getOutboundACHInstanceReference() {
    return outboundACHInstanceReference;
  }

  public void setOutboundACHInstanceReference(String outboundACHInstanceReference) {
    this.outboundACHInstanceReference = outboundACHInstanceReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to an Initiate service call 
   * @return outboundACHInitiateActionReference
  **/

  public String getOutboundACHInitiateActionReference() {
    return outboundACHInitiateActionReference;
  }

  public void setOutboundACHInitiateActionReference(String outboundACHInitiateActionReference) {
    this.outboundACHInitiateActionReference = outboundACHInitiateActionReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The Initiate service call input and output record 
   * @return outboundACHInitiateActionRecord
  **/

  public Object getOutboundACHInitiateActionRecord() {
    return outboundACHInitiateActionRecord;
  }

  public void setOutboundACHInitiateActionRecord(Object outboundACHInitiateActionRecord) {
    this.outboundACHInitiateActionRecord = outboundACHInitiateActionRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The status of the Outbound ACH instance (e.g. initialised, pending, active) 
   * @return outboundACHInstanceStatus
  **/

  public String getOutboundACHInstanceStatus() {
    return outboundACHInstanceStatus;
  }

  public void setOutboundACHInstanceStatus(String outboundACHInstanceStatus) {
    this.outboundACHInstanceStatus = outboundACHInstanceStatus;
  }


  /**
   * Get outboundACHInstanceRecord
   * @return outboundACHInstanceRecord
  **/

  public BQOutboundACHInitiateInputModelOutboundACHInstanceRecord getOutboundACHInstanceRecord() {
    return outboundACHInstanceRecord;
  }

  public void setOutboundACHInstanceRecord(BQOutboundACHInitiateInputModelOutboundACHInstanceRecord outboundACHInstanceRecord) {
    this.outboundACHInstanceRecord = outboundACHInstanceRecord;
  }


}

