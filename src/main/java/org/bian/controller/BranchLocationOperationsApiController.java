/**
 * @author Virtusa
 */
package org.bian.controller;

import java.util.List;
import org.bian.annotation.BianRestController;
import org.bian.annotation.BQ;
import org.bian.dto.BianRequest;
import org.bian.dto.BianResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PathVariable;
import org.bian.dto.*;
import org.bian.service.*;
import org.bian.annotation.functionalpattern.Administer;

@BianRestController
public class BranchLocationOperationsApiController {

	@Autowired
	BranchLocationOperationsApiService service;
	
	@Administer.Activate
	public BianResponse<SDBranchLocationOperationsActivateOutputModel> activate(@RequestBody BianRequest<SDBranchLocationOperationsActivateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.activate(bianRequest.getData()));
	}
	
	@BQ("cashinventoryhandling")
	@Administer.Capture
	public BianResponse<BQCashInventoryHandlingCaptureOutputModel> captureCashinventoryhandling(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQCashInventoryHandlingCaptureInputModel> bianRequest) {
		return BianResponse.forSuccess(service.captureCashinventoryhandling(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@BQ("locationsecurityadministration")
	@Administer.Capture
	public BianResponse<BQLocationSecurityAdministrationCaptureOutputModel> captureLocationsecurityadministration(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQLocationSecurityAdministrationCaptureInputModel> bianRequest) {
		return BianResponse.forSuccess(service.captureLocationsecurityadministration(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@BQ("noncashinventoryhandling")
	@Administer.Capture
	public BianResponse<BQNonCashInventoryHandlingCaptureOutputModel> captureNoncashinventoryhandling(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQNonCashInventoryHandlingCaptureInputModel> bianRequest) {
		return BianResponse.forSuccess(service.captureNoncashinventoryhandling(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@BQ("safecustodyoperations")
	@Administer.Capture
	public BianResponse<BQSafeCustodyOperationsCaptureOutputModel> captureSafecustodyoperations(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQSafeCustodyOperationsCaptureInputModel> bianRequest) {
		return BianResponse.forSuccess(service.captureSafecustodyoperations(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@BQ("staffassignment")
	@Administer.Capture
	public BianResponse<BQStaffAssignmentCaptureOutputModel> captureStaffassignment(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQStaffAssignmentCaptureInputModel> bianRequest) {
		return BianResponse.forSuccess(service.captureStaffassignment(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@Administer.Capture
	public BianResponse<CRBranchLocationAdministrativePlanCaptureOutputModel> capture(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<CRBranchLocationAdministrativePlanCaptureInputModel> bianRequest) {
		return BianResponse.forSuccess(service.capture(sdReferenceId, crReferenceId, bianRequest.getData()));
	}
	
	@BQ("workforceadministration")
	@Administer.Capture
	public BianResponse<BQWorkforceAdministrationCaptureOutputModel> captureWorkforceadministration(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQWorkforceAdministrationCaptureInputModel> bianRequest) {
		return BianResponse.forSuccess(service.captureWorkforceadministration(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@Administer.Configure
	public BianResponse<SDBranchLocationOperationsConfigureOutputModel> configure(@PathVariable("sd-reference-id") String sdReferenceId, @RequestBody BianRequest<SDBranchLocationOperationsConfigureInputModel> bianRequest) {
		return BianResponse.forSuccess(service.configure(sdReferenceId, bianRequest.getData()));
	}
	
	@Administer.Control
	public BianResponse<CRBranchLocationAdministrativePlanControlOutputModel> control(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<CRBranchLocationAdministrativePlanControlInputModel> bianRequest) {
		return BianResponse.forSuccess(service.control(sdReferenceId, crReferenceId, bianRequest.getData()));
	}
	
	@BQ("locationsecurityadministration")
	@Administer.Exchange
	public BianResponse<BQLocationSecurityAdministrationExchangeOutputModel> exchangeLocationsecurityadministration(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQLocationSecurityAdministrationExchangeInputModel> bianRequest) {
		return BianResponse.forSuccess(service.exchangeLocationsecurityadministration(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@Administer.Exchange
	public BianResponse<CRBranchLocationAdministrativePlanExchangeOutputModel> exchange(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<CRBranchLocationAdministrativePlanExchangeInputModel> bianRequest) {
		return BianResponse.forSuccess(service.exchange(sdReferenceId, crReferenceId, bianRequest.getData()));
	}
	
	@Administer.Feedback
	public BianResponse<SDBranchLocationOperationsFeedbackOutputModel> feedback(@PathVariable("sd-reference-id") String sdReferenceId, @RequestBody BianRequest<SDBranchLocationOperationsFeedbackInputModel> bianRequest) {
		return BianResponse.forSuccess(service.feedback(sdReferenceId, bianRequest.getData()));
	}
	
	@BQ("cashinventoryhandling")
	@Administer.Grant
	public BianResponse<BQCashInventoryHandlingGrantOutputModel> grantCashinventoryhandling(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQCashInventoryHandlingGrantInputModel> bianRequest) {
		return BianResponse.forSuccess(service.grantCashinventoryhandling(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@BQ("locationsecurityadministration")
	@Administer.Grant
	public BianResponse<BQLocationSecurityAdministrationGrantOutputModel> grantLocationsecurityadministration(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQLocationSecurityAdministrationGrantInputModel> bianRequest) {
		return BianResponse.forSuccess(service.grantLocationsecurityadministration(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@BQ("noncashinventoryhandling")
	@Administer.Grant
	public BianResponse<BQNonCashInventoryHandlingGrantOutputModel> grantNoncashinventoryhandling(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQNonCashInventoryHandlingGrantInputModel> bianRequest) {
		return BianResponse.forSuccess(service.grantNoncashinventoryhandling(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@BQ("staffassignment")
	@Administer.Grant
	public BianResponse<BQStaffAssignmentGrantOutputModel> grantStaffassignment(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQStaffAssignmentGrantInputModel> bianRequest) {
		return BianResponse.forSuccess(service.grantStaffassignment(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@Administer.Grant
	public BianResponse<CRBranchLocationAdministrativePlanGrantOutputModel> grant(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<CRBranchLocationAdministrativePlanGrantInputModel> bianRequest) {
		return BianResponse.forSuccess(service.grant(sdReferenceId, crReferenceId, bianRequest.getData()));
	}
	
	@Administer.Initiate
	public BianResponse<CRBranchLocationAdministrativePlanInitiateOutputModel> initiate(@PathVariable("sd-reference-id") String sdReferenceId, @RequestBody BianRequest<CRBranchLocationAdministrativePlanInitiateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.initiate(sdReferenceId, bianRequest.getData()));
	}
	
	@BQ("cashinventoryhandling")
	@Administer.Request
	public BianResponse<BQCashInventoryHandlingRequestOutputModel> requestCashinventoryhandling(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQCashInventoryHandlingRequestInputModel> bianRequest) {
		return BianResponse.forSuccess(service.requestCashinventoryhandling(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@BQ("locationsecurityadministration")
	@Administer.Request
	public BianResponse<BQLocationSecurityAdministrationRequestOutputModel> requestLocationsecurityadministration(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQLocationSecurityAdministrationRequestInputModel> bianRequest) {
		return BianResponse.forSuccess(service.requestLocationsecurityadministration(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@BQ("noncashinventoryhandling")
	@Administer.Request
	public BianResponse<BQNonCashInventoryHandlingRequestOutputModel> requestNoncashinventoryhandling(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQNonCashInventoryHandlingRequestInputModel> bianRequest) {
		return BianResponse.forSuccess(service.requestNoncashinventoryhandling(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@BQ("safecustodyoperations")
	@Administer.Request
	public BianResponse<BQSafeCustodyOperationsRequestOutputModel> requestSafecustodyoperations(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQSafeCustodyOperationsRequestInputModel> bianRequest) {
		return BianResponse.forSuccess(service.requestSafecustodyoperations(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@BQ("staffassignment")
	@Administer.Request
	public BianResponse<BQStaffAssignmentRequestOutputModel> requestStaffassignment(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQStaffAssignmentRequestInputModel> bianRequest) {
		return BianResponse.forSuccess(service.requestStaffassignment(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@Administer.Request
	public BianResponse<CRBranchLocationAdministrativePlanRequestOutputModel> request(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<CRBranchLocationAdministrativePlanRequestInputModel> bianRequest) {
		return BianResponse.forSuccess(service.request(sdReferenceId, crReferenceId, bianRequest.getData()));
	}
	
	@BQ("workforceadministration")
	@Administer.Request
	public BianResponse<BQWorkforceAdministrationRequestOutputModel> requestWorkforceadministration(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQWorkforceAdministrationRequestInputModel> bianRequest) {
		return BianResponse.forSuccess(service.requestWorkforceadministration(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@BQ("cashinventoryhandling")
	@Administer.Retrieve
	public BianResponse<BQCashInventoryHandlingRetrieveOutputModel> retrieveCashinventoryhandling(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrieveCashinventoryhandling(sdReferenceId, crReferenceId, bqReferenceId));
	}
	
	@BQ("locationsecurityadministration")
	@Administer.Retrieve
	public BianResponse<BQLocationSecurityAdministrationRetrieveOutputModel> retrieveLocationsecurityadministration(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrieveLocationsecurityadministration(sdReferenceId, crReferenceId, bqReferenceId));
	}
	
	@BQ("noncashinventoryhandling")
	@Administer.Retrieve
	public BianResponse<BQNonCashInventoryHandlingRetrieveOutputModel> retrieveNoncashinventoryhandling(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrieveNoncashinventoryhandling(sdReferenceId, crReferenceId, bqReferenceId));
	}
	
	@BQ("safecustodyoperations")
	@Administer.Retrieve
	public BianResponse<BQSafeCustodyOperationsRetrieveOutputModel> retrieveSafecustodyoperations(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrieveSafecustodyoperations(sdReferenceId, crReferenceId, bqReferenceId));
	}
	
	@BQ("staffassignment")
	@Administer.Retrieve
	public BianResponse<BQStaffAssignmentRetrieveOutputModel> retrieveStaffassignment(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrieveStaffassignment(sdReferenceId, crReferenceId, bqReferenceId));
	}
	
	@BQ("workforceadministration")
	@Administer.Retrieve
	public BianResponse<BQWorkforceAdministrationRetrieveOutputModel> retrieveWorkforceadministration(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrieveWorkforceadministration(sdReferenceId, crReferenceId, bqReferenceId));
	}
	
	@Administer.Retrieve
	public BianResponse<CRBranchLocationAdministrativePlanRetrieveOutputModel> retrieve(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId) {
		return BianResponse.forSuccess(service.retrieve(sdReferenceId, crReferenceId));
	}
	
	@Administer.RetrieveBQIds
	public BianResponse<List<String>> retrieveBQIds(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("behavior-qualifier") String behaviorQualifier) {
		return BianResponse.forSuccess(service.retrieveBQIds(sdReferenceId, crReferenceId, behaviorQualifier));
	}
	
	@Administer.RetrieveBQs
	public BianResponse<List<String>> retrieveBQs() {
		return BianResponse.forSuccess(service.retrieveBQs());
	}
	
	@Administer.RetrieveRefIds
	public BianResponse<List<String>> retrieveRefIds(@PathVariable("sd-reference-id") String sdReferenceId) {
		return BianResponse.forSuccess(service.retrieveRefIds(sdReferenceId));
	}
	
	@Administer.RetrieveSD
	public BianResponse<SDBranchLocationOperationsRetrieveOutputModel> retrieveSD(@PathVariable("sd-reference-id") String sdReferenceId) {
		return BianResponse.forSuccess(service.retrieveSD(sdReferenceId));
	}
	
	@Administer.Update
	public BianResponse<CRBranchLocationAdministrativePlanUpdateOutputModel> update(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<CRBranchLocationAdministrativePlanUpdateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.update(sdReferenceId, crReferenceId, bianRequest.getData()));
	}
	
	@BQ("cashinventoryhandling")
	@Administer.Update
	public BianResponse<BQCashInventoryHandlingUpdateOutputModel> updateCashinventoryhandling(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQCashInventoryHandlingUpdateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.updateCashinventoryhandling(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@BQ("locationsecurityadministration")
	@Administer.Update
	public BianResponse<BQLocationSecurityAdministrationUpdateOutputModel> updateLocationsecurityadministration(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQLocationSecurityAdministrationUpdateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.updateLocationsecurityadministration(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@BQ("noncashinventoryhandling")
	@Administer.Update
	public BianResponse<BQNonCashInventoryHandlingUpdateOutputModel> updateNoncashinventoryhandling(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQNonCashInventoryHandlingUpdateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.updateNoncashinventoryhandling(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@BQ("safecustodyoperations")
	@Administer.Update
	public BianResponse<BQSafeCustodyOperationsUpdateOutputModel> updateSafecustodyoperations(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQSafeCustodyOperationsUpdateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.updateSafecustodyoperations(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@BQ("staffassignment")
	@Administer.Update
	public BianResponse<BQStaffAssignmentUpdateOutputModel> updateStaffassignment(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQStaffAssignmentUpdateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.updateStaffassignment(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@BQ("workforceadministration")
	@Administer.Update
	public BianResponse<BQWorkforceAdministrationUpdateOutputModel> updateWorkforceadministration(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQWorkforceAdministrationUpdateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.updateWorkforceadministration(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
}
