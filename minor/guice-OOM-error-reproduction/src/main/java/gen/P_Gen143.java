
  package gen;
  public class P_Gen143 {
  		@com.google.inject.Inject
  		public P_Gen143(P_Gen144 p_gen144){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + p_gen144 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  