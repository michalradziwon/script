
  package gen;
  public class P_Gen96 {
  		@com.google.inject.Inject
  		public P_Gen96(P_Gen97 p_gen97){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + p_gen97 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  