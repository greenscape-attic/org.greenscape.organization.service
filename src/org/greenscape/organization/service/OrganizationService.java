package org.greenscape.organization.service;

import java.util.Collection;

import org.greenscape.organization.OrganizationEntity;

public interface OrganizationService {

	OrganizationEntity findById(Object id);

	OrganizationEntity findByOrganizationId(long orgId);

	Collection<OrganizationEntity> findAll();

	OrganizationEntity save(OrganizationEntity organizationModel);

	void deleteByOrganizationId(long orgId);

}