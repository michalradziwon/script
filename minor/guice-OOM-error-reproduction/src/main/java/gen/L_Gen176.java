
  package gen;
  public class L_Gen176 {
  		@com.google.inject.Inject
  		public L_Gen176(L_Gen177 l_gen177){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + l_gen177 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  