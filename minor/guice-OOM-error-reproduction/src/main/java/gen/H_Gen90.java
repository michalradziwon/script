
  package gen;
  public class H_Gen90 {
  		@com.google.inject.Inject
  		public H_Gen90(H_Gen91 h_gen91){
  			System.out.println(this.getClass().getCanonicalName() + " created. " + h_gen91 );
  		}
  @com.google.inject.Inject public void injectInterfaceWithoutImpl(gen.InterfaceWithoutImpl i){} // should expolode :)
  }
  