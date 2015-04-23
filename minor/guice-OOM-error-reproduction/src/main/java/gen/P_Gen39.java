
  package gen;
  public class P_Gen39 {
  		@com.google.inject.Inject
  		public P_Gen39(P_Gen40 p_gen40){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + p_gen40 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  