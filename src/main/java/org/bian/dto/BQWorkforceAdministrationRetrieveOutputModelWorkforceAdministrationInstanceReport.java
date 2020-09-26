package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQWorkforceAdministrationRetrieveOutputModelWorkforceAdministrationInstanceReport
 */
public class BQWorkforceAdministrationRetrieveOutputModelWorkforceAdministrationInstanceReport   {
  private Object workforceAdministrationInstanceReportRecord = null;

  private String workforceAdministrationInstanceReportType = null;

  private String workforceAdministrationInstanceReportParameters = null;

  private Object workforceAdministrationInstanceReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The input information used to assemble the report that can be on-going, periodic and actual and projected 
   * @return workforceAdministrationInstanceReportRecord
  **/

  public Object getWorkforceAdministrationInstanceReportRecord() {
    return workforceAdministrationInstanceReportRecord;
  }

  public void setWorkforceAdministrationInstanceReportRecord(Object workforceAdministrationInstanceReportRecord) {
    this.workforceAdministrationInstanceReportRecord = workforceAdministrationInstanceReportRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external report available 
   * @return workforceAdministrationInstanceReportType
  **/

  public String getWorkforceAdministrationInstanceReportType() {
    return workforceAdministrationInstanceReportType;
  }

  public void setWorkforceAdministrationInstanceReportType(String workforceAdministrationInstanceReportType) {
    this.workforceAdministrationInstanceReportType = workforceAdministrationInstanceReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the report (e.g. period, content type) 
   * @return workforceAdministrationInstanceReportParameters
  **/

  public String getWorkforceAdministrationInstanceReportParameters() {
    return workforceAdministrationInstanceReportParameters;
  }

  public void setWorkforceAdministrationInstanceReportParameters(String workforceAdministrationInstanceReportParameters) {
    this.workforceAdministrationInstanceReportParameters = workforceAdministrationInstanceReportParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external report in any suitable form including selection filters where appropriate 
   * @return workforceAdministrationInstanceReport
  **/

  public Object getWorkforceAdministrationInstanceReport() {
    return workforceAdministrationInstanceReport;
  }

  public void setWorkforceAdministrationInstanceReport(Object workforceAdministrationInstanceReport) {
    this.workforceAdministrationInstanceReport = workforceAdministrationInstanceReport;
  }


}

