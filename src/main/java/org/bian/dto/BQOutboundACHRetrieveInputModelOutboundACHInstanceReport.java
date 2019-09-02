package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQOutboundACHRetrieveInputModelOutboundACHInstanceReport
 */
public class BQOutboundACHRetrieveInputModelOutboundACHInstanceReport   {
  private String outboundACHInstanceReportReference = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance report 
   * @return outboundACHInstanceReportReference
  **/

  public String getOutboundACHInstanceReportReference() {
    return outboundACHInstanceReportReference;
  }

  public void setOutboundACHInstanceReportReference(String outboundACHInstanceReportReference) {
    this.outboundACHInstanceReportReference = outboundACHInstanceReportReference;
  }


}

