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
import java.util.Collections;
import java.util.List;
import lombok.Data;

@Data
public class Page<T extends Serializable> implements Serializable {

  private List<T> content = Collections.emptyList();
  private Integer totalPages = 0;
  private Long totalElements;
  private Integer size = 0;
  private Integer number = 0;
  private Integer numberOfElements = 0;
  private Boolean first;
  private Boolean last;
  private Pageable pageable;
  private Long dummy;
}