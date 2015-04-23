
  package gen;
  public class P_Gen63 {
  		@com.google.inject.Inject
  		public P_Gen63(P_Gen64 p_gen64){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + p_gen64 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  