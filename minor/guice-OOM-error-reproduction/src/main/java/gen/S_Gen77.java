
  package gen;
  public class S_Gen77 {
  		@com.google.inject.Inject
  		public S_Gen77(S_Gen78 s_gen78){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + s_gen78 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  