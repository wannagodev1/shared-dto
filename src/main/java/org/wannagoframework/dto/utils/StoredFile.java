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

import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import org.wannagoframework.dto.domain.BaseEntityStrId;

/**
 * @author WannaGo Dev1.
 * @version 1.0
 * @since 2019-05-15
 */
@Data
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true, exclude = {"content", "orginalContent"})
public class StoredFile extends BaseEntityStrId implements Serializable {

  private String filename;
  private String mimeType;
  private Long filesize;

  private byte[] content;
  private byte[] orginalContent;

  private Float zoom;

  private Long relatedObjectId;
  private String relatedObjectClass;

  private Boolean hasChanged = Boolean.FALSE;
}