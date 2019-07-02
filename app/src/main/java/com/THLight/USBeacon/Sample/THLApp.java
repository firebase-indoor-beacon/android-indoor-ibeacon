/** ============================================================== */
package com.THLight.USBeacon.Sample;
/** ============================================================== */
import android.app.Application;

/** ============================================================== */
public class THLApp extends Application
{
	public static THLApp App		= null;
	public static THLConfig Config	= null;
	
	/** ================================================ */
	public static THLApp getApp()
	{
		return App;
	}
	
	/** ================================================ */
	@Override
	public void onCreate()
	{
		super.onCreate();
		
		App		= this;
		Config	= new THLConfig(this);
		
		Config.loadSettings();
	}

	/** ================================================ */
	@Override
	public void onTerminate()
	{
		Config.saveSettings();
		
		super.onTerminate();
	}
}

/** ============================================================== */

