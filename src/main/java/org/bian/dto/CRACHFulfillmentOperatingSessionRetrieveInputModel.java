package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRACHFulfillmentOperatingSessionRetrieveInputModelACHFulfillmentOperatingSessionInstanceAnalysis;
import org.bian.dto.CRACHFulfillmentOperatingSessionRetrieveInputModelACHFulfillmentOperatingSessionInstanceReportRecord;

import javax.validation.Valid;
  
/**
 * CRACHFulfillmentOperatingSessionRetrieveInputModel
 */
public class CRACHFulfillmentOperatingSessionRetrieveInputModel   {
  private Object aCHFulfillmentOperatingSessionRetrieveActionTaskRecord = null;

  private String aCHFulfillmentOperatingSessionRetrieveActionRequest = null;

  private CRACHFulfillmentOperatingSessionRetrieveInputModelACHFulfillmentOperatingSessionInstanceReportRecord aCHFulfillmentOperatingSessionInstanceReportRecord = null;

  private CRACHFulfillmentOperatingSessionRetrieveInputModelACHFulfillmentOperatingSessionInstanceAnalysis aCHFulfillmentOperatingSessionInstanceAnalysis = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return aCHFulfillmentOperatingSessionRetrieveActionTaskRecord
  **/

  public Object getACHFulfillmentOperatingSessionRetrieveActionTaskRecord() {
    return aCHFulfillmentOperatingSessionRetrieveActionTaskRecord;
  }

  public void setACHFulfillmentOperatingSessionRetrieveActionTaskRecord(Object aCHFulfillmentOperatingSessionRetrieveActionTaskRecord) {
    this.aCHFulfillmentOperatingSessionRetrieveActionTaskRecord = aCHFulfillmentOperatingSessionRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service request (lists requested reports) 
   * @return aCHFulfillmentOperatingSessionRetrieveActionRequest
  **/

  public String getACHFulfillmentOperatingSessionRetrieveActionRequest() {
    return aCHFulfillmentOperatingSessionRetrieveActionRequest;
  }

  public void setACHFulfillmentOperatingSessionRetrieveActionRequest(String aCHFulfillmentOperatingSessionRetrieveActionRequest) {
    this.aCHFulfillmentOperatingSessionRetrieveActionRequest = aCHFulfillmentOperatingSessionRetrieveActionRequest;
  }


  /**
   * Get aCHFulfillmentOperatingSessionInstanceReportRecord
   * @return aCHFulfillmentOperatingSessionInstanceReportRecord
  **/

  public CRACHFulfillmentOperatingSessionRetrieveInputModelACHFulfillmentOperatingSessionInstanceReportRecord getACHFulfillmentOperatingSessionInstanceReportRecord() {
    return aCHFulfillmentOperatingSessionInstanceReportRecord;
  }

  public void setACHFulfillmentOperatingSessionInstanceReportRecord(CRACHFulfillmentOperatingSessionRetrieveInputModelACHFulfillmentOperatingSessionInstanceReportRecord aCHFulfillmentOperatingSessionInstanceReportRecord) {
    this.aCHFulfillmentOperatingSessionInstanceReportRecord = aCHFulfillmentOperatingSessionInstanceReportRecord;
  }


  /**
   * Get aCHFulfillmentOperatingSessionInstanceAnalysis
   * @return aCHFulfillmentOperatingSessionInstanceAnalysis
  **/

  public CRACHFulfillmentOperatingSessionRetrieveInputModelACHFulfillmentOperatingSessionInstanceAnalysis getACHFulfillmentOperatingSessionInstanceAnalysis() {
    return aCHFulfillmentOperatingSessionInstanceAnalysis;
  }

  public void setACHFulfillmentOperatingSessionInstanceAnalysis(CRACHFulfillmentOperatingSessionRetrieveInputModelACHFulfillmentOperatingSessionInstanceAnalysis aCHFulfillmentOperatingSessionInstanceAnalysis) {
    this.aCHFulfillmentOperatingSessionInstanceAnalysis = aCHFulfillmentOperatingSessionInstanceAnalysis;
  }


}

