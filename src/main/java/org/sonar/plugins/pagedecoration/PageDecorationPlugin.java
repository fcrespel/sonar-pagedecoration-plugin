/*
 * Sonar Page Decoration Plugin
 * Copyright (C) 2013 SonarSource
 * dev@sonar.codehaus.org
 *
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 3 of the License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this program; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA  02
 */
package org.sonar.plugins.pagedecoration;

import java.util.Arrays;
import java.util.List;

import org.sonar.api.PropertyType;
import org.sonar.api.SonarPlugin;
import org.sonar.api.config.PropertyDefinition;

public class PageDecorationPlugin extends SonarPlugin {

	public static final String SCRIPT_PROPERTY = "sonar.pagedecoration.script";
	public static final String STYLE_PROPERTY = "sonar.pagedecoration.style";
	public static final String HEADER_PROPERTY = "sonar.pagedecoration.header";
	public static final String FOOTER_PROPERTY = "sonar.pagedecoration.footer";
	public static final String SIDEBAR_PROPERTY = "sonar.pagedecoration.sidebar";

	@Override
	@SuppressWarnings("rawtypes")
	public List getExtensions() {
		return Arrays.asList(
			CustomPageDecoration.class,
			PropertyDefinition.builder(SCRIPT_PROPERTY)
				.name("Script")
				.type(PropertyType.TEXT)
				.index(10)
				.build(),
			PropertyDefinition.builder(STYLE_PROPERTY)
				.name("Style")
				.type(PropertyType.TEXT)
				.index(20)
				.build(),
			PropertyDefinition.builder(HEADER_PROPERTY)
				.name("Header")
				.type(PropertyType.TEXT)
				.index(30)
				.build(),
			PropertyDefinition.builder(FOOTER_PROPERTY)
				.name("Footer")
				.type(PropertyType.TEXT)
				.index(40)
				.build(),
			PropertyDefinition.builder(SIDEBAR_PROPERTY)
				.name("Sidebar")
				.type(PropertyType.TEXT)
				.index(50)
				.build()
		);
	}

}
