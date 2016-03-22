import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;

import scala.tools.nsc.interpreter.IMain;
import scala.tools.nsc.settings.MutableSettings.BooleanSetting;

public class Script {
	public static void exec() throws Exception{
		ScriptEngine engine = new ScriptEngineManager().getEngineByName("scala");
		// ((BooleanSetting)(((IMain)engine).settings().usejavacp())).value_$eq(true);
		// or
		// ((scala.tools.nsc.interpreter.IMain)engine).settings().processArgumentString("-usejavacp");
		engine.put("n: Int", 10);
		System.out.println("---");
		engine.eval("1 to n foreach print");
	}
}