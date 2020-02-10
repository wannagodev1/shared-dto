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


package org.wannagoframework.dto.utils;

/**
 * @author WannaGo Dev1.
 * @version 1.0
 * @since 2019-06-25
 */
public class AppContextThread {

  private static final ThreadLocal<String> currentUsername = new ThreadLocal<>();
  private static final ThreadLocal<String> currentSecurityUserId = new ThreadLocal<>();
  private static final ThreadLocal<String> currentSessionId = new ThreadLocal<>();
  private static final ThreadLocal<String> currentIso3Language = new ThreadLocal<>();
  private static final ThreadLocal<LatLng> currentPosition = new ThreadLocal<>();

  public static String getCurrentUsername() {
    return currentUsername.get();
  }

  public static void setCurrentUsername(String _currentUsername) {
    currentUsername.set(_currentUsername);
  }

  public static String getCurrentSecurityUserId() {
    return currentSecurityUserId.get();
  }

  public static void setCurrentSecurityUserId(String _currentSecurityUserId) {
    currentSecurityUserId.set(_currentSecurityUserId);
  }

  public static String getCurrentSessionId() {
    return currentSessionId.get();
  }

  public static void setCurrentSessionId(String _currentSessionId) {
    currentSessionId.set(_currentSessionId);
  }

  public static String getCurrentIso3Language() {
    return currentIso3Language.get();
  }

  public static void setCurrentIso3Language(String _currentIso3Language) {
    currentIso3Language.set(_currentIso3Language);
  }

  public static LatLng getCurrentPosition() {
    return currentPosition.get();
  }

  public static void setCurrentPosition(LatLng _currentPosition) {
    currentPosition.set(_currentPosition);
  }
}
