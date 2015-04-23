
  package gen;
  public class J_Gen77 {
  		@com.google.inject.Inject
  		public J_Gen77(J_Gen78 j_gen78){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + j_gen78 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  