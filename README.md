add @EnableCache in main class
add @Cacheble(value = "anyname") annotation which data (method) you want to add cache
while save add @Cacheevict(value = ""), other wise same data will repeat .
