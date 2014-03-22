/**
 * 
 *Copyright 2014 The Darks Logs Project (Liu lihua)
 *
 *Licensed under the Apache License, Version 2.0 (the "License");
 *you may not use this file except in compliance with the License.
 *You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 *Unless required by applicable law or agreed to in writing, software
 *distributed under the License is distributed on an "AS IS" BASIS,
 *WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *See the License for the specific language governing permissions and
 *limitations under the License.
 */

package darks.log.appender.impl;

import darks.log.LogMessage;
import darks.log.appender.Appender;

public class SqliteAppender extends Appender
{

	public SqliteAppender()
	{
	}

	@Override
	public void append(LogMessage msg, String log) throws Exception
	{
		// TODO Auto-generated method stub

	}

	@Override
	public boolean needPattern()
	{
		return true;
	}

}