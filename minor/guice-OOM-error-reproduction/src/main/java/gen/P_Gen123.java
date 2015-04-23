
  package gen;
  public class P_Gen123 {
  		@com.google.inject.Inject
  		public P_Gen123(P_Gen124 p_gen124){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + p_gen124 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  