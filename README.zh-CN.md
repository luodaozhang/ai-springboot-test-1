# ai-springboot-test-1

[English](README.md) | 简体中文

用于 AI 测试的最小化 Spring Boot Web 应用。

## 环境要求

- Java 8+
- Maven 3.9+

## 运行

```bash
mvn spring-boot:run
```

应用默认监听 `8080` 端口。启动后可以通过 `http://localhost:8080/` 访问服务。

## 接口

| 方法 | 路径 | 返回示例 | 说明 |
| --- | --- | --- | --- |
| `GET` | `/` | `ai-springboot-test-1 is running` | 服务首页，用于快速确认应用已启动。 |
| `GET` | `/health` | `ok` | 健康检查接口。 |
| `GET` | `/request-id` | `{ "requestId": "<uuid>" }` | 返回本次请求生成的唯一请求 ID。 |

## 说明

- 默认端口：`8080`
- 本仓库包含 `agents.md`，用于 AI 工作流测试。
