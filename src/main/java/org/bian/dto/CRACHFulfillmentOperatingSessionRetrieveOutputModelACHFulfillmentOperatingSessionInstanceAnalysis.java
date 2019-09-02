package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRACHFulfillmentOperatingSessionRetrieveOutputModelACHFulfillmentOperatingSessionInstanceAnalysis
 */
public class CRACHFulfillmentOperatingSessionRetrieveOutputModelACHFulfillmentOperatingSessionInstanceAnalysis   {
  private String aCHFulfillmentOperatingSessionInstanceAnalysisData = null;

  private String aCHFulfillmentOperatingSessionInstanceAnalysisReportType = null;

  private Object aCHFulfillmentOperatingSessionInstanceAnalysisReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The inputs and results of the instance analysis that can be on-going, periodic and actual and projected 
   * @return aCHFulfillmentOperatingSessionInstanceAnalysisData
  **/

  public String getACHFulfillmentOperatingSessionInstanceAnalysisData() {
    return aCHFulfillmentOperatingSessionInstanceAnalysisData;
  }

  public void setACHFulfillmentOperatingSessionInstanceAnalysisData(String aCHFulfillmentOperatingSessionInstanceAnalysisData) {
    this.aCHFulfillmentOperatingSessionInstanceAnalysisData = aCHFulfillmentOperatingSessionInstanceAnalysisData;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external performance analysis report available 
   * @return aCHFulfillmentOperatingSessionInstanceAnalysisReportType
  **/

  public String getACHFulfillmentOperatingSessionInstanceAnalysisReportType() {
    return aCHFulfillmentOperatingSessionInstanceAnalysisReportType;
  }

  public void setACHFulfillmentOperatingSessionInstanceAnalysisReportType(String aCHFulfillmentOperatingSessionInstanceAnalysisReportType) {
    this.aCHFulfillmentOperatingSessionInstanceAnalysisReportType = aCHFulfillmentOperatingSessionInstanceAnalysisReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external analysis report in any suitable form including selection filters where appropriate 
   * @return aCHFulfillmentOperatingSessionInstanceAnalysisReport
  **/

  public Object getACHFulfillmentOperatingSessionInstanceAnalysisReport() {
    return aCHFulfillmentOperatingSessionInstanceAnalysisReport;
  }

  public void setACHFulfillmentOperatingSessionInstanceAnalysisReport(Object aCHFulfillmentOperatingSessionInstanceAnalysisReport) {
    this.aCHFulfillmentOperatingSessionInstanceAnalysisReport = aCHFulfillmentOperatingSessionInstanceAnalysisReport;
  }


}

