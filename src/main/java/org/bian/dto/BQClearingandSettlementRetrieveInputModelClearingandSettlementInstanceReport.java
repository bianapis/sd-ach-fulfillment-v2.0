package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQClearingandSettlementRetrieveInputModelClearingandSettlementInstanceReport
 */
public class BQClearingandSettlementRetrieveInputModelClearingandSettlementInstanceReport   {
  private String clearingandSettlementInstanceReportReference = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance report 
   * @return clearingandSettlementInstanceReportReference
  **/

  public String getClearingandSettlementInstanceReportReference() {
    return clearingandSettlementInstanceReportReference;
  }

  public void setClearingandSettlementInstanceReportReference(String clearingandSettlementInstanceReportReference) {
    this.clearingandSettlementInstanceReportReference = clearingandSettlementInstanceReportReference;
  }


}

