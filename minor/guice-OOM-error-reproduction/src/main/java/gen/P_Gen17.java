
  package gen;
  public class P_Gen17 {
  		@com.google.inject.Inject
  		public P_Gen17(P_Gen18 p_gen18){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + p_gen18 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  