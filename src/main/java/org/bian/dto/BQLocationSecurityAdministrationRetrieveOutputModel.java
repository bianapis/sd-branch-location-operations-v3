package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQLocationSecurityAdministrationRetrieveOutputModelLocationSecurityAdministrationInstanceAnalysis;
import org.bian.dto.BQLocationSecurityAdministrationRetrieveOutputModelLocationSecurityAdministrationInstanceReport;

import javax.validation.Valid;
  
/**
 * BQLocationSecurityAdministrationRetrieveOutputModel
 */
public class BQLocationSecurityAdministrationRetrieveOutputModel   {
  private String locationSecurityAdministrationRetrieveActionTaskReference = null;

  private Object locationSecurityAdministrationRetrieveActionTaskRecord = null;

  private String locationSecurityAdministrationRetrieveActionResponse = null;

  private BQLocationSecurityAdministrationRetrieveOutputModelLocationSecurityAdministrationInstanceReport locationSecurityAdministrationInstanceReport = null;

  private BQLocationSecurityAdministrationRetrieveOutputModelLocationSecurityAdministrationInstanceAnalysis locationSecurityAdministrationInstanceAnalysis = null;

  private String workforceAdministrationPreconditions = null;

  private String workforceAdministrationBusinessUnitEmployeeReference = null;

  private String workforceAdministrationWorkSchedule = null;

  private String workforceAdministrationPostconditions = null;

  private String workforceAdministrationWorkforceAdministrationServiceType = null;

  private String workforceAdministrationWorkforceAdministrationServiceDescription = null;

  private String workforceAdministrationWorkforceAdministrationServiceInputsandOuputs = null;

  private String workforceAdministrationWorkforceAdministrationServiceWorkProduct = null;

  private String workforceAdministrationWorkforceAdministrationServiceName = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Location Security Administration instance retrieve service call 
   * @return locationSecurityAdministrationRetrieveActionTaskReference
  **/

  public String getLocationSecurityAdministrationRetrieveActionTaskReference() {
    return locationSecurityAdministrationRetrieveActionTaskReference;
  }

