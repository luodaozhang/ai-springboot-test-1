# ai-springboot-test-1

English | [简体中文](README.zh-CN.md)

Minimal Spring Boot Web application for AI testing.

## Requirements

- Java 8+
- Maven 3.9+

## Run

```bash
mvn spring-boot:run
```

## Endpoints

- `GET /` -> `ai-springboot-test-1 is running`
- `GET /health` -> `ok`
- `GET /request-id` -> `{ "requestId": "<uuid>" }`

## Notes

- Default port: `8080`
- This repository includes `agents.md` for AI workflow testing.
