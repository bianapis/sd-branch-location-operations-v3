package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRBranchLocationAdministrativePlanCaptureOutputModel
 */
public class CRBranchLocationAdministrativePlanCaptureOutputModel   {
  private String branchLocationAdministrativePlanBudgetType = null;

  private String branchLocationAdministrativePlanAssignment = null;

  private String branchLocationAdministrativePlanPlan = null;

  private String branchLocationAdministrativePlanCaptureActionTaskReference = null;

  private Object branchLocationAdministrativePlanCaptureActionTaskRecord = null;

  private String captureRecordReference = null;

  private Object captureResponseRecord = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Branch Location Administrative Plan instance capture service call 
   * @return branchLocationAdministrativePlanCaptureActionTaskReference
  **/

  public String getBranchLocationAdministrativePlanCaptureActionTaskReference() {
    return branchLocationAdministrativePlanCaptureActionTaskReference;
  }

  public void setBranchLocationAdministrativePlanCaptureActionTaskReference(String branchLocationAdministrativePlanCaptureActionTaskReference) {
    this.branchLocationAdministrativePlanCaptureActionTaskReference = branchLocationAdministrativePlanCaptureActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The capture service call consolidated processing record 
   * @return branchLocationAdministrativePlanCaptureActionTaskRecord
  **/

  public Object getBranchLocationAdministrativePlanCaptureActionTaskRecord() {
    return branchLocationAdministrativePlanCaptureActionTaskRecord;
  }

  public void setBranchLocationAdministrativePlanCaptureActionTaskRecord(Object branchLocationAdministrativePlanCaptureActionTaskRecord) {
    this.branchLocationAdministrativePlanCaptureActionTaskRecord = branchLocationAdministrativePlanCaptureActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the structured input transaction/record 
   * @return captureRecordReference
  **/

  public String getCaptureRecordReference() {
    return captureRecordReference;
  }

  public void setCaptureRecordReference(String captureRecordReference) {
    this.captureRecordReference = captureRecordReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: Details of the capture action service response 
   * @return captureResponseRecord
  **/

  public Object getCaptureResponseRecord() {
    return captureResponseRecord;
  }

  public void setCaptureResponseRecord(Object captureResponseRecord) {
    this.captureResponseRecord = captureResponseRecord;
  }


}

