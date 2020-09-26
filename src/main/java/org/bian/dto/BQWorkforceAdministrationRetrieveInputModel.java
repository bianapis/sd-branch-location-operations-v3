package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQWorkforceAdministrationRetrieveInputModelWorkforceAdministrationInstanceAnalysis;
import org.bian.dto.BQWorkforceAdministrationRetrieveInputModelWorkforceAdministrationInstanceReport;

import javax.validation.Valid;
  
/**
 * BQWorkforceAdministrationRetrieveInputModel
 */
public class BQWorkforceAdministrationRetrieveInputModel   {
  private Object workforceAdministrationRetrieveActionTaskRecord = null;

  private String workforceAdministrationRetrieveActionRequest = null;

  private BQWorkforceAdministrationRetrieveInputModelWorkforceAdministrationInstanceReport workforceAdministrationInstanceReport = null;

  private BQWorkforceAdministrationRetrieveInputModelWorkforceAdministrationInstanceAnalysis workforceAdministrationInstanceAnalysis = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return workforceAdministrationRetrieveActionTaskRecord
  **/

  public Object getWorkforceAdministrationRetrieveActionTaskRecord() {
    return workforceAdministrationRetrieveActionTaskRecord;
  }

  public void setWorkforceAdministrationRetrieveActionTaskRecord(Object workforceAdministrationRetrieveActionTaskRecord) {
    this.workforceAdministrationRetrieveActionTaskRecord = workforceAdministrationRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service request (lists requested reports) 
   * @return workforceAdministrationRetrieveActionRequest
  **/

  public String getWorkforceAdministrationRetrieveActionRequest() {
    return workforceAdministrationRetrieveActionRequest;
  }

  public void setWorkforceAdministrationRetrieveActionRequest(String workforceAdministrationRetrieveActionRequest) {
    this.workforceAdministrationRetrieveActionRequest = workforceAdministrationRetrieveActionRequest;
  }


  /**
   * Get workforceAdministrationInstanceReport
   * @return workforceAdministrationInstanceReport
  **/

  public BQWorkforceAdministrationRetrieveInputModelWorkforceAdministrationInstanceReport getWorkforceAdministrationInstanceReport() {
    return workforceAdministrationInstanceReport;
  }

  public void setWorkforceAdministrationInstanceReport(BQWorkforceAdministrationRetrieveInputModelWorkforceAdministrationInstanceReport workforceAdministrationInstanceReport) {
    this.workforceAdministrationInstanceReport = workforceAdministrationInstanceReport;
  }


  /**
   * Get workforceAdministrationInstanceAnalysis
   * @return workforceAdministrationInstanceAnalysis
  **/

  public BQWorkforceAdministrationRetrieveInputModelWorkforceAdministrationInstanceAnalysis getWorkforceAdministrationInstanceAnalysis() {
    return workforceAdministrationInstanceAnalysis;
  }

  public void setWorkforceAdministrationInstanceAnalysis(BQWorkforceAdministrationRetrieveInputModelWorkforceAdministrationInstanceAnalysis workforceAdministrationInstanceAnalysis) {
    this.workforceAdministrationInstanceAnalysis = workforceAdministrationInstanceAnalysis;
  }


}

