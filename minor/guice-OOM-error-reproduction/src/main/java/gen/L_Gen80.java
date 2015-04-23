
  package gen;
  public class L_Gen80 {
  		@com.google.inject.Inject
  		public L_Gen80(L_Gen81 l_gen81){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + l_gen81 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  