package hello.world.model;

import java.sql.Timestamp;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

import io.requery.Entity;
import io.requery.Generated;
import io.requery.Key;

@Entity
public abstract class AbstractPage {
	@Key
	@Generated
	Long postid;
	String memberid;
	Long rootid;
	Long parentid; //x
	Long typeid;
	String title;
	String content;
	String status;
	Timestamp sdate;
	Timestamp xdate;
	String suser;
	String xuser;
}
