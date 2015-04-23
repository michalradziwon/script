
  package gen;
  public class P_Gen124 {
  		@com.google.inject.Inject
  		public P_Gen124(P_Gen125 p_gen125){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + p_gen125 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  