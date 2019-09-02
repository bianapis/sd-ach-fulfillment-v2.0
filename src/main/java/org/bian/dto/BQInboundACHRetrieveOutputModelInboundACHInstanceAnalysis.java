package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQInboundACHRetrieveOutputModelInboundACHInstanceAnalysis
 */
public class BQInboundACHRetrieveOutputModelInboundACHInstanceAnalysis   {
  private Object inboundACHInstanceAnalysisRecord = null;

  private String inboundACHInstanceAnalysisReportType = null;

  private String inboundACHInstanceAnalysisParameters = null;

  private Object inboundACHInstanceAnalysisReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The inputs and results of the instance analysis that can be on-going, periodic and actual and projected 
   * @return inboundACHInstanceAnalysisRecord
  **/

  public Object getInboundACHInstanceAnalysisRecord() {
    return inboundACHInstanceAnalysisRecord;
  }

  public void setInboundACHInstanceAnalysisRecord(Object inboundACHInstanceAnalysisRecord) {
    this.inboundACHInstanceAnalysisRecord = inboundACHInstanceAnalysisRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external performance analysis report available 
   * @return inboundACHInstanceAnalysisReportType
  **/

  public String getInboundACHInstanceAnalysisReportType() {
    return inboundACHInstanceAnalysisReportType;
  }

  public void setInboundACHInstanceAnalysisReportType(String inboundACHInstanceAnalysisReportType) {
    this.inboundACHInstanceAnalysisReportType = inboundACHInstanceAnalysisReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the analysis (e.g. period, algorithm type) 
   * @return inboundACHInstanceAnalysisParameters
  **/

  public String getInboundACHInstanceAnalysisParameters() {
    return inboundACHInstanceAnalysisParameters;
  }

  public void setInboundACHInstanceAnalysisParameters(String inboundACHInstanceAnalysisParameters) {
    this.inboundACHInstanceAnalysisParameters = inboundACHInstanceAnalysisParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external analysis report in any suitable form including selection filters where appropriate 
   * @return inboundACHInstanceAnalysisReport
  **/

  public Object getInboundACHInstanceAnalysisReport() {
    return inboundACHInstanceAnalysisReport;
  }

  public void setInboundACHInstanceAnalysisReport(Object inboundACHInstanceAnalysisReport) {
    this.inboundACHInstanceAnalysisReport = inboundACHInstanceAnalysisReport;
  }


}

