
  package gen;
  public class H_Gen73 {
  		@com.google.inject.Inject
  		public H_Gen73(H_Gen74 h_gen74){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + h_gen74 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  