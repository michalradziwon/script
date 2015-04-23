
  package gen;
  public class P_Gen198 {
  		@com.google.inject.Inject
  		public P_Gen198(P_Gen199 p_gen199){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + p_gen199 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  