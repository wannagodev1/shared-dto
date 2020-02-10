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


package org.wannagoframework.dto.serviceQuery;

import java.io.Serializable;
import lombok.Data;

/**
 * Represents the result of a remote Service call (using Feign)
 *
 * Contains success or failure status, failure message and result data
 *
 * @param <T> Data type of the result (mostly when success)
 */
@Data
public class ServiceResult<T> implements Serializable {

  private Boolean isSuccess;
  private String message;
  private T data;

  /**
   * Create a new Service Result As Success
   */
  public ServiceResult() {
    isSuccess = Boolean.TRUE;
  }

  /**
   * Create a new Service Result As Failed with an error message
   *
   * @param message Error message
   */
  public ServiceResult(String message) {
    this(Boolean.FALSE, message, null);
  }

  /**
   * Create a new Service Result As Success with some data
   *
   * @param data Service Result Data
   */
  public ServiceResult(T data) {
    this(Boolean.TRUE, null, data);
  }

  /**
   * Create a new Service Result As Failed with an exception
   *
   * @param throwable Service Result Exception
   */
  public ServiceResult(Throwable throwable) {
    setIsSuccess(false);
    setMessage(throwable.getMessage());
  }

  /**
   * Create a new Service Result
   *
   * @param isSuccess Service success or not
   * @param message Message to be sent (mostly when error)
   * @param data Data to be sent (mostly when success)
   */
  public ServiceResult(Boolean isSuccess, String message, T data) {
    setIsSuccess(isSuccess);
    setMessage(message);
    setData(data);
  }
}
