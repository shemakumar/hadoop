package org.apache.hadoop.mapreduce;

import org.apache.hadoop.conf.Configuration;

/**
 * Created by pranav.agarwal on 02/12/16.
 */
public interface AdjustJobConfiguration {
  String ADJUST_JOBCONFIG_CLASS_VALUE = "com.flipkart.fdp.AdjustJobConfigurationImpl";
  String BADGER_PROPERTY_PREFIX = "badger.";
  String BADGER_PROCESSID_CONF = BADGER_PROPERTY_PREFIX + "mapred.fact.processId";
  String BADGER_EXECUTIONID_CONF = BADGER_PROPERTY_PREFIX + "mapred.fact.executionId";
  void adjustJobConfiguration(Configuration jobConf);
}
