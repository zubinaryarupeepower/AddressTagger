package com.grunick.addresstagger.data;

public class Constants {
	
	private Constants() {}
	
	public static final double ALMOST_ZERO = 0.00000001d;
	
	
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
		public static final String MOST_LIKELY_TAG_STRATEGY = "mostFrequent";
		public static final String HMM_BIGRAM_STRATEGY = "bigram";
		public static final String HMM_TRIGRAM_STRATEGY = "trigram";
		public static final String KN_INTERPOLATED_STRATEGY = "kninterp";
		public static final String MEMM_STRATEGY = "MEMM";
		public static final String TBL_STRATEGY = "TBL";
		public static final String CRF_STRATEGY = "CRF";
	}
	
	public static class StrategyConfig {
		public static final String PERSIST_FILE = "persist_file";
		public static final String ENTROPY_FILE = "entropy_file";
		public static final String CUTOFF = "cutoff";
		public static final String ITERATIONS = "iterations";
		public static final String CORPUS_FILE = "corpus_file";
		public static final String LEX_FILE = "lex_file";
		public static final String RULE_FILE = "rule_file";
		public static final String TEMPLATE_FILE = "template_file";
		public static final String GUESSER_FILE = "guesser_file";	

	}
	
	public static class UnknownWordTypes {
		public static final String FIXED_VALUE_STRATEGY = "fixed";
		public static final String MAXENT_STRATEGY = "maxent";
		public static final String SINGLETON_DIST_STRATEGY = "singleDist";
		public static final String FEATURE_STRATEGY = "feature";
	}
	
	public static class UnknownWordConfig {
		public static final String PERSIST_FILE = "persist_file";
		public static final String ENTROPY_FILE = "entropy_file";
		public static final String VALUE = "value";
	}
}
