package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.SDBranchLocationOperationsConfigureInputModelBranchLocationOperationsServiceConfigurationRecordBranchLocationOperationsServiceAgreement;
import org.bian.dto.SDBranchLocationOperationsConfigureInputModelBranchLocationOperationsServiceConfigurationRecordBranchLocationOperationsServiceConfigurationSetup;
import org.bian.dto.SDBranchLocationOperationsConfigureInputModelBranchLocationOperationsServiceConfigurationRecordBranchLocationOperationsServiceSubscription;

import javax.validation.Valid;
  
/**
 * SDBranchLocationOperationsConfigureOutputModelBranchLocationOperationsServiceConfigurationRecord
 */
public class SDBranchLocationOperationsConfigureOutputModelBranchLocationOperationsServiceConfigurationRecord   {
  private String branchLocationOperationsServiceConfigurationSettingDescription = null;

  private SDBranchLocationOperationsConfigureInputModelBranchLocationOperationsServiceConfigurationRecordBranchLocationOperationsServiceConfigurationSetup branchLocationOperationsServiceConfigurationSetup = null;

  private SDBranchLocationOperationsConfigureInputModelBranchLocationOperationsServiceConfigurationRecordBranchLocationOperationsServiceSubscription branchLocationOperationsServiceSubscription = null;

  private SDBranchLocationOperationsConfigureInputModelBranchLocationOperationsServiceConfigurationRecordBranchLocationOperationsServiceAgreement branchLocationOperationsServiceAgreement = null;

  private String branchLocationOperationsServiceStatus = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Description of the configuration parameter, allowed values and processing impact 
   * @return branchLocationOperationsServiceConfigurationSettingDescription
  **/

  public String getBranchLocationOperationsServiceConfigurationSettingDescription() {
    return branchLocationOperationsServiceConfigurationSettingDescription;
  }

  public void setBranchLocationOperationsServiceConfigurationSettingDescription(String branchLocationOperationsServiceConfigurationSettingDescription) {
    this.branchLocationOperationsServiceConfigurationSettingDescription = branchLocationOperationsServiceConfigurationSettingDescription;
  }


  /**
   * Get branchLocationOperationsServiceConfigurationSetup
   * @return branchLocationOperationsServiceConfigurationSetup
  **/

  public SDBranchLocationOperationsConfigureInputModelBranchLocationOperationsServiceConfigurationRecordBranchLocationOperationsServiceConfigurationSetup getBranchLocationOperationsServiceConfigurationSetup() {
    return branchLocationOperationsServiceConfigurationSetup;
  }

  public void setBranchLocationOperationsServiceConfigurationSetup(SDBranchLocationOperationsConfigureInputModelBranchLocationOperationsServiceConfigurationRecordBranchLocationOperationsServiceConfigurationSetup branchLocationOperationsServiceConfigurationSetup) {
    this.branchLocationOperationsServiceConfigurationSetup = branchLocationOperationsServiceConfigurationSetup;
  }


  /**
   * Get branchLocationOperationsServiceSubscription
   * @return branchLocationOperationsServiceSubscription
  **/

  public SDBranchLocationOperationsConfigureInputModelBranchLocationOperationsServiceConfigurationRecordBranchLocationOperationsServiceSubscription getBranchLocationOperationsServiceSubscription() {
    return branchLocationOperationsServiceSubscription;
  }

  public void setBranchLocationOperationsServiceSubscription(SDBranchLocationOperationsConfigureInputModelBranchLocationOperationsServiceConfigurationRecordBranchLocationOperationsServiceSubscription branchLocationOperationsServiceSubscription) {
    this.branchLocationOperationsServiceSubscription = branchLocationOperationsServiceSubscription;
  }


  /**
   * Get branchLocationOperationsServiceAgreement
   * @return branchLocationOperationsServiceAgreement
  **/

  public SDBranchLocationOperationsConfigureInputModelBranchLocationOperationsServiceConfigurationRecordBranchLocationOperationsServiceAgreement getBranchLocationOperationsServiceAgreement() {
    return branchLocationOperationsServiceAgreement;
  }

  public void setBranchLocationOperationsServiceAgreement(SDBranchLocationOperationsConfigureInputModelBranchLocationOperationsServiceConfigurationRecordBranchLocationOperationsServiceAgreement branchLocationOperationsServiceAgreement) {
    this.branchLocationOperationsServiceAgreement = branchLocationOperationsServiceAgreement;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The status of the offered service (e.g. active, suspended, idle) 
   * @return branchLocationOperationsServiceStatus
  **/

  public String getBranchLocationOperationsServiceStatus() {
    return branchLocationOperationsServiceStatus;
  }

  public void setBranchLocationOperationsServiceStatus(String branchLocationOperationsServiceStatus) {
    this.branchLocationOperationsServiceStatus = branchLocationOperationsServiceStatus;
  }


}

