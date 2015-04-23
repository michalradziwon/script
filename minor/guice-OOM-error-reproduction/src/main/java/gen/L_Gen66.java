
  package gen;
  public class L_Gen66 {
  		@com.google.inject.Inject
  		public L_Gen66(L_Gen67 l_gen67){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + l_gen67 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  