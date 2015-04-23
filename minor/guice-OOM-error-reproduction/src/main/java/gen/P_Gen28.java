
  package gen;
  public class P_Gen28 {
  		@com.google.inject.Inject
  		public P_Gen28(P_Gen29 p_gen29){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + p_gen29 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  