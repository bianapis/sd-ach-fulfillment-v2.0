package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRACHFulfillmentOperatingSessionInitiateInputModelACHFulfillmentOperatingSessionInstanceRecord;

import javax.validation.Valid;
  
/**
 * CRACHFulfillmentOperatingSessionInitiateInputModel
 */
public class CRACHFulfillmentOperatingSessionInitiateInputModel   {
  private String aCHFulfillmentServicingSessionReference = null;

  private Object aCHFulfillmentOperatingSessionInitiateActionRecord = null;

  private String aCHFulfillmentOperatingSessionInstanceStatus = null;

  private CRACHFulfillmentOperatingSessionInitiateInputModelACHFulfillmentOperatingSessionInstanceRecord aCHFulfillmentOperatingSessionInstanceRecord = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The Initiate service call input and output record 
   * @return aCHFulfillmentOperatingSessionInitiateActionRecord
  **/

  public Object getACHFulfillmentOperatingSessionInitiateActionRecord() {
    return aCHFulfillmentOperatingSessionInitiateActionRecord;
  }

  public void setACHFulfillmentOperatingSessionInitiateActionRecord(Object aCHFulfillmentOperatingSessionInitiateActionRecord) {
    this.aCHFulfillmentOperatingSessionInitiateActionRecord = aCHFulfillmentOperatingSessionInitiateActionRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The status of the ACH Fulfillment Operating Session instance (e.g. initialised, pending, active) 
   * @return aCHFulfillmentOperatingSessionInstanceStatus
  **/

  public String getACHFulfillmentOperatingSessionInstanceStatus() {
    return aCHFulfillmentOperatingSessionInstanceStatus;
  }

  public void setACHFulfillmentOperatingSessionInstanceStatus(String aCHFulfillmentOperatingSessionInstanceStatus) {
    this.aCHFulfillmentOperatingSessionInstanceStatus = aCHFulfillmentOperatingSessionInstanceStatus;
  }


  /**
   * Get aCHFulfillmentOperatingSessionInstanceRecord
   * @return aCHFulfillmentOperatingSessionInstanceRecord
  **/

  public CRACHFulfillmentOperatingSessionInitiateInputModelACHFulfillmentOperatingSessionInstanceRecord getACHFulfillmentOperatingSessionInstanceRecord() {
    return aCHFulfillmentOperatingSessionInstanceRecord;
  }

  public void setACHFulfillmentOperatingSessionInstanceRecord(CRACHFulfillmentOperatingSessionInitiateInputModelACHFulfillmentOperatingSessionInstanceRecord aCHFulfillmentOperatingSessionInstanceRecord) {
    this.aCHFulfillmentOperatingSessionInstanceRecord = aCHFulfillmentOperatingSessionInstanceRecord;
  }


}

