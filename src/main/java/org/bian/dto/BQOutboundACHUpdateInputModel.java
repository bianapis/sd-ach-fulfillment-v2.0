package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQOutboundACHUpdateInputModelInboundACHInstanceRecord;
import org.bian.dto.BQOutboundACHUpdateInputModelOutboundACHInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQOutboundACHUpdateInputModel
 */
public class BQOutboundACHUpdateInputModel   {
  private BQOutboundACHUpdateInputModelInboundACHInstanceRecord inboundACHInstanceRecord = null;

  private String aCHFulfillmentOperatingSessionInstanceReference = null;

  private String outboundACHInstanceReference = null;

  private BQOutboundACHUpdateInputModelOutboundACHInstanceRecord outboundACHInstanceRecord = null;

  private Object outboundACHUpdateActionTaskRecord = null;

  private String outboundACHUpdateActionRequest = null;


  /**
   * Get inboundACHInstanceRecord
   * @return inboundACHInstanceRecord
  **/

  public BQOutboundACHUpdateInputModelInboundACHInstanceRecord getInboundACHInstanceRecord() {
    return inboundACHInstanceRecord;
  }

  public void setInboundACHInstanceRecord(BQOutboundACHUpdateInputModelInboundACHInstanceRecord inboundACHInstanceRecord) {
    this.inboundACHInstanceRecord = inboundACHInstanceRecord;
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
   * Get outboundACHInstanceRecord
   * @return outboundACHInstanceRecord
  **/

  public BQOutboundACHUpdateInputModelOutboundACHInstanceRecord getOutboundACHInstanceRecord() {
    return outboundACHInstanceRecord;
  }

  public void setOutboundACHInstanceRecord(BQOutboundACHUpdateInputModelOutboundACHInstanceRecord outboundACHInstanceRecord) {
    this.outboundACHInstanceRecord = outboundACHInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The update service call consolidated processing record 
   * @return outboundACHUpdateActionTaskRecord
  **/

  public Object getOutboundACHUpdateActionTaskRecord() {
    return outboundACHUpdateActionTaskRecord;
  }

  public void setOutboundACHUpdateActionTaskRecord(Object outboundACHUpdateActionTaskRecord) {
    this.outboundACHUpdateActionTaskRecord = outboundACHUpdateActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the update action service request 
   * @return outboundACHUpdateActionRequest
  **/

  public String getOutboundACHUpdateActionRequest() {
    return outboundACHUpdateActionRequest;
  }

  public void setOutboundACHUpdateActionRequest(String outboundACHUpdateActionRequest) {
    this.outboundACHUpdateActionRequest = outboundACHUpdateActionRequest;
  }


}

