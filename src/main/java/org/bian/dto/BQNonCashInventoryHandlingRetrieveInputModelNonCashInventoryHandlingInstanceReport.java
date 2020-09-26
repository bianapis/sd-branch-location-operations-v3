package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQNonCashInventoryHandlingRetrieveInputModelNonCashInventoryHandlingInstanceReport
 */
public class BQNonCashInventoryHandlingRetrieveInputModelNonCashInventoryHandlingInstanceReport   {
  private String nonCashInventoryHandlingInstanceReportReference = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance report 
   * @return nonCashInventoryHandlingInstanceReportReference
  **/

  public String getNonCashInventoryHandlingInstanceReportReference() {
    return nonCashInventoryHandlingInstanceReportReference;
  }

  public void setNonCashInventoryHandlingInstanceReportReference(String nonCashInventoryHandlingInstanceReportReference) {
    this.nonCashInventoryHandlingInstanceReportReference = nonCashInventoryHandlingInstanceReportReference;
  }


}

