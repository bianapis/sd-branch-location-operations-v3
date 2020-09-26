package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRBranchLocationAdministrativePlanRetrieveOutputModelBranchLocationAdministrativePlanInstanceAnalysis
 */
public class CRBranchLocationAdministrativePlanRetrieveOutputModelBranchLocationAdministrativePlanInstanceAnalysis   {
  private String branchLocationAdministrativePlanInstanceAnalysisData = null;

  private String branchLocationAdministrativePlanInstanceAnalysisReportType = null;

  private Object branchLocationAdministrativePlanInstanceAnalysisReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The inputs and results of the instance analysis that can be on-going, periodic and actual and projected 
   * @return branchLocationAdministrativePlanInstanceAnalysisData
  **/

  public String getBranchLocationAdministrativePlanInstanceAnalysisData() {
    return branchLocationAdministrativePlanInstanceAnalysisData;
  }

  public void setBranchLocationAdministrativePlanInstanceAnalysisData(String branchLocationAdministrativePlanInstanceAnalysisData) {
    this.branchLocationAdministrativePlanInstanceAnalysisData = branchLocationAdministrativePlanInstanceAnalysisData;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external performance analysis report available 
   * @return branchLocationAdministrativePlanInstanceAnalysisReportType
  **/

  public String getBranchLocationAdministrativePlanInstanceAnalysisReportType() {
    return branchLocationAdministrativePlanInstanceAnalysisReportType;
  }

  public void setBranchLocationAdministrativePlanInstanceAnalysisReportType(String branchLocationAdministrativePlanInstanceAnalysisReportType) {
    this.branchLocationAdministrativePlanInstanceAnalysisReportType = branchLocationAdministrativePlanInstanceAnalysisReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external analysis report in any suitable form including selection filters where appropriate 
   * @return branchLocationAdministrativePlanInstanceAnalysisReport
  **/

  public Object getBranchLocationAdministrativePlanInstanceAnalysisReport() {
    return branchLocationAdministrativePlanInstanceAnalysisReport;
  }

  public void setBranchLocationAdministrativePlanInstanceAnalysisReport(Object branchLocationAdministrativePlanInstanceAnalysisReport) {
    this.branchLocationAdministrativePlanInstanceAnalysisReport = branchLocationAdministrativePlanInstanceAnalysisReport;
  }


}

