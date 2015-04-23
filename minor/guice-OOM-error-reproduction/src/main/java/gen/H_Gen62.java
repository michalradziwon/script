
  package gen;
  public class H_Gen62 {
  		@com.google.inject.Inject
  		public H_Gen62(H_Gen63 h_gen63){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + h_gen63 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  