
  package gen;
  public class P_Gen52 {
  		@com.google.inject.Inject
  		public P_Gen52(P_Gen53 p_gen53){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + p_gen53 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  