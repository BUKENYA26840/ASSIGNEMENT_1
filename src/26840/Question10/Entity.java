package Question10;

import java.text.SimpleDateFormat;
import java.util.Date;

class Entity { protected int id; protected String createdDate; protected String updatedDate; public Entity(){ this.createdDate = now(); this.updatedDate = now(); } public Entity(int id){ this(); if (id>0) this.id = id; else this.id = 1;} protected String now(){ return new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date()); }}
