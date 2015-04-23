
  package gen;
  public class H_Gen103 {
  		@com.google.inject.Inject
  		public H_Gen103(H_Gen104 h_gen104){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + h_gen104 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  