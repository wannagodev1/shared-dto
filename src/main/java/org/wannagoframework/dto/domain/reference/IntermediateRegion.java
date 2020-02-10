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


package org.wannagoframework.dto.domain.reference;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import org.wannagoframework.dto.domain.BaseEntityLongId;

/**
 * @author WannaGo Dev1.
 * @version 1.0
 * @since 2019-03-27
 */
@Data
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
public class IntermediateRegion extends
    BaseEntityLongId implements Serializable {

  // From Translation
  private String name;

  @EqualsAndHashCode.Exclude
  @ToString.Exclude
  private SubRegion subRegion;

  @EqualsAndHashCode.Exclude
  @ToString.Exclude
  private Set<Region> regions = new HashSet<>();

  @EqualsAndHashCode.Exclude
  @ToString.Exclude
  private Set<Country> countries = new HashSet<>();

  @EqualsAndHashCode.Include
  @ToString.Include
  private String subRegion() {
    return (subRegion != null && subRegion.getId() != null) ? subRegion.getId().toString() : null;
  }
}
