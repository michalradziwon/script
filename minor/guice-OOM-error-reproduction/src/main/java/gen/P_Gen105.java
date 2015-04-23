
  package gen;
  public class P_Gen105 {
  		@com.google.inject.Inject
  		public P_Gen105(P_Gen106 p_gen106){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + p_gen106 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  