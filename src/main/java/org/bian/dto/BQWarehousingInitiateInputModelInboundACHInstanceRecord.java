package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQWarehousingInitiateInputModelInboundACHInstanceRecordACHPaymentTransactionRecord;

import javax.validation.Valid;
  
/**
 * BQWarehousingInitiateInputModelInboundACHInstanceRecord
 */
public class BQWarehousingInitiateInputModelInboundACHInstanceRecord   {
  private String aCHPaymentTransactionReference = null;

  private BQWarehousingInitiateInputModelInboundACHInstanceRecordACHPaymentTransactionRecord aCHPaymentTransactionRecord = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a ACH payment transaction - included in the batch 
   * @return aCHPaymentTransactionReference
  **/

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

  public BQWarehousingInitiateInputModelInboundACHInstanceRecordACHPaymentTransactionRecord getACHPaymentTransactionRecord() {
    return aCHPaymentTransactionRecord;
  }

  public void setACHPaymentTransactionRecord(BQWarehousingInitiateInputModelInboundACHInstanceRecordACHPaymentTransactionRecord aCHPaymentTransactionRecord) {
    this.aCHPaymentTransactionRecord = aCHPaymentTransactionRecord;
  }


}

