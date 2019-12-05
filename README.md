## Commands

    # mvn clean install
    # mvn clean -Dtest="loginAsCorrectUser" -Dgroups="opensourcecms" test
    # mvn clean -Dtest=com.example.integration.IntegrationIT#contextLoads test
    # mvn clean -Dtest=IntegrationTests test
    # mvn clean -Popensourcecms test
    # mvn clean -Pintegration verify
    
        # https://www.mkyong.com/junit5/junit-5-tagging-and-filtering-tag-examples/
            # Run tests which tagged with `integration, slow, feature-168`
            mvn -Dgroups="opensourcecms, fast, feature-168"
    
            # Exclude tests which tagged with 'slow'
            # mvn -DexcludedGroups="slow"
    
        mvn -am -pl modul clean -PPROFIL verify
    	mvn -am -pl modul clean -PPROFIL -Dtest="SCIEZKA.DO.KLASY.<KLASA>#<NAZWAMETODY>" verify
    	
    # allure generate -c target\allure-results -o target\allure-report