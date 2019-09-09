package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQInboundACHInitiateOutputModelInboundACHInstanceRecordACHPaymentTransactionRecord;

import javax.validation.Valid;
  
/**
 * BQOutboundACHInitiateOutputModelInboundACHInstanceRecord
 */
public class BQOutboundACHInitiateOutputModelInboundACHInstanceRecord   {
  private BQInboundACHInitiateOutputModelInboundACHInstanceRecordACHPaymentTransactionRecord aCHPaymentTransactionRecord = null;


  /**
   * Get aCHPaymentTransactionRecord
   * @return aCHPaymentTransactionRecord
  **/

  @JsonProperty("aCHPaymentTransactionRecord")
  public BQInboundACHInitiateOutputModelInboundACHInstanceRecordACHPaymentTransactionRecord getACHPaymentTransactionRecord() {
    return aCHPaymentTransactionRecord;
  }

  public void setACHPaymentTransactionRecord(BQInboundACHInitiateOutputModelInboundACHInstanceRecordACHPaymentTransactionRecord aCHPaymentTransactionRecord) {
    this.aCHPaymentTransactionRecord = aCHPaymentTransactionRecord;
  }


}

