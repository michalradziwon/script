
  package gen;
  public class L_Gen1 {
  		@com.google.inject.Inject
  		public L_Gen1(L_Gen2 l_gen2){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + l_gen2 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  