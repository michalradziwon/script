
  package gen;
  public class L_Gen123 {
  		@com.google.inject.Inject
  		public L_Gen123(L_Gen124 l_gen124){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + l_gen124 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  