
  package gen;
  public class L_Gen135 {
  		@com.google.inject.Inject
  		public L_Gen135(L_Gen136 l_gen136){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + l_gen136 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  