package org.apache.hadoop.hdfs;

import java.io.IOException;

/**
 * Created by pranav.agarwal on 05/12/16.
 */
public interface DFSClientGuardrails {
  String FDP_PLATFORM_PROPERTY_PREFIX = "fdp.plat.mr.";
  String DFS_GUARDRAIL_CLASS = FDP_PLATFORM_PROPERTY_PREFIX + "dfs.guradrails.class";
  String DFS_GUARDRAIL_CLASS_VALUE = "com.flipkart.fdp.dfs.DFSClientGuardRailsImpl";
  String BADGER_PROPERTY_PREFIX = "badger.";
  String BADGER_PROCESSID_CONF = BADGER_PROPERTY_PREFIX + "mapred.fact.processId";

  void canReadFromLocation(String location) throws IOException;
  void canReadFurther(String location, long alreadyRead) throws IOException;
  void canWriteFurther(String location, long alreadyWritten) throws IOException;
  void canWriteToLocation(String location) throws IOException;
  void canCallNamenodeFurther() throws IOException;
}