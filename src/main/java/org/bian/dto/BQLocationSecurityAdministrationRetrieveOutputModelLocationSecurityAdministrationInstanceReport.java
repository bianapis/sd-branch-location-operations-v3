package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQLocationSecurityAdministrationRetrieveOutputModelLocationSecurityAdministrationInstanceReport
 */
public class BQLocationSecurityAdministrationRetrieveOutputModelLocationSecurityAdministrationInstanceReport   {
  private Object locationSecurityAdministrationInstanceReportRecord = null;

  private String locationSecurityAdministrationInstanceReportType = null;

  private String locationSecurityAdministrationInstanceReportParameters = null;

  private Object locationSecurityAdministrationInstanceReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The input information used to assemble the report that can be on-going, periodic and actual and projected 
   * @return locationSecurityAdministrationInstanceReportRecord
  **/

  public Object getLocationSecurityAdministrationInstanceReportRecord() {
    return locationSecurityAdministrationInstanceReportRecord;
  }

  public void setLocationSecurityAdministrationInstanceReportRecord(Object locationSecurityAdministrationInstanceReportRecord) {
    this.locationSecurityAdministrationInstanceReportRecord = locationSecurityAdministrationInstanceReportRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external report available 
   * @return locationSecurityAdministrationInstanceReportType
  **/

  public String getLocationSecurityAdministrationInstanceReportType() {
    return locationSecurityAdministrationInstanceReportType;
  }

  public void setLocationSecurityAdministrationInstanceReportType(String locationSecurityAdministrationInstanceReportType) {
    this.locationSecurityAdministrationInstanceReportType = locationSecurityAdministrationInstanceReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the report (e.g. period, content type) 
   * @return locationSecurityAdministrationInstanceReportParameters
  **/

  public String getLocationSecurityAdministrationInstanceReportParameters() {
    return locationSecurityAdministrationInstanceReportParameters;
  }

  public void setLocationSecurityAdministrationInstanceReportParameters(String locationSecurityAdministrationInstanceReportParameters) {
    this.locationSecurityAdministrationInstanceReportParameters = locationSecurityAdministrationInstanceReportParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external report in any suitable form including selection filters where appropriate 
   * @return locationSecurityAdministrationInstanceReport
  **/

  public Object getLocationSecurityAdministrationInstanceReport() {
    return locationSecurityAdministrationInstanceReport;
  }

  public void setLocationSecurityAdministrationInstanceReport(Object locationSecurityAdministrationInstanceReport) {
    this.locationSecurityAdministrationInstanceReport = locationSecurityAdministrationInstanceReport;
  }


}

