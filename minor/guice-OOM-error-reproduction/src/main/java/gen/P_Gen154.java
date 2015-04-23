
  package gen;
  public class P_Gen154 {
  		@com.google.inject.Inject
  		public P_Gen154(P_Gen155 p_gen155){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + p_gen155 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  