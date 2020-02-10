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


package org.springframework.security.core.userdetails;

import com.fasterxml.jackson.annotation.JsonIgnore;
import java.io.Serializable;
import java.util.Collection;
import org.springframework.security.core.GrantedAuthority;


public interface UserDetails extends Serializable {
  // ~ Methods
  // ========================================================================================================

  /**
   * Returns the authorities granted to the user. Cannot return <code>null</code>.
   *
   * @return the authorities, sorted by natural key (never <code>null</code>)
   */
  @JsonIgnore
  Collection<? extends GrantedAuthority> getAuthorities();

  /**
   * Returns the password used to authenticate the user.
   *
   * @return the password
   */
  String getPassword();

  /**
   * Returns the username used to authenticate the user. Cannot return <code>null</code>.
   *
   * @return the username (never <code>null</code>)
   */
  String getUsername();

  /**
   * Indicates whether the user's account has expired. An expired account cannot be authenticated.
   *
   * @return <code>true</code> if the user's account is valid (ie non-expired),
   * <code>false</code> if no longer valid (ie expired)
   */
  @JsonIgnore
  boolean isAccountNonExpired();

  /**
   * Indicates whether the user is locked or unlocked. A locked user cannot be authenticated.
   *
   * @return <code>true</code> if the user is not locked, <code>false</code> otherwise
   */
  @JsonIgnore
  boolean isAccountNonLocked();

  /**
   * Indicates whether the user's credentials (password) has expired. Expired credentials prevent
   * authentication.
   *
   * @return <code>true</code> if the user's credentials are valid (ie non-expired),
   * <code>false</code> if no longer valid (ie expired)
   */
  @JsonIgnore
  boolean isCredentialsNonExpired();

  /**
   * Indicates whether the user is enabled or disabled. A disabled user cannot be authenticated.
   *
   * @return <code>true</code> if the user is enabled, <code>false</code> otherwise
   */
  @JsonIgnore
  boolean isEnabled();
}
