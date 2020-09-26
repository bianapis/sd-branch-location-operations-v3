package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQStaffAssignmentCaptureOutputModel
 */
public class BQStaffAssignmentCaptureOutputModel   {
  private String staffAssignmentPreconditions = null;

  private String staffAssignmentBusinessUnitEmployeeReference = null;

  private String staffAssignmentWorkSchedule = null;

  private String staffAssignmentPostconditions = null;

  private String staffAssignmentStaffAssignmentServiceType = null;

  private String staffAssignmentStaffAssignmentServiceDescription = null;

  private String staffAssignmentStaffAssignmentServiceInputsandOuputs = null;

  private String staffAssignmentStaffAssignmentServiceWorkProduct = null;

  private String staffAssignmentStaffAssignmentServiceName = null;

  private String staffAssignmentCaptureActionTaskReference = null;

  private Object staffAssignmentCaptureActionTaskRecord = null;

  private String staffAssignmentCaptureRecordReference = null;

  private Object captureResponseRecord = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The required status/situation before the routine can be undertaken 
   * @return staffAssignmentPreconditions
  **/

  public String getStaffAssignmentPreconditions() {
    return staffAssignmentPreconditions;
  }

  public void setStaffAssignmentPreconditions(String staffAssignmentPreconditions) {
    this.staffAssignmentPreconditions = staffAssignmentPreconditions;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: The operating unit/employee responsible for performing the routine 
   * @return staffAssignmentBusinessUnitEmployeeReference
  **/

  public String getStaffAssignmentBusinessUnitEmployeeReference() {
    return staffAssignmentBusinessUnitEmployeeReference;
  }

  public void setStaffAssignmentBusinessUnitEmployeeReference(String staffAssignmentBusinessUnitEmployeeReference) {
    this.staffAssignmentBusinessUnitEmployeeReference = staffAssignmentBusinessUnitEmployeeReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The timing and key actions/milestones involved in completing the routine 
   * @return staffAssignmentWorkSchedule
  **/

  public String getStaffAssignmentWorkSchedule() {
    return staffAssignmentWorkSchedule;
  }

  public void setStaffAssignmentWorkSchedule(String staffAssignmentWorkSchedule) {
    this.staffAssignmentWorkSchedule = staffAssignmentWorkSchedule;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The completion status once the routine has been completed (note the need to fulfill a routine may recur frequently) 
   * @return staffAssignmentPostconditions
  **/

  public String getStaffAssignmentPostconditions() {
    return staffAssignmentPostconditions;
  }

  public void setStaffAssignmentPostconditions(String staffAssignmentPostconditions) {
    this.staffAssignmentPostconditions = staffAssignmentPostconditions;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Reference to the specific business service type 
   * @return staffAssignmentStaffAssignmentServiceType
  **/

  public String getStaffAssignmentStaffAssignmentServiceType() {
    return staffAssignmentStaffAssignmentServiceType;
  }

  public void setStaffAssignmentStaffAssignmentServiceType(String staffAssignmentStaffAssignmentServiceType) {
    this.staffAssignmentStaffAssignmentServiceType = staffAssignmentStaffAssignmentServiceType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Description of the performed business service 
   * @return staffAssignmentStaffAssignmentServiceDescription
  **/

  public String getStaffAssignmentStaffAssignmentServiceDescription() {
    return staffAssignmentStaffAssignmentServiceDescription;
  }

  public void setStaffAssignmentStaffAssignmentServiceDescription(String staffAssignmentStaffAssignmentServiceDescription) {
    this.staffAssignmentStaffAssignmentServiceDescription = staffAssignmentStaffAssignmentServiceDescription;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Mandatory and optional inputs and output information for the business service 
   * @return staffAssignmentStaffAssignmentServiceInputsandOuputs
  **/

  public String getStaffAssignmentStaffAssignmentServiceInputsandOuputs() {
    return staffAssignmentStaffAssignmentServiceInputsandOuputs;
  }

  public void setStaffAssignmentStaffAssignmentServiceInputsandOuputs(String staffAssignmentStaffAssignmentServiceInputsandOuputs) {
    this.staffAssignmentStaffAssignmentServiceInputsandOuputs = staffAssignmentStaffAssignmentServiceInputsandOuputs;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Documentation, meeting schedules, notes, reasearch. calculations and any other work products produced by the business service 
   * @return staffAssignmentStaffAssignmentServiceWorkProduct
  **/

  public String getStaffAssignmentStaffAssignmentServiceWorkProduct() {
    return staffAssignmentStaffAssignmentServiceWorkProduct;
  }

  public void setStaffAssignmentStaffAssignmentServiceWorkProduct(String staffAssignmentStaffAssignmentServiceWorkProduct) {
    this.staffAssignmentStaffAssignmentServiceWorkProduct = staffAssignmentStaffAssignmentServiceWorkProduct;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info:  
   * @return staffAssignmentStaffAssignmentServiceName
  **/

  public String getStaffAssignmentStaffAssignmentServiceName() {
    return staffAssignmentStaffAssignmentServiceName;
  }

  public void setStaffAssignmentStaffAssignmentServiceName(String staffAssignmentStaffAssignmentServiceName) {
    this.staffAssignmentStaffAssignmentServiceName = staffAssignmentStaffAssignmentServiceName;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Staff Assignment instance capture service call 
   * @return staffAssignmentCaptureActionTaskReference
  **/

  public String getStaffAssignmentCaptureActionTaskReference() {
    return staffAssignmentCaptureActionTaskReference;
  }

  public void setStaffAssignmentCaptureActionTaskReference(String staffAssignmentCaptureActionTaskReference) {
    this.staffAssignmentCaptureActionTaskReference = staffAssignmentCaptureActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The capture service call consolidated processing record 
   * @return staffAssignmentCaptureActionTaskRecord
  **/

  public Object getStaffAssignmentCaptureActionTaskRecord() {
    return staffAssignmentCaptureActionTaskRecord;
  }

  public void setStaffAssignmentCaptureActionTaskRecord(Object staffAssignmentCaptureActionTaskRecord) {
    this.staffAssignmentCaptureActionTaskRecord = staffAssignmentCaptureActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Staff Assignment structured input transaction/record 
   * @return staffAssignmentCaptureRecordReference
  **/

  public String getStaffAssignmentCaptureRecordReference() {
    return staffAssignmentCaptureRecordReference;
  }

  public void setStaffAssignmentCaptureRecordReference(String staffAssignmentCaptureRecordReference) {
    this.staffAssignmentCaptureRecordReference = staffAssignmentCaptureRecordReference;
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

