
  package gen;
  public class P_Gen66 {
  		@com.google.inject.Inject
  		public P_Gen66(P_Gen67 p_gen67){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + p_gen67 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  