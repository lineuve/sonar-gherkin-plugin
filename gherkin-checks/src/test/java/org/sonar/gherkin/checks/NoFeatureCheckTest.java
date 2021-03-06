/*
 * SonarQube Cucumber Gherkin Analyzer
 * Copyright (C) 2016-2017 David RACODON
 * david.racodon@gmail.com
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
 * You should have received a copy of the GNU Lesser General Public License
 * along with this program; if not, write to the Free Software Foundation,
 * Inc., 51 Franklin Street, Fifth Floor, Boston, MA  02110-1301, USA.
 */
package org.sonar.gherkin.checks;

import org.junit.Test;
import org.sonar.gherkin.checks.verifier.GherkinCheckVerifier;

public class NoFeatureCheckTest {

  @Test
  public void should_not_raise_any_issue_because_a_feature_is_defined() {
    GherkinCheckVerifier.verify(new NoFeatureCheck(), CheckTestUtils.getTestFile("no-feature/feature.feature"));
  }

  @Test
  public void should_raise_an_issue_because_no_feature_is_defined() {
    GherkinCheckVerifier.verify(new NoFeatureCheck(), CheckTestUtils.getTestFile("no-feature/no-feature.feature"));
  }

}
