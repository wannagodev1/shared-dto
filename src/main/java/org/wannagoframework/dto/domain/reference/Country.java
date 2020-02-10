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
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import org.wannagoframework.dto.domain.BaseEntityLongId;

/**
 * Referential for countries, based on the ISO 3166 list
 *
 * @author WannaGo Dev1.
 * @version 1.0
 * @since 2019-03-06
 */
@Data
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
public class Country extends BaseEntityLongId implements Serializable {
  // From Translation
  private String name;

  /**
   * Alpha-2 code
   */
  private String iso2;

  /**
   * Alpha-3 code
   */
  private String iso3;

  /**
   * Dialing code prefix
   */
  private String dialingCode;

  /**
   * Is European Union
   */
  private Boolean isEU;

  @EqualsAndHashCode.Exclude
  @ToString.Exclude
  private Region region;

  @EqualsAndHashCode.Exclude
  @ToString.Exclude
  private SubRegion subRegion;

  @EqualsAndHashCode.Exclude
  @ToString.Exclude
  private IntermediateRegion intermediateRegion;

  @EqualsAndHashCode.Include
  @ToString.Include
  private String region() {
    return (region != null && region.getId() != null) ? region.getId().toString() : null;
  }

  @EqualsAndHashCode.Include
  @ToString.Include
  private String subRegion() {
    return (subRegion != null && subRegion.getId() != null) ? subRegion.getId().toString() : null;
  }

  @EqualsAndHashCode.Include
  @ToString.Include
  private String intermediateRegion() {
    return (intermediateRegion != null && intermediateRegion.getId() != null) ? intermediateRegion
        .getId().toString() : null;
  }
}
