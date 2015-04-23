
  package gen;
  public class L_Gen12 {
  		@com.google.inject.Inject
  		public L_Gen12(L_Gen13 l_gen13){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + l_gen13 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  