/**
 * SwingSpy examines Swing layouts.<br>
 * Installation is simple, just add the following lines in your startup code:
 * <pre>
 * try {
 * Class.forName("jodd.swingspy.SwingSpy").getMethod("install").invoke(null);
 * } catch (Exception e) {
 * System.err.println("SwingSpy is not installed... " + e.toString());
 * }
 * </pre>
 * <br>
 * When SwingSpy is installed, you can invoke it by <b>SHIFT</b> + <b>CTRL</b> + <b>click</b> hot-key combination.
 */
package jodd.swing.spy;