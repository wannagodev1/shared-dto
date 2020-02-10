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

import java.util.Collections;
import java.util.List;
import java.util.function.Supplier;

/**
 * @author WannaGo Dev1.
 * @version 1.0
 * @since 2019-06-25
 */
public class AppContext {

  private static AppContext instance;

  private Supplier<String> currentUsernameProvider;
  private Supplier<String> currentSecurityUserIdProvider;
  private Supplier<String> currentSessionIdProvider;
  private Supplier<String> currentIso3LanguageProvider;
  private Supplier<StoredFile> currentAvatarProvider;
  private Supplier<LatLng> currentPositionProvider;
  private Supplier<List<Long>> currentUserActivitiesIds;

  private AppContext() {
  }

  public static AppContext getInstance() {
    if (instance == null) {
      instance = new AppContext();
    }

    return instance;
  }

  public void init(Supplier<String> currentUsernameProvider,
      Supplier<String> currentSecurityUserIdProvider, Supplier<String> currentSessionIdProvider,
      Supplier<String> currentIso3LanguageProvider, Supplier<LatLng> currentPositionProvider,
      Supplier<StoredFile> currentAvatarProvider,
      Supplier<List<Long>> currentUserActivitiesIds) {
    this.currentUsernameProvider = currentUsernameProvider;
    this.currentSecurityUserIdProvider = currentSecurityUserIdProvider;
    this.currentIso3LanguageProvider = currentIso3LanguageProvider;
    this.currentSessionIdProvider = currentSessionIdProvider;
    this.currentPositionProvider = currentPositionProvider;
    this.currentAvatarProvider = currentAvatarProvider;
    this.currentUserActivitiesIds = currentUserActivitiesIds;
  }

  public String getCurrentUsername() {
    return currentUsernameProvider == null ? null : currentUsernameProvider.get();
  }

  public String getCurrentSecurityUserId() {
    return currentSecurityUserIdProvider == null ? null : currentSecurityUserIdProvider.get();
  }

  public String getCurrentSessionId() {
    return currentSessionIdProvider == null ? null : currentSessionIdProvider.get();
  }

  public String getCurrentIso3Language() {
    return currentIso3LanguageProvider == null ? null : currentIso3LanguageProvider.get();
  }

  public LatLng getCurrentPosition() {
    return currentPositionProvider == null ? null : currentPositionProvider.get();
  }

  public StoredFile getCurrentAvatar() {
    return currentAvatarProvider == null ? null : currentAvatarProvider.get();
  }

  public List<Long> getCurrentUserActivitiesIds() {
    return currentUserActivitiesIds == null ? Collections.emptyList()
        : currentUserActivitiesIds.get();
  }
}
