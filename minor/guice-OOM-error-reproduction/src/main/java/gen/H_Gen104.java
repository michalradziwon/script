
  package gen;
  public class H_Gen104 {
  		@com.google.inject.Inject
  		public H_Gen104(H_Gen105 h_gen105){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + h_gen105 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  