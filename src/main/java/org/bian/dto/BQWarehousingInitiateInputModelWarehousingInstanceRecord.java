package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQWarehousingInitiateInputModelWarehousingInstanceRecord
 */
public class BQWarehousingInitiateInputModelWarehousingInstanceRecord   {
  private String scheduleReleaseDateTime = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::DateTime  general-info: The schedule for handling the warehoused transaction batch 
   * @return scheduleReleaseDateTime
  **/

  public String getScheduleReleaseDateTime() {
    return scheduleReleaseDateTime;
  }

  public void setScheduleReleaseDateTime(String scheduleReleaseDateTime) {
    this.scheduleReleaseDateTime = scheduleReleaseDateTime;
  }


}

