
  package gen;
  public class P_Gen188 {
  		@com.google.inject.Inject
  		public P_Gen188(P_Gen189 p_gen189){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + p_gen189 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  