package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQCashInventoryHandlingCaptureOutputModel
 */
public class BQCashInventoryHandlingCaptureOutputModel   {
  private String cashInventoryHandlingCaptureActionTaskReference = null;

  private Object cashInventoryHandlingCaptureActionTaskRecord = null;

  private String cashInventoryHandlingCaptureRecordReference = null;

  private Object captureResponseRecord = null;

  private String noncashInventoryHandlingPreconditions = null;

  private String noncashInventoryHandlingBusinessUnitEmployeeReference = null;

  private String noncashInventoryHandlingWorkSchedule = null;

  private String noncashInventoryHandlingPostconditions = null;

  private String noncashInventoryHandlingInventoryHandlingServiceType = null;

  private String noncashInventoryHandlingInventoryHandlingServiceDescription = null;

  private String noncashInventoryHandlingInventoryHandlingServiceInputsandOuputs = null;

  private String noncashInventoryHandlingInventoryHandlingServiceWorkProduct = null;

  private String noncashInventoryHandlingInventoryHandlingServiceName = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Cash Inventory Handling instance capture service call 
   * @return cashInventoryHandlingCaptureActionTaskReference
  **/

  public String getCashInventoryHandlingCaptureActionTaskReference() {
    return cashInventoryHandlingCaptureActionTaskReference;
  }

  public void setCashInventoryHandlingCaptureActionTaskReference(String cashInventoryHandlingCaptureActionTaskReference) {
    this.cashInventoryHandlingCaptureActionTaskReference = cashInventoryHandlingCaptureActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The capture service call consolidated processing record 
   * @return cashInventoryHandlingCaptureActionTaskRecord
  **/

  public Object getCashInventoryHandlingCaptureActionTaskRecord() {
    return cashInventoryHandlingCaptureActionTaskRecord;
  }

  public void setCashInventoryHandlingCaptureActionTaskRecord(Object cashInventoryHandlingCaptureActionTaskRecord) {
    this.cashInventoryHandlingCaptureActionTaskRecord = cashInventoryHandlingCaptureActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Cash Inventory Handling structured input transaction/record 
   * @return cashInventoryHandlingCaptureRecordReference
  **/

  public String getCashInventoryHandlingCaptureRecordReference() {
    return cashInventoryHandlingCaptureRecordReference;
  }

  public void setCashInventoryHandlingCaptureRecordReference(String cashInventoryHandlingCaptureRecordReference) {
    this.cashInventoryHandlingCaptureRecordReference = cashInventoryHandlingCaptureRecordReference;
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


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The required status/situation before the routine can be undertaken 
   * @return noncashInventoryHandlingPreconditions
  **/

  public String getNoncashInventoryHandlingPreconditions() {
    return noncashInventoryHandlingPreconditions;
  }

  public void setNoncashInventoryHandlingPreconditions(String noncashInventoryHandlingPreconditions) {
    this.noncashInventoryHandlingPreconditions = noncashInventoryHandlingPreconditions;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: The operating unit/employee responsible for performing the routine 
   * @return noncashInventoryHandlingBusinessUnitEmployeeReference
  **/

  public String getNoncashInventoryHandlingBusinessUnitEmployeeReference() {
    return noncashInventoryHandlingBusinessUnitEmployeeReference;
  }

  public void setNoncashInventoryHandlingBusinessUnitEmployeeReference(String noncashInventoryHandlingBusinessUnitEmployeeReference) {
    this.noncashInventoryHandlingBusinessUnitEmployeeReference = noncashInventoryHandlingBusinessUnitEmployeeReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The timing and key actions/milestones involved in completing the routine 
   * @return noncashInventoryHandlingWorkSchedule
  **/

  public String getNoncashInventoryHandlingWorkSchedule() {
    return noncashInventoryHandlingWorkSchedule;
  }

  public void setNoncashInventoryHandlingWorkSchedule(String noncashInventoryHandlingWorkSchedule) {
    this.noncashInventoryHandlingWorkSchedule = noncashInventoryHandlingWorkSchedule;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The completion status once the routine has been completed (note the need to fulfill a routine may recur frequently) 
   * @return noncashInventoryHandlingPostconditions
  **/

  public String getNoncashInventoryHandlingPostconditions() {
    return noncashInventoryHandlingPostconditions;
  }

  public void setNoncashInventoryHandlingPostconditions(String noncashInventoryHandlingPostconditions) {
    this.noncashInventoryHandlingPostconditions = noncashInventoryHandlingPostconditions;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Reference to the specific business service type 
   * @return noncashInventoryHandlingInventoryHandlingServiceType
  **/

  public String getNoncashInventoryHandlingInventoryHandlingServiceType() {
    return noncashInventoryHandlingInventoryHandlingServiceType;
  }

  public void setNoncashInventoryHandlingInventoryHandlingServiceType(String noncashInventoryHandlingInventoryHandlingServiceType) {
    this.noncashInventoryHandlingInventoryHandlingServiceType = noncashInventoryHandlingInventoryHandlingServiceType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Description of the performed business service 
   * @return noncashInventoryHandlingInventoryHandlingServiceDescription
  **/

  public String getNoncashInventoryHandlingInventoryHandlingServiceDescription() {
    return noncashInventoryHandlingInventoryHandlingServiceDescription;
  }

  public void setNoncashInventoryHandlingInventoryHandlingServiceDescription(String noncashInventoryHandlingInventoryHandlingServiceDescription) {
    this.noncashInventoryHandlingInventoryHandlingServiceDescription = noncashInventoryHandlingInventoryHandlingServiceDescription;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Mandatory and optional inputs and output information for the business service 
   * @return noncashInventoryHandlingInventoryHandlingServiceInputsandOuputs
  **/

  public String getNoncashInventoryHandlingInventoryHandlingServiceInputsandOuputs() {
    return noncashInventoryHandlingInventoryHandlingServiceInputsandOuputs;
  }

  public void setNoncashInventoryHandlingInventoryHandlingServiceInputsandOuputs(String noncashInventoryHandlingInventoryHandlingServiceInputsandOuputs) {
    this.noncashInventoryHandlingInventoryHandlingServiceInputsandOuputs = noncashInventoryHandlingInventoryHandlingServiceInputsandOuputs;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Documentation, meeting schedules, notes, reasearch. calculations and any other work products produced by the business service 
   * @return noncashInventoryHandlingInventoryHandlingServiceWorkProduct
  **/

  public String getNoncashInventoryHandlingInventoryHandlingServiceWorkProduct() {
    return noncashInventoryHandlingInventoryHandlingServiceWorkProduct;
  }

  public void setNoncashInventoryHandlingInventoryHandlingServiceWorkProduct(String noncashInventoryHandlingInventoryHandlingServiceWorkProduct) {
    this.noncashInventoryHandlingInventoryHandlingServiceWorkProduct = noncashInventoryHandlingInventoryHandlingServiceWorkProduct;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info:  
   * @return noncashInventoryHandlingInventoryHandlingServiceName
  **/

  public String getNoncashInventoryHandlingInventoryHandlingServiceName() {
    return noncashInventoryHandlingInventoryHandlingServiceName;
  }

  public void setNoncashInventoryHandlingInventoryHandlingServiceName(String noncashInventoryHandlingInventoryHandlingServiceName) {
    this.noncashInventoryHandlingInventoryHandlingServiceName = noncashInventoryHandlingInventoryHandlingServiceName;
  }


}

