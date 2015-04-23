
  package gen;
  public class L_Gen81 {
  		@com.google.inject.Inject
  		public L_Gen81(L_Gen82 l_gen82){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + l_gen82 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  