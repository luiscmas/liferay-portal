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

package com.liferay.portalweb.portal.controlpanel.polls;

import com.liferay.portalweb.portal.BaseTestCase;
import com.liferay.portalweb.portal.util.RuntimeVariables;

/**
 * @author Brian Wing Shun Chan
 */
public class ExpireQuestionTest extends BaseTestCase {
	public void testExpireQuestion() throws Exception {
		selenium.selectWindow("null");
		selenium.selectFrame("relative=top");
		selenium.open("/web/guest/home/");
		assertEquals(RuntimeVariables.replace("Go to"),
			selenium.getText("//li[@id='_145_mySites']/a/span"));
		selenium.mouseOver("//li[@id='_145_mySites']/a/span");
		selenium.waitForVisible("link=Control Panel");
		selenium.clickAt("link=Control Panel",
			RuntimeVariables.replace("Control Panel"));
		selenium.waitForPageToLoad("30000");
		selenium.clickAt("link=Polls", RuntimeVariables.replace("Polls"));
		selenium.waitForPageToLoad("30000");
		selenium.clickAt("link=Edited Test Question 2",
			RuntimeVariables.replace("Edited Test Question 2"));
		selenium.waitForPageToLoad("30000");
		assertTrue(selenium.isElementPresent(
				"//div[2]/div/span[1]/span/span/input"));
		assertTrue(selenium.isElementPresent("//span[2]/span/span/input"));
		assertTrue(selenium.isElementPresent("//span[3]/span/span/input"));
		assertTrue(selenium.isElementPresent("//span[4]/span/span/input"));
		selenium.clickAt("//input[@value='Cancel']",
			RuntimeVariables.replace("Cancel"));
		selenium.waitForPageToLoad("30000");
		assertEquals(RuntimeVariables.replace("Actions"),
			selenium.getText("//span[@title='Actions']/ul/li/strong/a/span"));
		selenium.clickAt("//span[@title='Actions']/ul/li/strong/a/span",
			RuntimeVariables.replace("Actions"));
		selenium.waitForVisible(
			"//div[@class='lfr-component lfr-menu-list']/ul/li[contains(.,'Edit')]/a");
		assertEquals(RuntimeVariables.replace("Edit"),
			selenium.getText(
				"//div[@class='lfr-component lfr-menu-list']/ul/li[contains(.,'Edit')]/a"));
		selenium.click(RuntimeVariables.replace(
				"//div[@class='lfr-component lfr-menu-list']/ul/li[contains(.,'Edit')]/a"));
		selenium.waitForPageToLoad("30000");
		assertTrue(selenium.isChecked("//input[@id='_25_neverExpireCheckbox']"));
		selenium.clickAt("//input[@id='_25_neverExpireCheckbox']",
			RuntimeVariables.replace("Never Expire"));
		assertFalse(selenium.isChecked("//input[@id='_25_neverExpireCheckbox']"));
		selenium.waitForVisible("//select[@id='_25_expirationDateMonth']");
		selenium.select("//select[@id='_25_expirationDateYear']",
			RuntimeVariables.replace("label=2008"));
		selenium.select("//select[@id='_25_expirationDateMonth']",
			RuntimeVariables.replace("label=January"));
		selenium.select("//select[@id='_25_expirationDateDay']",
			RuntimeVariables.replace("label=1"));
		selenium.select("//select[@name='_25_expirationDateHour']",
			RuntimeVariables.replace("label=12"));
		selenium.select("//select[@name='_25_expirationDateMinute']",
			RuntimeVariables.replace("label=:00"));
		selenium.select("//select[@name='_25_expirationDateAmPm']",
			RuntimeVariables.replace("label=AM"));
		selenium.clickAt("//input[@value='Save']",
			RuntimeVariables.replace("Save"));
		selenium.waitForPageToLoad("30000");
		assertEquals(RuntimeVariables.replace(
				"Your request completed successfully."),
			selenium.getText("//div[@class='portlet-msg-success']"));
	}
}