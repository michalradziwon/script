
  package gen;
  public class P_Gen14 {
  		@com.google.inject.Inject
  		public P_Gen14(P_Gen15 p_gen15){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + p_gen15 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  