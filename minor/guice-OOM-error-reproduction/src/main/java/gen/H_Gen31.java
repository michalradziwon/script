
  package gen;
  public class H_Gen31 {
  		@com.google.inject.Inject
  		public H_Gen31(H_Gen32 h_gen32){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + h_gen32 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  