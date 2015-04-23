
  package gen;
  public class L_Gen8 {
  		@com.google.inject.Inject
  		public L_Gen8(L_Gen9 l_gen9){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + l_gen9 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  