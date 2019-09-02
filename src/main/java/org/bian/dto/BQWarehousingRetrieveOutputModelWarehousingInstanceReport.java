package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQWarehousingRetrieveOutputModelWarehousingInstanceReport
 */
public class BQWarehousingRetrieveOutputModelWarehousingInstanceReport   {
  private Object warehousingInstanceReportRecord = null;

  private String warehousingInstanceReportType = null;

  private String warehousingInstanceReportParameters = null;

  private Object warehousingInstanceReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The input information used to assemble the report that can be on-going, periodic and actual and projected 
   * @return warehousingInstanceReportRecord
  **/

  public Object getWarehousingInstanceReportRecord() {
    return warehousingInstanceReportRecord;
  }

  public void setWarehousingInstanceReportRecord(Object warehousingInstanceReportRecord) {
    this.warehousingInstanceReportRecord = warehousingInstanceReportRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external report available 
   * @return warehousingInstanceReportType
  **/

  public String getWarehousingInstanceReportType() {
    return warehousingInstanceReportType;
  }

  public void setWarehousingInstanceReportType(String warehousingInstanceReportType) {
    this.warehousingInstanceReportType = warehousingInstanceReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the report (e.g. period, content type) 
   * @return warehousingInstanceReportParameters
  **/

  public String getWarehousingInstanceReportParameters() {
    return warehousingInstanceReportParameters;
  }

  public void setWarehousingInstanceReportParameters(String warehousingInstanceReportParameters) {
    this.warehousingInstanceReportParameters = warehousingInstanceReportParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external report in any suitable form including selection filters where appropriate 
   * @return warehousingInstanceReport
  **/

  public Object getWarehousingInstanceReport() {
    return warehousingInstanceReport;
  }

  public void setWarehousingInstanceReport(Object warehousingInstanceReport) {
    this.warehousingInstanceReport = warehousingInstanceReport;
  }


}

