
  package gen;
  public class P_Gen175 {
  		@com.google.inject.Inject
  		public P_Gen175(P_Gen176 p_gen176){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + p_gen176 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  