
  package gen;
  public class P_Gen62 {
  		@com.google.inject.Inject
  		public P_Gen62(P_Gen63 p_gen63){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + p_gen63 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  