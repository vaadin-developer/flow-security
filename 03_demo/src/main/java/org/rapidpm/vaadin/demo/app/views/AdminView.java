/**
 * Copyright © 2017 Sven Ruppert (sven.ruppert@gmail.com)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.rapidpm.vaadin.demo.app.views;

import com.vaadin.flow.component.Composite;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.html.Span;
import com.vaadin.flow.router.Route;
import org.rapidpm.vaadin.demo.app.security.roles.AuthorizationRole;
import org.rapidpm.vaadin.demo.app.security.roles.VisibleFor;

@Route(AdminView.NAV)
@VisibleFor({AuthorizationRole.ADMIN})
public class AdminView
    extends Composite<Div> {
  public static final String NAV = "admin";

  public AdminView() {
    getContent().add(new Span("AdminView"));
  }
}