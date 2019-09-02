package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQInboundACHRetrieveOutputModelInboundACHInstanceReport
 */
public class BQInboundACHRetrieveOutputModelInboundACHInstanceReport   {
  private Object inboundACHInstanceReportRecord = null;

  private String inboundACHInstanceReportType = null;

  private String inboundACHInstanceReportParameters = null;

  private Object inboundACHInstanceReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The input information used to assemble the report that can be on-going, periodic and actual and projected 
   * @return inboundACHInstanceReportRecord
  **/

  public Object getInboundACHInstanceReportRecord() {
    return inboundACHInstanceReportRecord;
  }

  public void setInboundACHInstanceReportRecord(Object inboundACHInstanceReportRecord) {
    this.inboundACHInstanceReportRecord = inboundACHInstanceReportRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external report available 
   * @return inboundACHInstanceReportType
  **/

  public String getInboundACHInstanceReportType() {
    return inboundACHInstanceReportType;
  }

  public void setInboundACHInstanceReportType(String inboundACHInstanceReportType) {
    this.inboundACHInstanceReportType = inboundACHInstanceReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the report (e.g. period, content type) 
   * @return inboundACHInstanceReportParameters
  **/

  public String getInboundACHInstanceReportParameters() {
    return inboundACHInstanceReportParameters;
  }

  public void setInboundACHInstanceReportParameters(String inboundACHInstanceReportParameters) {
    this.inboundACHInstanceReportParameters = inboundACHInstanceReportParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external report in any suitable form including selection filters where appropriate 
   * @return inboundACHInstanceReport
  **/

  public Object getInboundACHInstanceReport() {
    return inboundACHInstanceReport;
  }

  public void setInboundACHInstanceReport(Object inboundACHInstanceReport) {
    this.inboundACHInstanceReport = inboundACHInstanceReport;
  }


}

