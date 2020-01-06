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
package org.rapidpm.vaadin.demo.app.security.model;

import org.rapidpm.vaadin.demo.app.security.roles.AuthorizationRole;
import org.rapidpm.dependencies.core.logger.HasLogger;
import org.rapidpm.frp.model.Triple;

import java.util.HashSet;
import java.util.Set;

import static java.util.Arrays.asList;

public class MyUser
    extends Triple<Long, String, Set<AuthorizationRole>>
    implements HasLogger {

  public MyUser(Long id, String name, Set<AuthorizationRole> roles) {
    super(id, name, roles);
  }

  public MyUser(Long id, String name, AuthorizationRole... roles) {
    super(id, name, new HashSet<>(asList(roles)));
  }

  public Long id() {
    return getT1();
  }

  public String name() {
    return getT2();
  }

  public Set<AuthorizationRole> roles() {
    return getT3();
  }
}
