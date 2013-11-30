package com.grunick.addresstagger.input;

public class InputConstants {
	
	private InputConstants() {}
	
	public static class FileConfig {
		
		public static final String FILENAME = "filename";
		public static final String DELIMITER = "delimiter";
		
	}
	
	public static class InputSourceTypes {
		public static final String NO_OP_SOURCE = "noop";
		public static final String FILE_SOURCE = "file";
		
	}
	
	public static class TokenizerConfig {
		public static final String HEADER_FILE = "header_file";
		public static final String DELIMITER = "delimiter";
		public static final String NAME_COLUMN = "name_column";
		public static final String TAG_ORDER = "tag_order";
	}
	
	public static class TokenizerTypes {
		public static final String NO_OP_TOKENIZER = "noop";
		public static final String COLUMN_TOKENIZER = "tagged_column";
	}

	public static class StrategyTypes {
		public static final String NO_OP_STRATEGY= "noop";
		public static final String MAX_LIKELIHOOD_STRATEGY = "maximumLikelihood";
	}
}
