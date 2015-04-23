
  package gen;
  public class P_Gen159 {
  		@com.google.inject.Inject
  		public P_Gen159(P_Gen160 p_gen160){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + p_gen160 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  