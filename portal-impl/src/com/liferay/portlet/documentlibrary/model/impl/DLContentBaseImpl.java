/**
 * Copyright (c) 2000-2013 Liferay, Inc. All rights reserved.
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

package com.liferay.portlet.documentlibrary.model.impl;

import com.liferay.portal.kernel.exception.SystemException;

import com.liferay.portlet.documentlibrary.model.DLContent;
import com.liferay.portlet.documentlibrary.service.DLContentLocalServiceUtil;

/**
 * The extended model base implementation for the DLContent service. Represents a row in the &quot;DLContent&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This class exists only as a container for the default extended model level methods generated by ServiceBuilder. Helper methods and all application logic should be put in {@link DLContentImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see DLContentImpl
 * @see com.liferay.portlet.documentlibrary.model.DLContent
 * @generated
 */
public abstract class DLContentBaseImpl extends DLContentModelImpl
	implements DLContent {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a document library content model instance should use the {@link DLContent} interface instead.
	 */
	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			DLContentLocalServiceUtil.addDLContent(this);
		}
		else {
			DLContentLocalServiceUtil.updateDLContent(this);
		}
	}
}