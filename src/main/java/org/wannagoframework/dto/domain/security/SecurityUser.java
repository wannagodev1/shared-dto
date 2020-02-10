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
import java.time.Instant;
import java.util.Collection;
import java.util.HashSet;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import javax.validation.constraints.NotNull;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.oauth2.core.user.OAuth2User;
import org.wannagoframework.dto.domain.BaseEntityStrId;

/**
 * This class represents a Security User used to login and access the application.
 *
 * @author WannaGo Dev1.
 * @version 1.0
 * @since 2019-03-09
 */
@Data
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
public class SecurityUser extends BaseEntityStrId implements OAuth2User, UserDetails, Serializable {

  /**
   * Username
   */
  @NotNull
  private String username;

  private String email;

  private String mobileNumber;

  private String lastName;

  private String firstName;

  private String nickName;

  private String imageUrl;

  /**
   * Password for login using internal authentication
   */
  //@NotNull
  //@Pattern(regexp = "^(|(?=.*\\d)(?=.*[a-z])(?=.*[A-Z]).{6,})$", message = "need 6 or more chars, mixing digits, lowercase and uppercase letters")
  private String password;

  /**
   * Number of consecutive failed login attempt
   */
  private Integer failedLoginAttempts = 0;

  /**
   * Password last modification date
   */
  private Instant passwordLastModification;

  /**
   * Last successful login date
   */
  private Instant lastSuccessfulLogin;

  /**
   * Does this account has expired ?
   */
  private Boolean isAccountExpired;

  /**
   * Is this account locked ?
   */
  private Boolean isAccountLocked;

  /**
   * Is the password expired ?
   */
  private Boolean isCredentialsExpired;

  private Map<String, Object> attributes;

  /**
   * Define the kind of user : Internal, System, External
   */
  @NotNull
  private SecurityUserTypeEnum userType;

  private Locale defaultLocale;

  private Boolean isActivated;

  private VerificationToken verificationToken = new VerificationToken();

  private PasswordResetToken passwordResetToken = new PasswordResetToken();

  private RememberMeToken rememberMeToken = new RememberMeToken();

  @NotNull
  private AuthProviderEnum provider = AuthProviderEnum.LOCAL;

  private String providerId;

  /**
   * Security roles for this user
   */
  private Set<SecurityRole> roles = new HashSet<>();

  @Override
  @JsonIgnore
  public Collection<? extends GrantedAuthority> getAuthorities() {
    return roles;
  }

  @Override
  public String getPassword() {
    return password;
  }

  @Override
  public String getUsername() {
    return username;
  }

  @Override
  @JsonIgnore
  public boolean isAccountNonExpired() {
    return !getIsAccountExpired();
  }

  @Override
  @JsonIgnore
  public boolean isAccountNonLocked() {
    return !getIsAccountLocked();
  }

  @Override
  @JsonIgnore
  public boolean isCredentialsNonExpired() {
    return !getIsAccountExpired();
  }

  @Override
  @JsonIgnore
  public boolean isEnabled() {
    return getIsActive();
  }

  @Override
  @JsonIgnore
  public String getName() {
    return getUsername();
  }
}
