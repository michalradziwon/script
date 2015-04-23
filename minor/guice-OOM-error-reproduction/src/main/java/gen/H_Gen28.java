
  package gen;
  public class H_Gen28 {
  		@com.google.inject.Inject
  		public H_Gen28(H_Gen29 h_gen29){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + h_gen29 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  