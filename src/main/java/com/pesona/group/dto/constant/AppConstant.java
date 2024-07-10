package com.pesona.group.dto.constant;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public abstract class AppConstant {
	public static final String COMPANY_NAME = "Pesona Informasi Teknologi";
	public static final String COMPANY_EMAIL = "pesonaintek@gmail.com";
	public static final String COMPANY_URL = "https://www.pesonateknologi.com";
	public static final String COMPANY_LICENSE = "https://www.apache.org/licenses/LICENSE-2.0";
	public static final String VERSION = "0.0.1";

	@NoArgsConstructor(access = AccessLevel.PRIVATE)
	public abstract static class DiscoveredCache {
		public static final Integer REDIS_TIMEOUT = 3600; // 60 minutes
	}
}









