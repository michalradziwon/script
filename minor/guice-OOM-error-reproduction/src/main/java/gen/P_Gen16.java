
  package gen;
  public class P_Gen16 {
  		@com.google.inject.Inject
  		public P_Gen16(P_Gen17 p_gen17){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + p_gen17 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  