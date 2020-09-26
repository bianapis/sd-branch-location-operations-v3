package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRBranchLocationAdministrativePlanControlOutputModel
 */
public class CRBranchLocationAdministrativePlanControlOutputModel   {
  private String branchLocationAdministrativePlanBudgetType = null;

  private String branchLocationAdministrativePlanAssignment = null;

  private String branchLocationAdministrativePlanPlan = null;

  private String branchLocationAdministrativePlanControlActionTaskReference = null;

  private Object branchLocationAdministrativePlanControlActionTaskRecord = null;

  private String branchLocationAdministrativePlanControlActionResponse = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Branch Location Administrative Plan instance control processing service call 
   * @return branchLocationAdministrativePlanControlActionTaskReference
  **/

  public String getBranchLocationAdministrativePlanControlActionTaskReference() {
    return branchLocationAdministrativePlanControlActionTaskReference;
  }

  public void setBranchLocationAdministrativePlanControlActionTaskReference(String branchLocationAdministrativePlanControlActionTaskReference) {
    this.branchLocationAdministrativePlanControlActionTaskReference = branchLocationAdministrativePlanControlActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The processing control service call consolidated processing record 
   * @return branchLocationAdministrativePlanControlActionTaskRecord
  **/

  public Object getBranchLocationAdministrativePlanControlActionTaskRecord() {
    return branchLocationAdministrativePlanControlActionTaskRecord;
  }

  public void setBranchLocationAdministrativePlanControlActionTaskRecord(Object branchLocationAdministrativePlanControlActionTaskRecord) {
    this.branchLocationAdministrativePlanControlActionTaskRecord = branchLocationAdministrativePlanControlActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the control action service response 
   * @return branchLocationAdministrativePlanControlActionResponse
  **/

  public String getBranchLocationAdministrativePlanControlActionResponse() {
    return branchLocationAdministrativePlanControlActionResponse;
  }

  public void setBranchLocationAdministrativePlanControlActionResponse(String branchLocationAdministrativePlanControlActionResponse) {
    this.branchLocationAdministrativePlanControlActionResponse = branchLocationAdministrativePlanControlActionResponse;
  }


}

