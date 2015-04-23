
  package gen;
  public class P_Gen44 {
  		@com.google.inject.Inject
  		public P_Gen44(P_Gen45 p_gen45){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + p_gen45 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  