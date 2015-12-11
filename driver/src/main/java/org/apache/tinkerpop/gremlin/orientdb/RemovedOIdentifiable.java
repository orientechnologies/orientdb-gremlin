package org.apache.tinkerpop.gremlin.orientdb;

import org.apache.tinkerpop.gremlin.structure.Edge;
import org.apache.tinkerpop.gremlin.structure.Element;

import com.orientechnologies.orient.core.db.record.OIdentifiable;
import com.orientechnologies.orient.core.id.ORID;
import com.orientechnologies.orient.core.record.ORecord;
import com.orientechnologies.orient.core.storage.OStorage.LOCKING_STRATEGY;

public final class RemovedOIdentifiable implements OIdentifiable {

	private final ORID id;

	public RemovedOIdentifiable(ORID id) {
		this.id = id;
	}

	@Override
	public int compareTo(OIdentifiable o) {
		throw Element.Exceptions.elementAlreadyRemoved(Edge.class, id);
	}

	@Override
	public int compare(OIdentifiable o1, OIdentifiable o2) {
		throw Element.Exceptions.elementAlreadyRemoved(Edge.class, id);
	}

	@Override
	public ORID getIdentity() {
		throw Element.Exceptions.elementAlreadyRemoved(Edge.class, id);
	}

	@Override
	public <T extends ORecord> T getRecord() {
		throw Element.Exceptions.elementAlreadyRemoved(Edge.class, id);
	}

	@Override
	public void lock(boolean iExclusive) {
		throw Element.Exceptions.elementAlreadyRemoved(Edge.class, id);
	}

	@Override
	public boolean isLocked() {
		throw Element.Exceptions.elementAlreadyRemoved(Edge.class, id);
	}

	@Override
	public LOCKING_STRATEGY lockingStrategy() {
		throw Element.Exceptions.elementAlreadyRemoved(Edge.class, id);
	}

	@Override
	public void unlock() {
		throw Element.Exceptions.elementAlreadyRemoved(Edge.class, id);
	}

}
