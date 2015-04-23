
  package gen;
  public class L_Gen96 {
  		@com.google.inject.Inject
  		public L_Gen96(L_Gen97 l_gen97){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + l_gen97 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  