package com.example.eventlake;
import java.util.*;


@Node("Asset")
public class AssetEntity {
	
    @Id
	private final String name;
	
    @Property("description")
	private final String description;
	
    @Relationship(type = "DEPENDS_ON", direction = OUTGOING)
	private Set<AssetEntity> actors = new HashSet<>();
	
    public AssetEntity(String title, String description) {
		this.name = title;
		this.description = description;
	}
}