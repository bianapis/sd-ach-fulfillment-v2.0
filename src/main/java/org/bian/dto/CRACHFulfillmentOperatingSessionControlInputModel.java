package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRACHFulfillmentOperatingSessionControlInputModelACHFulfillmentOperatingSessionControlActionRequest;

import javax.validation.Valid;
  
/**
 * CRACHFulfillmentOperatingSessionControlInputModel
 */
public class CRACHFulfillmentOperatingSessionControlInputModel   {
  private String aCHFulfillmentServicingSessionReference = null;

  private String aCHFulfillmentOperatingSessionInstanceReference = null;

  private Object aCHFulfillmentOperatingSessionControlActionTaskRecord = null;

  private CRACHFulfillmentOperatingSessionControlInputModelACHFulfillmentOperatingSessionControlActionRequest aCHFulfillmentOperatingSessionControlActionRequest = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the active servicing session 
   * @return aCHFulfillmentServicingSessionReference
  **/

  public String getACHFulfillmentServicingSessionReference() {
    return aCHFulfillmentServicingSessionReference;
  }

  public void setACHFulfillmentServicingSessionReference(String aCHFulfillmentServicingSessionReference) {
    this.aCHFulfillmentServicingSessionReference = aCHFulfillmentServicingSessionReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the ACH Fulfillment Operating Session instance 
   * @return aCHFulfillmentOperatingSessionInstanceReference
  **/

  public String getACHFulfillmentOperatingSessionInstanceReference() {
    return aCHFulfillmentOperatingSessionInstanceReference;
  }

  public void setACHFulfillmentOperatingSessionInstanceReference(String aCHFulfillmentOperatingSessionInstanceReference) {
    this.aCHFulfillmentOperatingSessionInstanceReference = aCHFulfillmentOperatingSessionInstanceReference;
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
   * Get aCHFulfillmentOperatingSessionControlActionRequest
   * @return aCHFulfillmentOperatingSessionControlActionRequest
  **/

  public CRACHFulfillmentOperatingSessionControlInputModelACHFulfillmentOperatingSessionControlActionRequest getACHFulfillmentOperatingSessionControlActionRequest() {
    return aCHFulfillmentOperatingSessionControlActionRequest;
  }

  public void setACHFulfillmentOperatingSessionControlActionRequest(CRACHFulfillmentOperatingSessionControlInputModelACHFulfillmentOperatingSessionControlActionRequest aCHFulfillmentOperatingSessionControlActionRequest) {
    this.aCHFulfillmentOperatingSessionControlActionRequest = aCHFulfillmentOperatingSessionControlActionRequest;
  }


}

