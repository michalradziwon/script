
  package gen;
  public class P_Gen101 {
  		@com.google.inject.Inject
  		public P_Gen101(P_Gen102 p_gen102){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + p_gen102 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  