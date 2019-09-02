package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQWarehousingInitiateInputModelWarehousingInstanceRecord;
import org.bian.dto.BQWarehousingUpdateInputModelInboundACHInstanceRecord;
import org.bian.dto.BQWarehousingUpdateInputModelOutboundACHInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQWarehousingUpdateInputModel
 */
public class BQWarehousingUpdateInputModel   {
  private BQWarehousingUpdateInputModelInboundACHInstanceRecord inboundACHInstanceRecord = null;

  private BQWarehousingUpdateInputModelOutboundACHInstanceRecord outboundACHInstanceRecord = null;

  private String aCHFulfillmentOperatingSessionInstanceReference = null;

  private String warehousingInstanceReference = null;

  private BQWarehousingInitiateInputModelWarehousingInstanceRecord warehousingInstanceRecord = null;

  private Object warehousingUpdateActionTaskRecord = null;

  private String warehousingUpdateActionRequest = null;


  /**
   * Get inboundACHInstanceRecord
   * @return inboundACHInstanceRecord
  **/

  public BQWarehousingUpdateInputModelInboundACHInstanceRecord getInboundACHInstanceRecord() {
    return inboundACHInstanceRecord;
  }

  public void setInboundACHInstanceRecord(BQWarehousingUpdateInputModelInboundACHInstanceRecord inboundACHInstanceRecord) {
    this.inboundACHInstanceRecord = inboundACHInstanceRecord;
  }


  /**
   * Get outboundACHInstanceRecord
   * @return outboundACHInstanceRecord
  **/

  public BQWarehousingUpdateInputModelOutboundACHInstanceRecord getOutboundACHInstanceRecord() {
    return outboundACHInstanceRecord;
  }

  public void setOutboundACHInstanceRecord(BQWarehousingUpdateInputModelOutboundACHInstanceRecord outboundACHInstanceRecord) {
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
   * Get warehousingInstanceRecord
   * @return warehousingInstanceRecord
  **/

  public BQWarehousingInitiateInputModelWarehousingInstanceRecord getWarehousingInstanceRecord() {
    return warehousingInstanceRecord;
  }

  public void setWarehousingInstanceRecord(BQWarehousingInitiateInputModelWarehousingInstanceRecord warehousingInstanceRecord) {
    this.warehousingInstanceRecord = warehousingInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The update service call consolidated processing record 
   * @return warehousingUpdateActionTaskRecord
  **/

  public Object getWarehousingUpdateActionTaskRecord() {
    return warehousingUpdateActionTaskRecord;
  }

  public void setWarehousingUpdateActionTaskRecord(Object warehousingUpdateActionTaskRecord) {
    this.warehousingUpdateActionTaskRecord = warehousingUpdateActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the update action service request 
   * @return warehousingUpdateActionRequest
  **/

  public String getWarehousingUpdateActionRequest() {
    return warehousingUpdateActionRequest;
  }

  public void setWarehousingUpdateActionRequest(String warehousingUpdateActionRequest) {
    this.warehousingUpdateActionRequest = warehousingUpdateActionRequest;
  }


}

