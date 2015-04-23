
  package gen;
  public class P_Gen70 {
  		@com.google.inject.Inject
  		public P_Gen70(P_Gen71 p_gen71){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + p_gen71 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  