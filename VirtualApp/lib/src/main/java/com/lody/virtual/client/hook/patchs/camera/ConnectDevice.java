package com.lody.virtual.client.hook.patchs.camera;

import java.lang.reflect.Method;

import com.lody.virtual.client.hook.base.Hook;
import com.lody.virtual.client.hook.utils.HookUtils;

import android.hardware.ICameraClient;
import android.hardware.camera2.utils.BinderHolder;

/**
 * @author Lody
 *
 * @see android.hardware.ICameraService#connect(ICameraClient, int, String, int,
 *      BinderHolder)
 *
 */

public class ConnectDevice extends Hook {

	@Override
	public String getName() {
		return "connectDevice";
	}

	@Override
	public boolean beforeHook(Object who, Method method, Object... args) {
		HookUtils.replaceAppPkg(args);
		return super.beforeHook(who, method, args);
	}
}
