package com.apap.tutorial5.service;

import com.apap.tutorial5.model.PilotModel;

/**
 * 
 * PilotService
 * @author ivanabdurrahman
 *
 */
public interface PilotService {
	PilotModel getPilotDetailByLicenseNumber (String licenseNumber);
	
	void addPilot (PilotModel pilot);
	
	void deletePilotById(Long id);
}
