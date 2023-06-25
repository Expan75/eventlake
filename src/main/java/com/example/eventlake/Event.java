package com.example.eventlake;
import java.util.*;


@Node("Event")
public class EventEntity {
	
    @Id
	private final String name;
	
    @Property("description")
	private final String description;

    @Property("severityLevel")
    private final String severityLevel;  

    @Relationship(type = "AFFECTS", direction = OUTGOING)
	private Set<AssetEntity> assets = new HashSet<>();

    public EventEntity(String title, String description) {
		this.name = title;
		this.description = description;
	}
}