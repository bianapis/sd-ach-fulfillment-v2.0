package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRACHFulfillmentOperatingSessionControlOutputModel
 */
public class CRACHFulfillmentOperatingSessionControlOutputModel   {
  private String aCHFulfillmentOperatingSessionControlActionTaskReference = null;

  private Object aCHFulfillmentOperatingSessionControlActionTaskRecord = null;

  private String aCHFulfillmentOperatingSessionControlActionResponse = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a ACH Fulfillment Operating Session instance control processing service call 
   * @return aCHFulfillmentOperatingSessionControlActionTaskReference
  **/

  public String getACHFulfillmentOperatingSessionControlActionTaskReference() {
    return aCHFulfillmentOperatingSessionControlActionTaskReference;
  }

  public void setACHFulfillmentOperatingSessionControlActionTaskReference(String aCHFulfillmentOperatingSessionControlActionTaskReference) {
    this.aCHFulfillmentOperatingSessionControlActionTaskReference = aCHFulfillmentOperatingSessionControlActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The processing control service call consolidated processing record 
   * @return aCHFulfillmentOperatingSessionControlActionTaskRecord
  **/

  public Object getACHFulfillmentOperatingSessionControlActionTaskRecord() {
    return aCHFulfillmentOperatingSessionControlActionTaskRecord;
  }

  public void setACHFulfillmentOperatingSessionControlActionTaskRecord(Object aCHFulfillmentOperatingSessionControlActionTaskRecord) {
    this.aCHFulfillmentOperatingSessionControlActionTaskRecord = aCHFulfillmentOperatingSessionControlActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the control action service response 
   * @return aCHFulfillmentOperatingSessionControlActionResponse
  **/

  public String getACHFulfillmentOperatingSessionControlActionResponse() {
    return aCHFulfillmentOperatingSessionControlActionResponse;
  }

  public void setACHFulfillmentOperatingSessionControlActionResponse(String aCHFulfillmentOperatingSessionControlActionResponse) {
    this.aCHFulfillmentOperatingSessionControlActionResponse = aCHFulfillmentOperatingSessionControlActionResponse;
  }


}

