package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQNonCashInventoryHandlingRetrieveOutputModelNonCashInventoryHandlingInstanceAnalysis;
import org.bian.dto.BQNonCashInventoryHandlingRetrieveOutputModelNonCashInventoryHandlingInstanceReport;

import javax.validation.Valid;
  
/**
 * BQNonCashInventoryHandlingRetrieveOutputModel
 */
public class BQNonCashInventoryHandlingRetrieveOutputModel   {
  private String nonCashInventoryHandlingRetrieveActionTaskReference = null;

  private Object nonCashInventoryHandlingRetrieveActionTaskRecord = null;

  private String nonCashInventoryHandlingRetrieveActionResponse = null;

  private BQNonCashInventoryHandlingRetrieveOutputModelNonCashInventoryHandlingInstanceReport nonCashInventoryHandlingInstanceReport = null;

  private BQNonCashInventoryHandlingRetrieveOutputModelNonCashInventoryHandlingInstanceAnalysis nonCashInventoryHandlingInstanceAnalysis = null;

  private String locationSecurityAdministrationPreconditions = null;

  private String locationSecurityAdministrationBusinessUnitEmployeeReference = null;

  private String locationSecurityAdministrationWorkSchedule = null;

  private String locationSecurityAdministrationPostconditions = null;

  private String locationSecurityAdministrationLocationSecurityServiceType = null;

  private String locationSecurityAdministrationLocationSecurityServiceDescription = null;

  private String locationSecurityAdministrationLocationSecurityServiceInputsandOuputs = null;

  private String locationSecurityAdministrationLocationSecurityServiceWorkProduct = null;

  private String locationSecurityAdministrationLocationSecurityServiceName = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Non Cash Inventory Handling instance retrieve service call 
   * @return nonCashInventoryHandlingRetrieveActionTaskReference
  **/

  public String getNonCashInventoryHandlingRetrieveActionTaskReference() {
    return nonCashInventoryHandlingRetrieveActionTaskReference;
  }

