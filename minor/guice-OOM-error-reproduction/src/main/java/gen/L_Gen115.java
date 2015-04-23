
  package gen;
  public class L_Gen115 {
  		@com.google.inject.Inject
  		public L_Gen115(L_Gen116 l_gen116){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + l_gen116 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  