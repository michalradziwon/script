
  package gen;
  public class P_Gen121 {
  		@com.google.inject.Inject
  		public P_Gen121(P_Gen122 p_gen122){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + p_gen122 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  