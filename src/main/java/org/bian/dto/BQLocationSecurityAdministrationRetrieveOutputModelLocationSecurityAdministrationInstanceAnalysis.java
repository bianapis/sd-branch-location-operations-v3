package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQLocationSecurityAdministrationRetrieveOutputModelLocationSecurityAdministrationInstanceAnalysis
 */
public class BQLocationSecurityAdministrationRetrieveOutputModelLocationSecurityAdministrationInstanceAnalysis   {
  private Object locationSecurityAdministrationInstanceAnalysisRecord = null;

  private String locationSecurityAdministrationInstanceAnalysisReportType = null;

  private String locationSecurityAdministrationInstanceAnalysisParameters = null;

  private Object locationSecurityAdministrationInstanceAnalysisReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The inputs and results of the instance analysis that can be on-going, periodic and actual and projected 
   * @return locationSecurityAdministrationInstanceAnalysisRecord
  **/

  public Object getLocationSecurityAdministrationInstanceAnalysisRecord() {
    return locationSecurityAdministrationInstanceAnalysisRecord;
  }

  public void setLocationSecurityAdministrationInstanceAnalysisRecord(Object locationSecurityAdministrationInstanceAnalysisRecord) {
    this.locationSecurityAdministrationInstanceAnalysisRecord = locationSecurityAdministrationInstanceAnalysisRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external performance analysis report available 
   * @return locationSecurityAdministrationInstanceAnalysisReportType
  **/

  public String getLocationSecurityAdministrationInstanceAnalysisReportType() {
    return locationSecurityAdministrationInstanceAnalysisReportType;
  }

  public void setLocationSecurityAdministrationInstanceAnalysisReportType(String locationSecurityAdministrationInstanceAnalysisReportType) {
    this.locationSecurityAdministrationInstanceAnalysisReportType = locationSecurityAdministrationInstanceAnalysisReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the analysis (e.g. period, algorithm type) 
   * @return locationSecurityAdministrationInstanceAnalysisParameters
  **/

  public String getLocationSecurityAdministrationInstanceAnalysisParameters() {
    return locationSecurityAdministrationInstanceAnalysisParameters;
  }

  public void setLocationSecurityAdministrationInstanceAnalysisParameters(String locationSecurityAdministrationInstanceAnalysisParameters) {
    this.locationSecurityAdministrationInstanceAnalysisParameters = locationSecurityAdministrationInstanceAnalysisParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external analysis report in any suitable form including selection filters where appropriate 
   * @return locationSecurityAdministrationInstanceAnalysisReport
  **/

  public Object getLocationSecurityAdministrationInstanceAnalysisReport() {
    return locationSecurityAdministrationInstanceAnalysisReport;
  }

  public void setLocationSecurityAdministrationInstanceAnalysisReport(Object locationSecurityAdministrationInstanceAnalysisReport) {
    this.locationSecurityAdministrationInstanceAnalysisReport = locationSecurityAdministrationInstanceAnalysisReport;
  }


}

