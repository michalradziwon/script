
  package gen;
  public class L_Gen191 {
  		@com.google.inject.Inject
  		public L_Gen191(L_Gen192 l_gen192){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + l_gen192 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  