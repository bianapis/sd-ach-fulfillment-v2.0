package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQWarehousingRetrieveInputModelWarehousingInstanceAnalysis;
import org.bian.dto.BQWarehousingRetrieveInputModelWarehousingInstanceReport;

import javax.validation.Valid;
  
/**
 * BQWarehousingRetrieveInputModel
 */
public class BQWarehousingRetrieveInputModel   {
  private Object warehousingRetrieveActionTaskRecord = null;

  private String warehousingRetrieveActionRequest = null;

  private BQWarehousingRetrieveInputModelWarehousingInstanceReport warehousingInstanceReport = null;

  private BQWarehousingRetrieveInputModelWarehousingInstanceAnalysis warehousingInstanceAnalysis = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return warehousingRetrieveActionTaskRecord
  **/

  public Object getWarehousingRetrieveActionTaskRecord() {
    return warehousingRetrieveActionTaskRecord;
  }

  public void setWarehousingRetrieveActionTaskRecord(Object warehousingRetrieveActionTaskRecord) {
    this.warehousingRetrieveActionTaskRecord = warehousingRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service request (lists requested reports) 
   * @return warehousingRetrieveActionRequest
  **/

  public String getWarehousingRetrieveActionRequest() {
    return warehousingRetrieveActionRequest;
  }

  public void setWarehousingRetrieveActionRequest(String warehousingRetrieveActionRequest) {
    this.warehousingRetrieveActionRequest = warehousingRetrieveActionRequest;
  }


  /**
   * Get warehousingInstanceReport
   * @return warehousingInstanceReport
  **/

  public BQWarehousingRetrieveInputModelWarehousingInstanceReport getWarehousingInstanceReport() {
    return warehousingInstanceReport;
  }

  public void setWarehousingInstanceReport(BQWarehousingRetrieveInputModelWarehousingInstanceReport warehousingInstanceReport) {
    this.warehousingInstanceReport = warehousingInstanceReport;
  }


  /**
   * Get warehousingInstanceAnalysis
   * @return warehousingInstanceAnalysis
  **/

  public BQWarehousingRetrieveInputModelWarehousingInstanceAnalysis getWarehousingInstanceAnalysis() {
    return warehousingInstanceAnalysis;
  }

  public void setWarehousingInstanceAnalysis(BQWarehousingRetrieveInputModelWarehousingInstanceAnalysis warehousingInstanceAnalysis) {
    this.warehousingInstanceAnalysis = warehousingInstanceAnalysis;
  }


}

