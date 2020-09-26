package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRBranchLocationAdministrativePlanExchangeOutputModel
 */
public class CRBranchLocationAdministrativePlanExchangeOutputModel   {
  private String branchLocationAdministrativePlanBudgetType = null;

  private String branchLocationAdministrativePlanAssignment = null;

  private String branchLocationAdministrativePlanPlan = null;

  private String branchLocationAdministrativePlanExchangeActionTaskReference = null;

  private Object branchLocationAdministrativePlanExchangeActionTaskRecord = null;

  private String branchLocationAdministrativePlanExchangeActionResponse = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Branch Location Administrative Plan instance exchange service call 
   * @return branchLocationAdministrativePlanExchangeActionTaskReference
  **/

  public String getBranchLocationAdministrativePlanExchangeActionTaskReference() {
    return branchLocationAdministrativePlanExchangeActionTaskReference;
  }

  public void setBranchLocationAdministrativePlanExchangeActionTaskReference(String branchLocationAdministrativePlanExchangeActionTaskReference) {
    this.branchLocationAdministrativePlanExchangeActionTaskReference = branchLocationAdministrativePlanExchangeActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The exchange service call consolidated processing record 
   * @return branchLocationAdministrativePlanExchangeActionTaskRecord
  **/

  public Object getBranchLocationAdministrativePlanExchangeActionTaskRecord() {
    return branchLocationAdministrativePlanExchangeActionTaskRecord;
  }

  public void setBranchLocationAdministrativePlanExchangeActionTaskRecord(Object branchLocationAdministrativePlanExchangeActionTaskRecord) {
    this.branchLocationAdministrativePlanExchangeActionTaskRecord = branchLocationAdministrativePlanExchangeActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the exchange action service response 
   * @return branchLocationAdministrativePlanExchangeActionResponse
  **/

  public String getBranchLocationAdministrativePlanExchangeActionResponse() {
    return branchLocationAdministrativePlanExchangeActionResponse;
  }

  public void setBranchLocationAdministrativePlanExchangeActionResponse(String branchLocationAdministrativePlanExchangeActionResponse) {
    this.branchLocationAdministrativePlanExchangeActionResponse = branchLocationAdministrativePlanExchangeActionResponse;
  }


}

