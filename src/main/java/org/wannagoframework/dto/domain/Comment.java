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


package org.wannagoframework.dto.domain;

import java.io.Serializable;
import java.util.List;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import org.wannagoframework.dto.utils.StoredFile;

/**
 * A comment can be attached to anything
 *
 * @author WannaGo Dev1.
 * @version 1.0
 * @since 2019-03-07
 */
@Data
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
public class Comment extends BaseEntityLongId implements Serializable {

  /**
   * Text of the Comment
   */
  private String content;

  /**
   * List of attachments attached to the comment
   */
  private List<StoredFile> attachments;

  /**
   * In case of a reply, this is the parent comment
   */
  private Comment parent;

  /**
   * Object attached ID
   */
  private Long relatedObjectId;

  /**
   * Object attached Class
   */
  private String relatedObjectClass;
}
