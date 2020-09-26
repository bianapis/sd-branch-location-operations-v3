package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQSafeCustodyOperationsRetrieveInputModelSafeCustodyOperationsInstanceReport
 */
public class BQSafeCustodyOperationsRetrieveInputModelSafeCustodyOperationsInstanceReport   {
  private String safeCustodyOperationsInstanceReportReference = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance report 
   * @return safeCustodyOperationsInstanceReportReference
  **/

  public String getSafeCustodyOperationsInstanceReportReference() {
    return safeCustodyOperationsInstanceReportReference;
  }

  public void setSafeCustodyOperationsInstanceReportReference(String safeCustodyOperationsInstanceReportReference) {
    this.safeCustodyOperationsInstanceReportReference = safeCustodyOperationsInstanceReportReference;
  }


}

