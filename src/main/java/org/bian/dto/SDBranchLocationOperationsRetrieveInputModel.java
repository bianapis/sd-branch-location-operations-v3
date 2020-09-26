package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.SDBranchLocationOperationsRetrieveInputModelBranchLocationOperationsOfferedService;
import org.bian.dto.SDBranchLocationOperationsRetrieveInputModelBranchLocationOperationsRetrieveActionRecord;

import javax.validation.Valid;
  
/**
 * SDBranchLocationOperationsRetrieveInputModel
 */
public class SDBranchLocationOperationsRetrieveInputModel   {
  private Object branchLocationOperationsRetrieveActionTaskRecord = null;

  private String branchLocationOperationsRetrieveActionRequest = null;

  private SDBranchLocationOperationsRetrieveInputModelBranchLocationOperationsRetrieveActionRecord branchLocationOperationsRetrieveActionRecord = null;

  private SDBranchLocationOperationsRetrieveInputModelBranchLocationOperationsOfferedService branchLocationOperationsOfferedService = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service request (lists requested reports) 
   * @return branchLocationOperationsRetrieveActionRequest
  **/

  public String getBranchLocationOperationsRetrieveActionRequest() {
    return branchLocationOperationsRetrieveActionRequest;
  }

  public void setBranchLocationOperationsRetrieveActionRequest(String branchLocationOperationsRetrieveActionRequest) {
    this.branchLocationOperationsRetrieveActionRequest = branchLocationOperationsRetrieveActionRequest;
  }


  /**
   * Get branchLocationOperationsRetrieveActionRecord
   * @return branchLocationOperationsRetrieveActionRecord
  **/

  public SDBranchLocationOperationsRetrieveInputModelBranchLocationOperationsRetrieveActionRecord getBranchLocationOperationsRetrieveActionRecord() {
    return branchLocationOperationsRetrieveActionRecord;
  }

  public void setBranchLocationOperationsRetrieveActionRecord(SDBranchLocationOperationsRetrieveInputModelBranchLocationOperationsRetrieveActionRecord branchLocationOperationsRetrieveActionRecord) {
    this.branchLocationOperationsRetrieveActionRecord = branchLocationOperationsRetrieveActionRecord;
  }


  /**
   * Get branchLocationOperationsOfferedService
   * @return branchLocationOperationsOfferedService
  **/

  public SDBranchLocationOperationsRetrieveInputModelBranchLocationOperationsOfferedService getBranchLocationOperationsOfferedService() {
    return branchLocationOperationsOfferedService;
  }

  public void setBranchLocationOperationsOfferedService(SDBranchLocationOperationsRetrieveInputModelBranchLocationOperationsOfferedService branchLocationOperationsOfferedService) {
    this.branchLocationOperationsOfferedService = branchLocationOperationsOfferedService;
  }


}

