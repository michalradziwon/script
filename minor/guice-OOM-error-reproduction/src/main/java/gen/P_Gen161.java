
  package gen;
  public class P_Gen161 {
  		@com.google.inject.Inject
  		public P_Gen161(P_Gen162 p_gen162){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + p_gen162 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  