
  package gen;
  public class H_Gen96 {
  		@com.google.inject.Inject
  		public H_Gen96(H_Gen97 h_gen97){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + h_gen97 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  