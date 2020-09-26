package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRBranchLocationAdministrativePlanControlInputModelBranchLocationAdministrativePlanControlActionRequest;

import javax.validation.Valid;
  
/**
 * CRBranchLocationAdministrativePlanControlInputModel
 */
public class CRBranchLocationAdministrativePlanControlInputModel   {
  private String branchLocationOperationsServicingSessionReference = null;

  private String branchLocationAdministrativePlanInstanceReference = null;

  private String branchLocationAdministrativePlanBudgetType = null;

  private String branchLocationAdministrativePlanAssignment = null;

  private String branchLocationAdministrativePlanPlan = null;

  private String branchLocationAdministrativePlanReference = null;

  private Object branchLocationAdministrativePlanControlActionTaskRecord = null;

  private CRBranchLocationAdministrativePlanControlInputModelBranchLocationAdministrativePlanControlActionRequest branchLocationAdministrativePlanControlActionRequest = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the active servicing session 
   * @return branchLocationOperationsServicingSessionReference
  **/

  public String getBranchLocationOperationsServicingSessionReference() {
    return branchLocationOperationsServicingSessionReference;
  }

  public void setBranchLocationOperationsServicingSessionReference(String branchLocationOperationsServicingSessionReference) {
    this.branchLocationOperationsServicingSessionReference = branchLocationOperationsServicingSessionReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Branch Location Administrative Plan instance 
   * @return branchLocationAdministrativePlanInstanceReference
  **/

  public String getBranchLocationAdministrativePlanInstanceReference() {
    return branchLocationAdministrativePlanInstanceReference;
  }

  public void setBranchLocationAdministrativePlanInstanceReference(String branchLocationAdministrativePlanInstanceReference) {
    this.branchLocationAdministrativePlanInstanceReference = branchLocationAdministrativePlanInstanceReference;
  }


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
   * Get branchLocationAdministrativePlanControlActionRequest
   * @return branchLocationAdministrativePlanControlActionRequest
  **/

  public CRBranchLocationAdministrativePlanControlInputModelBranchLocationAdministrativePlanControlActionRequest getBranchLocationAdministrativePlanControlActionRequest() {
    return branchLocationAdministrativePlanControlActionRequest;
  }

  public void setBranchLocationAdministrativePlanControlActionRequest(CRBranchLocationAdministrativePlanControlInputModelBranchLocationAdministrativePlanControlActionRequest branchLocationAdministrativePlanControlActionRequest) {
    this.branchLocationAdministrativePlanControlActionRequest = branchLocationAdministrativePlanControlActionRequest;
  }


}

