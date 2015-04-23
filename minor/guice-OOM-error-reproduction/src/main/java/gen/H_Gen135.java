
  package gen;
  public class H_Gen135 {
  		@com.google.inject.Inject
  		public H_Gen135(H_Gen136 h_gen136){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + h_gen136 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  