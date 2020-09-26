package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQWorkforceAdministrationRetrieveOutputModelWorkforceAdministrationInstanceAnalysis
 */
public class BQWorkforceAdministrationRetrieveOutputModelWorkforceAdministrationInstanceAnalysis   {
  private Object workforceAdministrationInstanceAnalysisRecord = null;

  private String workforceAdministrationInstanceAnalysisReportType = null;

  private String workforceAdministrationInstanceAnalysisParameters = null;

  private Object workforceAdministrationInstanceAnalysisReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The inputs and results of the instance analysis that can be on-going, periodic and actual and projected 
   * @return workforceAdministrationInstanceAnalysisRecord
  **/

  public Object getWorkforceAdministrationInstanceAnalysisRecord() {
    return workforceAdministrationInstanceAnalysisRecord;
  }

  public void setWorkforceAdministrationInstanceAnalysisRecord(Object workforceAdministrationInstanceAnalysisRecord) {
    this.workforceAdministrationInstanceAnalysisRecord = workforceAdministrationInstanceAnalysisRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external performance analysis report available 
   * @return workforceAdministrationInstanceAnalysisReportType
  **/

  public String getWorkforceAdministrationInstanceAnalysisReportType() {
    return workforceAdministrationInstanceAnalysisReportType;
  }

  public void setWorkforceAdministrationInstanceAnalysisReportType(String workforceAdministrationInstanceAnalysisReportType) {
    this.workforceAdministrationInstanceAnalysisReportType = workforceAdministrationInstanceAnalysisReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the analysis (e.g. period, algorithm type) 
   * @return workforceAdministrationInstanceAnalysisParameters
  **/

  public String getWorkforceAdministrationInstanceAnalysisParameters() {
    return workforceAdministrationInstanceAnalysisParameters;
  }

  public void setWorkforceAdministrationInstanceAnalysisParameters(String workforceAdministrationInstanceAnalysisParameters) {
    this.workforceAdministrationInstanceAnalysisParameters = workforceAdministrationInstanceAnalysisParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external analysis report in any suitable form including selection filters where appropriate 
   * @return workforceAdministrationInstanceAnalysisReport
  **/

  public Object getWorkforceAdministrationInstanceAnalysisReport() {
    return workforceAdministrationInstanceAnalysisReport;
  }

  public void setWorkforceAdministrationInstanceAnalysisReport(Object workforceAdministrationInstanceAnalysisReport) {
    this.workforceAdministrationInstanceAnalysisReport = workforceAdministrationInstanceAnalysisReport;
  }


}

