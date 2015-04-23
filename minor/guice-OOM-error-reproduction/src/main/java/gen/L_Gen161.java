
  package gen;
  public class L_Gen161 {
  		@com.google.inject.Inject
  		public L_Gen161(L_Gen162 l_gen162){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + l_gen162 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  