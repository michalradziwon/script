
  package gen;
  public class P_Gen197 {
  		@com.google.inject.Inject
  		public P_Gen197(P_Gen198 p_gen198){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + p_gen198 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  