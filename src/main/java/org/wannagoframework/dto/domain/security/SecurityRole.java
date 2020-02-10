/*
 * This file is part of the WannaGo distribution (https://github.com/wannago).
 * Copyright (c) [2019] - [2020].
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, version 3.
 *
 * This program is distributed in the hope that it will be useful, but
 * WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program. If not, see <http://www.gnu.org/licenses/>.
 */


package org.wannagoframework.dto.domain.security;

import com.fasterxml.jackson.annotation.JsonIgnore;
import java.io.Serializable;
import javax.validation.constraints.NotNull;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import org.springframework.security.core.GrantedAuthority;
import org.wannagoframework.dto.domain.BaseEntityStrId;

/**
 * This class represent a Security SecurityConst (Used to access and navigate the application)
 *
 * @author WannaGo Dev1.
 * @version 1.0
 * @since 2019-03-09
 */
@Data
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
public class SecurityRole extends BaseEntityStrId implements GrantedAuthority, Serializable {

  /**
   * Name of the SecurityConst
   */
  @NotNull
  private String name;
  /**
   * Some description for this role
   */
  private String description;

  @NotNull
  private Boolean canLogin;

  public SecurityRole() {
  }

  public SecurityRole(String authority) {
    setName(authority);
  }

  @JsonIgnore
  public String getAuthority() {
    return name;
  }
}
