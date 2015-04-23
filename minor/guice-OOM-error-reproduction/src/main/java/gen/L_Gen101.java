
  package gen;
  public class L_Gen101 {
  		@com.google.inject.Inject
  		public L_Gen101(L_Gen102 l_gen102){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + l_gen102 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  