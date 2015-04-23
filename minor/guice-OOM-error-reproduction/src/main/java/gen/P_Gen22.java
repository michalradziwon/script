
  package gen;
  public class P_Gen22 {
  		@com.google.inject.Inject
  		public P_Gen22(P_Gen23 p_gen23){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + p_gen23 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  