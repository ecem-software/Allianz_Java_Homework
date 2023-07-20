package service;

import model.*;

import java.util.ArrayList;

public class InsuranceRequestService {
    public InsuranceRequest createInsuranceRequest(Vehicle vehicle) {
        InsuranceRequest insuranceRequest = new InsuranceRequest();
        insuranceRequest.setVehicle(vehicle);
        return insuranceRequest;
    }

    public void addProposalToInsuranceRequest(InsuranceRequest insuranceRequest, Proposal proposal) {
        if (insuranceRequest.getProposalList() != null) {
            insuranceRequest.getProposalList().add(proposal);
        } else {
            ArrayList<Proposal> proposalList = new ArrayList<>();
            proposalList.add(proposal);
            insuranceRequest.setProposalList(proposalList);
        }
    }

    public void createAddPolicyToInsuranceRequest(InsuranceRequest insuranceRequest, Proposal proposal) {
        Policy policy = new Policy();
        policy.setVehicle(proposal.getVehicle());
        policy.setInsuranceCompany(proposal.getCompany());
        policy.setPrice(proposal.getOfferPrice());
        policy.setStartDate(proposal.getStartDate());
        policy.setEndDate(proposal.getEndDate());
        insuranceRequest.setPolicy(policy);

    }
}
