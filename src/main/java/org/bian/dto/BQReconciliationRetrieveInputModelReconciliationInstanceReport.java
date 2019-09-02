package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQReconciliationRetrieveInputModelReconciliationInstanceReport
 */
public class BQReconciliationRetrieveInputModelReconciliationInstanceReport   {
  private String reconciliationInstanceReportReference = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance report 
   * @return reconciliationInstanceReportReference
  **/

  public String getReconciliationInstanceReportReference() {
    return reconciliationInstanceReportReference;
  }

  public void setReconciliationInstanceReportReference(String reconciliationInstanceReportReference) {
    this.reconciliationInstanceReportReference = reconciliationInstanceReportReference;
  }


}

