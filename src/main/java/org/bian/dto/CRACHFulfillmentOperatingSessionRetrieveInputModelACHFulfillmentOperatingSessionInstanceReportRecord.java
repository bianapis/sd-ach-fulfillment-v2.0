package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRACHFulfillmentOperatingSessionRetrieveInputModelACHFulfillmentOperatingSessionInstanceReportRecord
 */
public class CRACHFulfillmentOperatingSessionRetrieveInputModelACHFulfillmentOperatingSessionInstanceReportRecord   {
  private String aCHFulfillmentOperatingSessionInstanceReportReference = null;

  private String aCHFulfillmentOperatingSessionInstanceReportType = null;

  private String aCHFulfillmentOperatingSessionInstanceReportParameters = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance report 
   * @return aCHFulfillmentOperatingSessionInstanceReportReference
  **/

  public String getACHFulfillmentOperatingSessionInstanceReportReference() {
    return aCHFulfillmentOperatingSessionInstanceReportReference;
  }

  public void setACHFulfillmentOperatingSessionInstanceReportReference(String aCHFulfillmentOperatingSessionInstanceReportReference) {
    this.aCHFulfillmentOperatingSessionInstanceReportReference = aCHFulfillmentOperatingSessionInstanceReportReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external report available 
   * @return aCHFulfillmentOperatingSessionInstanceReportType
  **/

  public String getACHFulfillmentOperatingSessionInstanceReportType() {
    return aCHFulfillmentOperatingSessionInstanceReportType;
  }

  public void setACHFulfillmentOperatingSessionInstanceReportType(String aCHFulfillmentOperatingSessionInstanceReportType) {
    this.aCHFulfillmentOperatingSessionInstanceReportType = aCHFulfillmentOperatingSessionInstanceReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the report (e.g. period, content type) 
   * @return aCHFulfillmentOperatingSessionInstanceReportParameters
  **/

  public String getACHFulfillmentOperatingSessionInstanceReportParameters() {
    return aCHFulfillmentOperatingSessionInstanceReportParameters;
  }

  public void setACHFulfillmentOperatingSessionInstanceReportParameters(String aCHFulfillmentOperatingSessionInstanceReportParameters) {
    this.aCHFulfillmentOperatingSessionInstanceReportParameters = aCHFulfillmentOperatingSessionInstanceReportParameters;
  }


}

