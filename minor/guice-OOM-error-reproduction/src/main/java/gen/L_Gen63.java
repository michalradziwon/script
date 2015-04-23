
  package gen;
  public class L_Gen63 {
  		@com.google.inject.Inject
  		public L_Gen63(L_Gen64 l_gen64){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + l_gen64 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  