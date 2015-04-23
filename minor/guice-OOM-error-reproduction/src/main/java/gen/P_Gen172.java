
  package gen;
  public class P_Gen172 {
  		@com.google.inject.Inject
  		public P_Gen172(P_Gen173 p_gen173){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + p_gen173 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  