
  package gen;
  public class P_Gen8 {
  		@com.google.inject.Inject
  		public P_Gen8(P_Gen9 p_gen9){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + p_gen9 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  