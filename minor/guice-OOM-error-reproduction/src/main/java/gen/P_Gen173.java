
  package gen;
  public class P_Gen173 {
  		@com.google.inject.Inject
  		public P_Gen173(P_Gen174 p_gen174){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + p_gen174 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  