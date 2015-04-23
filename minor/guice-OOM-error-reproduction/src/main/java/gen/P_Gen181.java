
  package gen;
  public class P_Gen181 {
  		@com.google.inject.Inject
  		public P_Gen181(P_Gen182 p_gen182){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + p_gen182 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  