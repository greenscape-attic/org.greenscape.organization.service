package org.greenscape.organization.service;

import java.util.Collection;

import org.greenscape.organization.OrganizationEntity;

public interface OrganizationService {

	public OrganizationEntity findById(Object id);

	public OrganizationEntity findByOrganizationId(long orgId);

	public Collection<OrganizationEntity> findAll();

	public OrganizationEntity save(OrganizationEntity organizationModel);

	public void deleteByOrganizationId(long orgId);

}