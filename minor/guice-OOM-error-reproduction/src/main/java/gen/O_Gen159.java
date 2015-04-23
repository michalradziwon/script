
  package gen;
  public class O_Gen159 {
  		@com.google.inject.Inject
  		public O_Gen159(O_Gen160 o_gen160){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + o_gen160 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  