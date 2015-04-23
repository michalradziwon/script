
  package gen;
  public class L_Gen62 {
  		@com.google.inject.Inject
  		public L_Gen62(L_Gen63 l_gen63){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + l_gen63 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  