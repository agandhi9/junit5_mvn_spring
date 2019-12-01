package com.example.integration;

import com.example.base.BaseTests;
import com.example.config.IntegrationConfig;
import io.qameta.allure.Epic;
import io.qameta.allure.Step;
import io.qameta.allure.Story;
import org.junit.jupiter.api.*;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;

@Epic("Epic: Context loads")
@Story("Story: Context loads")
@Tag("integration")
//@Import(IntegrationConfig.class)
class IntegrationTests extends BaseTests {

	private static final Logger LOGGER = LogManager.getLogger(IntegrationTests.class);

	@BeforeEach
	void beforeEach(TestInfo info, TestReporter reporter) {
		LOGGER.info("before each test method - in a class ................ ");
		reporter.publishEntry(" [ " + info.getTags() + " ] " + info.getDisplayName());
	}

	@AfterEach
	void afterEach() {
		LOGGER.info("after each test method - in a class ................ ");
	}

	@Test
	@DisplayName("Context loads test")
	@Step("Step: Context loads test")
	@Tag("context")
	void contextLoads() {
		LOGGER.info("Context loaded");
		LOGGER.info(integrationConfig.getParamone());

	}

	@Test
	@DisplayName("Context loads second test")
	@Step("Step: Context loads second test")
	void contextLoadsSecond() {
		LOGGER.info("Context loaded second");
		LOGGER.info(integrationConfig.getParamtwo());
	}

	@Test
	@DisplayName("Context loads third test")
	@Step("Step: Context loads third test")
	void contextLoadsThird() {
		LOGGER.info("Context loaded third");
		LOGGER.info(integrationConfig.getParamthree());

	}

}
