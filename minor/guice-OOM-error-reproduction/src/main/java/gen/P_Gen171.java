
  package gen;
  public class P_Gen171 {
  		@com.google.inject.Inject
  		public P_Gen171(P_Gen172 p_gen172){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + p_gen172 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  