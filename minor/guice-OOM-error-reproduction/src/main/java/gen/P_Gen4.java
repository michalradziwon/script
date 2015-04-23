
  package gen;
  public class P_Gen4 {
  		@com.google.inject.Inject
  		public P_Gen4(P_Gen5 p_gen5){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + p_gen5 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  