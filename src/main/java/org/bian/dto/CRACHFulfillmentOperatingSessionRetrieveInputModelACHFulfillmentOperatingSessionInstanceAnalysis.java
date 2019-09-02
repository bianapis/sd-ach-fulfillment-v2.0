package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRACHFulfillmentOperatingSessionRetrieveInputModelACHFulfillmentOperatingSessionInstanceAnalysis
 */
public class CRACHFulfillmentOperatingSessionRetrieveInputModelACHFulfillmentOperatingSessionInstanceAnalysis   {
  private String aCHFulfillmentOperatingSessionInstanceAnalysisReference = null;

  private String aCHFulfillmentOperatingSessionInstanceAnalysisReportType = null;

  private String aCHFulfillmentOperatingSessionInstanceAnalysisParameters = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance analysis view 
   * @return aCHFulfillmentOperatingSessionInstanceAnalysisReference
  **/

  public String getACHFulfillmentOperatingSessionInstanceAnalysisReference() {
    return aCHFulfillmentOperatingSessionInstanceAnalysisReference;
  }

  public void setACHFulfillmentOperatingSessionInstanceAnalysisReference(String aCHFulfillmentOperatingSessionInstanceAnalysisReference) {
    this.aCHFulfillmentOperatingSessionInstanceAnalysisReference = aCHFulfillmentOperatingSessionInstanceAnalysisReference;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the analysis (e.g. period, algorithm type) 
   * @return aCHFulfillmentOperatingSessionInstanceAnalysisParameters
  **/

  public String getACHFulfillmentOperatingSessionInstanceAnalysisParameters() {
    return aCHFulfillmentOperatingSessionInstanceAnalysisParameters;
  }

  public void setACHFulfillmentOperatingSessionInstanceAnalysisParameters(String aCHFulfillmentOperatingSessionInstanceAnalysisParameters) {
    this.aCHFulfillmentOperatingSessionInstanceAnalysisParameters = aCHFulfillmentOperatingSessionInstanceAnalysisParameters;
  }


}

