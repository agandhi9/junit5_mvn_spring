## Commands

    # mvn clean test
    # mvn clean test -Dtest="loginAsCorrectUser" -Dgroups="opensourcecms"
    
        # https://www.mkyong.com/junit5/junit-5-tagging-and-filtering-tag-examples/
            # Run tests which tagged with `integration, slow, feature-168`
            mvn -Dgroups="opensourcecms, fast, feature-168"
    
            # Exclude tests which tagged with 'slow'
            # mvn -DexcludedGroups="slow"
    
    # allure generate -c report\allure-results -o report\allure-report