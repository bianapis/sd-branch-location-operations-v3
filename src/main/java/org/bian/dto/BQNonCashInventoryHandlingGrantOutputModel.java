package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRBranchLocationAdministrativePlanGrantOutputModelGrantRequestResponseRecord;

import javax.validation.Valid;
  
/**
 * BQNonCashInventoryHandlingGrantOutputModel
 */
public class BQNonCashInventoryHandlingGrantOutputModel   {
  private String nonCashInventoryHandlingGrantActionTaskReference = null;

  private Object nonCashInventoryHandlingGrantActionTaskRecord = null;

  private String grantRequestRecordReference = null;

  private CRBranchLocationAdministrativePlanGrantOutputModelGrantRequestResponseRecord grantRequestResponseRecord = null;

  private String safeCustodyOperationsPreconditions = null;

  private String safeCustodyOperationsBusinessUnitEmployeeReference = null;

  private String safeCustodyOperationsWorkSchedule = null;

  private String safeCustodyOperationsPostconditions = null;

  private String safeCustodyOperationsSafeCustodyOperationsServiceType = null;

  private String safeCustodyOperationsSafeCustodyOperationsServiceDescription = null;

  private String safeCustodyOperationsSafeCustodyOperationsServiceInputsandOuputs = null;

  private String safeCustodyOperationsSafeCustodyOperationsServiceWorkProduct = null;

  private String safeCustodyOperationsSafeCustodyOperationsServiceName = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Non Cash Inventory Handling instance grant service call 
   * @return nonCashInventoryHandlingGrantActionTaskReference
  **/

  public String getNonCashInventoryHandlingGrantActionTaskReference() {
    return nonCashInventoryHandlingGrantActionTaskReference;
  }

