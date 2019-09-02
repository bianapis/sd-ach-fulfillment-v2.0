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
import org.bian.annotation.functionalpattern.Operate;

@BianRestController
public class AchFulfillmentApiController {

	@Autowired
	AchFulfillmentApiService service;
	
	@Operate.Activate
	public BianResponse<SDACHFulfillmentActivateOutputModel> activate(@RequestBody BianRequest<SDACHFulfillmentActivateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.activate(bianRequest.getData()));
	}
	
	@Operate.Configure
	public BianResponse<SDACHFulfillmentConfigureOutputModel> configure(@PathVariable("sd-reference-id") String sdReferenceId, @RequestBody BianRequest<SDACHFulfillmentConfigureInputModel> bianRequest) {
		return BianResponse.forSuccess(service.configure(sdReferenceId, bianRequest.getData()));
	}
	
	@Operate.Control
	public BianResponse<CRACHFulfillmentOperatingSessionControlOutputModel> control(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<CRACHFulfillmentOperatingSessionControlInputModel> bianRequest) {
		return BianResponse.forSuccess(service.control(sdReferenceId, crReferenceId, bianRequest.getData()));
	}
	
	@Operate.Feedback
	public BianResponse<SDACHFulfillmentFeedbackOutputModel> feedback(@PathVariable("sd-reference-id") String sdReferenceId, @RequestBody BianRequest<SDACHFulfillmentFeedbackInputModel> bianRequest) {
		return BianResponse.forSuccess(service.feedback(sdReferenceId, bianRequest.getData()));
	}
	
	@Operate.Initiate
	public BianResponse<CRACHFulfillmentOperatingSessionInitiateOutputModel> initiate(@PathVariable("sd-reference-id") String sdReferenceId, @RequestBody BianRequest<CRACHFulfillmentOperatingSessionInitiateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.initiate(sdReferenceId, bianRequest.getData()));
	}
	
	@BQ("clearingandsettlement")
	@Operate.Initiate
	public BianResponse<BQClearingandSettlementInitiateOutputModel> initiateClearingandsettlement(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<BQClearingandSettlementInitiateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.initiateClearingandsettlement(sdReferenceId, crReferenceId, bianRequest.getData()));
	}
	
	@BQ("inboundach")
	@Operate.Initiate
	public BianResponse<BQInboundACHInitiateOutputModel> initiateInboundach(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<BQInboundACHInitiateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.initiateInboundach(sdReferenceId, crReferenceId, bianRequest.getData()));
	}
	
	@BQ("outboundach")
	@Operate.Initiate
	public BianResponse<BQOutboundACHInitiateOutputModel> initiateOutboundach(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<BQOutboundACHInitiateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.initiateOutboundach(sdReferenceId, crReferenceId, bianRequest.getData()));
	}
	
	@BQ("reconciliation")
	@Operate.Initiate
	public BianResponse<BQReconciliationInitiateOutputModel> initiateReconciliation(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<BQReconciliationInitiateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.initiateReconciliation(sdReferenceId, crReferenceId, bianRequest.getData()));
	}
	
	@BQ("warehousing")
	@Operate.Initiate
	public BianResponse<BQWarehousingInitiateOutputModel> initiateWarehousing(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<BQWarehousingInitiateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.initiateWarehousing(sdReferenceId, crReferenceId, bianRequest.getData()));
	}
	
	@Operate.Retrieve
	public BianResponse<CRACHFulfillmentOperatingSessionRetrieveOutputModel> retrieve(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId) {
		return BianResponse.forSuccess(service.retrieve(sdReferenceId, crReferenceId));
	}
	
	@Operate.RetrieveBQIds
	public BianResponse<List<String>> retrieveBQIds(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("behavior-qualifier") String behaviorQualifier) {
		return BianResponse.forSuccess(service.retrieveBQIds(sdReferenceId, crReferenceId, behaviorQualifier));
	}
	
	@Operate.RetrieveBQs
	public BianResponse<List<String>> retrieveBQs() {
		return BianResponse.forSuccess(service.retrieveBQs());
	}
	
	@BQ("clearingandsettlement")
	@Operate.Retrieve
	public BianResponse<BQClearingandSettlementRetrieveOutputModel> retrieveClearingandsettlement(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrieveClearingandsettlement(sdReferenceId, crReferenceId, bqReferenceId));
	}
	
	@BQ("inboundach")
	@Operate.Retrieve
	public BianResponse<BQInboundACHRetrieveOutputModel> retrieveInboundach(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrieveInboundach(sdReferenceId, crReferenceId, bqReferenceId));
	}
	
	@BQ("outboundach")
	@Operate.Retrieve
	public BianResponse<BQOutboundACHRetrieveOutputModel> retrieveOutboundach(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrieveOutboundach(sdReferenceId, crReferenceId, bqReferenceId));
	}
	
	@BQ("reconciliation")
	@Operate.Retrieve
	public BianResponse<BQReconciliationRetrieveOutputModel> retrieveReconciliation(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrieveReconciliation(sdReferenceId, crReferenceId, bqReferenceId));
	}
	
	@BQ("warehousing")
	@Operate.Retrieve
	public BianResponse<BQWarehousingRetrieveOutputModel> retrieveWarehousing(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrieveWarehousing(sdReferenceId, crReferenceId, bqReferenceId));
	}
	
	@Operate.RetrieveRefIds
	public BianResponse<List<String>> retrieveRefIds(@PathVariable("sd-reference-id") String sdReferenceId) {
		return BianResponse.forSuccess(service.retrieveRefIds(sdReferenceId));
	}
	
	@Operate.RetrieveSD
	public BianResponse<SDACHFulfillmentRetrieveOutputModel> retrieveSD(@PathVariable("sd-reference-id") String sdReferenceId) {
		return BianResponse.forSuccess(service.retrieveSD(sdReferenceId));
	}
	
	@Operate.Update
	public BianResponse<CRACHFulfillmentOperatingSessionUpdateOutputModel> update(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<CRACHFulfillmentOperatingSessionUpdateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.update(sdReferenceId, crReferenceId, bianRequest.getData()));
	}
	
	@BQ("clearingandsettlement")
	@Operate.Update
	public BianResponse<BQClearingandSettlementUpdateOutputModel> updateClearingandsettlement(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQClearingandSettlementUpdateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.updateClearingandsettlement(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@BQ("inboundach")
	@Operate.Update
	public BianResponse<BQInboundACHUpdateOutputModel> updateInboundach(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQInboundACHUpdateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.updateInboundach(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@BQ("outboundach")
	@Operate.Update
	public BianResponse<BQOutboundACHUpdateOutputModel> updateOutboundach(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQOutboundACHUpdateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.updateOutboundach(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@BQ("reconciliation")
	@Operate.Update
	public BianResponse<BQReconciliationUpdateOutputModel> updateReconciliation(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQReconciliationUpdateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.updateReconciliation(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@BQ("warehousing")
	@Operate.Update
	public BianResponse<BQWarehousingUpdateOutputModel> updateWarehousing(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQWarehousingUpdateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.updateWarehousing(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
}
