# Springboot + Filebeat + ELK

The goal is centralize all logs from springboot apps in elk solution.

This is a demo project and need custom configuration for production mode.

## Setup
1. Clone the project
2. Run docker compose up
3. Go to Kibana dashboard
4. Create a data view (management -> data views) with index pattern logs-*
5. Done!

## How it works (simple way)
Filebeat is "watching" containers with labels collect_logs_with_filebeat and decode_log_event_to_json_object.
This containers labels are configured in docker compose file.
With this all logs with that labels are centralized in ELK.
