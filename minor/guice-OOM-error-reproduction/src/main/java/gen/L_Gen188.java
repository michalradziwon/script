
  package gen;
  public class L_Gen188 {
  		@com.google.inject.Inject
  		public L_Gen188(L_Gen189 l_gen189){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + l_gen189 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  