  public void setLocationSecurityAdministrationRetrieveActionTaskReference(String locationSecurityAdministrationRetrieveActionTaskReference) {
    this.locationSecurityAdministrationRetrieveActionTaskReference = locationSecurityAdministrationRetrieveActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return locationSecurityAdministrationRetrieveActionTaskRecord
  **/

  public Object getLocationSecurityAdministrationRetrieveActionTaskRecord() {
    return locationSecurityAdministrationRetrieveActionTaskRecord;
  }

  public void setLocationSecurityAdministrationRetrieveActionTaskRecord(Object locationSecurityAdministrationRetrieveActionTaskRecord) {
    this.locationSecurityAdministrationRetrieveActionTaskRecord = locationSecurityAdministrationRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service response (lists returned reports) 
   * @return locationSecurityAdministrationRetrieveActionResponse
  **/

  public String getLocationSecurityAdministrationRetrieveActionResponse() {
    return locationSecurityAdministrationRetrieveActionResponse;
  }

  public void setLocationSecurityAdministrationRetrieveActionResponse(String locationSecurityAdministrationRetrieveActionResponse) {
    this.locationSecurityAdministrationRetrieveActionResponse = locationSecurityAdministrationRetrieveActionResponse;
  }


  /**
   * Get locationSecurityAdministrationInstanceReport
   * @return locationSecurityAdministrationInstanceReport
  **/

  public BQLocationSecurityAdministrationRetrieveOutputModelLocationSecurityAdministrationInstanceReport getLocationSecurityAdministrationInstanceReport() {
    return locationSecurityAdministrationInstanceReport;
  }

  public void setLocationSecurityAdministrationInstanceReport(BQLocationSecurityAdministrationRetrieveOutputModelLocationSecurityAdministrationInstanceReport locationSecurityAdministrationInstanceReport) {
    this.locationSecurityAdministrationInstanceReport = locationSecurityAdministrationInstanceReport;
  }


  /**
   * Get locationSecurityAdministrationInstanceAnalysis
   * @return locationSecurityAdministrationInstanceAnalysis
  **/

  public BQLocationSecurityAdministrationRetrieveOutputModelLocationSecurityAdministrationInstanceAnalysis getLocationSecurityAdministrationInstanceAnalysis() {
    return locationSecurityAdministrationInstanceAnalysis;
  }

  public void setLocationSecurityAdministrationInstanceAnalysis(BQLocationSecurityAdministrationRetrieveOutputModelLocationSecurityAdministrationInstanceAnalysis locationSecurityAdministrationInstanceAnalysis) {
    this.locationSecurityAdministrationInstanceAnalysis = locationSecurityAdministrationInstanceAnalysis;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The required status/situation before the routine can be undertaken 
   * @return workforceAdministrationPreconditions
  **/

  public String getWorkforceAdministrationPreconditions() {
    return workforceAdministrationPreconditions;
  }

  public void setWorkforceAdministrationPreconditions(String workforceAdministrationPreconditions) {
    this.workforceAdministrationPreconditions = workforceAdministrationPreconditions;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: The operating unit/employee responsible for performing the routine 
   * @return workforceAdministrationBusinessUnitEmployeeReference
  **/

  public String getWorkforceAdministrationBusinessUnitEmployeeReference() {
    return workforceAdministrationBusinessUnitEmployeeReference;
  }

  public void setWorkforceAdministrationBusinessUnitEmployeeReference(String workforceAdministrationBusinessUnitEmployeeReference) {
    this.workforceAdministrationBusinessUnitEmployeeReference = workforceAdministrationBusinessUnitEmployeeReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The timing and key actions/milestones involved in completing the routine 
   * @return workforceAdministrationWorkSchedule
  **/

  public String getWorkforceAdministrationWorkSchedule() {
    return workforceAdministrationWorkSchedule;
  }

  public void setWorkforceAdministrationWorkSchedule(String workforceAdministrationWorkSchedule) {
    this.workforceAdministrationWorkSchedule = workforceAdministrationWorkSchedule;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The completion status once the routine has been completed (note the need to fulfill a routine may recur frequently) 
   * @return workforceAdministrationPostconditions
  **/

  public String getWorkforceAdministrationPostconditions() {
    return workforceAdministrationPostconditions;
  }

  public void setWorkforceAdministrationPostconditions(String workforceAdministrationPostconditions) {
    this.workforceAdministrationPostconditions = workforceAdministrationPostconditions;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Reference to the specific business service type 
   * @return workforceAdministrationWorkforceAdministrationServiceType
  **/

  public String getWorkforceAdministrationWorkforceAdministrationServiceType() {
    return workforceAdministrationWorkforceAdministrationServiceType;
  }

  public void setWorkforceAdministrationWorkforceAdministrationServiceType(String workforceAdministrationWorkforceAdministrationServiceType) {
    this.workforceAdministrationWorkforceAdministrationServiceType = workforceAdministrationWorkforceAdministrationServiceType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Description of the performed business service 
   * @return workforceAdministrationWorkforceAdministrationServiceDescription
  **/

  public String getWorkforceAdministrationWorkforceAdministrationServiceDescription() {
    return workforceAdministrationWorkforceAdministrationServiceDescription;
  }

  public void setWorkforceAdministrationWorkforceAdministrationServiceDescription(String workforceAdministrationWorkforceAdministrationServiceDescription) {
    this.workforceAdministrationWorkforceAdministrationServiceDescription = workforceAdministrationWorkforceAdministrationServiceDescription;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Mandatory and optional inputs and output information for the business service 
   * @return workforceAdministrationWorkforceAdministrationServiceInputsandOuputs
  **/

  public String getWorkforceAdministrationWorkforceAdministrationServiceInputsandOuputs() {
    return workforceAdministrationWorkforceAdministrationServiceInputsandOuputs;
  }

  public void setWorkforceAdministrationWorkforceAdministrationServiceInputsandOuputs(String workforceAdministrationWorkforceAdministrationServiceInputsandOuputs) {
    this.workforceAdministrationWorkforceAdministrationServiceInputsandOuputs = workforceAdministrationWorkforceAdministrationServiceInputsandOuputs;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Documentation, meeting schedules, notes, reasearch. calculations and any other work products produced by the business service 
   * @return workforceAdministrationWorkforceAdministrationServiceWorkProduct
  **/

  public String getWorkforceAdministrationWorkforceAdministrationServiceWorkProduct() {
    return workforceAdministrationWorkforceAdministrationServiceWorkProduct;
  }

  public void setWorkforceAdministrationWorkforceAdministrationServiceWorkProduct(String workforceAdministrationWorkforceAdministrationServiceWorkProduct) {
    this.workforceAdministrationWorkforceAdministrationServiceWorkProduct = workforceAdministrationWorkforceAdministrationServiceWorkProduct;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info:  
   * @return workforceAdministrationWorkforceAdministrationServiceName
  **/

  public String getWorkforceAdministrationWorkforceAdministrationServiceName() {
    return workforceAdministrationWorkforceAdministrationServiceName;
  }

  public void setWorkforceAdministrationWorkforceAdministrationServiceName(String workforceAdministrationWorkforceAdministrationServiceName) {
    this.workforceAdministrationWorkforceAdministrationServiceName = workforceAdministrationWorkforceAdministrationServiceName;
  }


}

