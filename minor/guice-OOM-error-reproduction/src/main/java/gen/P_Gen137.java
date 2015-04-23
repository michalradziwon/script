
  package gen;
  public class P_Gen137 {
  		@com.google.inject.Inject
  		public P_Gen137(P_Gen138 p_gen138){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + p_gen138 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  