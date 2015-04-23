
  package gen;
  public class P_Gen162 {
  		@com.google.inject.Inject
  		public P_Gen162(P_Gen163 p_gen163){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + p_gen163 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  