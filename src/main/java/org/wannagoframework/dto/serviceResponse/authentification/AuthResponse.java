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


package org.wannagoframework.dto.serviceResponse.authentification;

import java.io.Serializable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AuthResponse implements Serializable {

  private String accessToken;
  private String tokenType = "Bearer";
  private AuthStatusEnum status;

  public AuthResponse(String accessToken) {
    this(AuthStatusEnum.SUCCESS, accessToken);
  }

  public AuthResponse(AuthStatusEnum status) {
    this(status, null);
  }

  public AuthResponse(AuthStatusEnum status, String accessToken) {
    this.status = status;
    this.accessToken = accessToken;
  }
}
