package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQWorkforceAdministrationRetrieveInputModelWorkforceAdministrationInstanceReport
 */
public class BQWorkforceAdministrationRetrieveInputModelWorkforceAdministrationInstanceReport   {
  private String workforceAdministrationInstanceReportReference = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance report 
   * @return workforceAdministrationInstanceReportReference
  **/

  public String getWorkforceAdministrationInstanceReportReference() {
    return workforceAdministrationInstanceReportReference;
  }

  public void setWorkforceAdministrationInstanceReportReference(String workforceAdministrationInstanceReportReference) {
    this.workforceAdministrationInstanceReportReference = workforceAdministrationInstanceReportReference;
  }


}

