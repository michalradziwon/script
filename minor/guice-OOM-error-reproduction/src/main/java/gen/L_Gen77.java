
  package gen;
  public class L_Gen77 {
  		@com.google.inject.Inject
  		public L_Gen77(L_Gen78 l_gen78){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + l_gen78 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  