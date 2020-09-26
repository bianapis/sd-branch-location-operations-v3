package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQLocationSecurityAdministrationRetrieveInputModelLocationSecurityAdministrationInstanceReport
 */
public class BQLocationSecurityAdministrationRetrieveInputModelLocationSecurityAdministrationInstanceReport   {
  private String locationSecurityAdministrationInstanceReportReference = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance report 
   * @return locationSecurityAdministrationInstanceReportReference
  **/

  public String getLocationSecurityAdministrationInstanceReportReference() {
    return locationSecurityAdministrationInstanceReportReference;
  }

  public void setLocationSecurityAdministrationInstanceReportReference(String locationSecurityAdministrationInstanceReportReference) {
    this.locationSecurityAdministrationInstanceReportReference = locationSecurityAdministrationInstanceReportReference;
  }


}

