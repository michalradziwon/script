
  package gen;
  public class H_Gen42 {
  		@com.google.inject.Inject
  		public H_Gen42(H_Gen43 h_gen43){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + h_gen43 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  