/*
 *
 *  DO YOU WANNA PLAY CONFIDENTIAL
 *   __________________
 *
 *   [2018] - [2019] Do You Wanna Play
 *   All Rights Reserved.
 *
 *   NOTICE:  All information contained herein is, and remains the property of "Do You Wanna Play"
 *   and its suppliers, if any. The intellectual and technical concepts contained herein are
 *   proprietary to "Do You Wanna Play" and its suppliers and may be covered by Morocco. and Foreign
 *   Patents, patents in process, and are protected by trade secret or copyright law.
 *   Dissemination of this information or reproduction of this material is strictly forbidden unless
 *    prior written permission is obtained from "Do You Wanna Play".
 */

package org.wannagoframework.dto.domain.user;

import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import org.wannagoframework.dto.domain.BaseEntityLongId;
import org.wannagoframework.dto.utils.StoredFile;

/**
 * This class represent a User.
 *
 * A User can be : - System user (internal) - Admin user (to administer the platform) - Player or
 * Fan - Owner of a Place
 *
 * @author WannaGo Dev1.
 * @version 1.0
 * @since 2019-03-06
 */
@Data
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
public class BaseUser extends BaseEntityLongId implements Serializable {

  private String securityUserId;

  private String email;

  private String firstName;

  private String lastName;

  private String fullName;

  private String nickName;

  private StoredFile avatar = null;

  private String avatarId = null;
}
