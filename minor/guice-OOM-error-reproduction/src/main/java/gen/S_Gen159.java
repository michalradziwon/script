
  package gen;
  public class S_Gen159 {
  		@com.google.inject.Inject
  		public S_Gen159(S_Gen160 s_gen160){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + s_gen160 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  