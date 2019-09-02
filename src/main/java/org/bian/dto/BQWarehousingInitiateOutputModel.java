package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQOutboundACHInitiateOutputModelInboundACHInstanceRecord;
import org.bian.dto.BQWarehousingInitiateInputModelOutboundACHInstanceRecord;
import org.bian.dto.BQWarehousingInitiateInputModelWarehousingInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQWarehousingInitiateOutputModel
 */
public class BQWarehousingInitiateOutputModel   {
  private BQOutboundACHInitiateOutputModelInboundACHInstanceRecord inboundACHInstanceRecord = null;

  private BQWarehousingInitiateInputModelOutboundACHInstanceRecord outboundACHInstanceRecord = null;

  private String warehousingInstanceReference = null;

  private String warehousingInitiateActionReference = null;

  private Object warehousingInitiateActionRecord = null;

  private String warehousingInstanceStatus = null;

  private BQWarehousingInitiateInputModelWarehousingInstanceRecord warehousingInstanceRecord = null;


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

  public BQWarehousingInitiateInputModelOutboundACHInstanceRecord getOutboundACHInstanceRecord() {
    return outboundACHInstanceRecord;
  }

  public void setOutboundACHInstanceRecord(BQWarehousingInitiateInputModelOutboundACHInstanceRecord outboundACHInstanceRecord) {
    this.outboundACHInstanceRecord = outboundACHInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Warehousing instance 
   * @return warehousingInstanceReference
  **/

  public String getWarehousingInstanceReference() {
    return warehousingInstanceReference;
  }

  public void setWarehousingInstanceReference(String warehousingInstanceReference) {
    this.warehousingInstanceReference = warehousingInstanceReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to an Initiate service call 
   * @return warehousingInitiateActionReference
  **/

  public String getWarehousingInitiateActionReference() {
    return warehousingInitiateActionReference;
  }

  public void setWarehousingInitiateActionReference(String warehousingInitiateActionReference) {
    this.warehousingInitiateActionReference = warehousingInitiateActionReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The Initiate service call input and output record 
   * @return warehousingInitiateActionRecord
  **/

  public Object getWarehousingInitiateActionRecord() {
    return warehousingInitiateActionRecord;
  }

  public void setWarehousingInitiateActionRecord(Object warehousingInitiateActionRecord) {
    this.warehousingInitiateActionRecord = warehousingInitiateActionRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The status of the Warehousing instance (e.g. initialised, pending, active) 
   * @return warehousingInstanceStatus
  **/

  public String getWarehousingInstanceStatus() {
    return warehousingInstanceStatus;
  }

  public void setWarehousingInstanceStatus(String warehousingInstanceStatus) {
    this.warehousingInstanceStatus = warehousingInstanceStatus;
  }


  /**
   * Get warehousingInstanceRecord
   * @return warehousingInstanceRecord
  **/

  public BQWarehousingInitiateInputModelWarehousingInstanceRecord getWarehousingInstanceRecord() {
    return warehousingInstanceRecord;
  }

  public void setWarehousingInstanceRecord(BQWarehousingInitiateInputModelWarehousingInstanceRecord warehousingInstanceRecord) {
    this.warehousingInstanceRecord = warehousingInstanceRecord;
  }


}

