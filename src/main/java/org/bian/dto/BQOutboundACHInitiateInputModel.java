package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQOutboundACHInitiateInputModelInboundACHInstanceRecord;
import org.bian.dto.BQOutboundACHInitiateInputModelOutboundACHInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQOutboundACHInitiateInputModel
 */
public class BQOutboundACHInitiateInputModel   {
  private BQOutboundACHInitiateInputModelInboundACHInstanceRecord inboundACHInstanceRecord = null;

  private String aCHFulfillmentOperatingSessionInstanceReference = null;

  private Object outboundACHInitiateActionRecord = null;

  private BQOutboundACHInitiateInputModelOutboundACHInstanceRecord outboundACHInstanceRecord = null;


  /**
   * Get inboundACHInstanceRecord
   * @return inboundACHInstanceRecord
  **/

  public BQOutboundACHInitiateInputModelInboundACHInstanceRecord getInboundACHInstanceRecord() {
    return inboundACHInstanceRecord;
  }

  public void setInboundACHInstanceRecord(BQOutboundACHInitiateInputModelInboundACHInstanceRecord inboundACHInstanceRecord) {
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

