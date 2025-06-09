# Risk Analyser

## Project Overview
Risk Analyser is a backend service that helps users track their stock portfolios and calculate associated risk metrics ( like exponential moving averages, volatility, etc. )
in easy user friendly language using AI-powered insights.

## Features
- User authentication via email and password.
- Manage multiple stocks per user aka portfolio entity.
- Each portfolio stores stocks with details : ticker, quantity, buy price, and timestamps.
- Fetches historical OHLCV (Open, High, Low, Close, Volume) data for stocks from a broker API, we'll integrate via Upstox or ICICI Direct.
- Calculates technical indicators such as EMA (20, 50, 100) to analyze stock trends.
- Computes risk metrics like volatility and volume variation. 
- Feeds computed metrics into an AI model that summarizes portfolio risk in an easy-to-understand format for the user.

## Tech Stack
- Backend : Spring Boot (Java)
- Data Source : Broker API for OHLCV data 
- AI Integration : Summarisation API (to be implemented)

## Current Progress
- User and Portfolio entities with one-to-many relationship implemented.
- Basic backend structure set up with Spring Boot.

## Future Work
- Integrate broker API for live data fetching.
- Implement risk metric calculations.
- Connect AI summarization API.
- Build frontend/UI to visualize portfolio risks.

Feel free to contribute or raise issues!
