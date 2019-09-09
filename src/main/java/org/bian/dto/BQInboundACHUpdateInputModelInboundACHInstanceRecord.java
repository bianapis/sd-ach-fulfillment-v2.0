package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQInboundACHUpdateInputModelInboundACHInstanceRecordACHPaymentTransactionRecord;

import javax.validation.Valid;
  
/**
 * BQInboundACHUpdateInputModelInboundACHInstanceRecord
 */
public class BQInboundACHUpdateInputModelInboundACHInstanceRecord   {
  private String inboundACHTransactionBatchReference = null;

  private String aCHPaymentTransactionReference = null;

  private BQInboundACHUpdateInputModelInboundACHInstanceRecordACHPaymentTransactionRecord aCHPaymentTransactionRecord = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to an inbound ACH transaction batch 
   * @return inboundACHTransactionBatchReference
  **/

  public String getInboundACHTransactionBatchReference() {
    return inboundACHTransactionBatchReference;
  }

  public void setInboundACHTransactionBatchReference(String inboundACHTransactionBatchReference) {
    this.inboundACHTransactionBatchReference = inboundACHTransactionBatchReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a ACH payment transaction - included in the batch 
   * @return aCHPaymentTransactionReference
  **/

  @JsonProperty("aCHPaymentTransactionReference")
  public String getACHPaymentTransactionReference() {
    return aCHPaymentTransactionReference;
  }

  public void setACHPaymentTransactionReference(String aCHPaymentTransactionReference) {
    this.aCHPaymentTransactionReference = aCHPaymentTransactionReference;
  }


  /**
   * Get aCHPaymentTransactionRecord
   * @return aCHPaymentTransactionRecord
  **/

  @JsonProperty("aCHPaymentTransactionRecord")
  public BQInboundACHUpdateInputModelInboundACHInstanceRecordACHPaymentTransactionRecord getACHPaymentTransactionRecord() {
    return aCHPaymentTransactionRecord;
  }

  public void setACHPaymentTransactionRecord(BQInboundACHUpdateInputModelInboundACHInstanceRecordACHPaymentTransactionRecord aCHPaymentTransactionRecord) {
    this.aCHPaymentTransactionRecord = aCHPaymentTransactionRecord;
  }


}

