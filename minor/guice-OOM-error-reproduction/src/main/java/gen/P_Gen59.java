
  package gen;
  public class P_Gen59 {
  		@com.google.inject.Inject
  		public P_Gen59(P_Gen60 p_gen60){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + p_gen60 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  