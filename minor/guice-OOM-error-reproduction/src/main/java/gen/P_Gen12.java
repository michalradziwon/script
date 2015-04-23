
  package gen;
  public class P_Gen12 {
  		@com.google.inject.Inject
  		public P_Gen12(P_Gen13 p_gen13){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + p_gen13 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  