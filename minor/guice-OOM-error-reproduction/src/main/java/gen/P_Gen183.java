
  package gen;
  public class P_Gen183 {
  		@com.google.inject.Inject
  		public P_Gen183(P_Gen184 p_gen184){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + p_gen184 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  