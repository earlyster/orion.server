/*******************************************************************************
 * Copyright (c) 2010 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *******************************************************************************/
package org.eclipse.orion.server.tests;

import org.eclipse.orion.server.tests.prefs.PreferenceTest;
import org.eclipse.orion.server.tests.servlets.files.AdvancedFilesTest;
import org.eclipse.orion.server.tests.servlets.files.CoreFilesTest;
import org.eclipse.orion.server.tests.servlets.users.BasicUsersTest;
import org.eclipse.orion.server.tests.servlets.workspace.WorkspaceServiceTest;
import org.eclipse.orion.server.tests.useradmin.XmlUserAdminTest;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

/**
 * Runs all automated server tests.
 */
@RunWith(Suite.class)
@SuiteClasses({CoreFilesTest.class, AdvancedFilesTest.class, PreferenceTest.class, BasicUsersTest.class, WorkspaceServiceTest.class, XmlUserAdminTest.class, PreferenceTest.class})
public class AllServerTests {
	//goofy junit4, no class body needed
}