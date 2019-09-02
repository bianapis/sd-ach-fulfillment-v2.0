package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQWarehousingInitiateInputModelInboundACHInstanceRecord;
import org.bian.dto.BQWarehousingInitiateInputModelOutboundACHInstanceRecord;
import org.bian.dto.BQWarehousingInitiateInputModelWarehousingInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQWarehousingInitiateInputModel
 */
public class BQWarehousingInitiateInputModel   {
  private BQWarehousingInitiateInputModelInboundACHInstanceRecord inboundACHInstanceRecord = null;

  private BQWarehousingInitiateInputModelOutboundACHInstanceRecord outboundACHInstanceRecord = null;

  private String aCHFulfillmentOperatingSessionInstanceReference = null;

  private Object warehousingInitiateActionRecord = null;

  private BQWarehousingInitiateInputModelWarehousingInstanceRecord warehousingInstanceRecord = null;


  /**
   * Get inboundACHInstanceRecord
   * @return inboundACHInstanceRecord
  **/

  public BQWarehousingInitiateInputModelInboundACHInstanceRecord getInboundACHInstanceRecord() {
    return inboundACHInstanceRecord;
  }

  public void setInboundACHInstanceRecord(BQWarehousingInitiateInputModelInboundACHInstanceRecord inboundACHInstanceRecord) {
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
   * @return warehousingInitiateActionRecord
  **/

  public Object getWarehousingInitiateActionRecord() {
    return warehousingInitiateActionRecord;
  }

  public void setWarehousingInitiateActionRecord(Object warehousingInitiateActionRecord) {
    this.warehousingInitiateActionRecord = warehousingInitiateActionRecord;
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

