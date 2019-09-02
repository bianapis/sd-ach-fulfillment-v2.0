package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQOutboundACHUpdateInputModelInboundACHInstanceRecord;
import org.bian.dto.BQOutboundACHUpdateInputModelOutboundACHInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQOutboundACHUpdateOutputModel
 */
public class BQOutboundACHUpdateOutputModel   {
  private BQOutboundACHUpdateInputModelInboundACHInstanceRecord inboundACHInstanceRecord = null;

  private BQOutboundACHUpdateInputModelOutboundACHInstanceRecord outboundACHInstanceRecord = null;

  private String outboundACHUpdateActionTaskReference = null;

  private Object outboundACHUpdateActionTaskRecord = null;

  private Object updateResponseRecord = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to an update service call 
   * @return outboundACHUpdateActionTaskReference
  **/

  public String getOutboundACHUpdateActionTaskReference() {
    return outboundACHUpdateActionTaskReference;
  }

  public void setOutboundACHUpdateActionTaskReference(String outboundACHUpdateActionTaskReference) {
    this.outboundACHUpdateActionTaskReference = outboundACHUpdateActionTaskReference;
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

