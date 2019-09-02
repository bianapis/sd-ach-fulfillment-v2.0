package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQInboundACHUpdateInputModelInboundACHInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQInboundACHUpdateInputModel
 */
public class BQInboundACHUpdateInputModel   {
  private String aCHFulfillmentOperatingSessionInstanceReference = null;

  private String inboundACHInstanceReference = null;

  private BQInboundACHUpdateInputModelInboundACHInstanceRecord inboundACHInstanceRecord = null;

  private Object inboundACHUpdateActionTaskRecord = null;

  private String inboundACHUpdateActionRequest = null;


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
   * Get inboundACHInstanceRecord
   * @return inboundACHInstanceRecord
  **/

  public BQInboundACHUpdateInputModelInboundACHInstanceRecord getInboundACHInstanceRecord() {
    return inboundACHInstanceRecord;
  }

  public void setInboundACHInstanceRecord(BQInboundACHUpdateInputModelInboundACHInstanceRecord inboundACHInstanceRecord) {
    this.inboundACHInstanceRecord = inboundACHInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The update service call consolidated processing record 
   * @return inboundACHUpdateActionTaskRecord
  **/

  public Object getInboundACHUpdateActionTaskRecord() {
    return inboundACHUpdateActionTaskRecord;
  }

  public void setInboundACHUpdateActionTaskRecord(Object inboundACHUpdateActionTaskRecord) {
    this.inboundACHUpdateActionTaskRecord = inboundACHUpdateActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the update action service request 
   * @return inboundACHUpdateActionRequest
  **/

  public String getInboundACHUpdateActionRequest() {
    return inboundACHUpdateActionRequest;
  }

  public void setInboundACHUpdateActionRequest(String inboundACHUpdateActionRequest) {
    this.inboundACHUpdateActionRequest = inboundACHUpdateActionRequest;
  }


}

