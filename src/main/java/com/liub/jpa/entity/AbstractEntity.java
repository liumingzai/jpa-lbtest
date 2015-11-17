/*
 * Copyright 2013 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.liub.jpa.entity;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import java.sql.Timestamp;

@MappedSuperclass
@EntityListeners(value = { AuditingEntityListener.class })
public abstract class AbstractEntity
{

	@Id @GeneratedValue Long id;

	@CreatedDate
	//@Type(type = "org.jadira.usertype.dateandtime.threetenbp.PersistentZonedDateTime")//
	Timestamp created_date;

	@LastModifiedDate
	//@Type(type = "org.jadira.usertype.dateandtime.threetenbp.PersistentZonedDateTime")//
    Timestamp modified_date;
}
