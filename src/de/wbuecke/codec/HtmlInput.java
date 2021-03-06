/*
 * Copyright (C) 2014 Wolfgang Buecke
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
 
package de.wbuecke.codec;

import org.apache.commons.lang3.StringEscapeUtils;

class HtmlInput implements Input {
	
	@Override public String getLabel() {
		return "HTML escaped";
	}

	@Override public String decode(String input) {
		return StringEscapeUtils.unescapeHtml4(input);
	}

	@Override public String encode(String plaintext) {
		return StringEscapeUtils.escapeHtml4(plaintext);
	}

}
