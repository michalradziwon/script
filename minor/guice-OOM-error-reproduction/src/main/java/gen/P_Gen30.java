
  package gen;
  public class P_Gen30 {
  		@com.google.inject.Inject
  		public P_Gen30(P_Gen31 p_gen31){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + p_gen31 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  