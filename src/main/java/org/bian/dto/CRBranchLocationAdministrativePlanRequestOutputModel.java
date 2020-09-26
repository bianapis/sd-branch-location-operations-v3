package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRBranchLocationAdministrativePlanRequestOutputModel
 */
public class CRBranchLocationAdministrativePlanRequestOutputModel   {
  private String branchLocationAdministrativePlanBudgetType = null;

  private String branchLocationAdministrativePlanAssignment = null;

  private String branchLocationAdministrativePlanPlan = null;

  private String branchLocationAdministrativePlanRequestActionTaskReference = null;

  private Object branchLocationAdministrativePlanRequestActionTaskRecord = null;

  private String requestRecordReference = null;

  private Object requestResponseRecord = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Branch Location Administrative Plan instance request service call 
   * @return branchLocationAdministrativePlanRequestActionTaskReference
  **/

  public String getBranchLocationAdministrativePlanRequestActionTaskReference() {
    return branchLocationAdministrativePlanRequestActionTaskReference;
  }

  public void setBranchLocationAdministrativePlanRequestActionTaskReference(String branchLocationAdministrativePlanRequestActionTaskReference) {
    this.branchLocationAdministrativePlanRequestActionTaskReference = branchLocationAdministrativePlanRequestActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The request service call consolidated processing record 
   * @return branchLocationAdministrativePlanRequestActionTaskRecord
  **/

  public Object getBranchLocationAdministrativePlanRequestActionTaskRecord() {
    return branchLocationAdministrativePlanRequestActionTaskRecord;
  }

  public void setBranchLocationAdministrativePlanRequestActionTaskRecord(Object branchLocationAdministrativePlanRequestActionTaskRecord) {
    this.branchLocationAdministrativePlanRequestActionTaskRecord = branchLocationAdministrativePlanRequestActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the service request record 
   * @return requestRecordReference
  **/

  public String getRequestRecordReference() {
    return requestRecordReference;
  }

  public void setRequestRecordReference(String requestRecordReference) {
    this.requestRecordReference = requestRecordReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: Details of the request action service response 
   * @return requestResponseRecord
  **/

  public Object getRequestResponseRecord() {
    return requestResponseRecord;
  }

  public void setRequestResponseRecord(Object requestResponseRecord) {
    this.requestResponseRecord = requestResponseRecord;
  }


}

