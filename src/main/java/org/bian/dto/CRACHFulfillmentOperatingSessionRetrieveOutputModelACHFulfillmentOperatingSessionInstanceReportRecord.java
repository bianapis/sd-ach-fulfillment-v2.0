package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRACHFulfillmentOperatingSessionRetrieveOutputModelACHFulfillmentOperatingSessionInstanceReportRecord
 */
public class CRACHFulfillmentOperatingSessionRetrieveOutputModelACHFulfillmentOperatingSessionInstanceReportRecord   {
  private String aCHFulfillmentOperatingSessionInstanceReportData = null;

  private String aCHFulfillmentOperatingSessionInstanceReportType = null;

  private Object aCHFulfillmentOperatingSessionInstanceReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The input information used to assemble the report that can be on-going, periodic and actual and projected 
   * @return aCHFulfillmentOperatingSessionInstanceReportData
  **/

  public String getACHFulfillmentOperatingSessionInstanceReportData() {
    return aCHFulfillmentOperatingSessionInstanceReportData;
  }

  public void setACHFulfillmentOperatingSessionInstanceReportData(String aCHFulfillmentOperatingSessionInstanceReportData) {
    this.aCHFulfillmentOperatingSessionInstanceReportData = aCHFulfillmentOperatingSessionInstanceReportData;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external report in any suitable form including selection filters where appropriate 
   * @return aCHFulfillmentOperatingSessionInstanceReport
  **/

  public Object getACHFulfillmentOperatingSessionInstanceReport() {
    return aCHFulfillmentOperatingSessionInstanceReport;
  }

  public void setACHFulfillmentOperatingSessionInstanceReport(Object aCHFulfillmentOperatingSessionInstanceReport) {
    this.aCHFulfillmentOperatingSessionInstanceReport = aCHFulfillmentOperatingSessionInstanceReport;
  }


}

