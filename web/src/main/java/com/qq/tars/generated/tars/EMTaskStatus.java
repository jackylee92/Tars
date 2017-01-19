// **********************************************************************
// This file was generated by a TARS parser!
// TARS version 1.0.1.
// **********************************************************************

package com.qq.tars.generated.tars;

/**
 * 任务的状态
 */
public enum EMTaskStatus {

	EM_T_NOT_START(0),
	EM_T_RUNNING(1),
	EM_T_SUCCESS(2),
	EM_T_FAILED(3),
	EM_T_CANCEL(4),
	EM_T_PARIAL(5);

	private final int value;

	private EMTaskStatus(int value) {
		this.value = value;
	}

	public int value() {
		return this.value;
	}

	@Override
	public String toString() {
		return this.name() + ":" + this.value;
	}

	public static EMTaskStatus convert(int value) {
		for(EMTaskStatus v : values()) {
			if(v.value() == value) {
				return v;
			}
		}
		return null;
	}
}