package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQInboundACHInitiateInputModelInboundACHInstanceRecordACHPaymentTransactionRecordDateType;

import javax.validation.Valid;
  
/**
 * BQInboundACHInitiateOutputModelInboundACHInstanceRecordACHPaymentTransactionRecord
 */
public class BQInboundACHInitiateOutputModelInboundACHInstanceRecordACHPaymentTransactionRecord   {
  private BQInboundACHInitiateInputModelInboundACHInstanceRecordACHPaymentTransactionRecordDateType dateType = null;


  /**
   * Get dateType
   * @return dateType
  **/

  public BQInboundACHInitiateInputModelInboundACHInstanceRecordACHPaymentTransactionRecordDateType getDateType() {
    return dateType;
  }

  public void setDateType(BQInboundACHInitiateInputModelInboundACHInstanceRecordACHPaymentTransactionRecordDateType dateType) {
    this.dateType = dateType;
  }


}

