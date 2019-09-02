package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQWarehousingRetrieveInputModelWarehousingInstanceAnalysis
 */
public class BQWarehousingRetrieveInputModelWarehousingInstanceAnalysis   {
  private String warehousingInstanceAnalysisReference = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance analysis view 
   * @return warehousingInstanceAnalysisReference
  **/

  public String getWarehousingInstanceAnalysisReference() {
    return warehousingInstanceAnalysisReference;
  }

  public void setWarehousingInstanceAnalysisReference(String warehousingInstanceAnalysisReference) {
    this.warehousingInstanceAnalysisReference = warehousingInstanceAnalysisReference;
  }


}

