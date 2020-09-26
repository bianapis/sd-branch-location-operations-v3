package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRBranchLocationAdministrativePlanRetrieveInputModelBranchLocationAdministrativePlanInstanceAnalysis
 */
public class CRBranchLocationAdministrativePlanRetrieveInputModelBranchLocationAdministrativePlanInstanceAnalysis   {
  private String branchLocationAdministrativePlanInstanceAnalysisReference = null;

  private String branchLocationAdministrativePlanInstanceAnalysisReportType = null;

  private String branchLocationAdministrativePlanInstanceAnalysisParameters = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance analysis view 
   * @return branchLocationAdministrativePlanInstanceAnalysisReference
  **/

  public String getBranchLocationAdministrativePlanInstanceAnalysisReference() {
    return branchLocationAdministrativePlanInstanceAnalysisReference;
  }

  public void setBranchLocationAdministrativePlanInstanceAnalysisReference(String branchLocationAdministrativePlanInstanceAnalysisReference) {
    this.branchLocationAdministrativePlanInstanceAnalysisReference = branchLocationAdministrativePlanInstanceAnalysisReference;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the analysis (e.g. period, algorithm type) 
   * @return branchLocationAdministrativePlanInstanceAnalysisParameters
  **/

  public String getBranchLocationAdministrativePlanInstanceAnalysisParameters() {
    return branchLocationAdministrativePlanInstanceAnalysisParameters;
  }

  public void setBranchLocationAdministrativePlanInstanceAnalysisParameters(String branchLocationAdministrativePlanInstanceAnalysisParameters) {
    this.branchLocationAdministrativePlanInstanceAnalysisParameters = branchLocationAdministrativePlanInstanceAnalysisParameters;
  }


}

