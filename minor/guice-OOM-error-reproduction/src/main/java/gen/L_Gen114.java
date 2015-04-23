
  package gen;
  public class L_Gen114 {
  		@com.google.inject.Inject
  		public L_Gen114(L_Gen115 l_gen115){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + l_gen115 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  