package com.rafsan.inventory.api;

import org.apache.commons.codec.digest.DigestUtils;

/**
 * Provides convenience utility methods
 *
 * @author Chalreson
 */
public class InventoryUtils {

	/**
	 * Hashes a plain text password string to a hashed-hex string following the SHA1 patterns
	 *
	 * @param rawPassword - the plain password
	 * @return hex string value equivalent to the password
	 */
	public static String hashPassword(String rawPassword) {
		return DigestUtils.sha1Hex((rawPassword.trim()));
	}

	public static String reversePasswordHash() {
		// TODO: Add implementation!!!!
		return null;
	}
}
