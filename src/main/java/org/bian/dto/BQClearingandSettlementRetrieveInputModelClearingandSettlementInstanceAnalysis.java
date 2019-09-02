package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQClearingandSettlementRetrieveInputModelClearingandSettlementInstanceAnalysis
 */
public class BQClearingandSettlementRetrieveInputModelClearingandSettlementInstanceAnalysis   {
  private String clearingandSettlementInstanceAnalysisReference = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance analysis view 
   * @return clearingandSettlementInstanceAnalysisReference
  **/

  public String getClearingandSettlementInstanceAnalysisReference() {
    return clearingandSettlementInstanceAnalysisReference;
  }

  public void setClearingandSettlementInstanceAnalysisReference(String clearingandSettlementInstanceAnalysisReference) {
    this.clearingandSettlementInstanceAnalysisReference = clearingandSettlementInstanceAnalysisReference;
  }


}