  public void setNonCashInventoryHandlingRetrieveActionTaskReference(String nonCashInventoryHandlingRetrieveActionTaskReference) {
    this.nonCashInventoryHandlingRetrieveActionTaskReference = nonCashInventoryHandlingRetrieveActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return nonCashInventoryHandlingRetrieveActionTaskRecord
  **/

  public Object getNonCashInventoryHandlingRetrieveActionTaskRecord() {
    return nonCashInventoryHandlingRetrieveActionTaskRecord;
  }

  public void setNonCashInventoryHandlingRetrieveActionTaskRecord(Object nonCashInventoryHandlingRetrieveActionTaskRecord) {
    this.nonCashInventoryHandlingRetrieveActionTaskRecord = nonCashInventoryHandlingRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service response (lists returned reports) 
   * @return nonCashInventoryHandlingRetrieveActionResponse
  **/

  public String getNonCashInventoryHandlingRetrieveActionResponse() {
    return nonCashInventoryHandlingRetrieveActionResponse;
  }

  public void setNonCashInventoryHandlingRetrieveActionResponse(String nonCashInventoryHandlingRetrieveActionResponse) {
    this.nonCashInventoryHandlingRetrieveActionResponse = nonCashInventoryHandlingRetrieveActionResponse;
  }


  /**
   * Get nonCashInventoryHandlingInstanceReport
   * @return nonCashInventoryHandlingInstanceReport
  **/

  public BQNonCashInventoryHandlingRetrieveOutputModelNonCashInventoryHandlingInstanceReport getNonCashInventoryHandlingInstanceReport() {
    return nonCashInventoryHandlingInstanceReport;
  }

  public void setNonCashInventoryHandlingInstanceReport(BQNonCashInventoryHandlingRetrieveOutputModelNonCashInventoryHandlingInstanceReport nonCashInventoryHandlingInstanceReport) {
    this.nonCashInventoryHandlingInstanceReport = nonCashInventoryHandlingInstanceReport;
  }


  /**
   * Get nonCashInventoryHandlingInstanceAnalysis
   * @return nonCashInventoryHandlingInstanceAnalysis
  **/

  public BQNonCashInventoryHandlingRetrieveOutputModelNonCashInventoryHandlingInstanceAnalysis getNonCashInventoryHandlingInstanceAnalysis() {
    return nonCashInventoryHandlingInstanceAnalysis;
  }

  public void setNonCashInventoryHandlingInstanceAnalysis(BQNonCashInventoryHandlingRetrieveOutputModelNonCashInventoryHandlingInstanceAnalysis nonCashInventoryHandlingInstanceAnalysis) {
    this.nonCashInventoryHandlingInstanceAnalysis = nonCashInventoryHandlingInstanceAnalysis;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The required status/situation before the routine can be undertaken 
   * @return locationSecurityAdministrationPreconditions
  **/

  public String getLocationSecurityAdministrationPreconditions() {
    return locationSecurityAdministrationPreconditions;
  }

  public void setLocationSecurityAdministrationPreconditions(String locationSecurityAdministrationPreconditions) {
    this.locationSecurityAdministrationPreconditions = locationSecurityAdministrationPreconditions;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: The operating unit/employee responsible for performing the routine 
   * @return locationSecurityAdministrationBusinessUnitEmployeeReference
  **/

  public String getLocationSecurityAdministrationBusinessUnitEmployeeReference() {
    return locationSecurityAdministrationBusinessUnitEmployeeReference;
  }

  public void setLocationSecurityAdministrationBusinessUnitEmployeeReference(String locationSecurityAdministrationBusinessUnitEmployeeReference) {
    this.locationSecurityAdministrationBusinessUnitEmployeeReference = locationSecurityAdministrationBusinessUnitEmployeeReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The timing and key actions/milestones involved in completing the routine 
   * @return locationSecurityAdministrationWorkSchedule
  **/

  public String getLocationSecurityAdministrationWorkSchedule() {
    return locationSecurityAdministrationWorkSchedule;
  }

  public void setLocationSecurityAdministrationWorkSchedule(String locationSecurityAdministrationWorkSchedule) {
    this.locationSecurityAdministrationWorkSchedule = locationSecurityAdministrationWorkSchedule;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The completion status once the routine has been completed (note the need to fulfill a routine may recur frequently) 
   * @return locationSecurityAdministrationPostconditions
  **/

  public String getLocationSecurityAdministrationPostconditions() {
    return locationSecurityAdministrationPostconditions;
  }

  public void setLocationSecurityAdministrationPostconditions(String locationSecurityAdministrationPostconditions) {
    this.locationSecurityAdministrationPostconditions = locationSecurityAdministrationPostconditions;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Reference to the specific business service type 
   * @return locationSecurityAdministrationLocationSecurityServiceType
  **/

  public String getLocationSecurityAdministrationLocationSecurityServiceType() {
    return locationSecurityAdministrationLocationSecurityServiceType;
  }

  public void setLocationSecurityAdministrationLocationSecurityServiceType(String locationSecurityAdministrationLocationSecurityServiceType) {
    this.locationSecurityAdministrationLocationSecurityServiceType = locationSecurityAdministrationLocationSecurityServiceType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Description of the performed business service 
   * @return locationSecurityAdministrationLocationSecurityServiceDescription
  **/

  public String getLocationSecurityAdministrationLocationSecurityServiceDescription() {
    return locationSecurityAdministrationLocationSecurityServiceDescription;
  }

  public void setLocationSecurityAdministrationLocationSecurityServiceDescription(String locationSecurityAdministrationLocationSecurityServiceDescription) {
    this.locationSecurityAdministrationLocationSecurityServiceDescription = locationSecurityAdministrationLocationSecurityServiceDescription;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Mandatory and optional inputs and output information for the business service 
   * @return locationSecurityAdministrationLocationSecurityServiceInputsandOuputs
  **/

  public String getLocationSecurityAdministrationLocationSecurityServiceInputsandOuputs() {
    return locationSecurityAdministrationLocationSecurityServiceInputsandOuputs;
  }

  public void setLocationSecurityAdministrationLocationSecurityServiceInputsandOuputs(String locationSecurityAdministrationLocationSecurityServiceInputsandOuputs) {
    this.locationSecurityAdministrationLocationSecurityServiceInputsandOuputs = locationSecurityAdministrationLocationSecurityServiceInputsandOuputs;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Documentation, meeting schedules, notes, reasearch. calculations and any other work products produced by the business service 
   * @return locationSecurityAdministrationLocationSecurityServiceWorkProduct
  **/

  public String getLocationSecurityAdministrationLocationSecurityServiceWorkProduct() {
    return locationSecurityAdministrationLocationSecurityServiceWorkProduct;
  }

  public void setLocationSecurityAdministrationLocationSecurityServiceWorkProduct(String locationSecurityAdministrationLocationSecurityServiceWorkProduct) {
    this.locationSecurityAdministrationLocationSecurityServiceWorkProduct = locationSecurityAdministrationLocationSecurityServiceWorkProduct;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info:  
   * @return locationSecurityAdministrationLocationSecurityServiceName
  **/

  public String getLocationSecurityAdministrationLocationSecurityServiceName() {
    return locationSecurityAdministrationLocationSecurityServiceName;
  }

  public void setLocationSecurityAdministrationLocationSecurityServiceName(String locationSecurityAdministrationLocationSecurityServiceName) {
    this.locationSecurityAdministrationLocationSecurityServiceName = locationSecurityAdministrationLocationSecurityServiceName;
  }


}

