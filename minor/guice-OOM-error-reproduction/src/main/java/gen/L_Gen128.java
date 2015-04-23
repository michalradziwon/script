
  package gen;
  public class L_Gen128 {
  		@com.google.inject.Inject
  		public L_Gen128(L_Gen129 l_gen129){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + l_gen129 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  