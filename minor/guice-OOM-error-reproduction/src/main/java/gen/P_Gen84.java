
  package gen;
  public class P_Gen84 {
  		@com.google.inject.Inject
  		public P_Gen84(P_Gen85 p_gen85){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + p_gen85 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  