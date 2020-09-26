package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRBranchLocationAdministrativePlanRetrieveOutputModelBranchLocationAdministrativePlanInstanceAnalysis;
import org.bian.dto.CRBranchLocationAdministrativePlanRetrieveOutputModelBranchLocationAdministrativePlanInstanceReportRecord;

import javax.validation.Valid;
  
/**
 * CRBranchLocationAdministrativePlanRetrieveOutputModel
 */
public class CRBranchLocationAdministrativePlanRetrieveOutputModel   {
  private String branchLocationAdministrativePlanBudgetType = null;

  private String branchLocationAdministrativePlanAssignment = null;

  private String branchLocationAdministrativePlanPlan = null;

  private String branchLocationAdministrativePlanReference = null;

  private String branchLocationAdministrativePlanRetrieveActionTaskReference = null;

  private Object branchLocationAdministrativePlanRetrieveActionTaskRecord = null;

  private String branchLocationAdministrativePlanRetrieveActionResponse = null;

  private CRBranchLocationAdministrativePlanRetrieveOutputModelBranchLocationAdministrativePlanInstanceReportRecord branchLocationAdministrativePlanInstanceReportRecord = null;

  private CRBranchLocationAdministrativePlanRetrieveOutputModelBranchLocationAdministrativePlanInstanceAnalysis branchLocationAdministrativePlanInstanceAnalysis = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: A Classification value that distinguishes between Budgets within Branch Location Administrative Plan according to the type of resource and/or activity that is budgetted 
   * @return branchLocationAdministrativePlanBudgetType
  **/

  public String getBranchLocationAdministrativePlanBudgetType() {
    return branchLocationAdministrativePlanBudgetType;
  }

  public void setBranchLocationAdministrativePlanBudgetType(String branchLocationAdministrativePlanBudgetType) {
    this.branchLocationAdministrativePlanBudgetType = branchLocationAdministrativePlanBudgetType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The allocation of someone or something which is specified for Branch Location Administrative Plan 
   * @return branchLocationAdministrativePlanAssignment
  **/

  public String getBranchLocationAdministrativePlanAssignment() {
    return branchLocationAdministrativePlanAssignment;
  }

  public void setBranchLocationAdministrativePlanAssignment(String branchLocationAdministrativePlanAssignment) {
    this.branchLocationAdministrativePlanAssignment = branchLocationAdministrativePlanAssignment;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: A plan that defines clerical support for BranchLocation 
   * @return branchLocationAdministrativePlanPlan
  **/

  public String getBranchLocationAdministrativePlanPlan() {
    return branchLocationAdministrativePlanPlan;
  }

  public void setBranchLocationAdministrativePlanPlan(String branchLocationAdministrativePlanPlan) {
    this.branchLocationAdministrativePlanPlan = branchLocationAdministrativePlanPlan;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Party who is involved in Branch Location Administrative Plan 
   * @return branchLocationAdministrativePlanReference
  **/

  public String getBranchLocationAdministrativePlanReference() {
    return branchLocationAdministrativePlanReference;
  }

  public void setBranchLocationAdministrativePlanReference(String branchLocationAdministrativePlanReference) {
    this.branchLocationAdministrativePlanReference = branchLocationAdministrativePlanReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Branch Location Administrative Plan instance retrieve service call 
   * @return branchLocationAdministrativePlanRetrieveActionTaskReference
  **/

  public String getBranchLocationAdministrativePlanRetrieveActionTaskReference() {
    return branchLocationAdministrativePlanRetrieveActionTaskReference;
  }

  public void setBranchLocationAdministrativePlanRetrieveActionTaskReference(String branchLocationAdministrativePlanRetrieveActionTaskReference) {
    this.branchLocationAdministrativePlanRetrieveActionTaskReference = branchLocationAdministrativePlanRetrieveActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return branchLocationAdministrativePlanRetrieveActionTaskRecord
  **/

  public Object getBranchLocationAdministrativePlanRetrieveActionTaskRecord() {
    return branchLocationAdministrativePlanRetrieveActionTaskRecord;
  }

  public void setBranchLocationAdministrativePlanRetrieveActionTaskRecord(Object branchLocationAdministrativePlanRetrieveActionTaskRecord) {
    this.branchLocationAdministrativePlanRetrieveActionTaskRecord = branchLocationAdministrativePlanRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service response (lists returned reports) 
   * @return branchLocationAdministrativePlanRetrieveActionResponse
  **/

  public String getBranchLocationAdministrativePlanRetrieveActionResponse() {
    return branchLocationAdministrativePlanRetrieveActionResponse;
  }

  public void setBranchLocationAdministrativePlanRetrieveActionResponse(String branchLocationAdministrativePlanRetrieveActionResponse) {
    this.branchLocationAdministrativePlanRetrieveActionResponse = branchLocationAdministrativePlanRetrieveActionResponse;
  }


  /**
   * Get branchLocationAdministrativePlanInstanceReportRecord
   * @return branchLocationAdministrativePlanInstanceReportRecord
  **/

  public CRBranchLocationAdministrativePlanRetrieveOutputModelBranchLocationAdministrativePlanInstanceReportRecord getBranchLocationAdministrativePlanInstanceReportRecord() {
    return branchLocationAdministrativePlanInstanceReportRecord;
  }

  public void setBranchLocationAdministrativePlanInstanceReportRecord(CRBranchLocationAdministrativePlanRetrieveOutputModelBranchLocationAdministrativePlanInstanceReportRecord branchLocationAdministrativePlanInstanceReportRecord) {
    this.branchLocationAdministrativePlanInstanceReportRecord = branchLocationAdministrativePlanInstanceReportRecord;
  }


  /**
   * Get branchLocationAdministrativePlanInstanceAnalysis
   * @return branchLocationAdministrativePlanInstanceAnalysis
  **/

  public CRBranchLocationAdministrativePlanRetrieveOutputModelBranchLocationAdministrativePlanInstanceAnalysis getBranchLocationAdministrativePlanInstanceAnalysis() {
    return branchLocationAdministrativePlanInstanceAnalysis;
  }

  public void setBranchLocationAdministrativePlanInstanceAnalysis(CRBranchLocationAdministrativePlanRetrieveOutputModelBranchLocationAdministrativePlanInstanceAnalysis branchLocationAdministrativePlanInstanceAnalysis) {
    this.branchLocationAdministrativePlanInstanceAnalysis = branchLocationAdministrativePlanInstanceAnalysis;
  }


}

