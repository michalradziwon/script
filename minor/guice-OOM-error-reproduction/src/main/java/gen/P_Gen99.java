
  package gen;
  public class P_Gen99 {
  		@com.google.inject.Inject
  		public P_Gen99(P_Gen100 p_gen100){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + p_gen100 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  