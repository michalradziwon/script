
  package gen;
  public class P_Gen49 {
  		@com.google.inject.Inject
  		public P_Gen49(P_Gen50 p_gen50){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + p_gen50 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  