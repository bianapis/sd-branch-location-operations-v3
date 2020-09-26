package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQSafeCustodyOperationsRetrieveInputModelSafeCustodyOperationsInstanceAnalysis;
import org.bian.dto.BQSafeCustodyOperationsRetrieveInputModelSafeCustodyOperationsInstanceReport;

import javax.validation.Valid;
  
/**
 * BQSafeCustodyOperationsRetrieveInputModel
 */
public class BQSafeCustodyOperationsRetrieveInputModel   {
  private String cashInventoryHandlingPreconditions = null;

  private String cashInventoryHandlingBusinessUnitEmployeeReference = null;

  private String cashInventoryHandlingWorkSchedule = null;

  private String cashInventoryHandlingPostconditions = null;

  private String cashInventoryHandlingCashInventoryHandlingServiceType = null;

  private String cashInventoryHandlingCashInventoryHandlingServiceDescription = null;

  private String cashInventoryHandlingCashInventoryHandlingServiceInputsandOuputs = null;

  private String cashInventoryHandlingCashInventoryHandlingServiceWorkProduct = null;

  private Object safeCustodyOperationsRetrieveActionTaskRecord = null;

  private String safeCustodyOperationsRetrieveActionRequest = null;

  private BQSafeCustodyOperationsRetrieveInputModelSafeCustodyOperationsInstanceReport safeCustodyOperationsInstanceReport = null;

  private BQSafeCustodyOperationsRetrieveInputModelSafeCustodyOperationsInstanceAnalysis safeCustodyOperationsInstanceAnalysis = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The required status/situation before the routine can be undertaken 
   * @return cashInventoryHandlingPreconditions
  **/

  public String getCashInventoryHandlingPreconditions() {
    return cashInventoryHandlingPreconditions;
  }

