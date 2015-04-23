
  package gen;
  public class P_Gen102 {
  		@com.google.inject.Inject
  		public P_Gen102(P_Gen103 p_gen103){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + p_gen103 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  