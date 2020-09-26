package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRBranchLocationAdministrativePlanRetrieveOutputModelBranchLocationAdministrativePlanInstanceReportRecord
 */
public class CRBranchLocationAdministrativePlanRetrieveOutputModelBranchLocationAdministrativePlanInstanceReportRecord   {
  private String branchLocationAdministrativePlanInstanceReportData = null;

  private String branchLocationAdministrativePlanInstanceReportType = null;

  private Object branchLocationAdministrativePlanInstanceReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The input information used to assemble the report that can be on-going, periodic and actual and projected 
   * @return branchLocationAdministrativePlanInstanceReportData
  **/

  public String getBranchLocationAdministrativePlanInstanceReportData() {
    return branchLocationAdministrativePlanInstanceReportData;
  }

  public void setBranchLocationAdministrativePlanInstanceReportData(String branchLocationAdministrativePlanInstanceReportData) {
    this.branchLocationAdministrativePlanInstanceReportData = branchLocationAdministrativePlanInstanceReportData;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external report available 
   * @return branchLocationAdministrativePlanInstanceReportType
  **/

  public String getBranchLocationAdministrativePlanInstanceReportType() {
    return branchLocationAdministrativePlanInstanceReportType;
  }

  public void setBranchLocationAdministrativePlanInstanceReportType(String branchLocationAdministrativePlanInstanceReportType) {
    this.branchLocationAdministrativePlanInstanceReportType = branchLocationAdministrativePlanInstanceReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external report in any suitable form including selection filters where appropriate 
   * @return branchLocationAdministrativePlanInstanceReport
  **/

  public Object getBranchLocationAdministrativePlanInstanceReport() {
    return branchLocationAdministrativePlanInstanceReport;
  }

  public void setBranchLocationAdministrativePlanInstanceReport(Object branchLocationAdministrativePlanInstanceReport) {
    this.branchLocationAdministrativePlanInstanceReport = branchLocationAdministrativePlanInstanceReport;
  }


}

