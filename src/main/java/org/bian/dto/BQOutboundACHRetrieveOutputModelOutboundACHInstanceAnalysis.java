package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQOutboundACHRetrieveOutputModelOutboundACHInstanceAnalysis
 */
public class BQOutboundACHRetrieveOutputModelOutboundACHInstanceAnalysis   {
  private Object outboundACHInstanceAnalysisRecord = null;

  private String outboundACHInstanceAnalysisReportType = null;

  private String outboundACHInstanceAnalysisParameters = null;

  private Object outboundACHInstanceAnalysisReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The inputs and results of the instance analysis that can be on-going, periodic and actual and projected 
   * @return outboundACHInstanceAnalysisRecord
  **/

  public Object getOutboundACHInstanceAnalysisRecord() {
    return outboundACHInstanceAnalysisRecord;
  }

  public void setOutboundACHInstanceAnalysisRecord(Object outboundACHInstanceAnalysisRecord) {
    this.outboundACHInstanceAnalysisRecord = outboundACHInstanceAnalysisRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external performance analysis report available 
   * @return outboundACHInstanceAnalysisReportType
  **/

  public String getOutboundACHInstanceAnalysisReportType() {
    return outboundACHInstanceAnalysisReportType;
  }

  public void setOutboundACHInstanceAnalysisReportType(String outboundACHInstanceAnalysisReportType) {
    this.outboundACHInstanceAnalysisReportType = outboundACHInstanceAnalysisReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the analysis (e.g. period, algorithm type) 
   * @return outboundACHInstanceAnalysisParameters
  **/

  public String getOutboundACHInstanceAnalysisParameters() {
    return outboundACHInstanceAnalysisParameters;
  }

  public void setOutboundACHInstanceAnalysisParameters(String outboundACHInstanceAnalysisParameters) {
    this.outboundACHInstanceAnalysisParameters = outboundACHInstanceAnalysisParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external analysis report in any suitable form including selection filters where appropriate 
   * @return outboundACHInstanceAnalysisReport
  **/

  public Object getOutboundACHInstanceAnalysisReport() {
    return outboundACHInstanceAnalysisReport;
  }

  public void setOutboundACHInstanceAnalysisReport(Object outboundACHInstanceAnalysisReport) {
    this.outboundACHInstanceAnalysisReport = outboundACHInstanceAnalysisReport;
  }


}

