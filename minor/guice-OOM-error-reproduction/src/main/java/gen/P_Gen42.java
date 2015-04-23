
  package gen;
  public class P_Gen42 {
  		@com.google.inject.Inject
  		public P_Gen42(P_Gen43 p_gen43){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + p_gen43 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  