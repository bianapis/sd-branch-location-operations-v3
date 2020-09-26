package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRBranchLocationAdministrativePlanRequestInputModelRequestRecordType;

import javax.validation.Valid;
  
/**
 * BQSafeCustodyOperationsRequestInputModel
 */
public class BQSafeCustodyOperationsRequestInputModel   {
  private String branchLocationAdministrativePlanInstanceReference = null;

  private String safeCustodyOperationsInstanceReference = null;

  private Object safeCustodyOperationsRequestActionTaskRecord = null;

  private CRBranchLocationAdministrativePlanRequestInputModelRequestRecordType requestRecordType = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Safe Custody Operations instance 
   * @return safeCustodyOperationsInstanceReference
  **/

  public String getSafeCustodyOperationsInstanceReference() {
    return safeCustodyOperationsInstanceReference;
  }

  public void setSafeCustodyOperationsInstanceReference(String safeCustodyOperationsInstanceReference) {
    this.safeCustodyOperationsInstanceReference = safeCustodyOperationsInstanceReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The request service call consolidated processing record 
   * @return safeCustodyOperationsRequestActionTaskRecord
  **/

  public Object getSafeCustodyOperationsRequestActionTaskRecord() {
    return safeCustodyOperationsRequestActionTaskRecord;
  }

  public void setSafeCustodyOperationsRequestActionTaskRecord(Object safeCustodyOperationsRequestActionTaskRecord) {
    this.safeCustodyOperationsRequestActionTaskRecord = safeCustodyOperationsRequestActionTaskRecord;
  }


  /**
   * Get requestRecordType
   * @return requestRecordType
  **/

  public CRBranchLocationAdministrativePlanRequestInputModelRequestRecordType getRequestRecordType() {
    return requestRecordType;
  }

  public void setRequestRecordType(CRBranchLocationAdministrativePlanRequestInputModelRequestRecordType requestRecordType) {
    this.requestRecordType = requestRecordType;
  }


}

