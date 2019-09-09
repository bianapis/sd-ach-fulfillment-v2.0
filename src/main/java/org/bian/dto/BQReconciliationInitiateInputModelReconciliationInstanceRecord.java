package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQReconciliationInitiateInputModelReconciliationInstanceRecord
 */
public class BQReconciliationInitiateInputModelReconciliationInstanceRecord   {
  private String aCHReconciliationTaskResult = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the reconciliation resolution  
   * @return aCHReconciliationTaskResult
  **/

  @JsonProperty("aCHReconciliationTaskResult")
  public String getACHReconciliationTaskResult() {
    return aCHReconciliationTaskResult;
  }

  public void setACHReconciliationTaskResult(String aCHReconciliationTaskResult) {
    this.aCHReconciliationTaskResult = aCHReconciliationTaskResult;
  }


}

