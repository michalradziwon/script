
  package gen;
  public class H_Gen185 {
  		@com.google.inject.Inject
  		public H_Gen185(H_Gen186 h_gen186){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + h_gen186 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  