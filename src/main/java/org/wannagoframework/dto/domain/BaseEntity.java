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
import java.time.Instant;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @author WannaGo Dev1.
 * @version 1.0
 * @since 2019-03-06
 */
@Data
@EqualsAndHashCode(exclude = {"createdBy", "modifiedBy", "created", "modified"})
public abstract class BaseEntity implements Serializable {

  /**
   * DB Generated ID
   */
  private Object id;

  /**
   * Who create this record (no ID, use username)
   */
  private String createdBy;

  /**
   * When this record has been created
   */
  private Instant created;

  /**
   * How did the last modification of this record (no ID, use username)
   */
  private String modifiedBy;

  /**
   * When this record was last updated
   */
  private Instant modified;

  /**
   * Version of the record. Used for synchronization and concurrent access.
   */
  private Long version;

  /**
   * Indicate if the current record is active (deactivate instead of delete)
   */
  private Boolean isActive = Boolean.TRUE;

  private Boolean isNew = Boolean.FALSE;
}
