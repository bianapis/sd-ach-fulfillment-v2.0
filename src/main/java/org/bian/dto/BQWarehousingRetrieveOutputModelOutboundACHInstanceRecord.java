package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQWarehousingRetrieveOutputModelOutboundACHInstanceRecord
 */
public class BQWarehousingRetrieveOutputModelOutboundACHInstanceRecord   {
  private String outboundACHTransactionBatchReference = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the batch ACH record 
   * @return outboundACHTransactionBatchReference
  **/

  public String getOutboundACHTransactionBatchReference() {
    return outboundACHTransactionBatchReference;
  }

  public void setOutboundACHTransactionBatchReference(String outboundACHTransactionBatchReference) {
    this.outboundACHTransactionBatchReference = outboundACHTransactionBatchReference;
  }


}

