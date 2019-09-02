package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQInboundACHRetrieveInputModelInboundACHInstanceReport
 */
public class BQInboundACHRetrieveInputModelInboundACHInstanceReport   {
  private String inboundACHInstanceReportReference = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance report 
   * @return inboundACHInstanceReportReference
  **/

  public String getInboundACHInstanceReportReference() {
    return inboundACHInstanceReportReference;
  }

  public void setInboundACHInstanceReportReference(String inboundACHInstanceReportReference) {
    this.inboundACHInstanceReportReference = inboundACHInstanceReportReference;
  }


}

