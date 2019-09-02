package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQClearingandSettlementUpdateInputModelClearingandSettlementInstanceRecord;
import org.bian.dto.BQClearingandSettlementUpdateInputModelInboundACHInstanceRecord;
import org.bian.dto.BQClearingandSettlementUpdateInputModelOutboundACHInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQClearingandSettlementUpdateOutputModel
 */
public class BQClearingandSettlementUpdateOutputModel   {
  private BQClearingandSettlementUpdateInputModelInboundACHInstanceRecord inboundACHInstanceRecord = null;

  private BQClearingandSettlementUpdateInputModelOutboundACHInstanceRecord outboundACHInstanceRecord = null;

  private BQClearingandSettlementUpdateInputModelClearingandSettlementInstanceRecord clearingandSettlementInstanceRecord = null;

  private String clearingandSettlementUpdateActionTaskReference = null;

  private Object clearingandSettlementUpdateActionTaskRecord = null;

  private Object updateResponseRecord = null;


  /**
   * Get inboundACHInstanceRecord
   * @return inboundACHInstanceRecord
  **/

  public BQClearingandSettlementUpdateInputModelInboundACHInstanceRecord getInboundACHInstanceRecord() {
    return inboundACHInstanceRecord;
  }

  public void setInboundACHInstanceRecord(BQClearingandSettlementUpdateInputModelInboundACHInstanceRecord inboundACHInstanceRecord) {
    this.inboundACHInstanceRecord = inboundACHInstanceRecord;
  }


  /**
   * Get outboundACHInstanceRecord
   * @return outboundACHInstanceRecord
  **/

  public BQClearingandSettlementUpdateInputModelOutboundACHInstanceRecord getOutboundACHInstanceRecord() {
    return outboundACHInstanceRecord;
  }

  public void setOutboundACHInstanceRecord(BQClearingandSettlementUpdateInputModelOutboundACHInstanceRecord outboundACHInstanceRecord) {
    this.outboundACHInstanceRecord = outboundACHInstanceRecord;
  }


  /**
   * Get clearingandSettlementInstanceRecord
   * @return clearingandSettlementInstanceRecord
  **/

  public BQClearingandSettlementUpdateInputModelClearingandSettlementInstanceRecord getClearingandSettlementInstanceRecord() {
    return clearingandSettlementInstanceRecord;
  }

  public void setClearingandSettlementInstanceRecord(BQClearingandSettlementUpdateInputModelClearingandSettlementInstanceRecord clearingandSettlementInstanceRecord) {
    this.clearingandSettlementInstanceRecord = clearingandSettlementInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to an update service call 
   * @return clearingandSettlementUpdateActionTaskReference
  **/

  public String getClearingandSettlementUpdateActionTaskReference() {
    return clearingandSettlementUpdateActionTaskReference;
  }

  public void setClearingandSettlementUpdateActionTaskReference(String clearingandSettlementUpdateActionTaskReference) {
    this.clearingandSettlementUpdateActionTaskReference = clearingandSettlementUpdateActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The update service call consolidated processing record 
   * @return clearingandSettlementUpdateActionTaskRecord
  **/

  public Object getClearingandSettlementUpdateActionTaskRecord() {
    return clearingandSettlementUpdateActionTaskRecord;
  }

  public void setClearingandSettlementUpdateActionTaskRecord(Object clearingandSettlementUpdateActionTaskRecord) {
    this.clearingandSettlementUpdateActionTaskRecord = clearingandSettlementUpdateActionTaskRecord;
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