  public void setNonCashInventoryHandlingGrantActionTaskReference(String nonCashInventoryHandlingGrantActionTaskReference) {
    this.nonCashInventoryHandlingGrantActionTaskReference = nonCashInventoryHandlingGrantActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The grant service call consolidated processing record 
   * @return nonCashInventoryHandlingGrantActionTaskRecord
  **/

  public Object getNonCashInventoryHandlingGrantActionTaskRecord() {
    return nonCashInventoryHandlingGrantActionTaskRecord;
  }

  public void setNonCashInventoryHandlingGrantActionTaskRecord(Object nonCashInventoryHandlingGrantActionTaskRecord) {
    this.nonCashInventoryHandlingGrantActionTaskRecord = nonCashInventoryHandlingGrantActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the grant request record 
   * @return grantRequestRecordReference
  **/

  public String getGrantRequestRecordReference() {
    return grantRequestRecordReference;
  }

  public void setGrantRequestRecordReference(String grantRequestRecordReference) {
    this.grantRequestRecordReference = grantRequestRecordReference;
  }


  /**
   * Get grantRequestResponseRecord
   * @return grantRequestResponseRecord
  **/

  public CRBranchLocationAdministrativePlanGrantOutputModelGrantRequestResponseRecord getGrantRequestResponseRecord() {
    return grantRequestResponseRecord;
  }

  public void setGrantRequestResponseRecord(CRBranchLocationAdministrativePlanGrantOutputModelGrantRequestResponseRecord grantRequestResponseRecord) {
    this.grantRequestResponseRecord = grantRequestResponseRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The required status/situation before the routine can be undertaken 
   * @return safeCustodyOperationsPreconditions
  **/

  public String getSafeCustodyOperationsPreconditions() {
    return safeCustodyOperationsPreconditions;
  }

  public void setSafeCustodyOperationsPreconditions(String safeCustodyOperationsPreconditions) {
    this.safeCustodyOperationsPreconditions = safeCustodyOperationsPreconditions;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: The operating unit/employee responsible for performing the routine 
   * @return safeCustodyOperationsBusinessUnitEmployeeReference
  **/

  public String getSafeCustodyOperationsBusinessUnitEmployeeReference() {
    return safeCustodyOperationsBusinessUnitEmployeeReference;
  }

  public void setSafeCustodyOperationsBusinessUnitEmployeeReference(String safeCustodyOperationsBusinessUnitEmployeeReference) {
    this.safeCustodyOperationsBusinessUnitEmployeeReference = safeCustodyOperationsBusinessUnitEmployeeReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The timing and key actions/milestones involved in completing the routine 
   * @return safeCustodyOperationsWorkSchedule
  **/

  public String getSafeCustodyOperationsWorkSchedule() {
    return safeCustodyOperationsWorkSchedule;
  }

  public void setSafeCustodyOperationsWorkSchedule(String safeCustodyOperationsWorkSchedule) {
    this.safeCustodyOperationsWorkSchedule = safeCustodyOperationsWorkSchedule;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The completion status once the routine has been completed (note the need to fulfill a routine may recur frequently) 
   * @return safeCustodyOperationsPostconditions
  **/

  public String getSafeCustodyOperationsPostconditions() {
    return safeCustodyOperationsPostconditions;
  }

  public void setSafeCustodyOperationsPostconditions(String safeCustodyOperationsPostconditions) {
    this.safeCustodyOperationsPostconditions = safeCustodyOperationsPostconditions;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Reference to the specific business service type 
   * @return safeCustodyOperationsSafeCustodyOperationsServiceType
  **/

  public String getSafeCustodyOperationsSafeCustodyOperationsServiceType() {
    return safeCustodyOperationsSafeCustodyOperationsServiceType;
  }

  public void setSafeCustodyOperationsSafeCustodyOperationsServiceType(String safeCustodyOperationsSafeCustodyOperationsServiceType) {
    this.safeCustodyOperationsSafeCustodyOperationsServiceType = safeCustodyOperationsSafeCustodyOperationsServiceType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Description of the performed business service 
   * @return safeCustodyOperationsSafeCustodyOperationsServiceDescription
  **/

  public String getSafeCustodyOperationsSafeCustodyOperationsServiceDescription() {
    return safeCustodyOperationsSafeCustodyOperationsServiceDescription;
  }

  public void setSafeCustodyOperationsSafeCustodyOperationsServiceDescription(String safeCustodyOperationsSafeCustodyOperationsServiceDescription) {
    this.safeCustodyOperationsSafeCustodyOperationsServiceDescription = safeCustodyOperationsSafeCustodyOperationsServiceDescription;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Mandatory and optional inputs and output information for the business service 
   * @return safeCustodyOperationsSafeCustodyOperationsServiceInputsandOuputs
  **/

  public String getSafeCustodyOperationsSafeCustodyOperationsServiceInputsandOuputs() {
    return safeCustodyOperationsSafeCustodyOperationsServiceInputsandOuputs;
  }

  public void setSafeCustodyOperationsSafeCustodyOperationsServiceInputsandOuputs(String safeCustodyOperationsSafeCustodyOperationsServiceInputsandOuputs) {
    this.safeCustodyOperationsSafeCustodyOperationsServiceInputsandOuputs = safeCustodyOperationsSafeCustodyOperationsServiceInputsandOuputs;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Documentation, meeting schedules, notes, reasearch. calculations and any other work products produced by the business service 
   * @return safeCustodyOperationsSafeCustodyOperationsServiceWorkProduct
  **/

  public String getSafeCustodyOperationsSafeCustodyOperationsServiceWorkProduct() {
    return safeCustodyOperationsSafeCustodyOperationsServiceWorkProduct;
  }

  public void setSafeCustodyOperationsSafeCustodyOperationsServiceWorkProduct(String safeCustodyOperationsSafeCustodyOperationsServiceWorkProduct) {
    this.safeCustodyOperationsSafeCustodyOperationsServiceWorkProduct = safeCustodyOperationsSafeCustodyOperationsServiceWorkProduct;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info:  
   * @return safeCustodyOperationsSafeCustodyOperationsServiceName
  **/

  public String getSafeCustodyOperationsSafeCustodyOperationsServiceName() {
    return safeCustodyOperationsSafeCustodyOperationsServiceName;
  }

  public void setSafeCustodyOperationsSafeCustodyOperationsServiceName(String safeCustodyOperationsSafeCustodyOperationsServiceName) {
    this.safeCustodyOperationsSafeCustodyOperationsServiceName = safeCustodyOperationsSafeCustodyOperationsServiceName;
  }


}

