package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQWarehousingInitiateInputModelWarehousingInstanceRecord;
import org.bian.dto.BQWarehousingUpdateInputModelInboundACHInstanceRecord;
import org.bian.dto.BQWarehousingUpdateInputModelOutboundACHInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQWarehousingUpdateOutputModel
 */
public class BQWarehousingUpdateOutputModel   {
  private BQWarehousingUpdateInputModelInboundACHInstanceRecord inboundACHInstanceRecord = null;

  private BQWarehousingUpdateInputModelOutboundACHInstanceRecord outboundACHInstanceRecord = null;

  private BQWarehousingInitiateInputModelWarehousingInstanceRecord warehousingInstanceRecord = null;

  private String warehousingUpdateActionTaskReference = null;

  private Object warehousingUpdateActionTaskRecord = null;

  private Object updateResponseRecord = null;


  /**
   * Get inboundACHInstanceRecord
   * @return inboundACHInstanceRecord
  **/

  public BQWarehousingUpdateInputModelInboundACHInstanceRecord getInboundACHInstanceRecord() {
    return inboundACHInstanceRecord;
  }

  public void setInboundACHInstanceRecord(BQWarehousingUpdateInputModelInboundACHInstanceRecord inboundACHInstanceRecord) {
    this.inboundACHInstanceRecord = inboundACHInstanceRecord;
  }


  /**
   * Get outboundACHInstanceRecord
   * @return outboundACHInstanceRecord
  **/

  public BQWarehousingUpdateInputModelOutboundACHInstanceRecord getOutboundACHInstanceRecord() {
    return outboundACHInstanceRecord;
  }

  public void setOutboundACHInstanceRecord(BQWarehousingUpdateInputModelOutboundACHInstanceRecord outboundACHInstanceRecord) {
    this.outboundACHInstanceRecord = outboundACHInstanceRecord;
  }


  /**
   * Get warehousingInstanceRecord
   * @return warehousingInstanceRecord
  **/

  public BQWarehousingInitiateInputModelWarehousingInstanceRecord getWarehousingInstanceRecord() {
    return warehousingInstanceRecord;
  }

  public void setWarehousingInstanceRecord(BQWarehousingInitiateInputModelWarehousingInstanceRecord warehousingInstanceRecord) {
    this.warehousingInstanceRecord = warehousingInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to an update service call 
   * @return warehousingUpdateActionTaskReference
  **/

  public String getWarehousingUpdateActionTaskReference() {
    return warehousingUpdateActionTaskReference;
  }

  public void setWarehousingUpdateActionTaskReference(String warehousingUpdateActionTaskReference) {
    this.warehousingUpdateActionTaskReference = warehousingUpdateActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The update service call consolidated processing record 
   * @return warehousingUpdateActionTaskRecord
  **/

  public Object getWarehousingUpdateActionTaskRecord() {
    return warehousingUpdateActionTaskRecord;
  }

  public void setWarehousingUpdateActionTaskRecord(Object warehousingUpdateActionTaskRecord) {
    this.warehousingUpdateActionTaskRecord = warehousingUpdateActionTaskRecord;
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

