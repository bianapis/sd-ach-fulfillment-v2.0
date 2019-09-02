package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQInboundACHRetrieveInputModelInboundACHInstanceAnalysis;
import org.bian.dto.BQInboundACHRetrieveInputModelInboundACHInstanceReport;

import javax.validation.Valid;
  
/**
 * BQInboundACHRetrieveInputModel
 */
public class BQInboundACHRetrieveInputModel   {
  private Object inboundACHRetrieveActionTaskRecord = null;

  private String inboundACHRetrieveActionRequest = null;

  private BQInboundACHRetrieveInputModelInboundACHInstanceReport inboundACHInstanceReport = null;

  private BQInboundACHRetrieveInputModelInboundACHInstanceAnalysis inboundACHInstanceAnalysis = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return inboundACHRetrieveActionTaskRecord
  **/

  public Object getInboundACHRetrieveActionTaskRecord() {
    return inboundACHRetrieveActionTaskRecord;
  }

  public void setInboundACHRetrieveActionTaskRecord(Object inboundACHRetrieveActionTaskRecord) {
    this.inboundACHRetrieveActionTaskRecord = inboundACHRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service request (lists requested reports) 
   * @return inboundACHRetrieveActionRequest
  **/

  public String getInboundACHRetrieveActionRequest() {
    return inboundACHRetrieveActionRequest;
  }

  public void setInboundACHRetrieveActionRequest(String inboundACHRetrieveActionRequest) {
    this.inboundACHRetrieveActionRequest = inboundACHRetrieveActionRequest;
  }


  /**
   * Get inboundACHInstanceReport
   * @return inboundACHInstanceReport
  **/

  public BQInboundACHRetrieveInputModelInboundACHInstanceReport getInboundACHInstanceReport() {
    return inboundACHInstanceReport;
  }

  public void setInboundACHInstanceReport(BQInboundACHRetrieveInputModelInboundACHInstanceReport inboundACHInstanceReport) {
    this.inboundACHInstanceReport = inboundACHInstanceReport;
  }


  /**
   * Get inboundACHInstanceAnalysis
   * @return inboundACHInstanceAnalysis
  **/

  public BQInboundACHRetrieveInputModelInboundACHInstanceAnalysis getInboundACHInstanceAnalysis() {
    return inboundACHInstanceAnalysis;
  }

  public void setInboundACHInstanceAnalysis(BQInboundACHRetrieveInputModelInboundACHInstanceAnalysis inboundACHInstanceAnalysis) {
    this.inboundACHInstanceAnalysis = inboundACHInstanceAnalysis;
  }


}

