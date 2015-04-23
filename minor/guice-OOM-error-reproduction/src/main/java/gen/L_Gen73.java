
  package gen;
  public class L_Gen73 {
  		@com.google.inject.Inject
  		public L_Gen73(L_Gen74 l_gen74){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + l_gen74 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  