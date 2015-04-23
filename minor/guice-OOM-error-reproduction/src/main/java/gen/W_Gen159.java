
  package gen;
  public class W_Gen159 {
  		@com.google.inject.Inject
  		public W_Gen159(W_Gen160 w_gen160){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + w_gen160 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  