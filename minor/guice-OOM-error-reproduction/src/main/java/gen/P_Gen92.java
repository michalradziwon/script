
  package gen;
  public class P_Gen92 {
  		@com.google.inject.Inject
  		public P_Gen92(P_Gen93 p_gen93){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + p_gen93 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  