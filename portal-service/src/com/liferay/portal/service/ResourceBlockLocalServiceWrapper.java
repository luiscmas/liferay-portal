/**
 * Copyright (c) 2000-2012 Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.liferay.portal.service;

/**
 * <p>
 * This class is a wrapper for {@link ResourceBlockLocalService}.
 * </p>
 *
 * @author    Brian Wing Shun Chan
 * @see       ResourceBlockLocalService
 * @generated
 */
public class ResourceBlockLocalServiceWrapper
	implements ResourceBlockLocalService,
		ServiceWrapper<ResourceBlockLocalService> {
	public ResourceBlockLocalServiceWrapper(
		ResourceBlockLocalService resourceBlockLocalService) {
		_resourceBlockLocalService = resourceBlockLocalService;
	}

	/**
	* Adds the resource block to the database. Also notifies the appropriate model listeners.
	*
	* @param resourceBlock the resource block
	* @return the resource block that was added
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.portal.model.ResourceBlock addResourceBlock(
		com.liferay.portal.model.ResourceBlock resourceBlock)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _resourceBlockLocalService.addResourceBlock(resourceBlock);
	}

	/**
	* Creates a new resource block with the primary key. Does not add the resource block to the database.
	*
	* @param resourceBlockId the primary key for the new resource block
	* @return the new resource block
	*/
	public com.liferay.portal.model.ResourceBlock createResourceBlock(
		long resourceBlockId) {
		return _resourceBlockLocalService.createResourceBlock(resourceBlockId);
	}

	/**
	* Deletes the resource block with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param resourceBlockId the primary key of the resource block
	* @return the resource block that was removed
	* @throws PortalException if a resource block with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.portal.model.ResourceBlock deleteResourceBlock(
		long resourceBlockId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _resourceBlockLocalService.deleteResourceBlock(resourceBlockId);
	}

	/**
	* Deletes the resource block from the database. Also notifies the appropriate model listeners.
	*
	* @param resourceBlock the resource block
	* @return the resource block that was removed
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.portal.model.ResourceBlock deleteResourceBlock(
		com.liferay.portal.model.ResourceBlock resourceBlock)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _resourceBlockLocalService.deleteResourceBlock(resourceBlock);
	}

	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _resourceBlockLocalService.dynamicQuery();
	}

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query
	* @return the matching rows
	* @throws SystemException if a system exception occurred
	*/
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _resourceBlockLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @return the range of matching rows
	* @throws SystemException if a system exception occurred
	*/
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException {
		return _resourceBlockLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching rows
	* @throws SystemException if a system exception occurred
	*/
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _resourceBlockLocalService.dynamicQuery(dynamicQuery, start,
			end, orderByComparator);
	}

	/**
	* Returns the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _resourceBlockLocalService.dynamicQueryCount(dynamicQuery);
	}

	public com.liferay.portal.model.ResourceBlock fetchResourceBlock(
		long resourceBlockId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _resourceBlockLocalService.fetchResourceBlock(resourceBlockId);
	}

	/**
	* Returns the resource block with the primary key.
	*
	* @param resourceBlockId the primary key of the resource block
	* @return the resource block
	* @throws PortalException if a resource block with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.portal.model.ResourceBlock getResourceBlock(
		long resourceBlockId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _resourceBlockLocalService.getResourceBlock(resourceBlockId);
	}

	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _resourceBlockLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the resource blocks.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of resource blocks
	* @param end the upper bound of the range of resource blocks (not inclusive)
	* @return the range of resource blocks
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.liferay.portal.model.ResourceBlock> getResourceBlocks(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _resourceBlockLocalService.getResourceBlocks(start, end);
	}

	/**
	* Returns the number of resource blocks.
	*
	* @return the number of resource blocks
	* @throws SystemException if a system exception occurred
	*/
	public int getResourceBlocksCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _resourceBlockLocalService.getResourceBlocksCount();
	}

	/**
	* Updates the resource block in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param resourceBlock the resource block
	* @return the resource block that was updated
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.portal.model.ResourceBlock updateResourceBlock(
		com.liferay.portal.model.ResourceBlock resourceBlock)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _resourceBlockLocalService.updateResourceBlock(resourceBlock);
	}

	/**
	* Updates the resource block in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param resourceBlock the resource block
	* @param merge whether to merge the resource block with the current session. See {@link com.liferay.portal.service.persistence.BatchSession#update(com.liferay.portal.kernel.dao.orm.Session, com.liferay.portal.model.BaseModel, boolean)} for an explanation.
	* @return the resource block that was updated
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.portal.model.ResourceBlock updateResourceBlock(
		com.liferay.portal.model.ResourceBlock resourceBlock, boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _resourceBlockLocalService.updateResourceBlock(resourceBlock,
			merge);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	public java.lang.String getBeanIdentifier() {
		return _resourceBlockLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_resourceBlockLocalService.setBeanIdentifier(beanIdentifier);
	}

	public void addCompanyScopePermission(long companyId,
		java.lang.String name, long roleId, java.lang.String actionId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		_resourceBlockLocalService.addCompanyScopePermission(companyId, name,
			roleId, actionId);
	}

	public void addCompanyScopePermissions(long companyId,
		java.lang.String name, long roleId, long actionIdsLong)
		throws com.liferay.portal.kernel.exception.SystemException {
		_resourceBlockLocalService.addCompanyScopePermissions(companyId, name,
			roleId, actionIdsLong);
	}

	public void addGroupScopePermission(long companyId, long groupId,
		java.lang.String name, long roleId, java.lang.String actionId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		_resourceBlockLocalService.addGroupScopePermission(companyId, groupId,
			name, roleId, actionId);
	}

	public void addGroupScopePermissions(long companyId, long groupId,
		java.lang.String name, long roleId, long actionIdsLong)
		throws com.liferay.portal.kernel.exception.SystemException {
		_resourceBlockLocalService.addGroupScopePermissions(companyId, groupId,
			name, roleId, actionIdsLong);
	}

	public void addIndividualScopePermission(long companyId, long groupId,
		java.lang.String name, long primKey, long roleId,
		java.lang.String actionId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		_resourceBlockLocalService.addIndividualScopePermission(companyId,
			groupId, name, primKey, roleId, actionId);
	}

	public void addIndividualScopePermission(long companyId, long groupId,
		java.lang.String name,
		com.liferay.portal.model.PermissionedModel permissionedModel,
		long roleId, java.lang.String actionId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		_resourceBlockLocalService.addIndividualScopePermission(companyId,
			groupId, name, permissionedModel, roleId, actionId);
	}

	public void addIndividualScopePermissions(long companyId, long groupId,
		java.lang.String name, long primKey, long roleId, long actionIdsLong)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		_resourceBlockLocalService.addIndividualScopePermissions(companyId,
			groupId, name, primKey, roleId, actionIdsLong);
	}

	public void addIndividualScopePermissions(long companyId, long groupId,
		java.lang.String name,
		com.liferay.portal.model.PermissionedModel permissionedModel,
		long roleId, long actionIdsLong)
		throws com.liferay.portal.kernel.exception.SystemException {
		_resourceBlockLocalService.addIndividualScopePermissions(companyId,
			groupId, name, permissionedModel, roleId, actionIdsLong);
	}

	/**
	* Adds a resource block if necessary and associates the resource block
	* permissions with it. The resource block will have an initial reference
	* count of one.
	*
	* @param companyId the primary key of the resource block's company
	* @param groupId the primary key of the resource block's group
	* @param name the resource block's name
	* @param permissionsHash the resource block's permission hash
	* @param resourceBlockPermissionsContainer the resource block's
	permissions container
	* @return the new resource block
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.portal.model.ResourceBlock addResourceBlock(
		long companyId, long groupId, java.lang.String name,
		java.lang.String permissionsHash,
		com.liferay.portal.model.ResourceBlockPermissionsContainer resourceBlockPermissionsContainer)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _resourceBlockLocalService.addResourceBlock(companyId, groupId,
			name, permissionsHash, resourceBlockPermissionsContainer);
	}

	public long getActionId(java.lang.String name, java.lang.String actionId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _resourceBlockLocalService.getActionId(name, actionId);
	}

	public long getActionIds(java.lang.String name,
		java.util.List<java.lang.String> actionIds)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _resourceBlockLocalService.getActionIds(name, actionIds);
	}

	public java.util.List<java.lang.String> getActionIds(
		java.lang.String name, long actionIdsLong)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _resourceBlockLocalService.getActionIds(name, actionIdsLong);
	}

	public java.util.List<java.lang.String> getCompanyScopePermissions(
		com.liferay.portal.model.ResourceBlock resourceBlock, long roleId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _resourceBlockLocalService.getCompanyScopePermissions(resourceBlock,
			roleId);
	}

	public java.util.List<java.lang.String> getGroupScopePermissions(
		com.liferay.portal.model.ResourceBlock resourceBlock, long roleId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _resourceBlockLocalService.getGroupScopePermissions(resourceBlock,
			roleId);
	}

	public com.liferay.portal.model.PermissionedModel getPermissionedModel(
		java.lang.String name, long primKey)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _resourceBlockLocalService.getPermissionedModel(name, primKey);
	}

	public java.util.List<java.lang.String> getPermissions(
		com.liferay.portal.model.ResourceBlock resourceBlock, long roleId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _resourceBlockLocalService.getPermissions(resourceBlock, roleId);
	}

	public com.liferay.portal.model.ResourceBlock getResourceBlock(
		java.lang.String name, long primKey)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _resourceBlockLocalService.getResourceBlock(name, primKey);
	}

	public java.util.List<java.lang.Long> getResourceBlockIds(
		com.liferay.portal.security.permission.ResourceBlockIdsBag resourceBlockIdsBag,
		java.lang.String name, java.lang.String actionId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _resourceBlockLocalService.getResourceBlockIds(resourceBlockIdsBag,
			name, actionId);
	}

	public com.liferay.portal.security.permission.ResourceBlockIdsBag getResourceBlockIdsBag(
		long companyId, long groupId, java.lang.String name, long[] roleIds)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _resourceBlockLocalService.getResourceBlockIdsBag(companyId,
			groupId, name, roleIds);
	}

	public boolean hasPermission(java.lang.String name, long primKey,
		java.lang.String actionId,
		com.liferay.portal.security.permission.ResourceBlockIdsBag resourceBlockIdsBag)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _resourceBlockLocalService.hasPermission(name, primKey,
			actionId, resourceBlockIdsBag);
	}

	public boolean hasPermission(java.lang.String name,
		com.liferay.portal.model.PermissionedModel permissionedModel,
		java.lang.String actionId,
		com.liferay.portal.security.permission.ResourceBlockIdsBag resourceBlockIdsBag)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _resourceBlockLocalService.hasPermission(name,
			permissionedModel, actionId, resourceBlockIdsBag);
	}

	public boolean isSupported(java.lang.String name) {
		return _resourceBlockLocalService.isSupported(name);
	}

	public void releasePermissionedModelResourceBlock(
		com.liferay.portal.model.PermissionedModel permissionedModel)
		throws com.liferay.portal.kernel.exception.SystemException {
		_resourceBlockLocalService.releasePermissionedModelResourceBlock(permissionedModel);
	}

	public void releasePermissionedModelResourceBlock(java.lang.String name,
		long primKey)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		_resourceBlockLocalService.releasePermissionedModelResourceBlock(name,
			primKey);
	}

	/**
	* Decrements the reference count of the resource block and updates it in
	* the database or deletes the resource block if the reference count reaches
	* zero.
	*
	* @param resourceBlockId the primary key of the resource block
	* @throws SystemException if a system exception occurred
	*/
	public void releaseResourceBlock(long resourceBlockId)
		throws com.liferay.portal.kernel.exception.SystemException {
		_resourceBlockLocalService.releaseResourceBlock(resourceBlockId);
	}

	/**
	* Decrements the reference count of the resource block and updates it in
	* the database or deletes the resource block if the reference count reaches
	* zero.
	*
	* @param resourceBlock the resource block
	* @throws SystemException if a system exception occurred
	*/
	public void releaseResourceBlock(
		com.liferay.portal.model.ResourceBlock resourceBlock)
		throws com.liferay.portal.kernel.exception.SystemException {
		_resourceBlockLocalService.releaseResourceBlock(resourceBlock);
	}

	public void removeAllGroupScopePermissions(long companyId,
		java.lang.String name, long roleId, long actionIdsLong)
		throws com.liferay.portal.kernel.exception.SystemException {
		_resourceBlockLocalService.removeAllGroupScopePermissions(companyId,
			name, roleId, actionIdsLong);
	}

	public void removeAllGroupScopePermissions(long companyId,
		java.lang.String name, long roleId, java.lang.String actionId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		_resourceBlockLocalService.removeAllGroupScopePermissions(companyId,
			name, roleId, actionId);
	}

	public void removeCompanyScopePermission(long companyId,
		java.lang.String name, long roleId, java.lang.String actionId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		_resourceBlockLocalService.removeCompanyScopePermission(companyId,
			name, roleId, actionId);
	}

	public void removeCompanyScopePermissions(long companyId,
		java.lang.String name, long roleId, long actionIdsLong)
		throws com.liferay.portal.kernel.exception.SystemException {
		_resourceBlockLocalService.removeCompanyScopePermissions(companyId,
			name, roleId, actionIdsLong);
	}

	public void removeGroupScopePermission(long companyId, long groupId,
		java.lang.String name, long roleId, java.lang.String actionId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		_resourceBlockLocalService.removeGroupScopePermission(companyId,
			groupId, name, roleId, actionId);
	}

	public void removeGroupScopePermissions(long companyId, long groupId,
		java.lang.String name, long roleId, long actionIdsLong)
		throws com.liferay.portal.kernel.exception.SystemException {
		_resourceBlockLocalService.removeGroupScopePermissions(companyId,
			groupId, name, roleId, actionIdsLong);
	}

	public void removeIndividualScopePermission(long companyId, long groupId,
		java.lang.String name, long primKey, long roleId,
		java.lang.String actionId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		_resourceBlockLocalService.removeIndividualScopePermission(companyId,
			groupId, name, primKey, roleId, actionId);
	}

	public void removeIndividualScopePermission(long companyId, long groupId,
		java.lang.String name,
		com.liferay.portal.model.PermissionedModel permissionedModel,
		long roleId, java.lang.String actionId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		_resourceBlockLocalService.removeIndividualScopePermission(companyId,
			groupId, name, permissionedModel, roleId, actionId);
	}

	public void removeIndividualScopePermissions(long companyId, long groupId,
		java.lang.String name, long primKey, long roleId, long actionIdsLong)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		_resourceBlockLocalService.removeIndividualScopePermissions(companyId,
			groupId, name, primKey, roleId, actionIdsLong);
	}

	public void removeIndividualScopePermissions(long companyId, long groupId,
		java.lang.String name,
		com.liferay.portal.model.PermissionedModel permissionedModel,
		long roleId, long actionIdsLong)
		throws com.liferay.portal.kernel.exception.SystemException {
		_resourceBlockLocalService.removeIndividualScopePermissions(companyId,
			groupId, name, permissionedModel, roleId, actionIdsLong);
	}

	public void setCompanyScopePermissions(long companyId,
		java.lang.String name, long roleId,
		java.util.List<java.lang.String> actionIds)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		_resourceBlockLocalService.setCompanyScopePermissions(companyId, name,
			roleId, actionIds);
	}

	public void setCompanyScopePermissions(long companyId,
		java.lang.String name, long roleId, long actionIdsLong)
		throws com.liferay.portal.kernel.exception.SystemException {
		_resourceBlockLocalService.setCompanyScopePermissions(companyId, name,
			roleId, actionIdsLong);
	}

	public void setGroupScopePermissions(long companyId, long groupId,
		java.lang.String name, long roleId,
		java.util.List<java.lang.String> actionIds)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		_resourceBlockLocalService.setGroupScopePermissions(companyId, groupId,
			name, roleId, actionIds);
	}

	public void setGroupScopePermissions(long companyId, long groupId,
		java.lang.String name, long roleId, long actionIdsLong)
		throws com.liferay.portal.kernel.exception.SystemException {
		_resourceBlockLocalService.setGroupScopePermissions(companyId, groupId,
			name, roleId, actionIdsLong);
	}

	public void setIndividualScopePermissions(long companyId, long groupId,
		java.lang.String name, long primKey, long roleId,
		java.util.List<java.lang.String> actionIds)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		_resourceBlockLocalService.setIndividualScopePermissions(companyId,
			groupId, name, primKey, roleId, actionIds);
	}

	public void setIndividualScopePermissions(long companyId, long groupId,
		java.lang.String name, long primKey, long roleId, long actionIdsLong)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		_resourceBlockLocalService.setIndividualScopePermissions(companyId,
			groupId, name, primKey, roleId, actionIdsLong);
	}

	public void setIndividualScopePermissions(long companyId, long groupId,
		java.lang.String name, long primKey,
		java.util.Map<java.lang.Long, java.lang.String[]> roleIdsToActionIds)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		_resourceBlockLocalService.setIndividualScopePermissions(companyId,
			groupId, name, primKey, roleIdsToActionIds);
	}

	public void setIndividualScopePermissions(long companyId, long groupId,
		java.lang.String name,
		com.liferay.portal.model.PermissionedModel permissionedModel,
		long roleId, java.util.List<java.lang.String> actionIds)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		_resourceBlockLocalService.setIndividualScopePermissions(companyId,
			groupId, name, permissionedModel, roleId, actionIds);
	}

	public void setIndividualScopePermissions(long companyId, long groupId,
		java.lang.String name,
		com.liferay.portal.model.PermissionedModel permissionedModel,
		long roleId, long actionIdsLong)
		throws com.liferay.portal.kernel.exception.SystemException {
		_resourceBlockLocalService.setIndividualScopePermissions(companyId,
			groupId, name, permissionedModel, roleId, actionIdsLong);
	}

	public void updateCompanyScopePermissions(long companyId,
		java.lang.String name, long roleId, long actionIdsLong, int operator)
		throws com.liferay.portal.kernel.exception.SystemException {
		_resourceBlockLocalService.updateCompanyScopePermissions(companyId,
			name, roleId, actionIdsLong, operator);
	}

	public void updateGroupScopePermissions(long companyId, long groupId,
		java.lang.String name, long roleId, long actionIdsLong, int operator)
		throws com.liferay.portal.kernel.exception.SystemException {
		_resourceBlockLocalService.updateGroupScopePermissions(companyId,
			groupId, name, roleId, actionIdsLong, operator);
	}

	public void updateIndividualScopePermissions(long companyId, long groupId,
		java.lang.String name,
		com.liferay.portal.model.PermissionedModel permissionedModel,
		long roleId, long actionIdsLong, int operator)
		throws com.liferay.portal.kernel.exception.SystemException {
		_resourceBlockLocalService.updateIndividualScopePermissions(companyId,
			groupId, name, permissionedModel, roleId, actionIdsLong, operator);
	}

	public com.liferay.portal.model.ResourceBlock updateResourceBlockId(
		long companyId, long groupId, java.lang.String name,
		com.liferay.portal.model.PermissionedModel permissionedModel,
		java.lang.String permissionsHash,
		com.liferay.portal.model.ResourceBlockPermissionsContainer resourceBlockPermissionsContainer)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _resourceBlockLocalService.updateResourceBlockId(companyId,
			groupId, name, permissionedModel, permissionsHash,
			resourceBlockPermissionsContainer);
	}

	public void verifyResourceBlockId(long companyId, java.lang.String name,
		long primKey)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		_resourceBlockLocalService.verifyResourceBlockId(companyId, name,
			primKey);
	}

	/**
	 * @deprecated Renamed to {@link #getWrappedService}
	 */
	public ResourceBlockLocalService getWrappedResourceBlockLocalService() {
		return _resourceBlockLocalService;
	}

	/**
	 * @deprecated Renamed to {@link #setWrappedService}
	 */
	public void setWrappedResourceBlockLocalService(
		ResourceBlockLocalService resourceBlockLocalService) {
		_resourceBlockLocalService = resourceBlockLocalService;
	}

	public ResourceBlockLocalService getWrappedService() {
		return _resourceBlockLocalService;
	}

	public void setWrappedService(
		ResourceBlockLocalService resourceBlockLocalService) {
		_resourceBlockLocalService = resourceBlockLocalService;
	}

	private ResourceBlockLocalService _resourceBlockLocalService;
}