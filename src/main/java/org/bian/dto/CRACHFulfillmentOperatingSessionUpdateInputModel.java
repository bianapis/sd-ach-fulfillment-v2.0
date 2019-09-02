package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRACHFulfillmentOperatingSessionUpdateInputModelACHFulfillmentOperatingSessionInstanceRecord;

import javax.validation.Valid;
  
/**
 * CRACHFulfillmentOperatingSessionUpdateInputModel
 */
public class CRACHFulfillmentOperatingSessionUpdateInputModel   {
  private String aCHFulfillmentServicingSessionReference = null;

  private String aCHFulfillmentOperatingSessionInstanceReference = null;

  private CRACHFulfillmentOperatingSessionUpdateInputModelACHFulfillmentOperatingSessionInstanceRecord aCHFulfillmentOperatingSessionInstanceRecord = null;

  private Object aCHFulfillmentOperatingSessionUpdateActionTaskRecord = null;

  private String updateActionRequest = null;


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
   * Get aCHFulfillmentOperatingSessionInstanceRecord
   * @return aCHFulfillmentOperatingSessionInstanceRecord
  **/

  public CRACHFulfillmentOperatingSessionUpdateInputModelACHFulfillmentOperatingSessionInstanceRecord getACHFulfillmentOperatingSessionInstanceRecord() {
    return aCHFulfillmentOperatingSessionInstanceRecord;
  }

  public void setACHFulfillmentOperatingSessionInstanceRecord(CRACHFulfillmentOperatingSessionUpdateInputModelACHFulfillmentOperatingSessionInstanceRecord aCHFulfillmentOperatingSessionInstanceRecord) {
    this.aCHFulfillmentOperatingSessionInstanceRecord = aCHFulfillmentOperatingSessionInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The update service call consolidated processing record 
   * @return aCHFulfillmentOperatingSessionUpdateActionTaskRecord
  **/

  public Object getACHFulfillmentOperatingSessionUpdateActionTaskRecord() {
    return aCHFulfillmentOperatingSessionUpdateActionTaskRecord;
  }

  public void setACHFulfillmentOperatingSessionUpdateActionTaskRecord(Object aCHFulfillmentOperatingSessionUpdateActionTaskRecord) {
    this.aCHFulfillmentOperatingSessionUpdateActionTaskRecord = aCHFulfillmentOperatingSessionUpdateActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the update action service request 
   * @return updateActionRequest
  **/

  public String getUpdateActionRequest() {
    return updateActionRequest;
  }

  public void setUpdateActionRequest(String updateActionRequest) {
    this.updateActionRequest = updateActionRequest;
  }


}

