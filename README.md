# What, how, why

Larger data warehouses means its harder to get an oversight of what is done when and how, let alone how it may affect any downstream dependencies.

A system to track changes and events, as well as notify downstream consumers about changes is neccessary. This is done by:

- Representing the data warehouse, its assets, and their dependencies as one hierarchial graph.
- Event logs generated from one or many assets and their dependencies; understand what upstream changes may affect downsream.
- Automatically generate statuses of data assets and Automatically notify downstream about status changes.

# Getting started

```bash
$ ./gradlew bootRun
```
