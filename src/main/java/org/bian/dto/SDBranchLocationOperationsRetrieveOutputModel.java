package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.SDBranchLocationOperationsRetrieveOutputModelBranchLocationOperationsOfferedService;
import org.bian.dto.SDBranchLocationOperationsRetrieveOutputModelBranchLocationOperationsRetrieveActionRecord;

import javax.validation.Valid;
  
/**
 * SDBranchLocationOperationsRetrieveOutputModel
 */
public class SDBranchLocationOperationsRetrieveOutputModel   {
  private String branchLocationOperationsRetrieveActionTaskReference = null;

  private Object branchLocationOperationsRetrieveActionTaskRecord = null;

  private String branchLocationOperationsRetrieveActionResponse = null;

  private SDBranchLocationOperationsRetrieveOutputModelBranchLocationOperationsRetrieveActionRecord branchLocationOperationsRetrieveActionRecord = null;

  private SDBranchLocationOperationsRetrieveOutputModelBranchLocationOperationsOfferedService branchLocationOperationsOfferedService = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a retrieve service call 
   * @return branchLocationOperationsRetrieveActionTaskReference
  **/

  public String getBranchLocationOperationsRetrieveActionTaskReference() {
    return branchLocationOperationsRetrieveActionTaskReference;
  }

  public void setBranchLocationOperationsRetrieveActionTaskReference(String branchLocationOperationsRetrieveActionTaskReference) {
    this.branchLocationOperationsRetrieveActionTaskReference = branchLocationOperationsRetrieveActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return branchLocationOperationsRetrieveActionTaskRecord
  **/

  public Object getBranchLocationOperationsRetrieveActionTaskRecord() {
    return branchLocationOperationsRetrieveActionTaskRecord;
  }

  public void setBranchLocationOperationsRetrieveActionTaskRecord(Object branchLocationOperationsRetrieveActionTaskRecord) {
    this.branchLocationOperationsRetrieveActionTaskRecord = branchLocationOperationsRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service response (lists returned reports) 
   * @return branchLocationOperationsRetrieveActionResponse
  **/

  public String getBranchLocationOperationsRetrieveActionResponse() {
    return branchLocationOperationsRetrieveActionResponse;
  }

  public void setBranchLocationOperationsRetrieveActionResponse(String branchLocationOperationsRetrieveActionResponse) {
    this.branchLocationOperationsRetrieveActionResponse = branchLocationOperationsRetrieveActionResponse;
  }


  /**
   * Get branchLocationOperationsRetrieveActionRecord
   * @return branchLocationOperationsRetrieveActionRecord
  **/

  public SDBranchLocationOperationsRetrieveOutputModelBranchLocationOperationsRetrieveActionRecord getBranchLocationOperationsRetrieveActionRecord() {
    return branchLocationOperationsRetrieveActionRecord;
  }

  public void setBranchLocationOperationsRetrieveActionRecord(SDBranchLocationOperationsRetrieveOutputModelBranchLocationOperationsRetrieveActionRecord branchLocationOperationsRetrieveActionRecord) {
    this.branchLocationOperationsRetrieveActionRecord = branchLocationOperationsRetrieveActionRecord;
  }


  /**
   * Get branchLocationOperationsOfferedService
   * @return branchLocationOperationsOfferedService
  **/

  public SDBranchLocationOperationsRetrieveOutputModelBranchLocationOperationsOfferedService getBranchLocationOperationsOfferedService() {
    return branchLocationOperationsOfferedService;
  }

  public void setBranchLocationOperationsOfferedService(SDBranchLocationOperationsRetrieveOutputModelBranchLocationOperationsOfferedService branchLocationOperationsOfferedService) {
    this.branchLocationOperationsOfferedService = branchLocationOperationsOfferedService;
  }


}

