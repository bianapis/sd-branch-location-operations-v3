package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQCashInventoryHandlingRetrieveOutputModelCashInventoryHandlingInstanceAnalysis;
import org.bian.dto.BQCashInventoryHandlingRetrieveOutputModelCashInventoryHandlingInstanceReport;

import javax.validation.Valid;
  
/**
 * BQCashInventoryHandlingRetrieveOutputModel
 */
public class BQCashInventoryHandlingRetrieveOutputModel   {
  private String cashInventoryHandlingRetrieveActionTaskReference = null;

  private Object cashInventoryHandlingRetrieveActionTaskRecord = null;

  private String cashInventoryHandlingRetrieveActionResponse = null;

  private BQCashInventoryHandlingRetrieveOutputModelCashInventoryHandlingInstanceReport cashInventoryHandlingInstanceReport = null;

  private BQCashInventoryHandlingRetrieveOutputModelCashInventoryHandlingInstanceAnalysis cashInventoryHandlingInstanceAnalysis = null;

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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Cash Inventory Handling instance retrieve service call 
   * @return cashInventoryHandlingRetrieveActionTaskReference
  **/

  public String getCashInventoryHandlingRetrieveActionTaskReference() {
    return cashInventoryHandlingRetrieveActionTaskReference;
  }

  public void setCashInventoryHandlingRetrieveActionTaskReference(String cashInventoryHandlingRetrieveActionTaskReference) {
    this.cashInventoryHandlingRetrieveActionTaskReference = cashInventoryHandlingRetrieveActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return cashInventoryHandlingRetrieveActionTaskRecord
  **/

  public Object getCashInventoryHandlingRetrieveActionTaskRecord() {
    return cashInventoryHandlingRetrieveActionTaskRecord;
  }

  public void setCashInventoryHandlingRetrieveActionTaskRecord(Object cashInventoryHandlingRetrieveActionTaskRecord) {
    this.cashInventoryHandlingRetrieveActionTaskRecord = cashInventoryHandlingRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service response (lists returned reports) 
   * @return cashInventoryHandlingRetrieveActionResponse
  **/

  public String getCashInventoryHandlingRetrieveActionResponse() {
    return cashInventoryHandlingRetrieveActionResponse;
  }

  public void setCashInventoryHandlingRetrieveActionResponse(String cashInventoryHandlingRetrieveActionResponse) {
    this.cashInventoryHandlingRetrieveActionResponse = cashInventoryHandlingRetrieveActionResponse;
  }


  /**
   * Get cashInventoryHandlingInstanceReport
   * @return cashInventoryHandlingInstanceReport
  **/

  public BQCashInventoryHandlingRetrieveOutputModelCashInventoryHandlingInstanceReport getCashInventoryHandlingInstanceReport() {
    return cashInventoryHandlingInstanceReport;
  }

  public void setCashInventoryHandlingInstanceReport(BQCashInventoryHandlingRetrieveOutputModelCashInventoryHandlingInstanceReport cashInventoryHandlingInstanceReport) {
    this.cashInventoryHandlingInstanceReport = cashInventoryHandlingInstanceReport;
  }


  /**
   * Get cashInventoryHandlingInstanceAnalysis
   * @return cashInventoryHandlingInstanceAnalysis
  **/

  public BQCashInventoryHandlingRetrieveOutputModelCashInventoryHandlingInstanceAnalysis getCashInventoryHandlingInstanceAnalysis() {
    return cashInventoryHandlingInstanceAnalysis;
  }

  public void setCashInventoryHandlingInstanceAnalysis(BQCashInventoryHandlingRetrieveOutputModelCashInventoryHandlingInstanceAnalysis cashInventoryHandlingInstanceAnalysis) {
    this.cashInventoryHandlingInstanceAnalysis = cashInventoryHandlingInstanceAnalysis;
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

