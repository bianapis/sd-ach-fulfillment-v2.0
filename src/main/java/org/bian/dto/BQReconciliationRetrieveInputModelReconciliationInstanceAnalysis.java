package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQReconciliationRetrieveInputModelReconciliationInstanceAnalysis
 */
public class BQReconciliationRetrieveInputModelReconciliationInstanceAnalysis   {
  private String reconciliationInstanceAnalysisReference = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance analysis view 
   * @return reconciliationInstanceAnalysisReference
  **/

  public String getReconciliationInstanceAnalysisReference() {
    return reconciliationInstanceAnalysisReference;
  }

  public void setReconciliationInstanceAnalysisReference(String reconciliationInstanceAnalysisReference) {
    this.reconciliationInstanceAnalysisReference = reconciliationInstanceAnalysisReference;
  }


}

