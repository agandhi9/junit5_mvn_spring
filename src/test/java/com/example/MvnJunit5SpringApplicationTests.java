package com.example;

import com.example.base.BaseTests;
import io.qameta.allure.Epic;
import io.qameta.allure.Step;
import io.qameta.allure.Story;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;


@Epic("Epic: Context loads")
@Story("Story: Context loads")
@Tag("context")
class MvnJunit5SpringApplicationTests extends BaseTests {

	static final Logger LOGGER = LoggerFactory.getLogger(MvnJunit5SpringApplicationTests.class);

	@Test
	@DisplayName("Context loads test")
	@Step("Step: Context loads test")
	void contextLoads() {
		LOGGER.info("Context loaded");
	}

	@Test
	@DisplayName("Context loads second test")
	@Step("Step: Context loads second test")
	void contextLoadsSecond() {
		LOGGER.info("Context loaded second");
	}

}
