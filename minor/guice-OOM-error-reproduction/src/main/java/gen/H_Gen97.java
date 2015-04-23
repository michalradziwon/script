
  package gen;
  public class H_Gen97 {
  		@com.google.inject.Inject
  		public H_Gen97(H_Gen98 h_gen98){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + h_gen98 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  