  public void setCashInventoryHandlingPreconditions(String cashInventoryHandlingPreconditions) {
    this.cashInventoryHandlingPreconditions = cashInventoryHandlingPreconditions;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: The operating unit/employee responsible for performing the routine 
   * @return cashInventoryHandlingBusinessUnitEmployeeReference
  **/

  public String getCashInventoryHandlingBusinessUnitEmployeeReference() {
    return cashInventoryHandlingBusinessUnitEmployeeReference;
  }

  public void setCashInventoryHandlingBusinessUnitEmployeeReference(String cashInventoryHandlingBusinessUnitEmployeeReference) {
    this.cashInventoryHandlingBusinessUnitEmployeeReference = cashInventoryHandlingBusinessUnitEmployeeReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The timing and key actions/milestones involved in completing the routine 
   * @return cashInventoryHandlingWorkSchedule
  **/

  public String getCashInventoryHandlingWorkSchedule() {
    return cashInventoryHandlingWorkSchedule;
  }

  public void setCashInventoryHandlingWorkSchedule(String cashInventoryHandlingWorkSchedule) {
    this.cashInventoryHandlingWorkSchedule = cashInventoryHandlingWorkSchedule;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The completion status once the routine has been completed (note the need to fulfill a routine may recur frequently) 
   * @return cashInventoryHandlingPostconditions
  **/

  public String getCashInventoryHandlingPostconditions() {
    return cashInventoryHandlingPostconditions;
  }

  public void setCashInventoryHandlingPostconditions(String cashInventoryHandlingPostconditions) {
    this.cashInventoryHandlingPostconditions = cashInventoryHandlingPostconditions;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Reference to the specific business service type 
   * @return cashInventoryHandlingCashInventoryHandlingServiceType
  **/

  public String getCashInventoryHandlingCashInventoryHandlingServiceType() {
    return cashInventoryHandlingCashInventoryHandlingServiceType;
  }

  public void setCashInventoryHandlingCashInventoryHandlingServiceType(String cashInventoryHandlingCashInventoryHandlingServiceType) {
    this.cashInventoryHandlingCashInventoryHandlingServiceType = cashInventoryHandlingCashInventoryHandlingServiceType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Description of the performed business service 
   * @return cashInventoryHandlingCashInventoryHandlingServiceDescription
  **/

  public String getCashInventoryHandlingCashInventoryHandlingServiceDescription() {
    return cashInventoryHandlingCashInventoryHandlingServiceDescription;
  }

  public void setCashInventoryHandlingCashInventoryHandlingServiceDescription(String cashInventoryHandlingCashInventoryHandlingServiceDescription) {
    this.cashInventoryHandlingCashInventoryHandlingServiceDescription = cashInventoryHandlingCashInventoryHandlingServiceDescription;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Mandatory and optional inputs and output information for the business service 
   * @return cashInventoryHandlingCashInventoryHandlingServiceInputsandOuputs
  **/

  public String getCashInventoryHandlingCashInventoryHandlingServiceInputsandOuputs() {
    return cashInventoryHandlingCashInventoryHandlingServiceInputsandOuputs;
  }

  public void setCashInventoryHandlingCashInventoryHandlingServiceInputsandOuputs(String cashInventoryHandlingCashInventoryHandlingServiceInputsandOuputs) {
    this.cashInventoryHandlingCashInventoryHandlingServiceInputsandOuputs = cashInventoryHandlingCashInventoryHandlingServiceInputsandOuputs;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Documentation, meeting schedules, notes, reasearch. calculations and any other work products produced by the business service 
   * @return cashInventoryHandlingCashInventoryHandlingServiceWorkProduct
  **/

  public String getCashInventoryHandlingCashInventoryHandlingServiceWorkProduct() {
    return cashInventoryHandlingCashInventoryHandlingServiceWorkProduct;
  }

  public void setCashInventoryHandlingCashInventoryHandlingServiceWorkProduct(String cashInventoryHandlingCashInventoryHandlingServiceWorkProduct) {
    this.cashInventoryHandlingCashInventoryHandlingServiceWorkProduct = cashInventoryHandlingCashInventoryHandlingServiceWorkProduct;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return safeCustodyOperationsRetrieveActionTaskRecord
  **/

  public Object getSafeCustodyOperationsRetrieveActionTaskRecord() {
    return safeCustodyOperationsRetrieveActionTaskRecord;
  }

  public void setSafeCustodyOperationsRetrieveActionTaskRecord(Object safeCustodyOperationsRetrieveActionTaskRecord) {
    this.safeCustodyOperationsRetrieveActionTaskRecord = safeCustodyOperationsRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service request (lists requested reports) 
   * @return safeCustodyOperationsRetrieveActionRequest
  **/

  public String getSafeCustodyOperationsRetrieveActionRequest() {
    return safeCustodyOperationsRetrieveActionRequest;
  }

  public void setSafeCustodyOperationsRetrieveActionRequest(String safeCustodyOperationsRetrieveActionRequest) {
    this.safeCustodyOperationsRetrieveActionRequest = safeCustodyOperationsRetrieveActionRequest;
  }


  /**
   * Get safeCustodyOperationsInstanceReport
   * @return safeCustodyOperationsInstanceReport
  **/

  public BQSafeCustodyOperationsRetrieveInputModelSafeCustodyOperationsInstanceReport getSafeCustodyOperationsInstanceReport() {
    return safeCustodyOperationsInstanceReport;
  }

  public void setSafeCustodyOperationsInstanceReport(BQSafeCustodyOperationsRetrieveInputModelSafeCustodyOperationsInstanceReport safeCustodyOperationsInstanceReport) {
    this.safeCustodyOperationsInstanceReport = safeCustodyOperationsInstanceReport;
  }


  /**
   * Get safeCustodyOperationsInstanceAnalysis
   * @return safeCustodyOperationsInstanceAnalysis
  **/

  public BQSafeCustodyOperationsRetrieveInputModelSafeCustodyOperationsInstanceAnalysis getSafeCustodyOperationsInstanceAnalysis() {
    return safeCustodyOperationsInstanceAnalysis;
  }

  public void setSafeCustodyOperationsInstanceAnalysis(BQSafeCustodyOperationsRetrieveInputModelSafeCustodyOperationsInstanceAnalysis safeCustodyOperationsInstanceAnalysis) {
    this.safeCustodyOperationsInstanceAnalysis = safeCustodyOperationsInstanceAnalysis;
  }


}

