/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
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

package com.liferay.revisited.service;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.revisited.model.Employee;

import java.util.List;

/**
 * Provides the remote service utility for Employee. This utility wraps
 * <code>com.liferay.revisited.service.impl.EmployeeServiceImpl</code> and is an
 * access point for service operations in application layer code running on a
 * remote server. Methods of this service are expected to have security checks
 * based on the propagated JAAS credentials because this service can be
 * accessed remotely.
 *
 * @author Brian Wing Shun Chan
 * @see EmployeeService
 * @generated
 */
public class EmployeeServiceUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to <code>com.liferay.revisited.service.impl.EmployeeServiceImpl</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static Employee addEmployee(
		String name, String address, String phoneNumber, long salary,
		String emailAddress) {

		return getService().addEmployee(
			name, address, phoneNumber, salary, emailAddress);
	}

	public static Employee getEmployeeById(long employeeId)
		throws PortalException {

		return getService().getEmployeeById(employeeId);
	}

	public static List<Employee> getEmployees(int startIndex, int lastIndex) {
		return getService().getEmployees(startIndex, lastIndex);
	}

	public static int getEmployeesCount() {
		return getService().getEmployeesCount();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	public static String getOSGiServiceIdentifier() {
		return getService().getOSGiServiceIdentifier();
	}

	public static EmployeeService getService() {
		return _service;
	}

	private static volatile EmployeeService _service;

}