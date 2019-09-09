package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRACHFulfillmentOperatingSessionUpdateOutputModelACHFulfillmentOperatingSessionInstanceRecord;

import javax.validation.Valid;
  
/**
 * CRACHFulfillmentOperatingSessionUpdateOutputModel
 */
public class CRACHFulfillmentOperatingSessionUpdateOutputModel   {
  private CRACHFulfillmentOperatingSessionUpdateOutputModelACHFulfillmentOperatingSessionInstanceRecord aCHFulfillmentOperatingSessionInstanceRecord = null;

  private String aCHFulfillmentOperatingSessionUpdateActionTaskReference = null;

  private Object aCHFulfillmentOperatingSessionUpdateActionTaskRecord = null;

  private Object updateResponseRecord = null;


  /**
   * Get aCHFulfillmentOperatingSessionInstanceRecord
   * @return aCHFulfillmentOperatingSessionInstanceRecord
  **/

  @JsonProperty("aCHFulfillmentOperatingSessionInstanceRecord")
  public CRACHFulfillmentOperatingSessionUpdateOutputModelACHFulfillmentOperatingSessionInstanceRecord getACHFulfillmentOperatingSessionInstanceRecord() {
    return aCHFulfillmentOperatingSessionInstanceRecord;
  }

  public void setACHFulfillmentOperatingSessionInstanceRecord(CRACHFulfillmentOperatingSessionUpdateOutputModelACHFulfillmentOperatingSessionInstanceRecord aCHFulfillmentOperatingSessionInstanceRecord) {
    this.aCHFulfillmentOperatingSessionInstanceRecord = aCHFulfillmentOperatingSessionInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to an update service call 
   * @return aCHFulfillmentOperatingSessionUpdateActionTaskReference
  **/

  @JsonProperty("aCHFulfillmentOperatingSessionUpdateActionTaskReference")
  public String getACHFulfillmentOperatingSessionUpdateActionTaskReference() {
    return aCHFulfillmentOperatingSessionUpdateActionTaskReference;
  }

  public void setACHFulfillmentOperatingSessionUpdateActionTaskReference(String aCHFulfillmentOperatingSessionUpdateActionTaskReference) {
    this.aCHFulfillmentOperatingSessionUpdateActionTaskReference = aCHFulfillmentOperatingSessionUpdateActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The update service call consolidated processing record 
   * @return aCHFulfillmentOperatingSessionUpdateActionTaskRecord
  **/

  @JsonProperty("aCHFulfillmentOperatingSessionUpdateActionTaskRecord")
  public Object getACHFulfillmentOperatingSessionUpdateActionTaskRecord() {
    return aCHFulfillmentOperatingSessionUpdateActionTaskRecord;
  }

  public void setACHFulfillmentOperatingSessionUpdateActionTaskRecord(Object aCHFulfillmentOperatingSessionUpdateActionTaskRecord) {
    this.aCHFulfillmentOperatingSessionUpdateActionTaskRecord = aCHFulfillmentOperatingSessionUpdateActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: Details of the Update action service response 
   * @return updateResponseRecord
  **/

  public Object getUpdateResponseRecord() {
    return updateResponseRecord;
  }

  public void setUpdateResponseRecord(Object updateResponseRecord) {
    this.updateResponseRecord = updateResponseRecord;
  }


}

