#### Topic Covered
- @Primary annotation to make one of implementation default if any interface has multiple implementations.
- Adding two profiles (To configure application differently for different environments) 
- Use of @PropertySource and @Value
- Creating profile specific properties files.
- Controlling properties via environment variables and command line arguments.
  a. Project -> Run as -> Run Configuration -> Arguments
  -> --server.port=9876	--spring.profiles.active=cat --company.name=CDAC
  b. Project -> Run as -> Run Configuration -> Environment
  -> COMPANY_NAME	CDAC
- Priority
  1. Arguments 2. Environment 3. Active Profile 4. application.properties
- Use of .yml file instead of .properties  