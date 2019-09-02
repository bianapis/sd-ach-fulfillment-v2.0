package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQInboundACHUpdateInputModelInboundACHInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQInboundACHUpdateOutputModel
 */
public class BQInboundACHUpdateOutputModel   {
  private BQInboundACHUpdateInputModelInboundACHInstanceRecord inboundACHInstanceRecord = null;

  private String inboundACHUpdateActionTaskReference = null;

  private Object inboundACHUpdateActionTaskRecord = null;

  private Object updateResponseRecord = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to an update service call 
   * @return inboundACHUpdateActionTaskReference
  **/

  public String getInboundACHUpdateActionTaskReference() {
    return inboundACHUpdateActionTaskReference;
  }

  public void setInboundACHUpdateActionTaskReference(String inboundACHUpdateActionTaskReference) {
    this.inboundACHUpdateActionTaskReference = inboundACHUpdateActionTaskReference;
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

