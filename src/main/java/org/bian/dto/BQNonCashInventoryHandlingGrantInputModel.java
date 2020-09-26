package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRBranchLocationAdministrativePlanGrantInputModelGrantRequestInputRecord;

import javax.validation.Valid;
  
/**
 * BQNonCashInventoryHandlingGrantInputModel
 */
public class BQNonCashInventoryHandlingGrantInputModel   {
  private String branchLocationAdministrativePlanInstanceReference = null;

  private String nonCashInventoryHandlingInstanceReference = null;

  private Object nonCashInventoryHandlingGrantActionTaskRecord = null;

  private String grantRequestRecordType = null;

  private CRBranchLocationAdministrativePlanGrantInputModelGrantRequestInputRecord grantRequestInputRecord = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the parent Branch Location Administrative Plan instance 
   * @return branchLocationAdministrativePlanInstanceReference
  **/

  public String getBranchLocationAdministrativePlanInstanceReference() {
    return branchLocationAdministrativePlanInstanceReference;
  }

  public void setBranchLocationAdministrativePlanInstanceReference(String branchLocationAdministrativePlanInstanceReference) {
    this.branchLocationAdministrativePlanInstanceReference = branchLocationAdministrativePlanInstanceReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Non Cash Inventory Handling instance 
   * @return nonCashInventoryHandlingInstanceReference
  **/

  public String getNonCashInventoryHandlingInstanceReference() {
    return nonCashInventoryHandlingInstanceReference;
  }

  public void setNonCashInventoryHandlingInstanceReference(String nonCashInventoryHandlingInstanceReference) {
    this.nonCashInventoryHandlingInstanceReference = nonCashInventoryHandlingInstanceReference;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Grant request type (e.g. access permission) 
   * @return grantRequestRecordType
  **/

  public String getGrantRequestRecordType() {
    return grantRequestRecordType;
  }

  public void setGrantRequestRecordType(String grantRequestRecordType) {
    this.grantRequestRecordType = grantRequestRecordType;
  }


  /**
   * Get grantRequestInputRecord
   * @return grantRequestInputRecord
  **/

  public CRBranchLocationAdministrativePlanGrantInputModelGrantRequestInputRecord getGrantRequestInputRecord() {
    return grantRequestInputRecord;
  }

  public void setGrantRequestInputRecord(CRBranchLocationAdministrativePlanGrantInputModelGrantRequestInputRecord grantRequestInputRecord) {
    this.grantRequestInputRecord = grantRequestInputRecord;
  }


}

