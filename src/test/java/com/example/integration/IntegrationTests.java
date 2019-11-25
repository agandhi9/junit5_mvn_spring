package com.example.integration;

import com.example.base.BaseTests;
import io.qameta.allure.Epic;
import io.qameta.allure.Step;
import io.qameta.allure.Story;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;

@Epic("Epic: Context loads")
@Story("Story: Context loads")
@Tag("integration")
class IntegrationTests extends BaseTests {

	private static final Logger LOGGER = LogManager.getLogger(IntegrationTests.class);

	@Autowired
	IntegrationConfig integrationConfig;

	@Test
	@DisplayName("Context loads test")
	@Step("Step: Context loads test")
	@Tag("context")
	void contextLoads() {
		LOGGER.info("Context loaded");
		LOGGER.info(integrationConfig.getParamOne());
	}

	@Test
	@DisplayName("Context loads second test")
	@Step("Step: Context loads second test")
	void contextLoadsSecond() {
		LOGGER.info("Context loaded second");
		LOGGER.info(integrationConfig.getParamTwo());
	}

	@Test
	@DisplayName("Context loads third test")
	@Step("Step: Context loads third test")
	void contextLoadsThird() {
		LOGGER.info("Context loaded third");
		LOGGER.info(integrationConfig.getParamThree());

	}

}
