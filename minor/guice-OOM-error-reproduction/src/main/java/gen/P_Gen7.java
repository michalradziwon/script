
  package gen;
  public class P_Gen7 {
  		@com.google.inject.Inject
  		public P_Gen7(P_Gen8 p_gen8){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + p_gen8 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  