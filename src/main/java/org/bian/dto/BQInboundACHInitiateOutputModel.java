package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQInboundACHInitiateOutputModelInboundACHInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQInboundACHInitiateOutputModel
 */
public class BQInboundACHInitiateOutputModel   {
  private String inboundACHInstanceReference = null;

  private String inboundACHInitiateActionReference = null;

  private Object inboundACHInitiateActionRecord = null;

  private String inboundACHInstanceStatus = null;

  private BQInboundACHInitiateOutputModelInboundACHInstanceRecord inboundACHInstanceRecord = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Inbound ACH instance 
   * @return inboundACHInstanceReference
  **/

  public String getInboundACHInstanceReference() {
    return inboundACHInstanceReference;
  }

  public void setInboundACHInstanceReference(String inboundACHInstanceReference) {
    this.inboundACHInstanceReference = inboundACHInstanceReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to an Initiate service call 
   * @return inboundACHInitiateActionReference
  **/

  public String getInboundACHInitiateActionReference() {
    return inboundACHInitiateActionReference;
  }

  public void setInboundACHInitiateActionReference(String inboundACHInitiateActionReference) {
    this.inboundACHInitiateActionReference = inboundACHInitiateActionReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The Initiate service call input and output record 
   * @return inboundACHInitiateActionRecord
  **/

  public Object getInboundACHInitiateActionRecord() {
    return inboundACHInitiateActionRecord;
  }

  public void setInboundACHInitiateActionRecord(Object inboundACHInitiateActionRecord) {
    this.inboundACHInitiateActionRecord = inboundACHInitiateActionRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The status of the Inbound ACH instance (e.g. initialised, pending, active) 
   * @return inboundACHInstanceStatus
  **/

  public String getInboundACHInstanceStatus() {
    return inboundACHInstanceStatus;
  }

  public void setInboundACHInstanceStatus(String inboundACHInstanceStatus) {
    this.inboundACHInstanceStatus = inboundACHInstanceStatus;
  }


  /**
   * Get inboundACHInstanceRecord
   * @return inboundACHInstanceRecord
  **/

  public BQInboundACHInitiateOutputModelInboundACHInstanceRecord getInboundACHInstanceRecord() {
    return inboundACHInstanceRecord;
  }

  public void setInboundACHInstanceRecord(BQInboundACHInitiateOutputModelInboundACHInstanceRecord inboundACHInstanceRecord) {
    this.inboundACHInstanceRecord = inboundACHInstanceRecord;
  }


}

