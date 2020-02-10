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

package org.wannagoframework.dto.domain.notification;

import java.util.Map;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import org.wannagoframework.dto.domain.BaseEntityStrId;

/**
 * @author WannaGo Dev1.
 * @version 1.0
 * @since 2019-07-09
 */
@Data
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
public class Mail extends BaseEntityStrId {
  private String to;

  private String copyTo;

  private String from;

  private String subject;

  private String body;

  private Map<String, byte[]> attachements;

  private Map<String, String> attributes;

  private MailStatusEnum mailStatus;

  private MailActionEnum mailAction;

  private String errorMessage;

  private Integer nbRetry = 0;

  private String applicationName;

  private String iso3Language;
}
