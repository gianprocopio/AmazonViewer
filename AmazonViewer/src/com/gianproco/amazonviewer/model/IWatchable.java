package com.gianproco.amazonviewer.model;

import java.util.Date;

public interface IWatchable {
	Date startWatching(Date dateStart);
	void stopWatching(Date dateStart, Date dateStop);
}
