package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQWarehousingRetrieveOutputModelWarehousingInstanceAnalysis
 */
public class BQWarehousingRetrieveOutputModelWarehousingInstanceAnalysis   {
  private Object warehousingInstanceAnalysisRecord = null;

  private String warehousingInstanceAnalysisReportType = null;

  private String warehousingInstanceAnalysisParameters = null;

  private Object warehousingInstanceAnalysisReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The inputs and results of the instance analysis that can be on-going, periodic and actual and projected 
   * @return warehousingInstanceAnalysisRecord
  **/

  public Object getWarehousingInstanceAnalysisRecord() {
    return warehousingInstanceAnalysisRecord;
  }

  public void setWarehousingInstanceAnalysisRecord(Object warehousingInstanceAnalysisRecord) {
    this.warehousingInstanceAnalysisRecord = warehousingInstanceAnalysisRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external performance analysis report available 
   * @return warehousingInstanceAnalysisReportType
  **/

  public String getWarehousingInstanceAnalysisReportType() {
    return warehousingInstanceAnalysisReportType;
  }

  public void setWarehousingInstanceAnalysisReportType(String warehousingInstanceAnalysisReportType) {
    this.warehousingInstanceAnalysisReportType = warehousingInstanceAnalysisReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the analysis (e.g. period, algorithm type) 
   * @return warehousingInstanceAnalysisParameters
  **/

  public String getWarehousingInstanceAnalysisParameters() {
    return warehousingInstanceAnalysisParameters;
  }

  public void setWarehousingInstanceAnalysisParameters(String warehousingInstanceAnalysisParameters) {
    this.warehousingInstanceAnalysisParameters = warehousingInstanceAnalysisParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external analysis report in any suitable form including selection filters where appropriate 
   * @return warehousingInstanceAnalysisReport
  **/

  public Object getWarehousingInstanceAnalysisReport() {
    return warehousingInstanceAnalysisReport;
  }

  public void setWarehousingInstanceAnalysisReport(Object warehousingInstanceAnalysisReport) {
    this.warehousingInstanceAnalysisReport = warehousingInstanceAnalysisReport;
  }


}

