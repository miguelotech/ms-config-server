package com.synopsis.config;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class MsConfigServerApplicationTests {

	@Test
	void applicationClassIsLoadable() {
		assertThat(new MsConfigServerApplication()).isNotNull();
	}
}
