package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRBranchLocationAdministrativePlanRetrieveInputModelBranchLocationAdministrativePlanInstanceAnalysis;
import org.bian.dto.CRBranchLocationAdministrativePlanRetrieveInputModelBranchLocationAdministrativePlanInstanceReportRecord;

import javax.validation.Valid;
  
/**
 * CRBranchLocationAdministrativePlanRetrieveInputModel
 */
public class CRBranchLocationAdministrativePlanRetrieveInputModel   {
  private Object branchLocationAdministrativePlanRetrieveActionTaskRecord = null;

  private String branchLocationAdministrativePlanRetrieveActionRequest = null;

  private CRBranchLocationAdministrativePlanRetrieveInputModelBranchLocationAdministrativePlanInstanceReportRecord branchLocationAdministrativePlanInstanceReportRecord = null;

  private CRBranchLocationAdministrativePlanRetrieveInputModelBranchLocationAdministrativePlanInstanceAnalysis branchLocationAdministrativePlanInstanceAnalysis = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return branchLocationAdministrativePlanRetrieveActionTaskRecord
  **/

  public Object getBranchLocationAdministrativePlanRetrieveActionTaskRecord() {
    return branchLocationAdministrativePlanRetrieveActionTaskRecord;
  }

  public void setBranchLocationAdministrativePlanRetrieveActionTaskRecord(Object branchLocationAdministrativePlanRetrieveActionTaskRecord) {
    this.branchLocationAdministrativePlanRetrieveActionTaskRecord = branchLocationAdministrativePlanRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service request (lists requested reports) 
   * @return branchLocationAdministrativePlanRetrieveActionRequest
  **/

  public String getBranchLocationAdministrativePlanRetrieveActionRequest() {
    return branchLocationAdministrativePlanRetrieveActionRequest;
  }

  public void setBranchLocationAdministrativePlanRetrieveActionRequest(String branchLocationAdministrativePlanRetrieveActionRequest) {
    this.branchLocationAdministrativePlanRetrieveActionRequest = branchLocationAdministrativePlanRetrieveActionRequest;
  }


  /**
   * Get branchLocationAdministrativePlanInstanceReportRecord
   * @return branchLocationAdministrativePlanInstanceReportRecord
  **/

  public CRBranchLocationAdministrativePlanRetrieveInputModelBranchLocationAdministrativePlanInstanceReportRecord getBranchLocationAdministrativePlanInstanceReportRecord() {
    return branchLocationAdministrativePlanInstanceReportRecord;
  }

  public void setBranchLocationAdministrativePlanInstanceReportRecord(CRBranchLocationAdministrativePlanRetrieveInputModelBranchLocationAdministrativePlanInstanceReportRecord branchLocationAdministrativePlanInstanceReportRecord) {
    this.branchLocationAdministrativePlanInstanceReportRecord = branchLocationAdministrativePlanInstanceReportRecord;
  }


  /**
   * Get branchLocationAdministrativePlanInstanceAnalysis
   * @return branchLocationAdministrativePlanInstanceAnalysis
  **/

  public CRBranchLocationAdministrativePlanRetrieveInputModelBranchLocationAdministrativePlanInstanceAnalysis getBranchLocationAdministrativePlanInstanceAnalysis() {
    return branchLocationAdministrativePlanInstanceAnalysis;
  }

  public void setBranchLocationAdministrativePlanInstanceAnalysis(CRBranchLocationAdministrativePlanRetrieveInputModelBranchLocationAdministrativePlanInstanceAnalysis branchLocationAdministrativePlanInstanceAnalysis) {
    this.branchLocationAdministrativePlanInstanceAnalysis = branchLocationAdministrativePlanInstanceAnalysis;
  }


}

