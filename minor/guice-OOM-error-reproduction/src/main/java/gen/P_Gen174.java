
  package gen;
  public class P_Gen174 {
  		@com.google.inject.Inject
  		public P_Gen174(P_Gen175 p_gen175){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + p_gen175 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  