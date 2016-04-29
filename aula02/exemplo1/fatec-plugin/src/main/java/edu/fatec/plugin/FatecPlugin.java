package edu.fatec.plugin;

import org.apache.maven.plugin.AbstractMojo;
import org.apache.maven.plugin.MojoExecutionException;
import org.apache.maven.plugin.MojoFailureException;


/**

*	
* @goal levi		
*
*
*/
public class FatecPlugin extends AbstractMojo{

	public void execute() throws MojoExecutionException, MojoFailureException {
		getLog().info("Hello, world!!");
	} 


}