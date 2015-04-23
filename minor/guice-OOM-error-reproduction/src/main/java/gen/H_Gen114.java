
  package gen;
  public class H_Gen114 {
  		@com.google.inject.Inject
  		public H_Gen114(H_Gen115 h_gen115){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + h_gen115 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  